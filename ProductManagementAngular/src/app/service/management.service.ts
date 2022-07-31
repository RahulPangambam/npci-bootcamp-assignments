import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable, map} from 'rxjs';
import { Product } from '../common/product';
import { Category } from '../common/category';
@Injectable({
  providedIn: 'root'
})
export class ManagementService {

  private productUrl = "http://localhost:8080/api/product"
  private categoryUrl = "http://localhost:8080/api/category"
  constructor(private httpClient : HttpClient) { }

  getAllProducts() : Observable<Product[]>{
    return this.httpClient.get<getProductResponse>(this.productUrl).pipe(map(response => response._embedded.products));
  }

  getAllCategories() : Observable<Category[]>{
    return this.httpClient.get<getCategoryResponse>(this.categoryUrl).pipe(map(response => response._embedded.categories));
  }
}

interface getProductResponse{
  _embedded : {
    products : Product[]
  }
}
interface getCategoryResponse{
  _embedded : {
    categories : Category[]
  }
}


import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
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
  saveProduct(product : Product) : Observable<Product>{
    const httpOptions = {
      headers : new HttpHeaders({
        'Content_type' : 'application/json',
        'Authorization' : 'auth-token',
        'Access-Control-Allow-Origin' : '*'
      })
    };
    return this.httpClient.post<Product>(this.productUrl, product, httpOptions);
  }
  getProductById(id : number) : Observable<Product>{
    const prodUrl = this.productUrl + "/" +id;

    return this.httpClient.get<Product>(prodUrl);
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


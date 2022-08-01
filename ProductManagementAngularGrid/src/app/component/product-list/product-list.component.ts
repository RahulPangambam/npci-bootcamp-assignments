import { Component, OnInit } from '@angular/core';
import { ManagementService } from 'src/app/service/management.service';
import { Product } from 'src/app/common/product';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  product : Product = new Product(0,"","","",0,"","",0,"","",0);
  products : Product[];
  imageUrl : string;
  description : string;
  constructor(private prodService : ManagementService, private route : Router) { }

  ngOnInit(): void {
    console.log(this.imageUrl)
    this.getAllProducts();
  }
  getAllProducts(){
    this.prodService.getAllProducts().subscribe(
      data=>{
      console.log(data);
      this.products = data;
      })
  }
  goToProdForm(){
    this.route.navigateByUrl("/merchant");
  }
  getProductById(id : number){
    this.prodService.getProductById(id).subscribe(data=>{
      this.product = data;
    });
  }

}

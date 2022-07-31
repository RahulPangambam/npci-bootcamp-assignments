import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  product : Product = new Product(0,"","","",0,"","",0,"","",0);
  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    console.log(this.product);
  }
}

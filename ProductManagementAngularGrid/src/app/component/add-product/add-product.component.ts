import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { Router } from '@angular/router';
import { Category } from 'src/app/common/category';
import { ManagementService } from 'src/app/service/management.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  product : Product = new Product(0,"","","",0,"","",0,"","",0);
  categories : Category[]
  constructor(private route : Router, private service : ManagementService) { }

  ngOnInit(): void {
    this.getAllCategories();
  }
  getAllCategories(){
    this.service.getAllCategories().subscribe(
      data =>{
        this.categories = data;
      })
  }
  onSubmit(){
    console.log(this.product);
    this.service.saveProduct(this.product).subscribe(data =>{
      this.route.navigateByUrl("/shop")
    });
  }
}

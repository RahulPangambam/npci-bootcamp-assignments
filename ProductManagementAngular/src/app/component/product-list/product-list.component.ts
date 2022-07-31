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

  products : Product[];
  constructor(private prodService : ManagementService, private route : Router) { }

  ngOnInit(): void {
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
    this.route.navigateByUrl("/addproduct");
  }

}

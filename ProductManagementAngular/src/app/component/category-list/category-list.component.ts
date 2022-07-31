import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/common/category';
import { ManagementService } from 'src/app/service/management.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {

  categories : Category[]
  constructor(private deptService : ManagementService, private route : Router) { }

  ngOnInit(): void {
    this.getAllCategories();
  }
  getAllCategories(){
    this.deptService.getAllCategories().subscribe(
      data =>{
        this.categories = data;
      })
  }
  goToCatForm(){
    this.route.navigateByUrl("/addcategory");
  }

}

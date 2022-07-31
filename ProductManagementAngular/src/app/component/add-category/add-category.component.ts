import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app/common/category';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent implements OnInit {

  category : Category = new Category(0, "");
  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    console.log(this.category);
    
  }
}

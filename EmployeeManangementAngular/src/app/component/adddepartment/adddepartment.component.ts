import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/common/department';

@Component({
  selector: 'app-adddepartment',
  templateUrl: './adddepartment.component.html',
  styleUrls: ['./adddepartment.component.css']
})
export class AdddepartmentComponent implements OnInit {

  department : Department = new Department(0,"","");
  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    console.log(this.department);
    
  }
}

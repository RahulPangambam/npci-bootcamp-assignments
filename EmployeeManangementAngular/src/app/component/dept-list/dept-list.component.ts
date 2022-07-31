import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/common/department';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dept-list',
  templateUrl: './dept-list.component.html',
  styleUrls: ['./dept-list.component.css']
})
export class DeptListComponent implements OnInit {

  departments : Department[]
  constructor(private deptService : ManagementServiceService, private route : Router) { }

  ngOnInit(): void {
    this.getAllDepartments();
  }
  getAllDepartments(){
    this.deptService.getAllDepartments().subscribe(
      data =>{
        this.departments = data;
      })
  }
  goToDeptForm(){
    this.route.navigateByUrl("/adddepartment");
  }
}

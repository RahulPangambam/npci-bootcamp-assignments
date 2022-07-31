import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/common/employee';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  employees: Employee[];
  constructor(private empService : ManagementServiceService, private route : Router) { }

  ngOnInit(): void {
    this.getAllEmployees();
  }
  getAllEmployees(){
    this.empService.getAllEmployees().subscribe(
      data=>{
      console.log(data);
      this.employees = data;
      })
  }
  goToEmpForm(){
    this.route.navigateByUrl("/addemployee");
  }

}

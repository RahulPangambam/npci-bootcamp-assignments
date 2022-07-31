import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/common/employee';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import { EmpListComponent } from '../emp-list/emp-list.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addemployee',
  templateUrl: './addemployee.component.html',
  styleUrls: ['./addemployee.component.css']
})
export class AddemployeeComponent implements OnInit {

  employee : Employee = new Employee(0,"","","",0,0,0,0);
  
  constructor(private route : Router) { }

  ngOnInit(): void {
  }
  onSubmit(){
    console.log(this.employee);
  }

}

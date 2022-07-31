import { Component, OnInit } from '@angular/core';
import { ManagementServiceService } from 'src/app/services/management-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  constructor(private route : Router) { }

  ngOnInit(): void {
  }
  getEmployee(){
    this.route.navigateByUrl("/employees");
  }
  getDepartment(){
    this.route.navigateByUrl("/departments");
  }
}

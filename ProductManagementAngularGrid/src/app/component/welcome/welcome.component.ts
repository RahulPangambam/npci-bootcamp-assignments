import { Component, OnInit } from '@angular/core';
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
  getProduct(){
    this.route.navigateByUrl("/shop");
  }
  getCategory(){
    this.route.navigateByUrl("/categories");
  }
  getProdForm(){
    this.route.navigateByUrl("/merchant");
  }
}

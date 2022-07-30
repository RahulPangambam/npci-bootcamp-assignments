import { Component, OnInit } from '@angular/core';
import { Salesperson } from '../salesperson';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  s1 : Salesperson = new Salesperson("Bebe", "Murry", "bebe@gmail.com", 40000, 100);
  salesPersonList : Salesperson[] = [this.s1, new Salesperson("Sensen", "Murry", "sensen@gmail.com", 50000, 40),
  new Salesperson("Jupon", "Murry", "jupon@gmail.com", 45000, 100),new Salesperson("Chutu", "Murry", "chutu@gmail.com", 1000, 49)];
  
  salesPersonModel : Salesperson = new Salesperson("","","",0,0);

  constructor() { }

  ngOnInit(): void {
  }
  onSubmit(){
    this.salesPersonList.push(this.salesPersonModel);
  }

}

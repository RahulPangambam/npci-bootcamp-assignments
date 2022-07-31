import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { Router, Routes, RouterModule } from '@angular/router'
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { EmpListComponent } from './component/emp-list/emp-list.component';
import { DeptListComponent } from './component/dept-list/dept-list.component';
import { WelcomeComponent } from './component/welcome/welcome.component';
import { AddemployeeComponent } from './component/addemployee/addemployee.component';
import { AdddepartmentComponent } from './component/adddepartment/adddepartment.component';

const route : Routes = [
  {path : '', component : WelcomeComponent},
  {path : 'employees', component : EmpListComponent},
  {path : 'departments', component : DeptListComponent},
  {path : 'addemployee', component : AddemployeeComponent},
  {path : 'adddepartment', component : AdddepartmentComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    EmpListComponent,
    DeptListComponent,
    WelcomeComponent,
    AddemployeeComponent,
    AdddepartmentComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(route),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

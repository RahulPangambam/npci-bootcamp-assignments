import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable,map } from 'rxjs';
import { Employee } from '../common/employee';
import { Department } from '../common/department';


@Injectable({
  providedIn: 'root'
})
export class ManagementServiceService {

  private empurl = "http://localhost:8080/api/emp"
  private deptEmpurl = "http://localhost:8080/api/dept"
  constructor(private httpClient : HttpClient) { }
  
  getAllEmployees() : Observable<Employee[]>{
    return this.httpClient.get<getEmployeeResponse>(this.empurl).pipe(map(response => response._embedded.employees));
  }

  getAllDepartments() : Observable<Department[]>{
    return this.httpClient.get<getDepartmentResponse>(this.deptEmpurl).pipe(map(response => response._embedded.departments));
  }
}

interface getEmployeeResponse{
  _embedded : {
    employees : Employee[]
  }
}
interface getDepartmentResponse{
  _embedded : {
    departments : Department[]
  }
}


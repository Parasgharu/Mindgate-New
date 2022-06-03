import { Component } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  userName:string []=['Kiran','Pravin','Paras','Harshal','Dinesh'];

  allEmployees : Employee[] =[
    {employeeId:101 , name:'Kiran', salary:25000},
    {employeeId:102 , name:'Pravin', salary:25000},
    {employeeId:103 , name:'Paras', salary:25000},
    {employeeId:104 , name:'Harshal', salary:25000},
    {employeeId:105 , name:'Dinesh', salary:25000}
  ];
}

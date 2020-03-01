import { Injectable, NgModule } from '@angular/core';
import { Employe } from '../interfaces/Employe';
import { HttpHeaders, HttpClientModule, HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface EmployeResponse {
	results?: Employe[]; 
}

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})


@NgModule({
  imports: [
      HttpClientModule
  ]
})


export class ServiceEmployeService {


  constructor(private http: HttpClient) { }

  addEmploye(employe: any)  {
    this.http.post("/addEmploye",employe,httpOptions).subscribe(res => {     
      console.log(employe);
    },
    (err: HttpErrorResponse) => {
          if (err.error instanceof Error) {		 
            console.log('An error occurred:', err.error.message);
          } else {				 
            console.log('Backend returned status code: ', err.status);
            console.log('Response body:', err.error);
          }
        }
    );
 }

 getAll(): Observable<any> {
  return this.http.get("/Employes")
}

login(employe : any): Observable<any> {
  var e : Employe = employe
  console.log("dddddd "+ e)
  return this.http.get("/login/"+ e.identifiant+"/"+e.motdepasse)
}

}
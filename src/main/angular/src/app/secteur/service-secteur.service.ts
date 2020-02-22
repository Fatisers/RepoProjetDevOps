import { Injectable, NgModule } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { HttpClientModule,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Secteur } from '../interfaces/Secteur';

export interface SecteurResponse {
	results?: Secteur[]; 
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


export class ServiceSecteurService {


  constructor(private http: HttpClient) { }

  addSecteur(secteur: any)  {
    this.http.post("/addsecteur",secteur,httpOptions).subscribe(res => {     
      console.log(secteur);
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
  return this.http.get("/Secteurs")
}

}

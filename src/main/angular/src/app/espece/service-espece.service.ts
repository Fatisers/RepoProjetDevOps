import { Injectable, NgModule } from '@angular/core';
import { Espece } from '../interfaces/Espece';
import { HttpHeaders, HttpClientModule, HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface EspeceResponse {
  results?: Espece[]; 
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


export class ServiceEspeceService {


  constructor(private http: HttpClient) { }

  addEspece(espece: any)  {
    this.http.post("/addEspece",espece,httpOptions).subscribe(res => {     
      console.log(espece);
    },
    (err: HttpErrorResponse) => {
          if (err.error instanceof Error) {		 
            console.log('Erreur : ', err.error.message);
          } else {				 
            console.log("Status code", err.status);
            console.log("Message d'erreur", err.error);
          }
        }
    );
 }

 getAll(): Observable<any> {
  return this.http.get("/especes")
}
}
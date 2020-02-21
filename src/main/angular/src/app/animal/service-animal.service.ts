

import { Injectable, NgModule } from '@angular/core';
import { Animal } from 'src/app/interfaces/Animal';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { HttpClientModule,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


export interface AnimalResponse {
	results?: Animal[]; 
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


export class ServiceAnimalService {


  constructor(private http: HttpClient) { }

  addAnimal(animal: any)  {
    console.log(animal);
    this.http.post("/addanimal",animal,httpOptions).subscribe(res => {     
      console.log(animal);
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
  return this.http.get("/animaux")
}
}
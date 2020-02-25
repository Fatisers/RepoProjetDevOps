import { Injectable, NgModule } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders, HttpClientModule } from '@angular/common/http';
import { Activite } from '../interfaces/Activite';
import { Observable } from 'rxjs';



export interface ActiviteResponse {
	results?: Activite[]; 
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

export class ServiceActiviteService {

  constructor(private http: HttpClient) { }

  addActivite(activite: any)  {
    this.http.post("/addactivite",activite,httpOptions).subscribe(res => {     
      console.log(activite);
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
  return this.http.get("/activites")
}
}

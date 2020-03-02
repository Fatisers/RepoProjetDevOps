import { Component, OnInit } from '@angular/core';
import { Espece } from 'src/app/interfaces/Espece';
import { Observable } from 'rxjs';
import { ServiceEspeceService } from '../service-espece.service';

@Component({
  selector: 'app-show-espece',
  templateUrl: './show-espece.component.html',
  styleUrls: ['./show-espece.component.css']
})
export class ShowEspeceComponent implements OnInit {

  especes : Observable<Espece>;
  
  constructor(private service : ServiceEspeceService) {
    this.service.getAll().subscribe(
      data => this.especes = data,
      error => console.log("Erreur "+error)   
      )
   }

  ngOnInit() {
    this.service.getAll().subscribe(
      data => this.especes = data,
      error => console.log("Erreur "+error)   
      )
      
  }

  displayedColumns: string[] = ['type', 'sexe', 'esperancedevie', 'regimeAlimentaire','niveauDeMenace'];
 

}

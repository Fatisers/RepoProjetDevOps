import { Component, OnInit } from '@angular/core';
import { ServiceActiviteService } from '../service-activite.service';
import { Observable } from 'rxjs';
import { Activite } from 'src/app/interfaces/Activite';



@Component({
  selector: 'app-show-activite',
  templateUrl: './show-activite.component.html',
  styleUrls: ['./show-activite.component.css']
})


export class ShowActiviteComponent implements OnInit {

  activites : Observable<Activite>;
  
  constructor(private service : ServiceActiviteService) {
    this.service.getAll().subscribe(
      data => this.activites = data,
      error => console.log("Erreur "+error)   
      )
   }

  ngOnInit() {
    this.service.getAll().subscribe(
      data => this.activites = data,
      error => console.log("Erreur "+error)   
      )
      
  }

  displayedColumns: string[] = ['jour', 'nom', 'heureDebut', 'heureFin', 'publiqueOuPrivee'];

}

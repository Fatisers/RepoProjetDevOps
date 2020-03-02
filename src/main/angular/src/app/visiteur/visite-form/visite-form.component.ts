import { Component, OnInit, NgZone } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ServiceVisiteurService } from '../service-visiteur.service';
import { ServiceActiviteService } from 'src/app/activite/service-activite.service';
import { Observable } from 'rxjs';
import { Activite } from 'src/app/interfaces/Activite';



export interface searchSS{
  JourVisite: string,
  heure: string
}


@Component({
  selector: 'app-visite-form',
  templateUrl: './visite-form.component.html',
  styleUrls: ['./visite-form.component.css']
})

export class VisiteFormComponent implements OnInit {

  activites : Observable<Activite>;

  displayedColumns: string[] = ['jour', 'nom', 'heureDebut', 'heureFin', 'publiqueOuPrivee'];
  
  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceActiviteService) { }

  ngOnInit() {
  }


  searchForm = this.formBuilder.group({
    nom: '',
    jour: '',
    heureDebut:'',
    dateArrivee: '',
    heureFin:'',
    publiqueOuPrivee: '',
    idBassin: '',
    idEmploye: ''

  });

  onFormSubmit() {
    this.service.searchactivite(this.searchForm.value).subscribe(
      data => this.activites = data,
      error => console.log("Erreur 3"+error)   
      )

  }

}

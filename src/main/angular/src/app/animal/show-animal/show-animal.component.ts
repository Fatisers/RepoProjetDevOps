import { Component, OnInit } from '@angular/core';
import { Animal } from 'src/app/interfaces/Animal';
import { Observable } from 'rxjs';
import { ServiceAnimalService } from '../service-animal.service';

@Component({
  selector: 'app-show-animal',
  templateUrl: './show-animal.component.html',
  styleUrls: ['./show-animal.component.css']
})
export class ShowAnimalComponent implements OnInit {

  animaux : Observable<Animal>;
  
  constructor(private service : ServiceAnimalService) {
    this.service.getAll().subscribe(
      data => this.animaux = data,
      error => console.log("Erreur "+error)   
      )
   }

  ngOnInit() {
    this.service.getAll().subscribe(
      data => this.animaux = data,
      error => console.log("Erreur "+error)   
      )
      
  }

  displayedColumns: string[] = ['nom', 'sexe', 'signeDistinctif', 'dateArrivee','dateDepartPossible'];
 

}

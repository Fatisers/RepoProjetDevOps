import { Component, OnInit, NgZone } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ServiceActiviteService } from '../service-activite.service';

@Component({
  selector: 'app-add-activite',
  templateUrl: './add-activite.component.html',
  styleUrls: ['./add-activite.component.css']
})
export class AddActiviteComponent implements OnInit {

  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceActiviteService) { }

  ngOnInit() {
  }

  addForm = this.formBuilder.group({
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
    this.service.addActivite(this.addForm.value);
  }
}

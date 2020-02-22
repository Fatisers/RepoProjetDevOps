import { Component, OnInit, NgZone } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ServiceEmployeService } from '../service-employe.service';

@Component({
  selector: 'app-add-employe',
  templateUrl: './add-employe.component.html',
  styleUrls: ['./add-employe.component.css']
})
export class AddEmployeComponent implements OnInit {
  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceEmployeService) { }

  ngOnInit() {
  }

  addForm = this.formBuilder.group({
    nom: '',
    identifiant: '',
    motdepasse:'',
    prenom: '',
    adresse:'',
    dateDeNaissance: '',
    numSecuSociale: '',
    role : '' 

  });

  onFormSubmit() {
    this.service.addEmploye(this.addForm.value);
  }

}

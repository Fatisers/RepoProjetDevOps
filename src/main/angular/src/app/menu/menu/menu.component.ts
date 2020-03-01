import { Component, OnInit, NgZone } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ServiceEmployeService } from 'src/app/employe/service-employe.service';
import { Employe } from 'src/app/interfaces/Employe';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  employe : Employe = {"idEmploye" : 0,"nom": "", "identifiant": "", "motdepasse":"", "prenom": "","adresse":"",
  "dateDeNaissance": "",
  "numSecuSociale": "",
  "role": "Visiteur","listebassins": []};

  showForm : boolean=true
  loginbool : boolean=true
  
  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceEmployeService) { }

  ngOnInit() {
  }

  login(){
    console.log("fffffffffff")
    this.showForm=false

  }


  loginForm = this.formBuilder.group({
    nom: '',
    identifiant: '',
    motdepasse:'',
    prenom: '',
    adresse:'',
    dateDeNaissance: '',
    numSecuSociale: '',
    role: ''
  });

  onFormSubmit() {
    this.showForm=true
    this.service.login(this.loginForm.value).subscribe(
      data => this.employe = data,
      error => console.log("Erreur 3"+error) 
      )
      console.log(this.employe)
      this.loginbool = false
  }

}

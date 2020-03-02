import { Component, OnInit, NgZone } from '@angular/core';
import { Observable } from 'rxjs';
import { Employe } from 'src/app/interfaces/Employe';
import { FormBuilder } from '@angular/forms';
import { ServiceEmployeService } from 'src/app/employe/service-employe.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  employe : Observable<Employe>;
  loginbool : boolean=true

  displayedColumns: string[] = ['nom', 'identifiant', 'motdepasse', 'prenom', 'adresse', 'dateDeNaissance', 'numSecuSociale', 'role'];
  
  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceEmployeService) { }

  ngOnInit() {
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
    this.service.login(this.loginForm.value).subscribe(
      data => this.employe = data,
      error => console.log("Erreur 3"+error) 
    
      )
      console.log(this.employe)
      this.loginbool = false
  }

}

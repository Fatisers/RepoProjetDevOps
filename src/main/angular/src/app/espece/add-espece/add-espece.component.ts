import { Component, OnInit, NgZone } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ServiceEspeceService } from '../service-espece.service';

@Component({
  selector: 'app-add-espece',
  templateUrl: './add-espece.component.html',
  styleUrls: ['./add-espece.component.css']
})
export class AddEspeceComponent implements OnInit {

 
  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceEspeceService) { }

  ngOnInit() {
  }

  addForm = this.formBuilder.group({
    type: '',
    sexe: '',
    esperancedevie:'',
    regimeAlimentaire: '',
    niveauDeMenace: ''

  });

  onFormSubmit() {
    this.service.addEspece(this.addForm.value);
  }


}

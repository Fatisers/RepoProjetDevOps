import { Component, OnInit, NgZone } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ServiceAnimalService } from '../service-animal.service';

@Component({
  selector: 'app-add-animal',
  templateUrl: './add-animal.component.html',
  styleUrls: ['./add-animal.component.css']
})
export class AddAnimalComponent implements OnInit {

  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceAnimalService) { }

  ngOnInit() {
  }

  addForm = this.formBuilder.group({
    nom: '',
    sexe: '',
    signeDistinctif:'',
    dateArrivee: '',
    dateDepartPossible:'',
    idEspece: '',
    idBassin: ''

  });

  onFormSubmit() {
    this.service.addAnimal(this.addForm.value);
  }

}

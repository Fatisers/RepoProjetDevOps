import { Component, OnInit, NgZone } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ServiceSecteurService } from '../service-secteur.service';

@Component({
  selector: 'app-add-secteur',
  templateUrl: './add-secteur.component.html',
  styleUrls: ['./add-secteur.component.css']
})
export class AddSecteurComponent implements OnInit {

  constructor(private ngZone: NgZone,
    private formBuilder: FormBuilder,
    private service: ServiceSecteurService) { }

  ngOnInit() {
  }

  addForm = this.formBuilder.group({
    nom: '',
    localisationDansAquarium : ''
  });

  onFormSubmit() {
    this.service.addSecteur(this.addForm.value);
  }

}

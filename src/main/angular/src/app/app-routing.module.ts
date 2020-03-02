import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddActiviteComponent } from './activite/add-activite/add-activite.component';
import { ShowActiviteComponent } from './activite/show-activite/show-activite.component';
import { AddAnimalComponent } from './animal/add-animal/add-animal.component';
import { ErrorPageComponent } from './menu/error-page/error-page.component';
import { WelcomePageComponent } from './menu/welcome-page/welcome-page.component';
import { VisiteFormComponent } from './visiteur/visite-form/visite-form.component';
import { ShowAnimalComponent } from './animal/show-animal/show-animal.component';
import { AddEspeceComponent } from './espece/add-espece/add-espece.component';
import { ShowEspeceComponent } from './espece/show-espece/show-espece.component';
import { LoginComponent } from './login/login/login.component';
import { AddEmployeComponent } from './employe/add-employe/add-employe.component';


const routes: Routes = [
  { path: 'addActivite', component: AddActiviteComponent},
  { path: 'showActivite', component: ShowActiviteComponent },
  { path: 'addAnimal', component: AddAnimalComponent },
  { path: 'addEmploye', component: AddEmployeComponent },
  { path: 'showAnimal', component: ShowAnimalComponent },
  { path: 'addEspece', component: AddEspeceComponent },
  { path: 'showEspece', component: ShowEspeceComponent }, 
  { path: 'welcomePage', component: WelcomePageComponent },
  { path: 'visitePage', component: VisiteFormComponent },
  { path: 'loginPage', component: LoginComponent },
  { path: '',   redirectTo: '/welcomePage', pathMatch: 'full' },
  { path: '**', component: ErrorPageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

//
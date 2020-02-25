import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddActiviteComponent } from './activite/add-activite/add-activite.component';
import { ShowActiviteComponent } from './activite/show-activite/show-activite.component';
import { AddAnimalComponent } from './animal/add-animal/add-animal.component';
import { MenuComponent } from './menu/menu/menu.component';
import { ErrorPageComponent } from './menu/error-page/error-page.component';


const routes: Routes = [
  { path: 'addActivite', component: AddActiviteComponent},
  { path: 'showActivite', component: ShowActiviteComponent },
  { path: 'addAnimal', component: AddAnimalComponent },
  { path: 'welcomePage', component: MenuComponent },
  { path: '',   redirectTo: '/welcomePage', pathMatch: 'full' },
  { path: '**', component: ErrorPageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

 
//  { path: '**', component: PageNotFoundComponent}
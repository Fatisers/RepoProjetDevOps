import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddActiviteComponent } from './activite/add-activite/add-activite.component';
import { ShowActiviteComponent } from './activite/show-activite/show-activite.component';


const routes: Routes = [
  { path: 'addActivite', component: AddActiviteComponent},
  { path: 'showActivite',        component: ShowActiviteComponent },
  { path: '',   redirectTo: '/addActivite', pathMatch: 'full' },
  { path: '**', component: AddActiviteComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

 
//  { path: '**', component: PageNotFoundComponent}
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EjecutarComponent } from './modules/ejecutar/component/ejecutar/ejecutar.component';
import { FuncionamientoComponent } from './modules/funcionamiento/component/funcionamiento/funcionamiento.component';
import { LeemeComponent } from './modules/leeme/component/leeme/leeme.component';

const routes: Routes = [
  {path: "funcionamiento", component: FuncionamientoComponent},
  {path: "ejecutar", component: EjecutarComponent},
  {path: "leeme", component: LeemeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

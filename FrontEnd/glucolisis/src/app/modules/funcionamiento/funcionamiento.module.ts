import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FuncionamientoComponent } from './component/funcionamiento/funcionamiento.component';



@NgModule({
  declarations: [
    FuncionamientoComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    FuncionamientoComponent
  ]
})
export class FuncionamientoModule { }

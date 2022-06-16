import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AnalizadorComponent } from './component/analizador/analizador.component';



@NgModule({
  declarations: [
    AnalizadorComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    AnalizadorComponent
  ]
})
export class AnalizadorModule { }

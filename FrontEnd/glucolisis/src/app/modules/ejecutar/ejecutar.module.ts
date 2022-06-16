import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EjecutarComponent } from './component/ejecutar/ejecutar.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { Calculadora } from './_model/Calculadora';


@NgModule({
  declarations: [
    EjecutarComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ],
  exports: [
    EjecutarComponent,
  ]
})
export class EjecutarModule { }

import { Component, OnInit } from '@angular/core';

import { FormBuilder, Validators} from '@angular/forms';
import { Calculadora } from '../../_model/Calculadora';

declare var $: any;

@Component({
  selector: 'app-ejecutar',
  templateUrl: './ejecutar.component.html',
  styleUrls: ['./ejecutar.component.css']
})
export class EjecutarComponent implements OnInit {

  cal: Calculadora = new Calculadora(0);
  aux: Calculadora = new Calculadora(0);
  constructor() { }



  ngOnInit(): void {
    this.cal = new Calculadora(0);
  }
  
  ejecuta(){
    var glucosa = <HTMLInputElement> document.getElementById("glucosas");
 
    this.cal = new Calculadora(Number(glucosa.value));
    this.aux = new Calculadora(Number(glucosa.value));
    this.aux.generaResultado()
    console.log(this.cal.glucosa);
  }
}

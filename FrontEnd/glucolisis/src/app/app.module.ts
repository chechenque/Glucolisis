import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EjecutarModule } from './modules/ejecutar/ejecutar.module';
import { FuncionamientoModule } from './modules/funcionamiento/funcionamiento.module';
import { LayoutModule } from './modules/layout/layout.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    LayoutModule,
    EjecutarModule,
    FuncionamientoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

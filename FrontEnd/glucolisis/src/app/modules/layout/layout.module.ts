import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { NavComponent } from './component/nav/nav.component';
import { RouterModule, Routes } from '@angular/router';




@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent,
    NavComponent
  ],
  imports: [
    CommonModule,
    RouterModule
  ],
  exports: [
    HeaderComponent,
    FooterComponent,
    NavComponent
  ]
})
export class LayoutModule { }

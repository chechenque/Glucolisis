import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AboutUsComponent } from './component/about-us/about-us.component';



@NgModule({
  declarations: [
    AboutUsComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    AboutUsComponent
  ]
})
export class AboutUsModule { }

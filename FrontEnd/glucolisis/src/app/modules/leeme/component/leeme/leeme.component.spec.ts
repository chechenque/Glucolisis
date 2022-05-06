import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LeemeComponent } from './leeme.component';

describe('LeemeComponent', () => {
  let component: LeemeComponent;
  let fixture: ComponentFixture<LeemeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LeemeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LeemeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

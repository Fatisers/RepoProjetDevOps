import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmploidutempsEmployeComponent } from './emploidutemps-employe.component';

describe('EmploidutempsEmployeComponent', () => {
  let component: EmploidutempsEmployeComponent;
  let fixture: ComponentFixture<EmploidutempsEmployeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmploidutempsEmployeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmploidutempsEmployeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowEspeceComponent } from './show-espece.component';

describe('ShowEspeceComponent', () => {
  let component: ShowEspeceComponent;
  let fixture: ComponentFixture<ShowEspeceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowEspeceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowEspeceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

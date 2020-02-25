import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowActiviteComponent } from './show-activite.component';

describe('ShowActiviteComponent', () => {
  let component: ShowActiviteComponent;
  let fixture: ComponentFixture<ShowActiviteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowActiviteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowActiviteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

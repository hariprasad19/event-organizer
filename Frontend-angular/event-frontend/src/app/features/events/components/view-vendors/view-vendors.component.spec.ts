import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewVendorsComponent } from './view-vendors.component';

describe('ViewVendorsComponent', () => {
  let component: ViewVendorsComponent;
  let fixture: ComponentFixture<ViewVendorsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ViewVendorsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewVendorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

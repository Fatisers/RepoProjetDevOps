import { TestBed } from '@angular/core/testing';

import { ServiceVisiteurService } from './service-visiteur.service';

describe('ServiceVisiteurService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceVisiteurService = TestBed.get(ServiceVisiteurService);
    expect(service).toBeTruthy();
  });
});

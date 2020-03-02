import { TestBed } from '@angular/core/testing';

import { ServiceEspeceService } from './service-espece.service';

describe('ServiceEspeceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceEspeceService = TestBed.get(ServiceEspeceService);
    expect(service).toBeTruthy();
  });
});

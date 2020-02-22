import { TestBed } from '@angular/core/testing';

import { ServiceActiviteService } from './service-activite.service';

describe('ServiceActiviteService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceActiviteService = TestBed.get(ServiceActiviteService);
    expect(service).toBeTruthy();
  });
});

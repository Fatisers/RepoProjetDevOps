import { TestBed } from '@angular/core/testing';

import { ServiceAnimalService } from './service-animal.service';

describe('ServiceAnimalService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceAnimalService = TestBed.get(ServiceAnimalService);
    expect(service).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { ServiceSecteurService } from './service-secteur.service';

describe('ServiceSecteurService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceSecteurService = TestBed.get(ServiceSecteurService);
    expect(service).toBeTruthy();
  });
});

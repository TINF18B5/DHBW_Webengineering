import { TestBed } from '@angular/core/testing';

import { AddressListService } from './address-list.service';

describe('AddressListServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddressListService = TestBed.get(AddressListService);
    expect(service).toBeTruthy();
  });
});

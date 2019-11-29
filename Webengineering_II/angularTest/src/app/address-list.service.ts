import { Injectable } from '@angular/core';
import { ADDRESSES } from './mock-addresses';


@Injectable({
  providedIn: 'root'
})
export class AddressListService {
    getAdresses(){ return ADDRESSES;}
}

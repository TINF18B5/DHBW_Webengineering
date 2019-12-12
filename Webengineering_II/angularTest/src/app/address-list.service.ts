import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Address } from './address';
import { ADDRESSES } from './mock-addresses';


@Injectable({
  providedIn: 'root'
})
export class AddressListService {

  private url = "/adresses";

  constructor(private http: HttpClient){}

  getAdressesFromAPI() :Observable<Address[]>{
     return this.http.get<Address[]>(this.url);
  }

  getAdressesLocal() : Address[]{
    return ADDRESSES;
  }

}

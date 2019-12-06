import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Address } from './address';


@Injectable({
  providedIn: 'root'
})
export class AddressListService {

  private url = "/addresses";

  constructor(private http: HttpClient){}

  getAdresses() :Observable<Address[]>{
     return this.http.get<Address[]>(this.url);
  }

}

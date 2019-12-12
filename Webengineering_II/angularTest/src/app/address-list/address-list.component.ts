import { Component, OnInit } from '@angular/core';
import { AddressListService } from '../address-list.service'
import { Address } from '../address';

@Component({
  selector: 'address-list',
  templateUrl: './address-list.component.html',
  styleUrls: ['./address-list.component.css']
})
export class AddressListComponent implements OnInit {
  addressList:Address[]
  constructor(private listService:AddressListService){
  }
  ngOnInit(){
    this.getAddressesLocal();
  }

  getAddressesLocal(){
    this.addressList = this.listService.getAdressesLocal();
  }

  getAddressesFromAPI(){
    this.listService.getAdressesFromAPI().subscribe(addresses => this.addressList = addresses);
  }
}

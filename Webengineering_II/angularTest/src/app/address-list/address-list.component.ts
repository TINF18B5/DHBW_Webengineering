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
  constructor(listService:AddressListService){
    this.addressList = listService.getAdresses();
  }
  ngOnInit(){}

}

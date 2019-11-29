import { Component, OnInit } from '@angular/core';
import { AddressListService } from '../address-list.service'

@Component({
  selector: 'address-list',
  templateUrl: './address-list.component.html',
  styleUrls: ['./address-list.component.css']
})
export class AddressListComponent implements OnInit {
  constructor(listService:AddressListService){

  }
  ngOnInit(){}

}

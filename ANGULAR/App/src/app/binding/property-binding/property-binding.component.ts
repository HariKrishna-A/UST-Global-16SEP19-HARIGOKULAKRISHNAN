import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
    name: string = 'Animal';
    imgUrl: string = 'https://cdn.pixabay.com/photo/2019/09/27/14/38/zoo-4508682__340.jpg';
    address: string = 'Bangalore,India';
    colorName: string = 'red';
    isActive: boolean = false;
    colSpanValue: number = 2;
  constructor() { }

  ngOnInit() {
    setInterval(() =>{
      this.colorName = 'black'
      this.isActive = !this.isActive;
    },2000)
  }
}

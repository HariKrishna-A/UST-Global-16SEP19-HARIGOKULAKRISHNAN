import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-switch',
  templateUrl: './ng-switch.component.html',
  styleUrls: ['./ng-switch.component.css']
})
export class NgSwitchComponent implements OnInit {
  colorName = 'bule';
  color = 'blue';
  //  colors = ['blue', 'red'];
  constructor() { }

  ngOnInit() {
  }
cF() {
this.color = 'red';
this.colorName = 'red';
}
cF1() {
  this.color = 'green';
  this.colorName = 'green';
  }

  cF2() {
    this.color = 'yellow';
    this.colorName = 'yellow';
    }
}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {

  inputData = '';
  constructor() { }

  ngOnInit() {
  }

  alertFun() {
   alert('Hai...,Hello Angular');
  }

  dataInput(event) {
    console.log(event);
    console.log(event.target.value);
    this.inputData = event.target.value;
  }
}

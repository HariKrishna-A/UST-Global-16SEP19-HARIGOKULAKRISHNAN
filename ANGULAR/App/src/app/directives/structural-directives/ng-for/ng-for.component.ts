import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

 products = [
   {
     name : 'Food',
     img : 'https://cdn.pixabay.com/photo/2017/01/31/09/30/raspberry-2023404__340.jpg',
     price : 200,
   },
   {
    name : 'Food',
    img : 'https://cdn.pixabay.com/photo/2016/04/13/07/18/blueberry-1326154__340.jpg',
    price : 201,
  },
  {
    name : 'Food',
    img : 'https://cdn.pixabay.com/photo/2016/03/23/15/00/ice-cream-cone-1274894__340.jpg',
    price : 50,
  }
 ];

  constructor() { }

  ngOnInit() {
  }

}

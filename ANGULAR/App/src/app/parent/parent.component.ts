import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectCar ;
  constructor() { }

  Cars = [
    {
      name : 'Jaguvar',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/07/13/20/43/auto-1515464__340.jpg'
    },
    {
      name : 'Jaguvar',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/08/13/22/54/jaguar-3604243__340.jpg'
    },
    {
      name : 'Jaguvar',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/07/26/21/49/jaguar-1544031__340.jpg'
    },
    {
      name : 'Jaguvar',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/14/23/09/jaguar-1256562__340.jpg'
    }
  ];

  ngOnInit() {
  }

  sendCar(car) {
    this.selectCar = car;
    console.log(car);
  }
}

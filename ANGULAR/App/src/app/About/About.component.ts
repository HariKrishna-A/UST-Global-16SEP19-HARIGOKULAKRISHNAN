import { Component } from '@angular/core';



@Component({
    selector : 'app-about',
    templateUrl : './About.component.html',
    styleUrls : ['./About.component.css']
})






export class AboutComponent {
    color = 'red';
    bgcolor = 'black';
    isActive = true;
    constructor() {
        // setInterval(() => {
        //     this.isActive = !this.isActive;
        // }, 2000);
        setInterval(() => {
            this.isActive = !this.isActive;
        }, 2000);
    }
}

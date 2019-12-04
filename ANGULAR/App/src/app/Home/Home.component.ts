import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector : 'app-home',
    templateUrl : './Home.component.html',
    styleUrls : ['./Home.component.css']
})

export class HomeComponent {
    news;
    constructor(private http: HttpClient) {

        this.getNews();
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=083c24625e56427a8738bd1666ac0936').subscribe(data => {
        this.news = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('News Got Successfuly');
        });
    }

}

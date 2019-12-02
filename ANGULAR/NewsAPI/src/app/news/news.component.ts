import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  news;
  entertainmentNews;
  sportsnews;
  constructor(public http: HttpClient) {
    this.getNews();
    this.getEntertainment();
    this.getSports();
  }

  ngOnInit() {
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
  getEntertainment() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=083c24625e56427a8738bd1666ac0936').subscribe(data => {
      this.entertainmentNews = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('EntertainmentNew Got Successfuly');
    });
  }
  getSports() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=083c24625e56427a8738bd1666ac0936').subscribe(data => {
      this.sportsnews = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('SportsNews Got Successfuly');
    });
  }

}

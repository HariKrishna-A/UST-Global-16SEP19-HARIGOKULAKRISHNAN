import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search-news',
  templateUrl: './search-news.component.html',
  styleUrls: ['./search-news.component.css']
})
export class SearchNewsComponent implements OnInit {

  search;
  searchNews;
  constructor(public http: HttpClient) {

      // this.getSearchNews();
      // this.cFun(event);
   }

  ngOnInit() {
  }
  // cFun(event) {
  //   // console.log(event.target.value);
  //   this.search = event.target.value;
  //   console.log(this.search);
  // }
    // getSearchNews()
     cFun(event) {
      // this.search = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/everything?from=2019-09-16&sortBy=publishedAt&apiKey=083c24625e56427a8738bd1666ac0936&q='+event.target.value).subscribe(data => {
    this.searchNews = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('sourcesNews Got Successfuly');
    });

  }
}

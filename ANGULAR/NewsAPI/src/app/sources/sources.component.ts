import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
  inputdata;
  sourcesNews;
  constructor(private http: HttpClient) {
    this.getNews();
  }

  ngOnInit() {
  }

  getEnt(event) {
    this.inputdata = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=c143f726ab994b898534102e79f01ba0&sources=' + this.inputdata).subscribe(data => {
      this.sourcesNews = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    });
  }

  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(data => {
      this.sourcesNews = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    });
  }
}

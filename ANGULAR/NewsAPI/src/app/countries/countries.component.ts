import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
  countriesNews;
  inputdata;
  constructor(private http: HttpClient) {
    this.getNews();
  }

  ngOnInit() {
  }
  getEnt(event) {
    this.inputdata = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=c143f726ab994b898534102e79f01ba0&country=' + this.inputdata).subscribe(data => {
      this.countriesNews = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    });
  }

  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(data => {
      this.countriesNews = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    });
  }
}

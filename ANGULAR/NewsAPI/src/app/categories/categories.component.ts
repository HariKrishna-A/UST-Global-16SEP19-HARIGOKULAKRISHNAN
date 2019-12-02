import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  inputdata;
  categoriesNews;
  constructor(private http: HttpClient) {
    this.getNews(); }

  ngOnInit() {
  }
  getEnt(event) {
    this.inputdata = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=c143f726ab994b898534102e79f01ba0&category=' + this.inputdata).subscribe(data => {
     this.categoriesNews = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }

   getNews() {
     this.http.get<any>('https://jsonplaceholder.typicode.com/photos').subscribe(data => {
      this.categoriesNews = data.articles;
   //  console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }

}

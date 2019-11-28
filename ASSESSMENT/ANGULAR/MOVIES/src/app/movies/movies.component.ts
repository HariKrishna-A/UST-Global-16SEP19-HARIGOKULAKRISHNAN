import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  searchMovies;
  constructor(public http: HttpClient) {

   }

  ngOnInit() {
  }
  cFun(event) {
    console.log(event.target.value)
    this.http.get<any>('http://www.omdbapi.com/?apikey=514c73d6&s='+event.target.value).subscribe(data => {
    console.log(data);
    this.searchMovies = data.Search;
    }, err => {
        console.log(err);
    }, () => {
        console.log('Got Successfuly');
    });

  }
}

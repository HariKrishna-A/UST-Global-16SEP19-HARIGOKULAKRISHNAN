import { Component, OnInit } from '@angular/core';
import { LibrarianService } from 'src/app/librarian.service';

@Component({
  selector: 'app-viewbook',
  templateUrl: './viewbook.component.html',
  styleUrls: ['./viewbook.component.css']
})
export class ViewbookComponent implements OnInit {
  books;
  selectedbook;
  message;
  constructor(private service:LibrarianService) {
    this.viewBook();
   }

  ngOnInit() {
  }
  viewBook() {
    this.service.viewBook().subscribe((data) => {
      console.log(data);
      this.books = data.bookBeans;
    }, (err) => {
      console.log(err);
    });
  }
  selectedBook(book) {
    this.selectedbook = book;
    // console.log(book.id);
    
  }
  deleteBook(){
    this.service.deleteBook(this.selectedbook.id).subscribe((data)=>{this.message=data.description});
  }
}

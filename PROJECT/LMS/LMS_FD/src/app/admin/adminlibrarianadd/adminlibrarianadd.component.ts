import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/admin.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-adminlibrarianadd',
  templateUrl: './adminlibrarianadd.component.html',
  styleUrls: ['./adminlibrarianadd.component.css']
})
export class AdminlibrarianaddComponent implements OnInit {

  constructor(private service: AdminService) { }

  registerData(form: NgForm){
    // console.log('value: '+form); 
    return this.service.registerLibrarian(form.value).subscribe((data)=>{
      console.log(data);
    },err => {
      console.log('error');
    });
  }

  ngOnInit() {
  }

}

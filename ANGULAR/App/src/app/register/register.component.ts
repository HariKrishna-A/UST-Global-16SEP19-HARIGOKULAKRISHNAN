import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import {NgForm} from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {

  users ;
  selectedUser ;
  today = new Date();
  constructor(public service: UserService) {
    console.log('Constructor ....RUNNING');
    this.getData();
  }

  ngOnInit() {
    console.log('ngOnInit....RUNNING');
  }

  ngDoCheck() {
    console.log('DoCheck.......RUNNING');
  }

  ngAfterViewInit() {
    console.log('AfterViewInit .....RUNNING');
  }

  ngAfterViewChecked() {
    console.log('AfterViewChecked.....RUNNING');
  }

  ngOnDestroy() {
    console.log('OnDestroy...RUNNING');
  }
  // loginData(form: NgForm) {
  //   console.log(form.value);

  // }
  loginData(form) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data posted successfully');

    });
  }


  getData() {
    this.service.getUser().subscribe(data => {
      console.log(data);
      this.users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data got successfully');
    });
  }

  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data delete successfully');
    });
  }

  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }

  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id, form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated successfully');
    });
  }
}

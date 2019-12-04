import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  firebaseUrl = 'https://krishna-a13ac.firebaseio.com/';

  constructor(public http: HttpClient) { }



  postUser(data) {
    console.log('service', data);
    return this.http.post(`${this.firebaseUrl}/user.json` , data);

  }
  getUser() {
    return this.http.get(`${this.firebaseUrl}/user.json`).pipe(
      map(data => {
        let newArray = [];
        for(let key in data) {
            newArray.push({...data[key],id : key});
        }
        return newArray;
      })
    );
  }

    updateUser(id , data) {
      return this.http.put(`${this.firebaseUrl}/user/${id}.json`,data)
    }



  deleteUser(id) {
    return this.http.delete(`${this.firebaseUrl}/user/${id}.json`);
  }

}

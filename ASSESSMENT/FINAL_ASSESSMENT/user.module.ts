import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { RegisterComponent } from './register/register.component';
import { AppRoutingModule } from '../app-routing.module';



@NgModule({
  declarations: [LoginComponent, HeaderComponent, HomeComponent, FooterComponent, RegisterComponent],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  exports: [
        HeaderComponent, HomeComponent, FooterComponent, LoginComponent, RegisterComponent
  ]
})
export class UserModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Header/Header.component';
import { HomeComponent } from './Home/Home.component';
import { LogInComponent } from './Login/Login.component';
import { AboutComponent } from './About/About.component';
import { HelpComponent } from './Help/Help.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { BindingComponent } from './binding/binding.component';
import { PropertyBindingComponent } from './Binding/property-binding/property-binding.component';
import { EventBindingComponent } from './binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { StructuralDirectivesComponent } from './directives/structural-directives/structural-directives.component';
import { NgIfComponent } from './directives/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directives/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './assignment/form1/form1.component';
import { Form2Component } from './assignment/form2/form2.component';
import { Form3Component } from './assignment/form3/form3.component';
import { Form4Component } from './assignment/form4/form4.component';
import { ReativeFormComponent } from './reative-form/reative-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LogInComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    BindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectivesComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReativeFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe
  ],
  imports: [
    BrowserModule,
    // AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot ([
      {path : 'home', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent},
      // {path : 'login', component : LogInComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component: EventBindingComponent},
      {path : 'two-way', component: TwoWayBindingComponent},
      {path : 'login', component : NgIfComponent},
      {path : 'ngfor', component : NgForComponent},
      {path : 'ngswitch', component : NgSwitchComponent},
      {path : 'register', component: RegisterComponent},
      {path : 'form1', component: Form1Component},
      {path : 'form2', component: Form2Component},
      {path : 'form3', component: Form3Component},
      {path : 'form4', component: Form4Component},
      {path : 'reactive-form', component : ReativeFormComponent},
      {path : 'parent', component : ParentComponent},
      {path : 'comment-details' , component : CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

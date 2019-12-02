import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchComponent } from './search/search.component';
import { RouterModule } from '@angular/router';
import { NavComponent } from './nav/nav.component';
import { HttpClientModule } from '@angular/common/http';
import { NewsComponent } from './news/news.component';

@NgModule({
  declarations: [
    AppComponent,
    CountriesComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchComponent,
    NavComponent,
    NewsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'news', component: NewsComponent },
      { path: 'countries', component: CountriesComponent },
      { path: 'categorycomponent', component: CategoriesComponent },
      { path: 'sourcecomponent', component: SourcesComponent },
      { path: 'sn', component: SearchComponent },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

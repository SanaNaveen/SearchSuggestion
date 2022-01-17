import { Component } from '@angular/core';
import { SearchBar } from './service/search.bar';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SearchBar';

  searchValue : string ;

  dataList = [];

  ulEnable : boolean = false;

  name : string = "";

  constructor(private searchService : SearchBar) {}


  getChar(data : KeyboardEvent){

    this.searchValue = "";
    this.searchValue += (data.target as HTMLInputElement).value ;
    let term = this.searchValue;

    let req = {
      "searchText" : this.searchValue
    }

    if(this.searchValue.length > 0){
      this.searchService.searchData(req).subscribe((data : any) => {

        this.dataList = data.responseList;
        this.ulEnable = true;
  
        //console.log(data);
  
      });
    }else{
      this.dataList = [];
      this.ulEnable = false;
    }

    
    /* this.dataList = this.dataList.filter(function(val) {
      return val.indexOf(term) >=0;
    }); */


   // console.log(this.searchValue);
    

  }

  setInputValue(event : any){

    
    this.name = event;
    this.ulEnable = false;


    

  }
}

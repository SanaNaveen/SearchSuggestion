import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn : 'root'
})
export class SearchBar {

    constructor(private http : HttpClient){}

	baseUrl = environment.baseUrl;
	
    searchData(data){

        return this.http.post(this.baseUrl+'api/searchData',data);
    }

}
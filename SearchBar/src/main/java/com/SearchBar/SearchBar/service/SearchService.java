package com.SearchBar.SearchBar.service;

import com.SearchBar.SearchBar.dto.ResponseDto;
import com.SearchBar.SearchBar.dto.SearchDto;

public interface SearchService {

	public ResponseDto searchData(SearchDto searchDto);
	
}

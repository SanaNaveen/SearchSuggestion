package com.SearchBar.SearchBar.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SearchBar.SearchBar.dto.ResponseDto;
import com.SearchBar.SearchBar.dto.SearchDto;
import com.SearchBar.SearchBar.service.SearchService;

/*
 * @author Sana Naveen
 * 
*/


@Controller
@RequestMapping("/api")
@CrossOrigin(value = "*")
public class SearchController {
	
	@Resource
	SearchService searchService;
	
	@PostMapping(value = "/searchData")
	public ResponseEntity<ResponseDto> searchData(@RequestBody SearchDto searchDto){
		
		ResponseDto dto = new ResponseDto();
		
		dto = searchService.searchData(searchDto);
		
		
		return new ResponseEntity<ResponseDto>(dto,HttpStatus.OK);
		
	}

}

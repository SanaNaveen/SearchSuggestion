package com.SearchBar.SearchBar.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.SearchBar.SearchBar.dto.ResponseDto;
import com.SearchBar.SearchBar.dto.SearchDto;
import com.SearchBar.SearchBar.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{

	@Override
	public ResponseDto searchData(SearchDto searchDto) {
		
		ResponseDto responseDto = new ResponseDto();
		
		List<String> dataList = new ArrayList<String>();
		dataList.add("Asia");
		dataList.add("India");
		dataList.add("China");
		dataList.add("Usa");
		dataList.add("Uk");
		dataList.add("New york");
		dataList.add("Toronta");
		dataList.add("Canada");
		dataList.add("Mexico");
		
		List<String> result = new ArrayList<>();
		
		result = dataList.stream().filter(x -> x.toLowerCase().startsWith(searchDto.getSearchText().toLowerCase()))
				.collect(Collectors.toList());
		
		responseDto.setResponseList(result);
		
		
		return responseDto;
	}

}

package com.infy.assign.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.assign.springboot.model.RemoveDuplicateArray;
import com.infy.assign.springboot.service.AssignmentService;

@RestController
public class AssignmentController {
	
	@Autowired
	private AssignmentService assignmentService;
	
	@RequestMapping("/api/fibonacci")
	public ResponseEntity<Long> findNthFibonacci(@RequestParam("n") int n){
	
		long fib=assignmentService.findNthFibonacci(n);
		
	return new 	ResponseEntity<Long>(fib,HttpStatus.OK);
	}
	
	@RequestMapping("/api/reverseword")
	public ResponseEntity<String> reverseWordInString(@RequestParam("sentence")String sentence){
	
		String rev=assignmentService.reverseWordInString(sentence);
		
	return new 	ResponseEntity<String>(rev,HttpStatus.OK);
	}
	
	@RequestMapping("/api/triangletype")
	public ResponseEntity<String> findTypeOfTriangle(@RequestParam("a")int a,@RequestParam("b")int b,@RequestParam("c")int c){
	
		String tri=assignmentService.findTypeOfTriangle(a,b,c);
		
	return new 	ResponseEntity<String>(tri,HttpStatus.OK);
	}
	
	@RequestMapping(value="/api/makeonearray",method=RequestMethod.POST)
	public ResponseEntity<List> removeDuplFromArray(@RequestBody RemoveDuplicateArray rmDuplArray){
	
		List<Integer> list=assignmentService.removeDuplFromArray(rmDuplArray);
		
	return new 	ResponseEntity<List>(list,HttpStatus.OK);
	}


}

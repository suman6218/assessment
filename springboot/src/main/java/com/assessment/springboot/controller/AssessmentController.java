package com.assessment.springboot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.springboot.service.AssessmentService;

@RestController
public class AssessmentController {
	
	@Autowired
	private AssessmentService assessmentService;
	
	@GetMapping("/api/fibonacci")
	public ResponseEntity<String> findNthFibonacci(@RequestParam("n") long n){
		System.out.println();
	
		String fib=assessmentService.findNthFibonacci(n);
		
	return new 	ResponseEntity<String>(fib,getHttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/api/reverseword")
	public ResponseEntity<String> reverseWordInString(@RequestParam("sentence")String sentence){
	
		String rev=assessmentService.reverseWordInString(sentence);
		
	return new 	ResponseEntity<String>(rev,getHttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/api/triangletype")
	public ResponseEntity<String> findTypeOfTriangle(@RequestParam("a")Integer a,@RequestParam("b")Integer b,@RequestParam("c")Integer c){
	
		String tri=assessmentService.findTypeOfTriangle(a,b,c);
		
	return new 	ResponseEntity<String>(tri,getHttpHeaders(),HttpStatus.OK);
	}
	
	@PostMapping(value="/api/makeonearray")
	public ResponseEntity<String> removeDuplFromArray(@RequestBody String json){		
	
		String list=assessmentService.removeDuplFromArray(json);	
		
	return new 	ResponseEntity<String>(list,getHttpHeaders(),HttpStatus.OK);
	}
	private HttpHeaders getHttpHeaders() {
		
		HttpHeaders headers=new HttpHeaders();	
		
		headers.add("pragma", "no-cache");
		headers.add("date", new Date().toString());		
		headers.add("content-type", "application/json;charset=UTF-8");
		headers.add("cache-control", "no-cache");
		//headers.add("content-encoding", "gzip");
		//headers.add("content-length","131");
		headers.add("expires", "-1");
		
	return headers;	
	}
	
}

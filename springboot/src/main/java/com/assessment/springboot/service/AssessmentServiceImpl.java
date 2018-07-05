package com.assessment.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.assessment.springboot.model.RemoveDuplicateArray;
import com.google.gson.Gson;

@Service("assessmentService")
public class AssessmentServiceImpl implements AssessmentService{
	
	public String findNthFibonacci(long n) {
		
		if(n==0) {
		return "n=>value should be greater than zero "
				+ "";	
		}
		if(n<0) {
			return "n=>value should be positive";	
		}
		long a = -1;
		long b = 1;
		long fib = 0;
		for (long loop = 0; loop <= n; loop++) {
			fib = a + b;
			a = b;
			b = fib;
		}
		return new Gson().toJson(fib);
	}

	public String reverseWordInString(String sentence) {
		
		if(sentence==null || sentence.isEmpty()) {
			return "Sentence should not empty";	
		}
		String[] words = sentence.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}

		return reversedString;
	}

	public String findTypeOfTriangle(Integer a, Integer b, Integer c) {
		
		if(a==null || b==null || c==null) {
			return "a,b,c value/s should not empty";
		}
		if(a==0 || b==0 || c==0) {
			return "a,b,c value/s should not be Zero";
		}	
		if(a<0 || b<0 || c<0) {
			return "a,b,c value/s should not be negative";
		}
		String type = "";
		if (a == b && b == c)
			type = "Equilateral";

		else if (a >= (b + c) || c >= (b + a) || b >= (a + c))
			type = "Not a triangle";

		else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a))
			type = "Isosceles";

		else if (a != b && b != c && c != a)
			type = "Scalene";

		return type;

	}

	public String removeDuplFromArray(String json) {
		
		if(json==null|| json.isEmpty()) {
		 return "JSON should not be empty";	
		}
		
		RemoveDuplicateArray rmvDuplicate=new Gson().fromJson(json, RemoveDuplicateArray.class);
		List<Integer> finalList = new ArrayList<Integer>();
		finalList.addAll(rmvDuplicate.getList1());
		finalList.addAll(rmvDuplicate.getList2());
		finalList.addAll(rmvDuplicate.getList3());
		Set<Integer> set = new TreeSet<Integer>(finalList);	
		
		
		return new Gson().toJson(set);
	}


}

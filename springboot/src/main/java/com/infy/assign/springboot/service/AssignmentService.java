package com.infy.assign.springboot.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.infy.assign.springboot.model.RemoveDuplicateArray;

@Service
public class AssignmentService {

	public long findNthFibonacci(int n) {

		long a = -1;
		long b = 1;
		long fib = 0;
		for (int loop = 0; loop <= n; loop++) {
			fib = a + b;
			a = b;
			b = fib;
		}
		return fib;
	}

	public String reverseWordInString(String sentence) {

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

	public String findTypeOfTriangle(int a, int b, int c) {

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

	public List<Integer> removeDuplFromArray(RemoveDuplicateArray rmvDuplicate) {

		List<Integer> finalList = new ArrayList<Integer>();

		finalList.addAll(rmvDuplicate.getList1());
		finalList.addAll(rmvDuplicate.getList2());
		finalList.addAll(rmvDuplicate.getList3());
		Set<Integer> set = new HashSet<Integer>(finalList);

		return new ArrayList<Integer>(set);
	}

}

package com.assessment.springboot;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.assessment.springboot.model.RemoveDuplicateArray;
import com.assessment.springboot.service.AssessmentServiceImpl;
import com.google.gson.Gson;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssessmentServiceTest {
	
	@Autowired
	private AssessmentServiceImpl assessmentService;
	
	/* Fibonacci unit test start */
	@Test
	public void findNegativeFibonacciTest(){
	
		String fib=assessmentService.findNthFibonacci(-1);
		System.out.println("@@@@@@@@ findNegativeFibonacciTest result:"+fib);		
	}
	@Test
	public void findZeroFibonacciTest(){
	
		String fib=assessmentService.findNthFibonacci(0);
		System.out.println("@@@@@@@@ findZeroFibonacciTest result:"+fib);		
	}
	
	@Test
	public void find5thFibonacciTest(){
	
		String fib=assessmentService.findNthFibonacci(5);
		System.out.println("@@@@@@@@ find5thFibonacciTest result:"+fib);		
	}
	@Test
	public void find8thFibonacciTest(){
	
		String fib=assessmentService.findNthFibonacci(8);
		System.out.println("@@@@@@@@ find8thFibonacciTest result:"+fib);		
	}
	/* Fibonacci unit test End */
	
	
	/* reverseWordInString unit test Start */
	@Test
	public void emptyWordInStringTest(){
	
		String rev=assessmentService.reverseWordInString("");
		System.out.println("@@@@@@@@ emptyWordInStringTest result:"+rev);		
	}
	@Test
	public void nullWordInStringTest(){
	
		String rev=assessmentService.reverseWordInString(null);
		System.out.println("@@@@@@@@ nullWordInStringTest result:"+rev);		
	}
	@Test
	public void reverseWordInStringTest(){
	
		String rev=assessmentService.reverseWordInString("How are you");
		System.out.println("@@@@@@@@ reverseWordInStringTest result:"+rev);		
	}
	/* reverseWordInString unit test End */
	
	
	/* Triangle unit test Start */
	@Test
	public void negativeTriangleTest(){
	
		String tri=assessmentService.findTypeOfTriangle(-1,-2,10);
		System.out.println("@@@@@@@@ negativeTriangleTest result:"+tri);		
	}
	@Test
	public void zeroTriangleTest(){
	
		String tri=assessmentService.findTypeOfTriangle(0,0,0);
		System.out.println("@@@@@@@@ zeroTriangleTest result:"+tri);		
	}
	@Test
	public void equilateralTriangleTest(){
	
		String tri=assessmentService.findTypeOfTriangle(10,10,10);
		System.out.println("@@@@@@@@ equilateralTriangleTest result:"+tri);		
	}
	@Test
	public void notTriangleTest(){
	
		String tri=assessmentService.findTypeOfTriangle(50,10,60);
		System.out.println("@@@@@@@@ notTriangleTest result:"+tri);		
	}
	@Test
	public void isoscelesTriangleTest(){
	
		String tri=assessmentService.findTypeOfTriangle(80,80,20);
		System.out.println("@@@@@@@@ isoscelesTriangleTest result:"+tri);		
	}
	@Test
	public void scaleneTriangleTest(){
	
		String tri=assessmentService.findTypeOfTriangle(60,40,80);
		System.out.println("@@@@@@@@ scaleneTriangleTest result:"+tri);		
	}
	/* Triangle unit test End */
	
	/* remove duplicate array unit test Start */
	@Test
	public void nullremoveDuplFromArrayTest(){
		
		String list=assessmentService.removeDuplFromArray("");	
		System.out.println("@@@@@@@@ nullremoveDuplFromArrayTest result:"+list);
		
	}
	@Test
	public void emptyremoveDuplFromArrayTest(){
		
		String list=assessmentService.removeDuplFromArray("");	
		System.out.println("@@@@@@@@ emptyremoveDuplFromArrayTest result:"+list);
		
	}
	@Test
	public void removeDuplFromArrayTest(){	
		
		RemoveDuplicateArray array=new RemoveDuplicateArray();
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		List<Integer> list3=new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		list2.add(10);
		list2.add(50);
		list2.add(30);
		list2.add(60);
		
		list3.add(60);
		list3.add(20);
		list3.add(70);
		list3.add(80);
		
		array.setList1(list1);
		array.setList2(list2);
		array.setList3(list3);
		String list=assessmentService.removeDuplFromArray(new Gson().toJson(array));	
		System.out.println("@@@@@@@@ removeDuplFromArrayTest result:"+list);
		
		/* remove duplicate array unit test End */
	}
	
	
	

}

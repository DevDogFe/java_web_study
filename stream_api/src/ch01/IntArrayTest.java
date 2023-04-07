package ch01;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntArrayTest {

	public static void main(String[] args) {
		//1. 배열 + Stream
		int[] arr = {1, 2, 3, 4, 5};
		
		int sumVal = Arrays.stream(arr).sum(); //최종 연산
		System.out.println(sumVal);
		long count = Arrays.stream(arr).count();
		System.out.println(count);

	} // end of main

} // end of class

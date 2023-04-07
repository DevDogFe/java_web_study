package ch01;

public class MainTest1 {

	// main
	public static void main(String[] args) {

		Integer num = new Integer(8); // 박싱
		int n = num.intValue(); // 언박싱
		// int n = num; // 자동 언박싱
		
		System.out.println(n); 
		
		System.out.println("=======================");
		
		Integer num2 = 30; // 자동 박싱
		
		int result = num2 + 20;
		
		System.out.println(result);
		
	} // end of main

} // end of class

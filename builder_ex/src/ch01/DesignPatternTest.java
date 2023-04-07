package ch01;

public class DesignPatternTest {

	public static void main(String[] args) {

		DesignPattern.getInstance().method2(); // 변수없이 메소드2 사용 
		DesignPattern singleTone = DesignPattern.getInstance(); // 싱글톤 객체를 지역변수로 가져옴
		System.out.println(singleTone.method1()); // method1 사용
		
		
	} // end of main

}

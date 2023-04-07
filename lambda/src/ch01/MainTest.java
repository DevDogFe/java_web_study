package ch01;

public class MainTest {

	/*
	 * 람다식(Lambda expression)
	 * 
	 * - 자바8부터 함수형 프로그래밍 방식을 지원함. 이를 람다식이라 한다.
	 * 
	 * 함수형 프로그래밍? (FP: Functional Programming)
	 * 함수를 기반으로하는 프로그래밍 입력방식 매개변수로 전달받는 입력 외에
	 * 외부 자료(데이터)를 사용하지 않아 여러 자료가 동시에 수행되는 
	 * 병렬 처리 가능한 코딩방식이다.
	 * 
	 * 순수함수(Pure Function)를 구현하고 호출함으로써 외부자료에 부수적인 영향(side effect)을
	 * 주지 않도록 구현하는 방식이다.
	 * 
	 * 익명함수 
	 * --> 컴파일러가 타입추론이 가능하기 때문에 코드를 줄여서 사용할 수 있는 개념으로발전되었다.
	 * 
	 * () -> {System.out.println("반가워 람다");};
	 * (x) -> {System.out.println(x + "<<<");}; // 매개변수를 구현부에 끌어 사용
	 * x -> {}; // 매개변수가 하나일 때 괄호 생략
	 * x -> System.out.println("반가워 람다"); // 구현부 중괄호 생략해도 됨
	 * 
	 * !! 람다식을 사용하기 위해 반드시 선행되어야 할 부분 !!
	 * 인터페이스가 먼저 만들어져있어야한다.
	 * */
	
	
	// main
	public static void main(String[] args) {
		
		// int cal(int x, int y);
		
		// 1. 인터페이스가 있어야한다.
		// 2. 어떻게 구현할지 식을 재정의한다. (람다표현식으로)
		IAdd iAdd = (x, y) -> {return x + y;};
		IAdd iSub = (x, y) -> {return x - y;};
		
		int resultAdd = iAdd.cal(5, 6);
		System.out.println(resultAdd);
		int resultSub = iSub.cal(6, 5);
		System.out.println(resultSub);
		
		// 람다 표현식 만들기
		// 람다 표현식을 만들기 위해서는 대상 인터페이스 내에 추상메소드가 하나만 정의되어 있어야한다.
		IPrint iPrint = (a, b) -> {System.out.println(a + " : " + b);};
		iPrint.myPrint("홍길동", "asd123");
		
		IPrint2 iPrint2 = () -> {return "헬로 람다";};
		System.out.println(iPrint2.print());
		

	} // end of main

} // end of class



interface IPrint {
	
	void myPrint(String str, String token);
}

interface IPrint2 {
	String print();
}
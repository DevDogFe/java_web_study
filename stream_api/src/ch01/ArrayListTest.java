package ch01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		// 자료구조 <- 스트림 생성 가능
		// 스트림은 최종연산 or 중간연산 + 최종연산 다 가능
		// 최종연산: sum(), count, forEach()
		// 중간연산: map(), filter(), sorted()
		/* 
		 * map: 데이터 형변환
		 * filter: 걸러내기
		 * sorted: 정렬
		 * */
		
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		// 스트림 생성
		Stream<String> stream = sList.stream();
		
		// 최종연산 forEach
		// 중간연산과 최종연산 구현은 람다식 활용
		// 코드의 양을 줄이고 가독성을 높일 수 있다.
		stream.forEach(s -> { System.out.print(s + " ");});
		System.out.println("");
		System.out.println("=======================");
		
		// 중간연산 + 최종연산
		// sorted + forEach
		sList.stream().sorted().forEach( s -> {System.out.print(s + " ");});
		System.out.println("");
		System.out.println("=======================");
		// map + forEach
		sList.stream().map(s ->  s.length()).forEach(s -> System.out.print(s + ": 갯수확인\n"));
		System.out.println("");
		System.out.println("=======================");
		// filter + forEach
		sList.stream().filter(s -> s.length() > 4).forEach(s -> System.out.print(s + " "));
		

	} // end of main

} // end of class

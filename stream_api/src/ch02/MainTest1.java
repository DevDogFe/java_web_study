package ch02;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		// 자료구조 Stream API 사용
		
		ArrayList<String> list = new ArrayList<>();
		list.add("123");
		list.add("456");
		list.add("bbb@gmail.com");
		list.add("bbssdsdbbbbbbbb@gmail.com");
		list.add("abc");
		list.add("asd");
		list.add("asd@test.com");
		list.add("ddd@naver.com");
		ArrayList<String> emailList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		list.stream().filter(s -> s.indexOf("@") > 0 && s.length() < 20 ).forEach(s -> emailList.add(s));
		emailList.stream().forEach(s -> System.out.println(s));
		list.stream().filter(s -> s.indexOf("@") < 0).forEach(s -> strList.add(s));
		System.out.println("===========================");
		strList.stream().forEach(s -> System.out.println(s));
		
		
		
		

	} // end of main

}

package ch01;

import ch01.Todo.MyBuilder;

public class MainTest {

	// main
	public static void main(String[] args) {
		Todo todo1 = new MyBuilder().setComplete(1).build();
		Todo todo2 = new MyBuilder().setContent("잠자기").build();
		Todo todo3 = new MyBuilder().setComplete(0).setContent("청소").build();
		
		System.out.println(todo1.getComplete());
		System.out.println(todo2.getContent());
		System.out.println(todo3.getComplete() + " " + todo3.getContent());
		
		
		
	} // end of main

} // end of class

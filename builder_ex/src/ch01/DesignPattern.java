package ch01;

public class DesignPattern {

	private static DesignPattern instance; //자기자신 멤버변수로 선언
	private static final String MSG1 = "싱글톤패턴 method1() 메소드 사용";
	
	private DesignPattern() {} // 생성자는 private로하여 다른 곳에서 객체 생성 막아둠
	
	// 다른곳에서 객체를 끌어다 쓸 수 있는 getInstance() 메소드 생성
	public static DesignPattern getInstance() {
		if(instance == null) {
			instance = new DesignPattern();
		}
		return instance;
	}
	
	public static String method1() {
		return MSG1;
	}
	
	public void method2() {
		System.out.println("싱글톤 패턴 method2() 사용");

	}
}

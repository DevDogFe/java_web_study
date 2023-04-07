package ch01;

public class AirConditioner implements Electronic220v{

	// 전기를 연결하다.
	@Override
	public void connect() {
		System.out.println("에어컨 연결 220v ON");
	}
}

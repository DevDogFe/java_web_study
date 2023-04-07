package ch01;

// 어댑터 패턴 설계
public class TencoAdapter implements Electronic220v {
	
	Electronic110v electronic110v;
	
	// 생성할 때 변환할 타입 넣음
	public TencoAdapter(Electronic110v electronic110v) {
		this.electronic110v = electronic110v;
	}
	
	@Override
	public void connect() {
		electronic110v.connect();
	}
	
}

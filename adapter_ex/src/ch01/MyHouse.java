package ch01;


public class MyHouse {
	
	// main
	public static void main(String[] args) {
		
		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		HairDryer dryer = new HairDryer();
		
		connect(airConditioner);
		connect(cleaner);
		// connect(dryer); // 110v라 불가
		
		// 어댑터 준비 TencoAdapter.java
		TencoAdapter adapterHairDryer = new TencoAdapter(dryer);
		adapterHairDryer.connect();
		
	} // end of main
	
	// 전기 콘센트
	public static void connect(Electronic220v electronic220v) {
		electronic220v.connect();
	}

} // end of class

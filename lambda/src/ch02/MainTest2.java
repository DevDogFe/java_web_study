package ch02;

public class MainTest2 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println("i: " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}).start();
		
		new Thread(()->{
			for(int i = 0; i < 10; i++) {
				System.out.println("i: " + i + " 람다");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

}

package ch02;

import java.util.Arrays;

public class MainTestEx {

	// main
	public static void main(String[] args) {

		IMaxNumber2 iMaxNumber = (numbers) -> {
			Arrays.sort(numbers);
			int max = numbers[numbers.length - 1];
			return max;
		};
		IMaxNumber2 iMinNumber = (numbers) -> {
			Arrays.sort(numbers);
			int min = numbers[0];
			return min;
		};
		
		int[] is = {1, 2, 3, 4, 5, 10, 100, 55};
		int max = iMaxNumber.getMax(is);
		System.out.println(max);
		int[] is2 = {22,13,42,24,5,6,45,34,22};
		System.out.println(iMaxNumber.getMax(is2));
		System.out.println(iMinNumber.getMax(is));
		System.out.println(iMinNumber.getMax(is2));
		
		
		IDrive iDrive = str->{
			System.out.println(str + "합니다.");
		};
		iDrive.drive("좌회전");
		iDrive.drive("우회전");
		iDrive.drive("직진");
		iDrive.drive("감속");
		iDrive.drive("정지");
		
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(i + "start");
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(i + "run");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).run();
		

	} // end of main

} // end of class

@FunctionalInterface
interface IMaxNumber2 {

	int getMax(int[] numbers);
}

interface IDrive{
	
	void drive(String str);
}
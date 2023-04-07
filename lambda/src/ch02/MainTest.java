package ch02;

public class MainTest {

	// main
	public static void main(String[] args) {

		IMaxNumber maxInt = new IMaxNumber() {

			@Override
			public int getMax(int a, int b) {
				if (a > b) {
					return a;
				}
				return b;
			}
		};

		int i = maxInt.getMax(1, 2);
		System.out.println(i);

		IMaxNumber lambdaMaxInt = (x, y) -> {
			return x > y ? x : y;
		};
		
		System.out.println(lambdaMaxInt.getMax(50, 51));

	} // end of main

} // end of class


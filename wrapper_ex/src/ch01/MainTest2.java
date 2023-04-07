package ch01;

public class MainTest2 {

	// main
	public static void main(String[] args) {

		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		double d = Double.parseDouble(str2);
		boolean flag = Boolean.parseBoolean(str3);
		
		System.out.println(b + " " + i + " " + d + " " + flag +" " + !flag);
		
	} // end of main

}

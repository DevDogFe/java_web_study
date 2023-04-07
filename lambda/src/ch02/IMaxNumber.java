package ch02;

@FunctionalInterface // @FunctionalInterface: 추상메서드 하나로 제한 
public interface IMaxNumber {
	int getMax(int a, int b);
}

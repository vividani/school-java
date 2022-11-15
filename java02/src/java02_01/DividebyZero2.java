package java02_01;

public class DividebyZero2 {

	public static void main(String[] args) {
		int x = 10, y = 0;
		try {
			System.out.println(x+'/'+y+'='+x/y);
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나누기 금지");
		}
	}

}

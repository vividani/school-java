package chapter04;
import java.util.*;
public class MathFunctions {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("!(factorial연산), exp(지수연산), max(최대값) 이 세 연산자 중의 하나를 사용하여 연산 수식을 입력하세요 ");
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt(); String op = s.next();
		
		switch(op) {
		case "!": System.out.println(num1 + "!" + " = " + factorial(num1)); break;
		case "exp": num2 = s.nextInt(); System.out.println(num1+ "의 "+num2+"승 = "+ exp(num1,num2)); break;
		case "max": num2 = s.nextInt(); System.out.println(num1+ "와 "+ num2+ "중의 최대값은 " +max(num1,num2)); break;
		default: System.out.println("잘못된 수식이 입력되었습니다.");
		}

		s.close();

	}
	static int factorial(int x) {
		if (x == 0)
			return 1;
		else
			return x * factorial(x-1);
		
	}
	
	static int exp(int x, int y) {
		if (y == 0)
			return 1;
		else
			return x * exp(x, y-1);
	}
	
	static int max(int x, int y) {
		if (x < y)
			return y;
		else 
			return x;
	}
}

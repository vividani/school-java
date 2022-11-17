package chapter04;
import java.util.*;
public class MathFunctions {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("!(factorial����), exp(��������), max(�ִ밪) �� �� ������ ���� �ϳ��� ����Ͽ� ���� ������ �Է��ϼ��� ");
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt(); String op = s.next();
		
		switch(op) {
		case "!": System.out.println(num1 + "!" + " = " + factorial(num1)); break;
		case "exp": num2 = s.nextInt(); System.out.println(num1+ "�� "+num2+"�� = "+ exp(num1,num2)); break;
		case "max": num2 = s.nextInt(); System.out.println(num1+ "�� "+ num2+ "���� �ִ밪�� " +max(num1,num2)); break;
		default: System.out.println("�߸��� ������ �ԷµǾ����ϴ�.");
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

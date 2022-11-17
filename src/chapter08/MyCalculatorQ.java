package chapter08;
import java.util.*;

class CalculatorQ {
	String type;
	
	CalculatorQ(String t) {type = t;}
	
	void add(int x, int y) {			//메소드 -덧셈
		System.out.println(type+ ": " +x+ " + " +y+ " = " +(x+y));
	}
	
	void sub(int x, int y) {			//메소드 -뺄셈
		System.out.println(type+ ": " +x+ " - " +y+ " = " +(x-y));
	}
	
	void mul(int x, int y) {			//메소드 -곱셈
		System.out.println(type+ ": " +x+ " * " +y+ " = " +(x*y));
	}
	
	void div(int x, int y) {			//메소드 -나눗셈
		if (y != 0) System.out.println(type+ ": " +x+ " / " +y+ " = " +(x/y));
		else 		System.out.println("나누는 수가 0이면 계산 불가");

	}
	
	void left(int x, int y) {			//메소드 -나머지연산
		if (y != 0) System.out.println(type+ ": " +x+ " % " +y+ " = " +(x%y));
		else 		System.out.println("나누는 수가 0이면 계산 불가");
	}
	
	void exp(int x, int y) {			//메소드 -지수연산
		int ans = 1;
		for (int i = 1; i < y +1; i++)
			ans *= x;
		System.out.println(type+ ": " +x+ "의 " +y+ "승 = " +ans);
	
	}
	
}//class CalculatorQ(계산기 클래스)

class MyCalculatorQ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("생성할 계산기의 종류를 입력하세요 (예: 공학용계산기 / 핸드폰계산기 / 과학용계산기 등 띄어쓰기 없이 입력) => ");
		String type = s.next();
		CalculatorQ cal = new CalculatorQ(type);
		int data1, data2, end = 1;
		String op;
		
		while (end == 1) {
			System.out.print("\n계산할 수식을 다음과 같이 입력하세요.\n연산은 +, -, *, / 4칙연산과 %연산, 지수연산인 exp 6가지 중에 선택하세요. 예: 42 % 5 또는 10 exp 2 => ");
			data1 = s.nextInt(); op = s.next(); data2 = s.nextInt();
			switch(op) {
			case "+" : cal.add(data1, data2); break;
			case "-" : cal.sub(data1, data2); break;
			case "*" : cal.mul(data1, data2); break;
			case "/" : cal.div(data1, data2); break;
			case "%" : cal.left(data1, data2); break;
			case "exp" : cal.exp(data1, data2); break;
			default : System.out.println("잘못된 연산자가 입력되었어요.");
			}
			System.out.print("프로그램 종료를 원하시면 2, 계속하고 싶으면 1을 입력 => ");
			end = s.nextInt();
		}
		
		s.close();
		}//main

}//프로그램 종료

package chapter08;

class Calculator {
	String type;						//계산기 종류
	
	Calculator(String t) {type = t;};	//생성자 -계산기 종류를 입력받아 저장하는 역할
	
	void add(int x, int y) {			//메소드 -덧셈
		System.out.println(x+ " + " +y+ " = " +(x+y));
	}
	
	void sub(int x, int y) {			//메소드 -뺄셈
		System.out.println(x+ " - " +y+ " = " +(x-y));
	}
	
	void mul(int x, int y) {			//메소드 -곱셈
		System.out.println(x+ " * " +y+ " = " +(x*y));
	}
	
	void div(int x, int y) {			//메소드 -나눗셈
		if (y != 0) System.out.println(x+ " / " +y+ " = " +(x/y));
		else 		System.out.println("나누는 수가 0이면 계산 불가");

	}
}//클래스 Calculator 정의


public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal1;
		Calculator cal2;
		
		cal1 = new Calculator("공학용계산기");
		cal2 = new Calculator("핸드폰계산기");
		
		cal1.add(10, 20);
		cal1.sub(100, 50);
		cal1.mul(30,4);
		cal1.div(100, 25);
		
		cal2.add(500, 1000);
		cal2.sub(250, 100);
		cal2.mul(50, 20);
		cal2.div(300, 5);

	}

}

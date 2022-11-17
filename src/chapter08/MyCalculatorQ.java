package chapter08;
import java.util.*;

class CalculatorQ {
	String type;
	
	CalculatorQ(String t) {type = t;}
	
	void add(int x, int y) {			//�޼ҵ� -����
		System.out.println(type+ ": " +x+ " + " +y+ " = " +(x+y));
	}
	
	void sub(int x, int y) {			//�޼ҵ� -����
		System.out.println(type+ ": " +x+ " - " +y+ " = " +(x-y));
	}
	
	void mul(int x, int y) {			//�޼ҵ� -����
		System.out.println(type+ ": " +x+ " * " +y+ " = " +(x*y));
	}
	
	void div(int x, int y) {			//�޼ҵ� -������
		if (y != 0) System.out.println(type+ ": " +x+ " / " +y+ " = " +(x/y));
		else 		System.out.println("������ ���� 0�̸� ��� �Ұ�");

	}
	
	void left(int x, int y) {			//�޼ҵ� -����������
		if (y != 0) System.out.println(type+ ": " +x+ " % " +y+ " = " +(x%y));
		else 		System.out.println("������ ���� 0�̸� ��� �Ұ�");
	}
	
	void exp(int x, int y) {			//�޼ҵ� -��������
		int ans = 1;
		for (int i = 1; i < y +1; i++)
			ans *= x;
		System.out.println(type+ ": " +x+ "�� " +y+ "�� = " +ans);
	
	}
	
}//class CalculatorQ(���� Ŭ����)

class MyCalculatorQ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ ������ ������ �Է��ϼ��� (��: ���п���� / �ڵ������� / ���п���� �� ���� ���� �Է�) => ");
		String type = s.next();
		CalculatorQ cal = new CalculatorQ(type);
		int data1, data2, end = 1;
		String op;
		
		while (end == 1) {
			System.out.print("\n����� ������ ������ ���� �Է��ϼ���.\n������ +, -, *, / 4Ģ����� %����, ���������� exp 6���� �߿� �����ϼ���. ��: 42 % 5 �Ǵ� 10 exp 2 => ");
			data1 = s.nextInt(); op = s.next(); data2 = s.nextInt();
			switch(op) {
			case "+" : cal.add(data1, data2); break;
			case "-" : cal.sub(data1, data2); break;
			case "*" : cal.mul(data1, data2); break;
			case "/" : cal.div(data1, data2); break;
			case "%" : cal.left(data1, data2); break;
			case "exp" : cal.exp(data1, data2); break;
			default : System.out.println("�߸��� �����ڰ� �ԷµǾ����.");
			}
			System.out.print("���α׷� ���Ḧ ���Ͻø� 2, ����ϰ� ������ 1�� �Է� => ");
			end = s.nextInt();
		}
		
		s.close();
		}//main

}//���α׷� ����

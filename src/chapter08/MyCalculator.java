package chapter08;

class Calculator {
	String type;						//���� ����
	
	Calculator(String t) {type = t;};	//������ -���� ������ �Է¹޾� �����ϴ� ����
	
	void add(int x, int y) {			//�޼ҵ� -����
		System.out.println(x+ " + " +y+ " = " +(x+y));
	}
	
	void sub(int x, int y) {			//�޼ҵ� -����
		System.out.println(x+ " - " +y+ " = " +(x-y));
	}
	
	void mul(int x, int y) {			//�޼ҵ� -����
		System.out.println(x+ " * " +y+ " = " +(x*y));
	}
	
	void div(int x, int y) {			//�޼ҵ� -������
		if (y != 0) System.out.println(x+ " / " +y+ " = " +(x/y));
		else 		System.out.println("������ ���� 0�̸� ��� �Ұ�");

	}
}//Ŭ���� Calculator ����


public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal1;
		Calculator cal2;
		
		cal1 = new Calculator("���п����");
		cal2 = new Calculator("�ڵ�������");
		
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

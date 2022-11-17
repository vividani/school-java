package chapter11;

class Calculator{
	int i, j;
	Calculator() {	}
	
	void add(int x, int y) {
		System.out.println(x+ "+" +y+ "=" +(x+y));
	}
	
	void substract(int x, int y) {
		System.out.println(x+ "-" +y+ "=" +(x-y));
	}
	
}
class Multi_Calculator extends Calculator{
	
	void multiply(int x, int y) {
		System.out.println(x+ "x" +y+ "=" +x*y);
	}
	
	void divide(int x, int y) {
		if(y != 0)
			System.out.println(x+ "/" +y+ "=" +x/y);
		else
			System.out.println("������ ���� 0�̸� �ȵ�");
	}
}

public class UseCalculator {

	public static void main(String[] args) {	// �� ������ ���� ��ü ���� �� ���
		
		Calculator cal = new Calculator(); // ����,���� ���� ��ü ����
		cal.add(10, 20);
		cal.substract(100, 50);
		
		Multi_Calculator cal2 = new Multi_Calculator(); //��Ģ���� ���� ��ü ����
		cal2.add(100, 200);
		cal2.substract(50, 25);
		cal2.multiply(4, 5);
		cal2.divide(100, 4);


	}

}

package chapter13; /*�޼ҵ� ���� :stop*/

class Vehicle {
	String name;
	String number;
	int year;
	String company;
	int tot;

	int gas;
	int cost;
	int pay, tot_pay; //�����ܰ�, �����, (���� ������)���
	
	
	Vehicle(String n, String no, int y, String c){
		name = n;	number = no;	year = y;	company = c;
	}
	
	void gas(int g, int c) {
		gas =+ g;	cost = c;
		System.out.println(number+ " " +name+ "�� " +g+ "���� ��ŭ�� ���Ḧ �־� �����ܰ�� " +gas+ "�����̰� " +c+ "���� ����� �����Ѵ�.");
	}
	
	int velo;	int distance;
	void drive(int v, int d) { //v�� ����ӵ�, d�� ���� �Ÿ�(m)
		velo = v;	distance = d;
		int used_gas;
		if(v <= 60) {
			used_gas = d/10000;
		}
		else if(v > 60 && v <= 80) {
			used_gas = (int)(d*1.5/10000);
		}
		else
			used_gas = d*2/10000;
		
		gas =- used_gas;
		System.out.println(number+ " " +name+ "�� " +v+ "�ӵ��� " +d+ "m�� �����Ͽ� " +used_gas+ "������ ���� �Ҹ� �Ѵ�. ���� �ܰ��" +gas);
	}
	
	void deposit() { //��� ���� (��� - �����)
		tot = tot_pay - cost;
		System.out.println(number+ " " +name+ "�� " +company+ "�� " +tot+ "���� �糳���� �Ա��Ѵ�.");
	}
	
	void park(String lo) { //lo�� ������ ���
		System.out.println(number+ " " +name+ "�� " +lo+ "�� �����Ѵ�.");
	}
}

//�¾���
interface Stop { 
	/*public �� �־ ��*/void stop(int a, int s, int d);
}

class Bus extends Vehicle implements Stop {
	Bus(String n, String no, int y, String c){
		super(n, no, y, c);
	}
	
	public void stop(int a, int s, int d) {
		if (distance <= 10000)
			pay = 1200*a + 800*s;
		else 
			pay = (int)(1200*1.5*a + 800*1.5*s); 
		
		super.tot_pay =+ pay;
		System.out.println(number+ " " +name+ "�� �" +a+ "��, �л� " +s+ "���� ��� " +pay+ "�� �޾Ƽ� �糳�� �Ѿ��� " +(super.tot_pay-super.cost));
	}
	
}

class Taxi extends Vehicle implements Stop {
	Taxi(String n, String no, int y, String c){
		super(n, no, y, c);
	}

	public void stop(int a, int s, int d) {
		if (distance <= 2000)
			pay = 3000;
		else
			pay = 3000 + (distance - 2000)*142/100;
		
		super.tot_pay =+ pay;
		System.out.println(number+ " " +name+ "�� ��� " +pay+ "�� �޾Ƽ� �糳�� �Ѿ��� " +(super.tot_pay-super.cost));
	}
		
}


public class CreateVehicles {

	public static void main(String[] args) {
		Bus b120 = new Bus ("120�� ����", "12�� 3456", 2019, "���ﱳ��");
		b120.gas(10, 30000);
		b120.drive(50, 10000);
		b120.stop(20, 10, 10000);
		b120.drive(80, 20000);
		b120.stop(10, 5, 20000);
		b120.deposit();
		b120.park("���� ������");

		Taxi t = new Taxi ("ȸ���ý�", "56�� 1234", 2018, "ok����");
		t.gas(5, 15000);
		t.drive(60, 10000);
		t.stop(1, 0, 10000);
		t.drive(80, 20000);
		t.stop(2, 1, 20000);
		t.deposit();
		t.park("����������");
	}

}

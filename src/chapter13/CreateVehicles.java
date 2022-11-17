package chapter13; /*메소드 종류 :stop*/

class Vehicle {
	String name;
	String number;
	int year;
	String company;
	int tot;

	int gas;
	int cost;
	int pay, tot_pay; //연료잔고, 연료비, (고객이 지불한)요금
	
	
	Vehicle(String n, String no, int y, String c){
		name = n;	number = no;	year = y;	company = c;
	}
	
	void gas(int g, int c) {
		gas =+ g;	cost = c;
		System.out.println(number+ " " +name+ "가 " +g+ "리터 만큼의 연료를 넣어 연로잔고는 " +gas+ "리터이고 " +c+ "원의 요금을 지불한다.");
	}
	
	int velo;	int distance;
	void drive(int v, int d) { //v는 주행속도, d는 주행 거리(m)
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
		System.out.println(number+ " " +name+ "가 " +v+ "속도로 " +d+ "m를 주행하여 " +used_gas+ "리터의 연료 소모를 한다. 연료 잔고는" +gas);
	}
	
	void deposit() { //요금 정산 (요금 - 연료비)
		tot = tot_pay - cost;
		System.out.println(number+ " " +name+ "가 " +company+ "에 " +tot+ "원의 사납금을 입금한다.");
	}
	
	void park(String lo) { //lo는 주차한 장소
		System.out.println(number+ " " +name+ "가 " +lo+ "에 주차한다.");
	}
}

//맞았음
interface Stop { 
	/*public 안 넣어도 됨*/void stop(int a, int s, int d);
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
		System.out.println(number+ " " +name+ "에 어른" +a+ "명, 학생 " +s+ "명의 요금 " +pay+ "원 받아서 사납금 총액은 " +(super.tot_pay-super.cost));
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
		System.out.println(number+ " " +name+ "에 요금 " +pay+ "원 받아서 사납금 총액은 " +(super.tot_pay-super.cost));
	}
		
}


public class CreateVehicles {

	public static void main(String[] args) {
		Bus b120 = new Bus ("120번 버스", "12사 3456", 2019, "서울교통");
		b120.gas(10, 30000);
		b120.drive(50, 10000);
		b120.stop(20, 10, 10000);
		b120.drive(80, 20000);
		b120.stop(10, 5, 20000);
		b120.deposit();
		b120.park("본사 차고지");

		Taxi t = new Taxi ("회사택시", "56가 1234", 2018, "ok교통");
		t.gas(5, 15000);
		t.drive(60, 10000);
		t.stop(1, 0, 10000);
		t.drive(80, 20000);
		t.stop(2, 1, 20000);
		t.deposit();
		t.park("서울주차장");
	}

}

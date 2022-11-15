package java02_04;

class Road {
	private String color = "green";
	
	public synchronized void car_go() {
		while(color != "green") {
			try {wait();}
			catch(InterruptedException e) {}
		}
		System.out.println("차가 주행한다.");
		color = "yellow";
		notifyAll(); //������� ��� �����带 ����� == car_go, bike_go, pade_go ��� ����
	}
	public synchronized void bike_go() {
		while(color != "yellow") { //�ٸ� �޼ҵ尡 ������ ���� wait (���� �ʴ� ���, ���� ������)
			try {wait();}
			catch(InterruptedException e) {}
		}
		System.out.println("�����Ű� �޸���.");
		color = "red";
		notifyAll();
	}
	public synchronized void pade_go() {
		while(color != "red") {
			try {wait();}
			catch(InterruptedException e) {}
		}
		System.out.println("�����ڰ� ���� �ǳʹ�.");
		color = "green";
		notifyAll();
	}
	
}
class Car extends Thread {
	private Road road;
	public Car(Road c) {
		road = c;
	}
	public void run() {
		for(int i=0; i<3; i++)
			road.car_go();
	}
}

class Bike extends Thread {
	private Road road;
	public Bike(Road b) {
		road = b;
	}
	public void run() {
		for(int i=0; i<3; i++)
			road.bike_go();
	}
}

class Padestrian extends Thread {
	private Road road;
	public Padestrian(Road p) {
		road = p;
	}
	public void run() {
		for(int i=0; i<3; i++)
			road.pade_go();
	}
}

public class ThreeSignal {

	public static void main(String[] args) {
		
		Road r = new Road();
		Car c = new Car(r);
		Bike b = new Bike(r);
		Padestrian p = new Padestrian(r);
		c.start();
		b.start();
		p.start();
	
	}

}

package chapter13;

interface Birds{
	void fly();
}
class Rats{
	public void gnaw() {
		System.out.println("���� ���� ������ ����.");
	}
}
class Flights implements Birds{
	public void takeoff() {
		System.out.println("����Ⱑ �̷��ϴ�.");
	}
	public void land() {
		System.out.println("����Ⱑ �����ϴ�.");
	}
	public void fly() {
		System.out.println("����Ⱑ �����ϴ�.");
	}
}
class Bats extends Rats implements Birds{
	public void hangdown() {
		System.out.println("õ�忡 �Ŵ޸���.");
	}
	public void fly() {
		System.out.println("������ �۴��Ÿ���.");
	}
}

public class PlayBats {
	public static void main(String[] args) {
		Bats little = new Bats();
		little.gnaw();
		little.hangdown();
		little.fly();
		
		Flights boing = new Flights();
		boing.takeoff();
		boing.fly();
		boing.land();
	}
}

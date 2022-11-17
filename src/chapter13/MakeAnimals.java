package chapter13;

interface Animals {
	void eat(String str);
	void sleep(int time);
}

interface Mammal extends Animals {
	void bear(int num);
}

interface Birds1 extends Animals {
	void fly();
}

class Rats1 implements Mammal {
	String name;
	public Rats1(String str) {
		name = str;
	}
	public void gnaw() {
		System.out.println(name+ "�� ���� ���ƸԴ�.");
	}
	public void eat(String str) {
		System.out.println(name+ "�� " +str+ "�� �Դ�.");
	}
	public void sleep(int time) {
		System.out.println(name+ "��  " +time+ "�ð��� �ܴ�.");
	}
	public void bear(int num) {
		System.out.println(name+ "�� " +num+ "������ ������ ����.");
	}
}
	
class Bats1 extends Rats1 implements Birds1{
	public Bats1(String name) {
		super(name);
	}
	public void hangdown() {
		System.out.println(name+ "�� õ�忡 �Ŵ޸���.");
	}
	public void fly() {
		System.out.println(name+ "�� ����.");
	}
}

class Flights1 implements Birds1{
	String name;
	Flights1(String n) {
		name = n;
	}
	public void takeoff() {
		System.out.println(name+ "����Ⱑ �̷��ϴ�.");
	}
	public void land() {
		System.out.println(name+ "����Ⱑ �����ϴ�.");
	}
	public void fly() {
		System.out.println(name+ "����Ⱑ �����ϴ�.");
	}
	public void eat(String str) {
		System.out.println(name+ "��" +str+ "�� �����Ѵ�.");
	}
	public void sleep(int time) {
		System.out.println(name+ "��" +time+ "�ð����� �����Ǵ�.");
	}

}

public class MakeAnimals {

	public static void main(String[] args) {
		Rats1 mickey = new Rats1("�����Ű");
		mickey.eat("��");
		mickey.sleep(6);
		mickey.bear(10);
		mickey.gnaw();
		
		Bats1 little = new Bats1("����");
		little.eat("����");
		little.sleep(5);
		little.bear(3);
		little.gnaw();
		little.hangdown();
		little.fly();
		
		Flights1 boing = new Flights1("����707");
		boing.takeoff();
		boing.fly();
		boing.land();
	}

}

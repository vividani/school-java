package java02_04;

class Printer {
	
	static int num = 0; //static�� ����� ����� ��� �޶���
	
	synchronized void printing(String name) {
		System.out.println(name+ "��" + num++ +"��°�� ������ ���");
	}
	
}


class PC extends Thread {
	
	Printer sp;
	
	PC(Printer p, String name) {
		super(name);
		sp = p;
	}
	
	public void run() {
		for(int i=0; i<3; i++)
			sp.printing(getName());
	}
	
}


public class SyncPCThread {
	public static void main(String[] args) {
		Printer printer = new Printer();
		PC c1 = new PC(printer, "1");
		PC c2 = new PC(printer, "2");
		PC c3 = new PC(printer, "3");
		c1.start();
		c2.start();
		c3.start();
	}
}
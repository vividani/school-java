package java02_04;

class SharedPrinter {
	
	int signal = 1;
	
	synchronized void usingPrinter(int n) {
		System.out.println(n+ "���� ����");
		
		while(signal != n) {
			try { wait();
			} catch (InterruptedException e) { return; }
		}
		
		System.out.println(n+ "���� �����ͷ� ���");
		
		if (signal == 3) signal = 1;
		else signal++;
		System.out.println(n+"���� ����");
		notifyAll();
	}	
}

class PC2 extends Thread {
	SharedPrinter sp; int number;
	
	PC2(SharedPrinter p, int n) {
		sp = p; number = n;
	}
	
	public void run() {
		for(int i=0; i<3; i++)
			sp.usingPrinter(number);
	}
}

public class SyncPCThread2 {

	public static void main(String[] args) {
		SharedPrinter printer = new SharedPrinter();
		PC2 c1 = new PC2(printer, 1);
		PC2 c2 = new PC2(printer, 2);
		PC2 c3 = new PC2(printer, 3);
		/* Thread Ŭ���� ����� �̹� �����Ƿ�
		 * ��ü������ ���� �� �Ŀ� �����ڸ� ���� �ѱ��.
		 * */
		
		c1.start();
		c2.start();
		c3.start();

	}

}

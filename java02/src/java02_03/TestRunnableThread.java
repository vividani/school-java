package java02_03;

class RunnableThread implements Runnable {
	
	public void run() {
		System.out.println("Runnable ������ �������Դϴ�.");
	}
	
}

public class TestRunnableThread {

	public static void main(String[] args) {
		RunnableThread r = new RunnableThread();
		Thread t = new Thread(r);
		
		System.out.println("������ ���� ��");
		t.start();
		System.out.println("������ ���� ��");

	}

}

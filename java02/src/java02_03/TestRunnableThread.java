package java02_03;

class RunnableThread implements Runnable {
	
	public void run() {
		System.out.println("Runnable 스레드 실행중입니다.");
	}
	
}

public class TestRunnableThread {

	public static void main(String[] args) {
		RunnableThread r = new RunnableThread();
		Thread t = new Thread(r);
		
		System.out.println("스레드 시작 전");
		t.start();
		System.out.println("스레드 시작 후");

	}

}

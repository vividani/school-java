package java02_08;

class RunnableThread implements Runnable {
	
	public void run() { System.out.println("Runnable 스레드 실행중입니다."); }
	
}//Runnable class

public class TestRunnableThread {

	public static void main(String[] args) {
		
		RunnableThread r = new RunnableThread();//Runnable 객체생성
		Thread t = new Thread(r);//Runnable 갖는 Thread 객체생성
		
		System.out.println("스레드 시작 전");
		t.start();//run()실행
		System.out.println("스레드 시작 후");
		
	}//main

}//class

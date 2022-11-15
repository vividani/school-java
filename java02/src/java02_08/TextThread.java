package java02_08;

class ThreadExample extends Thread { //스레드 클래스 생성
	
	public ThreadExample( String name) {super(name); }
	
	public void run() { System.out.println(getName()+" 실행중입니다.");	}
}//Thread class


public class TextThread {

	public static void main(String[] args) {
		
		//스레드 객체 생성
		ThreadExample t = new ThreadExample("자바 스레드");
		
		System.out.println("스레드 시작 전");
		t.start(); //run()실행
		System.out.println("스레드 시작 후");
	}//main
	
}//class

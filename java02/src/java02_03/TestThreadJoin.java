package java02_03;

class ThreadExampleJoin extends Thread{
	
	public ThreadExampleJoin (String name) { super(name);}
	
	public void run() {
		System.out.println(getName()+" 실행중입니다.");
	}
}

public class TestThreadJoin {
	public static void main(String[] args) {
		ThreadExampleJoin t = new ThreadExampleJoin("자바 스레드");
	    System.out.println("스레드 시작 전");
	    t.start();
	    try {
	    	t.join();
	    } catch (Exception e) {
	    	System.out.println("join 실행 중 예외 발생");
	    }
	    System.out.println("스레드 시작 후");
	    
	}

}

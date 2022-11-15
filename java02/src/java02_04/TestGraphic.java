package java02_04;

/*안 될때는 module-info.java에 requires java.desktop;*/
import java.awt.*; 
import java.util.*;

class GraphicThread extends Frame implements Runnable {
	
	int num;  //점의 개수
	Color color;  //점의 색상
	Random r;
	int x,y;  //좌표값
	
	public GraphicThread(int n, Color c) {
		num = n;
		color = c;
		r = new Random();  //객체를 생성해서 써야한다.
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x,y,15,15);
	}
	
	public void update(Graphics g) {
		paint(g);
	}

	public void run() {
		Rectangle rec = getBounds();
		//awt 클래스의 Rectangle의 getBounds -> 창 크기 지정
		for(int i=0; i<num; i++) {  //num만큼의 점을 찍음
			//r(random)을 이용해서 rec(창 크기) 내에서 정함
			x = r.nextInt(rec.width);
			y = r.nextInt(rec.height);
			
			repaint();  //repaint()로 써야 반복해서 찍기 가능
			try {
				Thread.sleep(1000);  //시간차
			} catch (Exception e) {}
			
		}
	}

} //GraphicThread 클래스



public class TestGraphic {

	public static void main(String[] args) {

		GraphicThread gt = new GraphicThread(500,Color.red);
		gt.setSize(400,400);
		gt.setVisible(true);
		Thread t = new Thread(gt);
		
		GraphicThread gt2 = new GraphicThread(500,Color.blue);
		gt2.setSize(400,400);
		gt2.setVisible(true);
		Thread t2 = new Thread(gt2);
		
		t.start();
		t2.start();
	}

}
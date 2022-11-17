package chapter08;

class Box {			//Box라는 객체를 정의한 클래스
	int width;		//상자의 가로길이
	int height;		//상자의 세로길이
	int depth;		//상자의 높이
	
	Box(int w, int h, int d){		//생성자
		width=w;
		height=h;
		depth=d;
	}
	
	void volume() {					//상자의 부피를 구하는 메소드
		int vol;
		vol = width * height * depth;
		System.out.println("상자의 부피는 " +vol);
	}
}//클래스 Box


public class MyBox {
	public static void main(String[] args) {
		Box mybox1;					//객체선언
		Box mybox2;
		mybox1 = new Box(10,20,30);	//객체생성
		mybox2 = new Box(20,20,20);
		mybox1.volume();			//객체사용
		mybox2.volume();

	}

}//public 클래스 MyBox

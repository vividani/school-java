package chapter08;

class BoxQ {
	int width;
	int height;
	int depth;
	
	BoxQ(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
	}
	
	void volume() {
		int vol = width * height * depth;
		System.out.println("상자의 부피는 " + vol);
	}
	
	void area() {
		int ar = 2*(width*height + height*depth + depth*width);
		System.out.println("상자의 면적은 " + ar);
	}
}//class BoxQ

class MyBoxQ {

	public static void main(String[] args) {

		BoxQ mybox1 = new BoxQ(10,20,30);		//객체선언, 객체생성
		BoxQ mybox2 = new BoxQ(20,20,20);
		mybox1.volume();						//객체사용
		mybox1.area();
		mybox2.volume();
		mybox2.area();
	}

}
//class MyBoxQ
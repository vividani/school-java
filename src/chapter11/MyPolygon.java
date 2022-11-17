package chapter11;

class Rectangle {
	
	int area(int x, int y) { //직사각형 면적
		return x*y;
	}
	
	int round(int x, int y) { //직사각형 둘레
		return 2*(x+y);
	}
}

class Cuboid extends Rectangle { //super.을 앞에 붙이지 않아도 상속받은 메소드를 사용하면 됨.
	
	int area(int x, int y, int z) { //직육면체 면적
		int a = area(x, y); //2*(area(x,y)+area(y,z)+area(z,x)
		int b = x*z;
		int c = y*z;
		return 2*(a+b+c);
	}
	
	int round(int x, int y, int z) { //직육면체 둘레
		return 2*round(x, y)+4*z; //round(x,y)+round(y,z)+round(z,x)
	}
	
	int volume(int x, int y, int z) { //직육면체 부피
		return x*y*z; //area(x,y)*z
	}
}

public class MyPolygon {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println("직사각형의 면적은 " +r.area(5,10)+ ", 직사각형의 둘레는 " +r.round(5,10));
		
		Cuboid c = new Cuboid();
		System.out.println("직육면체의 면적은 " +c.area(5,10,2)+ 
				", 직육면체의 둘레는 " +c.round(5,10,2)+ ", 직육면체의 부피는 " +c.volume(5,10,2));
	}

}

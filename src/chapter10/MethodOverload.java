package chapter10;

class Polygon {
	String name;
	
	public Polygon(String n) {
		name = n;
	}
	void area (int r) {
		if (name.equals("원"))
			System.out.println(name+ "의 면적은 " +3.14*r*r);
		else
			System.out.println(name+ "의 면적은 " +r*r);
	}
	void area (int w, int h) {
		if (name.equals("삼각형"))
			System.out.println(name+ "의 면적은 " +0.5*w*h);
		else
			System.out.println(name+ "의 면적은 " +w*h);
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		Polygon triangle = new Polygon("삼각형");
		triangle.area(4,6);
		
		Polygon rectangle = new Polygon("직사각형");
		rectangle.area(5,10);;
		
		Polygon circle = new Polygon("원");
		circle.area(10);
		
		Polygon square = new Polygon("정사각형");
		square.area(8);
	}

}

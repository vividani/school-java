package chapter12;

abstract class Polygon {

	abstract void draw();
	abstract void coloring(String color);
}

class Circle extends Polygon {
	void draw() {
		System.out.println("원을 그린다.");
	}
	void coloring(String c) {
		System.out.println(c+ "색으로 원을 칠한다.");
	}
}
class Triangle extends Polygon {
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
	void coloring(String c) {
		System.out.println(c+ "색으로 원을 칠한다.");
	}	
}
class Rectangle extends Polygon {
	void draw() {
		System.out.println("사각형을 그린다.");
	}
	void coloring(String c) {
		System.out.println(c+ "색으로 원을 칠한다.");
	}
}

public class AbstractExam {

	public static void main(String[] args) {
		Circle won = new Circle();
		Triangle semo = new Triangle();
		Rectangle nemo = new Rectangle();
		won.draw();
		won.coloring("빨강");
		semo.draw();
		semo.coloring("파랑");
		nemo.draw();
		nemo.coloring("노랑");
		
	}

}

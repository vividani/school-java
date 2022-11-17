package chapter12;

abstract class Polygon {

	abstract void draw();
	abstract void coloring(String color);
}

class Circle extends Polygon {
	void draw() {
		System.out.println("���� �׸���.");
	}
	void coloring(String c) {
		System.out.println(c+ "������ ���� ĥ�Ѵ�.");
	}
}
class Triangle extends Polygon {
	void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
	void coloring(String c) {
		System.out.println(c+ "������ ���� ĥ�Ѵ�.");
	}	
}
class Rectangle extends Polygon {
	void draw() {
		System.out.println("�簢���� �׸���.");
	}
	void coloring(String c) {
		System.out.println(c+ "������ ���� ĥ�Ѵ�.");
	}
}

public class AbstractExam {

	public static void main(String[] args) {
		Circle won = new Circle();
		Triangle semo = new Triangle();
		Rectangle nemo = new Rectangle();
		won.draw();
		won.coloring("����");
		semo.draw();
		semo.coloring("�Ķ�");
		nemo.draw();
		nemo.coloring("���");
		
	}

}

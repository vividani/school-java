package chapter10;

class Polygon {
	String name;
	
	public Polygon(String n) {
		name = n;
	}
	void area (int r) {
		if (name.equals("��"))
			System.out.println(name+ "�� ������ " +3.14*r*r);
		else
			System.out.println(name+ "�� ������ " +r*r);
	}
	void area (int w, int h) {
		if (name.equals("�ﰢ��"))
			System.out.println(name+ "�� ������ " +0.5*w*h);
		else
			System.out.println(name+ "�� ������ " +w*h);
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		Polygon triangle = new Polygon("�ﰢ��");
		triangle.area(4,6);
		
		Polygon rectangle = new Polygon("���簢��");
		rectangle.area(5,10);;
		
		Polygon circle = new Polygon("��");
		circle.area(10);
		
		Polygon square = new Polygon("���簢��");
		square.area(8);
	}

}

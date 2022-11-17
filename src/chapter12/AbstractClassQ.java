package chapter12;

import java.util.Scanner;

abstract class PolygonQ{
	String polygon;
	int line1, line2;
	
	/*Polygon(String n, int l) { name = n; line = l;} �����ڸ� �̸� ���� �� ���� Ŭ�������� �����ε� �Ѵ�.*/
	
	abstract void area();	//����
	abstract void round();	//�ѷ�
	void draw(String c) {	//����
		System.out.println(c+ "���� "+polygon+ "�� �׸���.");
	}
}

class Square extends PolygonQ{
	
	Square(String p, int d){
		polygon = p; line1 = d; /*super(p,d);*/
	}
	void area() {System.out.println(polygon+ "�� ������ " +line1*line1);}/*���簢���� ����*/
	void round() {System.out.println(polygon+ "�� �ѷ��� " +line1*4);}/*���簢���� �ѷ�*/

}

class Rectangle1 extends PolygonQ{
	
	/*int line2;*/
	Rectangle1(String p, int d, int d2){
		polygon = p; line1 = d; line2 = d2; /*super(p,d); line2 = d2;*/
	}
	void area() {System.out.println(polygon+ "�� ������ " +line1*line2);}/*���簢���� ����*/
	void round() {System.out.println(polygon+ "�� �ѷ��� " +(line1*2+ line2*2));}/*���簢���� �ѷ�*/
	
}

class Circle1 extends PolygonQ{
	
	final double pi = 3.14;
	
	Circle1(String p, int d){
		polygon = p; line1 = d;
	}
	void area() {System.out.println(polygon+ "�� ������ " +pi*line1*line1);}/*���� ����*/
	void round() {System.out.println(polygon+ "�� �ѷ��� " +2*pi*line1);}/*���� �ѷ�*/
	
}

public class AbstractClassQ {

	public static void main(String[] args) {
		String color, figure = "" ;
		int d, d2;
		Scanner s = new Scanner(System.in);
		
		while (! figure.equals("����")) {
			System.out.print("���簢��, ���簢��, �� �߿��� ������ �ѷ��� ���� ������ �̸��� �Է��ϼ���. \n���α׷��� �����Ϸ��� '����'��� �Է��ϼ���  => ");
			figure = s.next();
			
			if (figure.equals("���簢��")) {
				System.out.print("���簢���� �Ѻ��� ���̿� ������ �Է��ϼ��� => ");
				d = s.nextInt(); color = s.next();
				Square sq = new Square("���簢��", d);
				sq.area();
				sq.round();
				sq.draw(color);
			}
			else if (figure.contentEquals("���簢��")) {
				System.out.print("���簢���� �κ��� ���̿� ������ �Է��ϼ��� => ");
				d = s.nextInt(); d2 = s.nextInt(); color = s.next();
				Rectangle1 r = new Rectangle1("���簢��", d, d2);
				r.area();
				r.round();
				r.draw(color);
			}
			else if (figure.contentEquals("��")) {
				System.out.print("���� �������� ���̿� ������ �Է��ϼ��� => ");
				d = s.nextInt(); color = s.next();
				Circle1 c = new Circle1("��", d);
				c.area();
				c.round();
				c.draw(color);
			}
			else if (! figure.contentEquals("����"))
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
		}
		s.close();
		
	}

}

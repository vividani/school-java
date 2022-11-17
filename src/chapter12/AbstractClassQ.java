package chapter12;

import java.util.Scanner;

abstract class PolygonQ{
	String polygon;
	int line1, line2;
	
	/*Polygon(String n, int l) { name = n; line = l;} 생성자를 미리 만든 후 하위 클래스에서 오버로드 한다.*/
	
	abstract void area();	//면적
	abstract void round();	//둘레
	void draw(String c) {	//색깔
		System.out.println(c+ "으로 "+polygon+ "을 그린다.");
	}
}

class Square extends PolygonQ{
	
	Square(String p, int d){
		polygon = p; line1 = d; /*super(p,d);*/
	}
	void area() {System.out.println(polygon+ "의 면적은 " +line1*line1);}/*정사각형의 면적*/
	void round() {System.out.println(polygon+ "의 둘레는 " +line1*4);}/*정사각형의 둘레*/

}

class Rectangle1 extends PolygonQ{
	
	/*int line2;*/
	Rectangle1(String p, int d, int d2){
		polygon = p; line1 = d; line2 = d2; /*super(p,d); line2 = d2;*/
	}
	void area() {System.out.println(polygon+ "의 면적은 " +line1*line2);}/*직사각형의 면적*/
	void round() {System.out.println(polygon+ "의 둘레는 " +(line1*2+ line2*2));}/*직사각형의 둘레*/
	
}

class Circle1 extends PolygonQ{
	
	final double pi = 3.14;
	
	Circle1(String p, int d){
		polygon = p; line1 = d;
	}
	void area() {System.out.println(polygon+ "의 면적은 " +pi*line1*line1);}/*원의 면적*/
	void round() {System.out.println(polygon+ "의 둘레는 " +2*pi*line1);}/*원의 둘레*/
	
}

public class AbstractClassQ {

	public static void main(String[] args) {
		String color, figure = "" ;
		int d, d2;
		Scanner s = new Scanner(System.in);
		
		while (! figure.equals("종료")) {
			System.out.print("정사각형, 직사각형, 원 중에서 면적과 둘레를 구할 도형의 이름을 입력하세요. \n프로그램을 종료하려면 '종료'라고 입력하세요  => ");
			figure = s.next();
			
			if (figure.equals("정사각형")) {
				System.out.print("정사각형의 한변의 길이와 색깔을 입력하세요 => ");
				d = s.nextInt(); color = s.next();
				Square sq = new Square("정사각형", d);
				sq.area();
				sq.round();
				sq.draw(color);
			}
			else if (figure.contentEquals("직사각형")) {
				System.out.print("직사각형의 두변의 길이와 색깔을 입력하세요 => ");
				d = s.nextInt(); d2 = s.nextInt(); color = s.next();
				Rectangle1 r = new Rectangle1("직사각형", d, d2);
				r.area();
				r.round();
				r.draw(color);
			}
			else if (figure.contentEquals("원")) {
				System.out.print("원의 반지름의 길이와 색깔을 입력하세요 => ");
				d = s.nextInt(); color = s.next();
				Circle1 c = new Circle1("원", d);
				c.area();
				c.round();
				c.draw(color);
			}
			else if (! figure.contentEquals("종료"))
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
		}
		s.close();
		
	}

}

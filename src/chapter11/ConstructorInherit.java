package chapter11;

class Polygon{			//평면 도형 클래스 : 원, 직사각형 도형의 면적을 구하는 클래스
	final double pi = 3.14;
	String name;		//멤버변수 : 도형의 이름
	Polygon(String n){	//생성자 : 도형의 이름 저장
		name = n;
	}
	double area(double r) {	//원의 면적 구하는 메소드
		return pi*r*r;
	}
	double area(double w, double h) {	//직사각형의 면적 구하는 메소드
		return w*h;
	}
	
}

class A3DimensionFigure extends Polygon{
	A3DimensionFigure(String n){
		super(n);
	}
	double area(double r, double h) {		//원기둥의 면적
		return 2*area(r) + 2*pi*r*h; //또는 super.area(2*pi*r, h)
	}
	double area(double w, double h, double d) {	//직육면체의 면적
		return 2*( super.area(w,h) + super.area(h,d) + super.area(d,w));
	}
	double volume(double r, double h) {	//원기둥의 부피
		return area(r)*h;
	}
	double volume(double w, double h, double d) {	//직육면체의 부피
		return super.area(w,h)*d;
	}
}

public class ConstructorInherit {

	public static void main(String[] args) {
		Polygon circle = new Polygon("원"); //원 객체 circle 생성
		System.out.println(circle.name+"의 면적은 "+ circle.area(10)); 
		// 반지름이 10인 circle의 면적 구하기
		
		Polygon rectangle = new Polygon("직사각형"); // 직사각형 객체 rectangle 생성
		System.out.println(rectangle.name+"의 면적은 "+ rectangle.area(5, 10)); 
		// 가로, 세로가 5, 10인 직사각형의 면적 구하기
		
		A3DimensionFigure cylinder = new A3DimensionFigure("원기둥");
		System.out.println(cylinder.name+"의 면적은 "+ cylinder.area(10, 5)+", 부피는 "+ 
		cylinder.volume(10, 5)); // 밑면의 반지름이 10, 높이가 5인 원기둥의 면적과 부피
		
		A3DimensionFigure cuboid = new A3DimensionFigure("직육면체");
		System.out.println(cuboid.name+"의 면적은 "+ cuboid.area(3, 4, 5)+", 부피는 "+ 
		cuboid.volume(3, 4, 5)); // 가로, 세로, 높이가 3,4,5인 직육면체 면적과 부피

	}

}

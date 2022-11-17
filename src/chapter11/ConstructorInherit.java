package chapter11;

class Polygon{			//��� ���� Ŭ���� : ��, ���簢�� ������ ������ ���ϴ� Ŭ����
	final double pi = 3.14;
	String name;		//������� : ������ �̸�
	Polygon(String n){	//������ : ������ �̸� ����
		name = n;
	}
	double area(double r) {	//���� ���� ���ϴ� �޼ҵ�
		return pi*r*r;
	}
	double area(double w, double h) {	//���簢���� ���� ���ϴ� �޼ҵ�
		return w*h;
	}
	
}

class A3DimensionFigure extends Polygon{
	A3DimensionFigure(String n){
		super(n);
	}
	double area(double r, double h) {		//������� ����
		return 2*area(r) + 2*pi*r*h; //�Ǵ� super.area(2*pi*r, h)
	}
	double area(double w, double h, double d) {	//������ü�� ����
		return 2*( super.area(w,h) + super.area(h,d) + super.area(d,w));
	}
	double volume(double r, double h) {	//������� ����
		return area(r)*h;
	}
	double volume(double w, double h, double d) {	//������ü�� ����
		return super.area(w,h)*d;
	}
}

public class ConstructorInherit {

	public static void main(String[] args) {
		Polygon circle = new Polygon("��"); //�� ��ü circle ����
		System.out.println(circle.name+"�� ������ "+ circle.area(10)); 
		// �������� 10�� circle�� ���� ���ϱ�
		
		Polygon rectangle = new Polygon("���簢��"); // ���簢�� ��ü rectangle ����
		System.out.println(rectangle.name+"�� ������ "+ rectangle.area(5, 10)); 
		// ����, ���ΰ� 5, 10�� ���簢���� ���� ���ϱ�
		
		A3DimensionFigure cylinder = new A3DimensionFigure("�����");
		System.out.println(cylinder.name+"�� ������ "+ cylinder.area(10, 5)+", ���Ǵ� "+ 
		cylinder.volume(10, 5)); // �ظ��� �������� 10, ���̰� 5�� ������� ������ ����
		
		A3DimensionFigure cuboid = new A3DimensionFigure("������ü");
		System.out.println(cuboid.name+"�� ������ "+ cuboid.area(3, 4, 5)+", ���Ǵ� "+ 
		cuboid.volume(3, 4, 5)); // ����, ����, ���̰� 3,4,5�� ������ü ������ ����

	}

}

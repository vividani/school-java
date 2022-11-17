package chapter11;

class Rectangle {
	
	int area(int x, int y) { //���簢�� ����
		return x*y;
	}
	
	int round(int x, int y) { //���簢�� �ѷ�
		return 2*(x+y);
	}
}

class Cuboid extends Rectangle { //super.�� �տ� ������ �ʾƵ� ��ӹ��� �޼ҵ带 ����ϸ� ��.
	
	int area(int x, int y, int z) { //������ü ����
		int a = area(x, y); //2*(area(x,y)+area(y,z)+area(z,x)
		int b = x*z;
		int c = y*z;
		return 2*(a+b+c);
	}
	
	int round(int x, int y, int z) { //������ü �ѷ�
		return 2*round(x, y)+4*z; //round(x,y)+round(y,z)+round(z,x)
	}
	
	int volume(int x, int y, int z) { //������ü ����
		return x*y*z; //area(x,y)*z
	}
}

public class MyPolygon {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println("���簢���� ������ " +r.area(5,10)+ ", ���簢���� �ѷ��� " +r.round(5,10));
		
		Cuboid c = new Cuboid();
		System.out.println("������ü�� ������ " +c.area(5,10,2)+ 
				", ������ü�� �ѷ��� " +c.round(5,10,2)+ ", ������ü�� ���Ǵ� " +c.volume(5,10,2));
	}

}

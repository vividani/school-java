package chapter08;

class Box {			//Box��� ��ü�� ������ Ŭ����
	int width;		//������ ���α���
	int height;		//������ ���α���
	int depth;		//������ ����
	
	Box(int w, int h, int d){		//������
		width=w;
		height=h;
		depth=d;
	}
	
	void volume() {					//������ ���Ǹ� ���ϴ� �޼ҵ�
		int vol;
		vol = width * height * depth;
		System.out.println("������ ���Ǵ� " +vol);
	}
}//Ŭ���� Box


public class MyBox {
	public static void main(String[] args) {
		Box mybox1;					//��ü����
		Box mybox2;
		mybox1 = new Box(10,20,30);	//��ü����
		mybox2 = new Box(20,20,20);
		mybox1.volume();			//��ü���
		mybox2.volume();

	}

}//public Ŭ���� MyBox

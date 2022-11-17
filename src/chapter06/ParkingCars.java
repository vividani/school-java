package chapter06;
import java.util.Scanner;
public class ParkingCars {
	
	static String tunnel[];     //���� �޼ҵ忡�� �����ϱ� ���� �������� ��ġ�� ����
	static int pos = 0, size;    //������ ������� �� top�� -1

	public static void main(String[] args) {
		int select = 0;
		System.out.print("������ �ͳ��� ũ�⸦ �Է��ϼ��� => ");
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		tunnel = new String[size];
		
		while (select != 3) {
			System.out.print("\n���� �����Ϸ��� 1�� ���̸��� �Է�, �����Ϸ��� 2, �����Ϸ��� 3�� �Է��ϼ���\n=> ");
			
			select = s.nextInt();
			if (select == 1) parkIn(s.next());	//����
			else if (select == 2) parkOut();	//����
			else;
			if (select != 3) printCars();		//�������� �ʾҴٸ� �ͳ� ���� ���
			
		}//while
		
		s.close();
	}//main ����
	
	static void parkIn(String car) {
		if (pos == size)
			System.out.println("�ͳ��� ������ ������ ������ �����ϴ�.");
		else
			tunnel[pos++] = car;
	}
	
	static void parkOut() {
		if (pos == 0)
			System.out.println("�ͳο� ������ ���� �����ϴ�.");
		else
			System.out.println("�ͳο��� " +tunnel[--pos]+ "�� �����Ǿ����ϴ�.");
	}
	
	static void printCars() {
		System.out.print("< ���� �ͳο� ������ ���� ");
		if (pos == 0) System.out.println("�����ϴ�. >");
		else {
			for (int i= 0; i <pos; i++)
				System.out.print(tunnel[i]+ " ");
			System.out.println(">");
		}
	}
	
}//���α׷� ����

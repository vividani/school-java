package chapter05;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("�Ҽ����� �Ǻ��� ���� ������ �Ʒ��� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num > 0 ) { /*���� ����*/
			for(int i = 2; i < num; i++) { /*i�� 2���� �Է��� ������*/
				if(num % i == 0) { /*i�� �Է°��� ����� ��*/
					System.out.println(num + "��(��) �Ҽ� �ƴ�");
					break;
				}
				else if(i == num-1 && num % i != 0)
					System.out.println(num + "��(��) �Ҽ���");
			}
			if (num==1) System.out.println(num + "��(��) �Ҽ��ƴ�");
			else if (num==2) System.out.println(num + "��(��) �Ҽ���");
		}
		else /*���� ���� �ƴ�*/
			System.out.println(num+ "��(��) ���� ������ �ƴϹǷ� �Ҽ� �Ǻ� �Ұ�");
		
		s.close();

	}

}

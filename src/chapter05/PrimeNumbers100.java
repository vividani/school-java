package chapter05;
import java.util.*;
public class PrimeNumbers100 {

	public static void main(String[] args) {
		
		System.out.println("���� ������ �Ʒ��� �Է��ϸ� 1~�� ���� ������ �Ҽ��� ��� ã������");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num > 0) {			
			if(num < 3) {
				System.out.println("���̿� �Ҽ��� �����ϴ�.");
			}
			else {
				System.out.println("2");
				for(int i=2; i<num; i++) { //4�̻��� �Է��� ���
					for(int j=2; j<i; j++) { //�Է��� �� �̳��� ���� ����
						if(i%j==0) { //�Ҽ��ƴ�
							break;					
						}
						else if(j==i-1 && i%j!=0)
							System.out.println(i);
					} //�ι�° for��
				} //ù��° for��
			}
		} //if��
		else
			System.out.println(num+ "��(��) ���� ������ �ƴϹǷ� �Ҽ� �Ǻ� �Ұ�");
	} //main�Լ�
} //class

package chapter04;
import java.util.*;
public class ForMax {

	public static void main(String[] args) {
		
		System.out.println("�л� ���� �Է��ϼ���(2�� �̻�)==> ");
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		//�л� �� �Է�
		
		System.out.println(count + "�� �л����� ������ �Ʒ��� �Է��ϼ���.");
		int i = 0, max = 0;
		for( ; i < count; i++ ) {
			int score = s.nextInt();
			while (score < 0 || score > 100) {
				System.out.println("���� �����Դϴ�. 0 ~100�� ���̷� �ٽ� �Է��ϼ���.");
				score = s.nextInt();
			}
			if (max < score) max = score;
		} //�����Է� �� �ְ��� ����
		
		System.out.println("�ְ� ������ " + max + "��");
		s.close();

	}

}

package chapter04;
import java.util.*;
public class DoWhileMax {

	public static void main(String[] args) {
		System.out.println("�л� ���� �Է��ϼ���( 2�� �̻� )");
		int i=0, count, score, max=0; Scanner s = new Scanner(System.in);
		count = s.nextInt();		
		
		System.out.println(count + "���� �л����� ������ �Է��ϼ���");
		do {
			score = s.nextInt(); //���� �Է¹���
			while (!( score >= 0 && score <= 100)){
				System.out.println("���� �����Դϴ�. 0~100�� ���̷� �ٽ� �Է��ϼ���!");
				score = s.nextInt();
			}
			if (score > max) max = score;
			i++;
		} while (i < count);
		System.out.println("�ְ� ������ " + max + "��");
		s.close();
	}

}

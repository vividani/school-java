package chapter04;
import java.util.*;
public class FindZero {

	public static void main(String[] args) {
		System.out.println("10���� ������ �Է��ϼ���===>");
		Scanner s = new Scanner(System.in);
		int i = 1;
		boolean zero = false;
		
		while (i <= 10) {
			if (s.nextInt() == 0) {
				System.out.println(i+"��°�� 0 �Էµ�");
				zero = true;
			}
			i++;
		}
		if (zero != true) System.out.println("�Է°��߿� 0�� ����");
		s.close();
	}

}

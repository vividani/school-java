package chapter03;

import java.util.Scanner;

public class scholarship {

	public static void main(String[] args) {
		System.out.println("JAVA, Visual Basic, C�� ������ �Է��ϼ���==>");
		Scanner s = new Scanner(System.in);
			int java = s.nextInt();
			int vb = s.nextInt();
			int c = s.nextInt();
			
			if ( java < 0 || vb < 0 || c < 0 || java > 100 || vb > 100 || c > 100 )
				System.out.println("�߸��� ������ �ԷµǾ����!!");
			else if ( java >= 95 && vb >= 95 && c >= 95 )
				System.out.println("��������! �������б� �޾ƿ�~!");
			else if ( java >= 95 && (vb >= 95 || c >= 95) )
				System.out.println("����! �ݾ����б� �޾ƿ�~!");
			else
				System.out.println("���б� ����ڰ� �ƴմϴ�.");

			s.close();
	}

}

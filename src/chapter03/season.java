package chapter03;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		System.out.println("�� ��(��)���� �Է��ϼ���===> ");
		Scanner s = new Scanner(System.in);
			int month =  s.nextInt();
			String season;
			
			switch (month) {
				case 12:
				case 1:
				case 2:
					season = "�ܿ�";
					break;
				case 3:
				case 4:
				case 5:
					season = "��";
					break;
				case 6:
				case 7:
				case 8:
					season = "����";
					break;
				case 9:
				case 10:
				case 11:
					season = "����";
					break;
				default:
					season = "���� �߸� �Է��߽��ϴ�.";
			}
			System.out.println("������ >" + season + "< �Դϴ�.");
			
			s.close();
	}

}

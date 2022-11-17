package chapter03;

import java.util.Scanner;

public class scholarship {

	public static void main(String[] args) {
		System.out.println("JAVA, Visual Basic, C의 점수를 입력하세요==>");
		Scanner s = new Scanner(System.in);
			int java = s.nextInt();
			int vb = s.nextInt();
			int c = s.nextInt();
			
			if ( java < 0 || vb < 0 || c < 0 || java > 100 || vb > 100 || c > 100 )
				System.out.println("잘못된 점수가 입력되었어요!!");
			else if ( java >= 95 && vb >= 95 && c >= 95 )
				System.out.println("축하축하! 전액장학금 받아요~!");
			else if ( java >= 95 && (vb >= 95 || c >= 95) )
				System.out.println("축하! 반액장학금 받아요~!");
			else
				System.out.println("장학금 대상자가 아닙니다.");

			s.close();
	}

}

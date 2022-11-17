package chapter03;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요===> ");
		Scanner s = new Scanner(System.in);
			int score =  s.nextInt();
			
			if (score > 100)
				System.out.println("잘못된 점수입니다.");
			else if (score >= 90)
				System.out.println("A");
			else if (score >= 80)
				System.out.println("B");
			else if (score >= 70)
				System.out.println("C");
			else if (score >= 60)
				System.out.println("D");
			else
				System.out.println("F");
			
			s.close();

	}

}

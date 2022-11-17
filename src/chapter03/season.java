package chapter03;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		System.out.println("몇 월(月)인지 입력하세요===> ");
		Scanner s = new Scanner(System.in);
			int month =  s.nextInt();
			String season;
			
			switch (month) {
				case 12:
				case 1:
				case 2:
					season = "겨울";
					break;
				case 3:
				case 4:
				case 5:
					season = "봄";
					break;
				case 6:
				case 7:
				case 8:
					season = "여름";
					break;
				case 9:
				case 10:
				case 11:
					season = "가을";
					break;
				default:
					season = "월을 잘못 입력했습니다.";
			}
			System.out.println("계절은 >" + season + "< 입니다.");
			
			s.close();
	}

}

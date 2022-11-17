package chapter14;
import java.util.*;

public class PrintCalender {

	public static void main(String[] args) {
		System.out.println("달력을 출력하고 싶은 연도와 월을 입력하시오(예: 2022년 5월 -> 2022 5)");
		
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		int month = s.nextInt();
		
		Date d = new Date(year-1900, month-1, 1);
		
		System.out.println("\t\t\t" +year+ "년\t" +month+ "월");
		System.out.println("일	월	화	수	목	금	토");
		/*1일이 몇요일인지 알 수 있는 방법 ??*/
		int k = 1;
		int m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i=0; i<d.getDay(); i++)
			System.out.print("\t");
		System.out.println();
		
		for (int i=d.getDay(); i<7; i++)
			System.out.print(k++ + "\t");
		System.out.print("\n");
		
		for (int i=1; i<=5; i++){
			for (int j=0; j<7; j++){
				System.out.print(k++ + "\t");
				if (k > m[month-1]) break;
			}
			if (k > m[month-1]) break;
			System.out.println();
		}
		
		
		s.close();
	}

}

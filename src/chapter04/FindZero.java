package chapter04;
import java.util.*;
public class FindZero {

	public static void main(String[] args) {
		System.out.println("10개의 정수를 입력하세요===>");
		Scanner s = new Scanner(System.in);
		int i = 1;
		boolean zero = false;
		
		while (i <= 10) {
			if (s.nextInt() == 0) {
				System.out.println(i+"번째에 0 입력됨");
				zero = true;
			}
			i++;
		}
		if (zero != true) System.out.println("입력값중에 0이 없음");
		s.close();
	}

}

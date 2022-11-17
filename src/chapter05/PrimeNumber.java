package chapter05;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("소수인지 판별할 양의 정수를 아래에 입력하세요");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num > 0 ) { /*양의 정수*/
			for(int i = 2; i < num; i++) { /*i는 2부터 입력한 값까지*/
				if(num % i == 0) { /*i가 입력값의 약수일 떄*/
					System.out.println(num + "은(는) 소수 아님");
					break;
				}
				else if(i == num-1 && num % i != 0)
					System.out.println(num + "은(는) 소수임");
			}
			if (num==1) System.out.println(num + "은(는) 소수아님");
			else if (num==2) System.out.println(num + "은(는) 소수임");
		}
		else /*양의 정수 아님*/
			System.out.println(num+ "은(는) 양의 정수가 아니므로 소수 판별 불가");
		
		s.close();

	}

}

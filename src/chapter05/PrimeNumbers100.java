package chapter05;
import java.util.*;
public class PrimeNumbers100 {

	public static void main(String[] args) {
		
		System.out.println("양의 정수를 아래에 입력하면 1~그 정수 사이의 소수를 모두 찾을께요");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num > 0) {			
			if(num < 3) {
				System.out.println("사이에 소수가 없습니다.");
			}
			else {
				System.out.println("2");
				for(int i=2; i<num; i++) { //4이상을 입력한 경우
					for(int j=2; j<i; j++) { //입력한 수 이내의 수로 나눔
						if(i%j==0) { //소수아님
							break;					
						}
						else if(j==i-1 && i%j!=0)
							System.out.println(i);
					} //두번째 for문
				} //첫번째 for문
			}
		} //if문
		else
			System.out.println(num+ "은(는) 양의 정수가 아니므로 소수 판별 불가");
	} //main함수
} //class

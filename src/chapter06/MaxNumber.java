package chapter06;
import java.util.*;
public class MaxNumber {

	public static void main(String[] args) {
		
		int i, count, max;
		Scanner s = new Scanner(System.in);
		System.out.print("정수들을 입력하면 제일 큰 수를 찾아줍니다. 입력할 정수의 갯수는? ");
		count = s.nextInt();
		
		int num[] = new int[count]; //배열 선언 및 생성
		
		System.out.println("정수들을 하나씩 입력하세요"); //입력된 정수들을 정수형 배열 num에 저장
		for (i=0; i<count; i++)
			num[i] = s.nextInt();
		
		for (i=1, max=num[0]; i<num.length; i++) { //num의 요소와 비교해서 max 값 구하기
			if (max < num[i])
				max = num[i];
		}
		System.out.println("최대값은 " +max);
		s.close();

	}//main

}//class

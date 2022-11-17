package chapter07;
import java.util.Scanner;
public class FindFactors {
	/*final static int END = -999; 프로그램에서 필요없으므로 지워도 됌 */

	public static void main(String[] args) {
		System.out.println("약수를 구하고 싶은 정수를 하나 입력하면 그 정수의 약수들을 모두 찾아서 2차원 배열에 저장하고 출력하는 프로그램입니다.");
		System.out.print("약수를 구하고 싶은 정수의 갯수는 총 몇개인가요? 숫자만 입력 => ");
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();             //입력 될 정수의 개수
		int data[][] = new int[cnt][];     //입력된 정수와 그의 약수들을 저장할 2차원 배열
		
		for(int i = 0, input = 0;i < cnt; i++) {
			System.out.print("약수를 구하고 싶은 정수를 하나 입력하세요 => ");
			input = s.nextInt();
			int f[] = findFactors(input);  //findFactors함수를 이용해서 약수 찾고 1차원 배열 return

			data[i] = f;
			
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++)
				System.out.print(data[i][j]+ " ");
			System.out.println();
		}
			s.close();
	}//main

	static int[] findFactors(int num) {
		
		int count = 0;		//임의의 약수 저장 배열
		 for (int i=1; i<=num; i++)
		 	if (num %i == 0) count++;
		/*
		 int factors[] = new int[num];
		 *배열의 공간을 num으로 한다는 것은 논리적으로 맞지 않음.
		 *약수의 개수와 그 숫자는 아무런 관련이 없으므로 기억 공간의 낭비가 발생함.
		 *따라서 약수를  찾는 for문을 먼저 사용해서 약수의 개수를 찾은 후 그 수만큼 배열을 할당해야함.
		*/
		
		int factors[] = new int[count+1]; factors[0] = num; 
		for (int i=1, j=0; i<=num; i++)
			if(num %i == 0) factors[++j] = i; 
		
		/* 내가 작성한 잘못된 코드
		factors[0] = num;               //첫번째 요소는 입력 받은 값
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > 0; j--)
				if (num % j == 0) factors[i] = num / j;
		*/
		
		return factors;			//배열 전체를 리턴한다.(call by reference)
	}

}//program

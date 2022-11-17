package chapter04;
import java.util.*;
public class FindFactors {

	public static void main(String[] args) {
		System.out.println("약수를 구하고 싶은 양의 정수를 입력하세요==> ");
		int n, i=1; Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		while (i <= n/2) {
			if (n % i == 0)
				System.out.println(i+" ");
			i++;
		}
		System.out.println(n);
		s.close();
	}

}

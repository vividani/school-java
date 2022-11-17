package chapter04;
import java.util.*;
public class ForMax {

	public static void main(String[] args) {
		
		System.out.println("학생 수를 입력하세요(2명 이상)==> ");
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		//학생 수 입력
		
		System.out.println(count + "명 학생들의 점수를 아래에 입력하세요.");
		int i = 0, max = 0;
		for( ; i < count; i++ ) {
			int score = s.nextInt();
			while (score < 0 || score > 100) {
				System.out.println("점수 오류입니다. 0 ~100점 사이로 다시 입력하세요.");
				score = s.nextInt();
			}
			if (max < score) max = score;
		} //점수입력 후 최고점 저장
		
		System.out.println("최고 점수는 " + max + "점");
		s.close();

	}

}

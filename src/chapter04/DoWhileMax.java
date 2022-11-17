package chapter04;
import java.util.*;
public class DoWhileMax {

	public static void main(String[] args) {
		System.out.println("학생 수를 입력하세요( 2명 이상 )");
		int i=0, count, score, max=0; Scanner s = new Scanner(System.in);
		count = s.nextInt();		
		
		System.out.println(count + "명의 학생들의 점수를 입력하세요");
		do {
			score = s.nextInt(); //점수 입력받음
			while (!( score >= 0 && score <= 100)){
				System.out.println("점수 오류입니다. 0~100점 사이로 다시 입력하세요!");
				score = s.nextInt();
			}
			if (score > max) max = score;
			i++;
		} while (i < count);
		System.out.println("최고 점수는 " + max + "점");
		s.close();
	}

}

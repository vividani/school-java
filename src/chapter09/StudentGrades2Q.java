package chapter09;
import java.util.Scanner;

class Student {
	int number, count;
	String dept, name;
	int grade[];
	final String subject = "객체지향언어";
	
	Student (String d, int no, String n){
		dept = d;	number = no;	name = n;
		count = 0;	grade = new int[5];
	}
	
	/*왜 여기서 public을 쓰지??*/void exam(int g) {	
		if (g >= 0 && g <= 100)
			grade[count++] = g;
		else
			System.out.println(g+ "점은 정상 범위의 시험점수가 아님.");
	}
	
	/*왜 여기서 public을 쓰지??*/void final_grade() {
		int max = grade[0];
		
		for (int i = 1; i < grade.length; i++)
			if (max < grade[i]) max = grade[i];
		
		System.out.print(dept+ "/" +number+ "/" +name+ " " +subject+ "의 최종점수는 \"" +max+ "\"점");
	}
}//Student 클래스

public class StudentGrades2Q {

	public static void main(String[] args) {
		int ans;
		Scanner s = new Scanner(System.in);
		
		do {
			
			System.out.print("성적을 구할 학생은 모두 몇 명입니까?> ");	int cnt = s.nextInt();
			
			Student st[] = new Student[cnt];
		
			for (int i = 0; i <cnt; i++) {
				System.out.print("성적을 구할 학생의 학과명 학번 이름을 순서대로 입력하세요> ");
				String dept = s.next();		int no = s.nextInt();	String name = s.next();
			
				st[i] = new Student(dept, no, name);
				
				System.out.print(dept+ "/" +no+ "/" +name+ " 학생이 본 5번의 시험점수를 모두 입력하세요 > ");
				for (int j = 0; j < 5; j++) st[i].exam(s.nextInt());
		
				st[i].final_grade();
			}//for문
			System.out.print("프로그램을 종료하시려면 2, 계속해서 다른 학생의 성적을 구하시려면 1 입력> ");
			ans = s.nextInt();
			System.out.println();
		
		} while(ans == 1);

		s.close();
	}//main함수

}

package chapter10;
import java.util.Scanner;

class Student {
	int number, count;
	String dept, name;
	int grade[];
	static double tot = 0;					//전체 수강생들의 누적 점수 : 전체에서 공통으로 사용하기 때문에 클래스형 변수 static으로 선언한다.
	static int student_count = 0;
	static final String subject = "객체지향언어";
	
	Student(String d, int no, String n) {
		dept = d;	number = no;	name = n;	count = 0;
		grade = new int[5];
		student_count++;
	}
	
	void exam(int g) {
		if(g >= 0 && g <= 100)
			grade[count++] = g;
		else
			System.out.println(g+ "점은 정상 범위의 시험점수가 아님.");
	}
	
	public void final_grade() {
		int max = grade[0];
		for (int i = 1; i <grade.length; i++)
			if (max < grade[i]) max = grade[i];
		
		System.out.println(dept+ "/" +number+ "/" +name+ " " +subject+ "의 최종점수는  " +max+ "점");
		tot += max;		// 전체 수강생들의 평균을 구하기 위해 각 학생의 최종 점수 누적
	}
	
	static void class_average() {	// 전체 수강생들의 평균 점수 구하는 클래스형 메소드
		double ave = tot / student_count;	// 학생들의 최종점수의 누적값 / 학생수
		System.out.println(subject+ " 전체 수강생들의 학기말 평균 점수는 " +ave+ "점 입니다.");
	}
}

public class UsingStatic {

	public static void main(String[] args) {
		int end = 1;
		Scanner s = new Scanner(System.in);
		while (end != 2) {
			System.out.print("성적을 구할 학생의 학과명 학번 이름을 순서대로 입력하세요 => ");
			String dept = s.next(); int no = s.nextInt(); String name = s.next();
			Student stu = new Student(dept, no, name);	//학생 객체 선언 및 생성
			
			System.out.print(dept+ "/" +no+ "/" +name+ " 학생이 본 5회 시험점수들을 모두 입력하세요 => ");
			for (int i = 0; i < 5; i++)
				stu.exam(s.nextInt());	// 객체 사용 : 해당 학생 객체의 시험점수 입력받아 저장
			
			stu.final_grade();			// 객체 사용 : 해당 학생 객체의 시험점수 중 최대값을 최종 점수 출력
			System.out.print("프로그램을 종료하시려면 2, 계속 다른 학생의 성적을 구하시려면 1 입력 => ");
			end = s.nextInt();
		}
		Student.class_average();	// 수강생들의 전체 평균 점수를 출력 : 클래스형 메소드

		s.close();
	}	// 반 평균은 특정 학생 객체에 소속된 행동이 아니므로 클래스형 메소드로 실행

}

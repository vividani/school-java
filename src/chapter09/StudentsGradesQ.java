package chapter09;

class StudentQ {
	int number;
	String name;
	int total, count, att, fin;
	
	StudentQ (int no, String n){
		number = no;	name = n;
	}
	
	void exam(int g) {
		if (g >= 0 && g <= 100){
			total += g;
			count++;
		}
		else
			System.out.println(g + "점은 정상 범위의 시험점수가 아님. 점수는 0~100점 사이 값");
	}
	
	void ave_grade() {
		System.out.println(number + "번 " +name+ "의 성적 평점은 " +total/count);
	}
	
	void attend(int a) {
		att = a;
	}
	
	void final_grade() {
		fin = (int)((total / count)*0.8 + att*0.2);	//굳이 지역변수로 안 만들고 여기서 선언해도 됨.
		System.out.println(number + "번 " +name+ "의 최종 점수는 " +fin);
	}
	
}//Student 클래스

public class StudentsGradesQ {

	public static void main(String[] args) {
		StudentQ st1 = new StudentQ(2021081001, "이기쁨");
		st1.exam(90);
		st1.exam(80);
		st1.exam(100);
		st1.attend(100);
		st1.ave_grade();
		st1.final_grade();
		
		StudentQ st2 = new StudentQ(2019081123, "나잘해");
		st2.exam(70);
		st2.exam(80);
		st2.exam(90);
		st2.attend(90);
		st2.ave_grade();
		st2.final_grade();

	}//main

}

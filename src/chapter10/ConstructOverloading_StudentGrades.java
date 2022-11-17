package chapter10;

class Student2{
	int number, count;
	String school, dept, name;
	int grade[];
	final String subject = "객체지향언어";
	
	Student2(String d, int no, String n){
		school = "";	dept = d;	number = no;	name = n;
		count = 0;
		grade = new int[5];
	}
	
	Student2(String s, String d, int no, String n){
		school = s;	dept = d;	number = no;	name = n;
		count = 0;
		grade = new int[5];
	}
	
	public void exam(int g) {
		if(g >= 0 && g <= 100)
			grade[count++] = g;
		else
			System.out.println(g+ "점은 정상 범위의 시험점수가 아님.");
	}
	
	public void final_grade() {
		int max = grade[0];
		for (int i = 1; i <grade.length; i++)
			if (max < grade[i]) max = grade[i];
		
		System.out.println(school+ "/" +dept+ "/" +number+ "/" +name+ " " +subject+ "의 최종점수는  " +max+ "점");
	}
}//Student 클래스

public class ConstructOverloading_StudentGrades {

	public static void main(String[] args) {
		Student2 s, s2;
		s = new Student2("컴퓨터공학과", 2021081001, "김명지");
		s.exam(100);	s.exam(80);	s.exam(90);	s.exam(88);	s.exam(92);
		s.final_grade();
		s2 = new Student2("서일대학", "국문과", 2020020033, "이영희");
		s2.exam(90);	s2.exam(70);	s2.exam(75);	s2.exam(80);	s2.exam(85);
		s2.final_grade();

	}

}

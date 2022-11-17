package chapter11;

abstract class Student{	//생성자를 만들면 생성자 상속이 일어남.(아직 안 배움)
	int total = 0, num = 0;
	String name;
	
	public Student(int no, String name){
		num = no;
		this.name = name;	//멤버변수와 매개변수의 이름이 같은 경우 this.를 붙이면 멤버변수라는 표시가 됨
		total = 0;
	}
	
	void report(int r) {
		total += r;
	}
	
	abstract void exam(int t);
	
	void printGrade() {
		String grade = "";
		switch (this.total/10) {
		case 10: case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			grade = "F"; break;
		default: grade = "잘못된 점수로 계산 불가능";
		}
	
		System.out.println(num+ "번 " +name+ "의  총점은 " +total+ "이므로 학점은 " +grade);
	}
	
}


class Normal_Student extends Student {
	
	Normal_Student(int no, String n){
		super(no,n);
	}
	
	void exam(int t) {
		total += t;
	}
	
}


class Cunning_Student extends Student {
	
	Cunning_Student(int no, String n){
		super(no,n);
	}
	
	void exam(int t) {
		total += t - 20;
	}
	
}


public class NewStudent {

	public static void main(String[] args) {
		Normal_Student boy = new Normal_Student(2020081001, "김철수");	//일반 학생 객체 boy 생성
		boy.report(38);	// 레포트점수 38점을 총점에 합산하기
		boy.exam(60);	// 시험점수 60점을 총점에 합산하기
		boy.printGrade();	// 총점98점, 학점 A를 출력
		
		Cunning_Student girl = new Cunning_Student(2019081100, "이연희");	// 컨닝한 학생 객체 girl 생성
		girl.report(40);	// 레포트점수 40점을 총점에 합산하기
		girl.exam(44);	// 시험점수 44점에서 20점을 벌점으로 감점하고 총점에 합산
		girl.printGrade();	// 총점64점, 학점 D 출력

	}

}

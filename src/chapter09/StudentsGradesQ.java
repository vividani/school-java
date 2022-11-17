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
			System.out.println(g + "���� ���� ������ ���������� �ƴ�. ������ 0~100�� ���� ��");
	}
	
	void ave_grade() {
		System.out.println(number + "�� " +name+ "�� ���� ������ " +total/count);
	}
	
	void attend(int a) {
		att = a;
	}
	
	void final_grade() {
		fin = (int)((total / count)*0.8 + att*0.2);	//���� ���������� �� ����� ���⼭ �����ص� ��.
		System.out.println(number + "�� " +name+ "�� ���� ������ " +fin);
	}
	
}//Student Ŭ����

public class StudentsGradesQ {

	public static void main(String[] args) {
		StudentQ st1 = new StudentQ(2021081001, "�̱��");
		st1.exam(90);
		st1.exam(80);
		st1.exam(100);
		st1.attend(100);
		st1.ave_grade();
		st1.final_grade();
		
		StudentQ st2 = new StudentQ(2019081123, "������");
		st2.exam(70);
		st2.exam(80);
		st2.exam(90);
		st2.attend(90);
		st2.ave_grade();
		st2.final_grade();

	}//main

}

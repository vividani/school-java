package chapter10;

class Student3{
	int number, count;
	String school, dept, name;
	int grade[];
	final String subject = "��ü������";
	
	Student3(String d, int no, String n){
		school = "";	dept = d;	number = no;	name = n;
		count = 0;
		grade = new int[5];
	}
	
	public void exam(int g) {
		if(g >= 0 && g <= 100)
			grade[count++] = g;
		else
			System.out.println(g+ "���� ���� ������ ���������� �ƴ�.");
	}
	
	public void exam(int g, int g2) {
		if((g >= 0 && g <= 100) && (g2 >= 0 && g2 <= 100))
			grade[count++] = (g>g2)? g:g2;
		else
			System.out.println("�� �������� �߿� ���� ������ �ƴ� ������ ����.");
	}
	
	public void final_grade() {
		int max = grade[0];
		for (int i = 1; i <grade.length; i++)
			if (max < grade[i]) max = grade[i];
		
		System.out.println(school+ "/" +dept+ "/" +number+ "/" +name+ " " +subject+ "�� ����������  " +max+ "��");
	}
}//Student Ŭ����

public class MethodOverloading_StudentGrades {

	public static void main(String[] args) {
		Student3 s, s2;
		s = new Student3("��ǻ�Ͱ��а�", 2021081001, "�����");
		s.exam(100);	s.exam(80);	s.exam(90);	s.exam(88);	s.exam(92);
		s.final_grade();
		s2 = new Student3("������Ű��а�", 2020020033, "�̿���");
		s2.exam(50, 80);	s2.exam(70);	s2.exam(30, 20);	s2.exam(80);	s2.exam(85);
		s2.final_grade();

	}

}

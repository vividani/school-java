package chapter10;
import java.util.Scanner;

class Student {
	int number, count;
	String dept, name;
	int grade[];
	static double tot = 0;					//��ü ���������� ���� ���� : ��ü���� �������� ����ϱ� ������ Ŭ������ ���� static���� �����Ѵ�.
	static int student_count = 0;
	static final String subject = "��ü������";
	
	Student(String d, int no, String n) {
		dept = d;	number = no;	name = n;	count = 0;
		grade = new int[5];
		student_count++;
	}
	
	void exam(int g) {
		if(g >= 0 && g <= 100)
			grade[count++] = g;
		else
			System.out.println(g+ "���� ���� ������ ���������� �ƴ�.");
	}
	
	public void final_grade() {
		int max = grade[0];
		for (int i = 1; i <grade.length; i++)
			if (max < grade[i]) max = grade[i];
		
		System.out.println(dept+ "/" +number+ "/" +name+ " " +subject+ "�� ����������  " +max+ "��");
		tot += max;		// ��ü ���������� ����� ���ϱ� ���� �� �л��� ���� ���� ����
	}
	
	static void class_average() {	// ��ü ���������� ��� ���� ���ϴ� Ŭ������ �޼ҵ�
		double ave = tot / student_count;	// �л����� ���������� ������ / �л���
		System.out.println(subject+ " ��ü ���������� �б⸻ ��� ������ " +ave+ "�� �Դϴ�.");
	}
}

public class UsingStatic {

	public static void main(String[] args) {
		int end = 1;
		Scanner s = new Scanner(System.in);
		while (end != 2) {
			System.out.print("������ ���� �л��� �а��� �й� �̸��� ������� �Է��ϼ��� => ");
			String dept = s.next(); int no = s.nextInt(); String name = s.next();
			Student stu = new Student(dept, no, name);	//�л� ��ü ���� �� ����
			
			System.out.print(dept+ "/" +no+ "/" +name+ " �л��� �� 5ȸ ������������ ��� �Է��ϼ��� => ");
			for (int i = 0; i < 5; i++)
				stu.exam(s.nextInt());	// ��ü ��� : �ش� �л� ��ü�� �������� �Է¹޾� ����
			
			stu.final_grade();			// ��ü ��� : �ش� �л� ��ü�� �������� �� �ִ밪�� ���� ���� ���
			System.out.print("���α׷��� �����Ͻ÷��� 2, ��� �ٸ� �л��� ������ ���Ͻ÷��� 1 �Է� => ");
			end = s.nextInt();
		}
		Student.class_average();	// ���������� ��ü ��� ������ ��� : Ŭ������ �޼ҵ�

		s.close();
	}	// �� ����� Ư�� �л� ��ü�� �Ҽӵ� �ൿ�� �ƴϹǷ� Ŭ������ �޼ҵ�� ����

}

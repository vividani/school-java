package chapter09;
import java.util.Scanner;

class Student {
	int number, count;
	String dept, name;
	int grade[];
	final String subject = "��ü������";
	
	Student (String d, int no, String n){
		dept = d;	number = no;	name = n;
		count = 0;	grade = new int[5];
	}
	
	/*�� ���⼭ public�� ����??*/void exam(int g) {	
		if (g >= 0 && g <= 100)
			grade[count++] = g;
		else
			System.out.println(g+ "���� ���� ������ ���������� �ƴ�.");
	}
	
	/*�� ���⼭ public�� ����??*/void final_grade() {
		int max = grade[0];
		
		for (int i = 1; i < grade.length; i++)
			if (max < grade[i]) max = grade[i];
		
		System.out.print(dept+ "/" +number+ "/" +name+ " " +subject+ "�� ���������� \"" +max+ "\"��");
	}
}//Student Ŭ����

public class StudentGrades2Q {

	public static void main(String[] args) {
		int ans;
		Scanner s = new Scanner(System.in);
		
		do {
			
			System.out.print("������ ���� �л��� ��� �� ���Դϱ�?> ");	int cnt = s.nextInt();
			
			Student st[] = new Student[cnt];
		
			for (int i = 0; i <cnt; i++) {
				System.out.print("������ ���� �л��� �а��� �й� �̸��� ������� �Է��ϼ���> ");
				String dept = s.next();		int no = s.nextInt();	String name = s.next();
			
				st[i] = new Student(dept, no, name);
				
				System.out.print(dept+ "/" +no+ "/" +name+ " �л��� �� 5���� ���������� ��� �Է��ϼ��� > ");
				for (int j = 0; j < 5; j++) st[i].exam(s.nextInt());
		
				st[i].final_grade();
			}//for��
			System.out.print("���α׷��� �����Ͻ÷��� 2, ����ؼ� �ٸ� �л��� ������ ���Ͻ÷��� 1 �Է�> ");
			ans = s.nextInt();
			System.out.println();
		
		} while(ans == 1);

		s.close();
	}//main�Լ�

}

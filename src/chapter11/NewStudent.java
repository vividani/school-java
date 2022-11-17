package chapter11;

abstract class Student{	//�����ڸ� ����� ������ ����� �Ͼ.(���� �� ���)
	int total = 0, num = 0;
	String name;
	
	public Student(int no, String name){
		num = no;
		this.name = name;	//��������� �Ű������� �̸��� ���� ��� this.�� ���̸� ���������� ǥ�ð� ��
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
		default: grade = "�߸��� ������ ��� �Ұ���";
		}
	
		System.out.println(num+ "�� " +name+ "��  ������ " +total+ "�̹Ƿ� ������ " +grade);
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
		Normal_Student boy = new Normal_Student(2020081001, "��ö��");	//�Ϲ� �л� ��ü boy ����
		boy.report(38);	// ����Ʈ���� 38���� ������ �ջ��ϱ�
		boy.exam(60);	// �������� 60���� ������ �ջ��ϱ�
		boy.printGrade();	// ����98��, ���� A�� ���
		
		Cunning_Student girl = new Cunning_Student(2019081100, "�̿���");	// ������ �л� ��ü girl ����
		girl.report(40);	// ����Ʈ���� 40���� ������ �ջ��ϱ�
		girl.exam(44);	// �������� 44������ 20���� �������� �����ϰ� ������ �ջ�
		girl.printGrade();	// ����64��, ���� D ���

	}

}

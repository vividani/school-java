package chapter06;
import java.util.*;
public class MaxNumber {

	public static void main(String[] args) {
		
		int i, count, max;
		Scanner s = new Scanner(System.in);
		System.out.print("�������� �Է��ϸ� ���� ū ���� ã���ݴϴ�. �Է��� ������ ������? ");
		count = s.nextInt();
		
		int num[] = new int[count]; //�迭 ���� �� ����
		
		System.out.println("�������� �ϳ��� �Է��ϼ���"); //�Էµ� �������� ������ �迭 num�� ����
		for (i=0; i<count; i++)
			num[i] = s.nextInt();
		
		for (i=1, max=num[0]; i<num.length; i++) { //num�� ��ҿ� ���ؼ� max �� ���ϱ�
			if (max < num[i])
				max = num[i];
		}
		System.out.println("�ִ밪�� " +max);
		s.close();

	}//main

}//class

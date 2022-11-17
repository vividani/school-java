package chapter07;
import java.util.Scanner;
public class FindFactors {
	/*final static int END = -999; ���α׷����� �ʿ�����Ƿ� ������ �� */

	public static void main(String[] args) {
		System.out.println("����� ���ϰ� ���� ������ �ϳ� �Է��ϸ� �� ������ ������� ��� ã�Ƽ� 2���� �迭�� �����ϰ� ����ϴ� ���α׷��Դϴ�.");
		System.out.print("����� ���ϰ� ���� ������ ������ �� ��ΰ���? ���ڸ� �Է� => ");
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();             //�Է� �� ������ ����
		int data[][] = new int[cnt][];     //�Էµ� ������ ���� ������� ������ 2���� �迭
		
		for(int i = 0, input = 0;i < cnt; i++) {
			System.out.print("����� ���ϰ� ���� ������ �ϳ� �Է��ϼ��� => ");
			input = s.nextInt();
			int f[] = findFactors(input);  //findFactors�Լ��� �̿��ؼ� ��� ã�� 1���� �迭 return

			data[i] = f;
			
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++)
				System.out.print(data[i][j]+ " ");
			System.out.println();
		}
			s.close();
	}//main

	static int[] findFactors(int num) {
		
		int count = 0;		//������ ��� ���� �迭
		 for (int i=1; i<=num; i++)
		 	if (num %i == 0) count++;
		/*
		 int factors[] = new int[num];
		 *�迭�� ������ num���� �Ѵٴ� ���� �������� ���� ����.
		 *����� ������ �� ���ڴ� �ƹ��� ������ �����Ƿ� ��� ������ ���� �߻���.
		 *���� �����  ã�� for���� ���� ����ؼ� ����� ������ ã�� �� �� ����ŭ �迭�� �Ҵ��ؾ���.
		*/
		
		int factors[] = new int[count+1]; factors[0] = num; 
		for (int i=1, j=0; i<=num; i++)
			if(num %i == 0) factors[++j] = i; 
		
		/* ���� �ۼ��� �߸��� �ڵ�
		factors[0] = num;               //ù��° ��Ҵ� �Է� ���� ��
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > 0; j--)
				if (num % j == 0) factors[i] = num / j;
		*/
		
		return factors;			//�迭 ��ü�� �����Ѵ�.(call by reference)
	}

}//program

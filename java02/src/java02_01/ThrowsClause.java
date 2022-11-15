package java02_01;

class MinusException extends Exception {}

public class ThrowsClause {
	public static void main(String[] args) { //���α׷��� ���� ���ܿ� ���� ���� ó��
		int num;
		try {
			num = Integer.parseInt(args[0]);
			if (num < 0)
				throw new MinusException();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("데이터를 입력하세요!");
		} catch (MinusException e) {
			System.out.println("양수를 입력하시오!");
		}
	}
}

package java02_01;

class InputException extends Exception {};
class EmptyException extends Exception {};


public class UserDefinedExcept2 {
	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new EmptyException();
			else if (args.length != 3)
				throw new InputException();
			else
				System.out.println("올바른 수식을 입력하시오!");
		} catch (EmptyException e) {
			System.out.println("수식이 입력되지 않았소!");
		} catch (InputException i) {
			System.out.println("사칙 연산 수식의 항은 3개여야 하오!");
		}
	}
}

package java02_01;

//MinusException 예외는 이미 ThrowsClause에 정의됨

public class ExceptionExample {
	public static void main(String[] args) {
		int num;
		try {
			num = Integer.parseInt(args[0]);
			if (num < 0)
        //예외 발생
				throw new MinusException();
      System.out.println("읽어들인 숫자는 "+num);
      //예외 처리
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("데이터가 입력되지 않았어요!");
		} catch (MinusException e) {
			System.out.println("양수를 입력하시오!");
		} catch (NumberFormatException n) {
      //시스템 정의 예외
			System.out.println("숫자를 입력하시오!");
		}
	}
}

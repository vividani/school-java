package java02_02;

class NoDataException extends Exception{}; //입력값 없음 예외
//타입 예외 TypeException 정의
//대신 NumberFormatException(시스템)이 있다..!!!

class InputException extends Exception{}; //입력 길이 예외
class OperatorException extends Exception{}; //연산자 예외


public class TestCalculator {
	
	//입력값 없음 예외 메소드
	static void noData_ex(String[] args) throws NoDataException {
		if (args.length == 0) throw new NoDataException();
	}
	//입력 길이 예외 메소드
	static void input_ex(String[] args) throws InputException {
		if (args.length != 3) throw new InputException();
	}

	//연산자 예외 메소드
	static void op_ex(String[] args) throws OperatorException {
		if (!(args[1].equals("+")||args[1].equals("-")||args[1].equals("x")||args[1].equals("X")||args[1].equals("/"))) {
			throw new OperatorException();
		}
	}
	//계산 메소드
	static double calculation(String[] args) {
		int ans = 0;
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);
		String op = args[1];
		
		if (op.equals("+"))	ans = n1 + n2;
	    else if (op.equals("-")) ans = n1 - n2;
	    else if (op.equals("x")||op.equals("X")) ans = n1 * n2;
	    else if (op.equals("/")) ans = n1 / n2;
		
		return ans;
	}


	public static void main(String[] args) {
		
		try {
	        noData_ex(args);
	        input_ex(args);
	        op_ex(args);
	        System.out.println(args[0] + args[1] + args[2] + "=" + calculation(args));	        
	        
		} catch (NoDataException e) {
			System.out.println("사칙연산 수식을 입력해 주세요!!");
		} catch (InputException i) {
			System.out.println("수식 입력을 이와 같이 해주세요 ==> <숫자> <연산자> <숫자>");
		} catch (OperatorException o) {
			System.out.println("연산은 사칙 연산만 가능합니다!! ex) <숫자> <연산자(+,-,x,/)> <숫자>");
		} 
        /*
          catch (TypeException t) {
		      System.out.println("피연산자는 숫자만 들어올 수 있습니다!! ex) <숫자> <연산자(+,-,x,/)> <숫자>");
		  }
		*/
		
		
	}

}
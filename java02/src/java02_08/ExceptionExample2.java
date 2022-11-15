package java02_08;

class EmptyData extends Exception{} //예외정의1 : 입력값 없음
class MinusException extends Exception{} //예외정의2 : 음수 값 입력

public class ExceptionExample2 {
	
	public static void main(String[] args) {
		
		try {
			int num;
			
			if(args.length == 0)
				throw new EmptyData(); // 예외1
			
			//입력값 int로 형변환 후 num에 저장
			num = Integer.parseInt(args[0]);
			
			if(num<0)
				throw new MinusException(); //예외2
			else
				System.out.println("읽어들인 숫자는 " +num); //정상출력
			
		} catch(EmptyData e) { //예외1
			System.out.println("데이터가 입력되지 않았습니다!");
		} catch(MinusException m) { //예외2
			System.out.println("양수를 입력하세요!");
		} catch(NumberFormatException n) { //시스템정의예외
			System.out.println("숫자를 입력하세요!");
		}
		
	}//main
	
}//class

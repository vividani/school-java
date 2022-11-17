package chapter06;
import java.util.Scanner;
public class ParkingCars {
	
	static String tunnel[];     //여러 메소드에서 공유하기 위해 전역변수 위치에 선언
	static int pos = 0, size;    //스택이 비어있을 때 top은 -1

	public static void main(String[] args) {
		int select = 0;
		System.out.print("주차할 터널의 크기를 입력하세요 => ");
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		tunnel = new String[size];
		
		while (select != 3) {
			System.out.print("\n차를 주차하려면 1과 차이름을 입력, 출차하려면 2, 종료하려면 3을 입력하세요\n=> ");
			
			select = s.nextInt();
			if (select == 1) parkIn(s.next());	//입차
			else if (select == 2) parkOut();	//출차
			else;
			if (select != 3) printCars();		//종료하지 않았다면 터널 상태 출력
			
		}//while
		
		s.close();
	}//main 종료
	
	static void parkIn(String car) {
		if (pos == size)
			System.out.println("터널이 꽉차서 주차할 공간이 없습니다.");
		else
			tunnel[pos++] = car;
	}
	
	static void parkOut() {
		if (pos == 0)
			System.out.println("터널에 출차할 차가 없습니다.");
		else
			System.out.println("터널에서 " +tunnel[--pos]+ "가 출차되었습니다.");
	}
	
	static void printCars() {
		System.out.print("< 현재 터널에 주차된 차는 ");
		if (pos == 0) System.out.println("없습니다. >");
		else {
			for (int i= 0; i <pos; i++)
				System.out.print(tunnel[i]+ " ");
			System.out.println(">");
		}
	}
	
}//프로그램 종료

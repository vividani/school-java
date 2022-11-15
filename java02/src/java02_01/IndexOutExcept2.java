package java02_01;

public class IndexOutExcept2 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			for (int i = 0; i <= 5; i++) {
				a[i] = i;
				System.out.println("a["+i+"]="+a[i]);
			}
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			//배열의 첨자가 범위를 벗어날 떄 발생하는 시스템 예외
			System.out.print("배열의 크기를 벗어났어요!");
		}
	}

}

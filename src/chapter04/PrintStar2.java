package chapter04;
import java.util.*;
public class PrintStar2 {

	public static void main(String[] args) {
		
		System.out.println("Á¤¼ö ÀÔ·Â==>");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i=1; i<n+1; i++) {
			for (int j=1; j<2*i-2; j++) {
				System.out.println(" ");
			}//ºóÄ­
			
			for (int k=0; k<2*(n-i)+1; k++) {
				System.out.println("*");
			}//º°
			
			System.out.println("\n"); //ÁÙ¹Ù²Þ
		}
		s.close();
	}

}

package chapter07;

public class YearArray {

	public static void main(String[] args) {
		String year[][] = {
				{"March", "april", "May"},
				{"Jun", "July", "August"},
				{"September", "October", "November"},
				{"December", "January", "February"}
		};
		
		for (int i=0; i<year.length; i++) {
			switch(i) {
			case 0 : System.out.print("º½ : "); break;
			case 1 : System.out.print("¿©¸§ : "); break;
			case 2 : System.out.print("°¡À» : "); break;
			case 3 : System.out.print("°Ü¿ï : "); break;
			}
			for (int j=0; j<year[i].length; j++)
				System.out.print(year[i][j]+ " ");
			System.out.println();
		}//¹Ù±ù for¹®

	}//main

}//program

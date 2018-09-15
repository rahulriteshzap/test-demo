package BeginnersBook;

public class Pattern1 {

	public static void main(String[] args) {
		
		for (int row=1; row <=4; row ++) {
			
			for (int col=1; col<=4 ; col++) {
				
				if (col + row == 5) {
					 System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println("");
		}

	}

}

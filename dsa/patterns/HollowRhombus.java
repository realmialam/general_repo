
import java.util.Scanner;
public class HollowRhombus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		/*
		
		row==5



		c(2, 4), c(2, 8)
		c(3, 3), c(3, 7)
		c(4, 2), c(4, 6)
		
		star to be printed at following locations:

		1. i=1 and i=row
		2. i+j = row + 1 and i+j = 2*row



		*/


		for(int i=1; i<=row; i++){

			for(int j=1; j<=2*row-1; j++){
				int sum = i+j;
				if(sum == row+1 || sum == 2*row || i==1&& j>row || i==row&&j<=row){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
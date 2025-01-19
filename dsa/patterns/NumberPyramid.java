
import java.util.Scanner;
public class NumberPyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		/*

		row=5

		r1: spaces=4, number 1 r-times
		r2: spaces=3, number 2 r-times
		*/


		for(int i=1; i<=row; i++){
			// print spaces
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}

			// print numbers
			for(int j=1; j<=i; j++){
				System.out.print(i + " ");
			}

			System.out.println();
		}
	}
}
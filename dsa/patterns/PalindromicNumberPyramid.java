
import java.util.Scanner;
public class PalindromicNumberPyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		/*

		row=5

		r1:  spaces=4, 1 1times, blank
		r2:  spaces=3, 2,1,2
		r3:  spaces=2, 3,2,1,2,3
		*/


		for(int i=1; i<=row; i++){

			// print spaces
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}

			// first number part
			for(int j=i; j>=1; j--){
				System.out.print(j);
			}

			// second number part
			for(int j=2; j<=i; j++){
				System.out.print(j);
			}

			System.out.println();
		}
	}
}
import java.util.Scanner;
public class RightHalfTriangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		

		/*
		row = 4;
		r1: space=3, star=1
		r2: space=2, star=2
		r3: space=1, star=3
		r4: space=0, star=4


		*/

		for(int i=1; i<=row; i++){

			// print spaces
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}

			// print stars
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}

			// change of line

			System.out.println();
		}

	}
}
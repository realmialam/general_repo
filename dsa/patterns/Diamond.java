import java.util.Scanner;
public class Diamond{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();

		/*

		row=4
		-----
		
		top-left-half

		r1: spaces=3, star=1
		r2: spaces=2, star=2
		r3: spaces=1, star=3
		r4: spaces=0, star=4

		r-n: spaces=row-i, star=i


		top-right-half

		r1: nothing
		r2: star=1
		r3: star=2
		r4: star=3

		r-n: star=i-1

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

			// print stars
			for(int j=1; j<=i-1; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i=row; i>=1; i--){

			// print spaces
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}

			// print stars
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}

			// print stars
			for(int j=1; j<=i-1; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
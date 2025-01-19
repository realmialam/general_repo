import java.util.Scanner;
public class Butterfly{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		/*
		
		for row=4
		---------

		part1 - stars

		r1: stars=1
		r2: stars=2
		r3: stars=3
		.
		.
		.


		part2 - spaces

		r1: spaces = 6
		r2: spaces = 4
		r3: spaces = 2
		r4: spaces = 0

		r-n: spaces = 2 (row-i)


		part3 - stars

		r1: stars=1
		r2: stars=2
		r3: stars=3

		r-n: stars=i

		*/

		// upper half

		for(int i=1; i<=row; i++){

			// print stars
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}

			// print spaces
			for(int j=1; j<=2*(row-i); j++){
				System.out.print(" ");
			}

			// print stars
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		// lower half

		for(int i=row; i>=1; i--){

			// print stars
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}

			// print spaces
			for(int j=1; j<=2*(row-i); j++){
				System.out.print(" ");
			}

			// print stars
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}

			System.out.println();
		}


	}

}
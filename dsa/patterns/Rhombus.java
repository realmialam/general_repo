
import java.util.Scanner;
public class Rhombus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		/*
		rows = 5

		r1: spaces=4 and star=5
		r2: spaces=3 and star=5
		r3: spaces=2 and start=5
		r4: spaces=1 and star=5
		r5: spaces=0 and star=5

		*/

		for(int i=1; i<=rows; i++){

			// print spaces
			for(int j=1; j<=rows-i; j++){
				System.out.print(" ");
			}
			
			// print stars
			for(int j=1; j<=rows; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
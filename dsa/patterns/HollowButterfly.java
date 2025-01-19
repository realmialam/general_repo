
import java.util.Scanner;
public class HollowButterfly{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();


		/*

		when row=5
		
		c(1,1), c(1,10)
		c(2,1), c(2,2), c(2,9), c(2,10)
		c(3,1), c(3,3), c(3,8), c(3,10)


		when row=2

		c(1,1), c(1,2), c(1,3), c(1,4)
		c(2,1), c(2,2), c(2,3), c(2,4)
		c(3,1), c(3,2), c(3,3), c(3,4)

		from above analysis we found that * is printed at following positions

		* is printed at the edge (where i=row and j=2*row)
		* is printed when i==j
		* is printed when i+j = 2*row + 1




		*/


		for(int i=1; i<=row; i++){

			for(int j=1; j<=2*row; j++){
				if((i==j) || (i+j == 2*row+1) || (j==1) || (j==2*row)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}


			}
			System.out.println();
		}

		for(int i=row; i>=1; i--){

			for(int j=1; j<=2*row; j++){
				if((i==j) || (i+j == 2*row+1) || (j==1) || (j==2*row)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}


			}
			System.out.println();
		}
	}
}

import java.util.Scanner;

public class CountPathMaze{


	private static int countPath(int n, int m){


		if(m==1 && n==1){



			return 1;
		}
		if((m==0 || n==0)){
			return 0;
		}

		// move towards left

		int countLeft = countPath(n-1, m);


		// move towards up

		int countUp = countPath(n, m-1);

		return countLeft + countUp;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // row
		int m = sc.nextInt(); // column

		int result = countPath(n,m);
		System.out.println(result);
	}
}

import java.util.Scanner;
class Array2D{
	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int [][] arr = new int [n][m];

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				arr[i][j] = sc.nextInt();
			}
		}


		System.out.println("characters array..");
		char [][] charArray = new char[n][m];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				charArray[i][j] = sc.next().charAt(0);
			}
		}

		print(charArray, n, m);

	}

	private static void print(char [][] arr, int n, int m){
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}




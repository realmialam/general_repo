
import java.util.Scanner;
class RotateAntiClockWise{

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

		print(arr, n,m);
		// reverse each row;

		for(int i=0; i<n; i++){
			reverse(arr, i, m);
		}
		print(arr, n,m);

		// take transpose of the array

		transpose(arr, n, m);

		System.out.println("rotated array...");
		print(arr, n,m);



	}

	private static void reverse(int [][] arr, int currentRow, int columnNum){
		int start = 0;
		int end = columnNum-1;

		while(start < end){
			int temp = arr[currentRow][start];
			arr[currentRow][start] = arr[currentRow][end];
			arr[currentRow][end] = temp;

			start++;
			end--;
		}
	}

	private static void transpose(int arr[][], int n, int m){
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(j>i){
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
	}

	private static void print(int [][] arr, int n, int m){
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
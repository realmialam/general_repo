
import java.util.Scanner;
public class RecursiveBubbleSort{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			int value = sc.nextInt();
			arr[i] = value;
		}

		recursiveBubble(arr, size, 0);
		for(int i=0; i<size; i++){
			System.out.println("a:" + arr[i]);
		}
	}

	private static void recursiveBubble(int []arr, int n, int j){
		if(n==1){
			return;
		}
		if(j==n-1){
			recursiveBubble(arr, n-1, 0);
			return;
		}
		if(arr[j]>arr[j+1]){
			swap(arr, j);
		}

		recursiveBubble(arr, n, j+1);
		return;
	}

	private static void swap(int arr[], int j){
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
		return;
	}
}
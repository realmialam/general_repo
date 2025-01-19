
import java.util.Scanner;
public class ArrayStrictlyIncreasing{

	public static boolean isIncreasing(int [] arr, int size, int idx){
		if(size<=0){
			return false;
		}

		if(size-1 == idx){
			return true;
		}

		if(arr[idx] < arr[idx+1]){
			return isIncreasing(arr, size, idx+1);
		}

		return false;
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0; i<size; i++){
			int temp = sc.nextInt();
			arr[i] = temp;
		}

		System.out.println(isIncreasing(arr, size, 0));
	}
}
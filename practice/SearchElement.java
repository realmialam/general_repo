
import java.util.Scanner;

public class SearchElement{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int[] arr = new int[]{5,8,9,5,7,4,2};
		
		int count = 0;
		int index = linearSearch(key, arr, count);
		System.out.println(index);
		

	}

	public static int linearSearch(int key, int[] arr, int count){

		if(count == arr.length){
			return -1;
		}	
		
		if(arr[count] ==  key){
			return count;
		}
		
		return linearSearch(key, arr, count + 1);
		

	}


}

import java.util.*;

class SearchInArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int size = sc.nextInt();

		int [] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(find(key, arr, 0));

	}

	public static boolean find(int key, int [] arr, int cpos){
		if(cpos == arr.length){
			return  false;
		}

		if(arr[cpos] == key){
			return true;
		}

		return find(key, arr, cpos+1);
	}
}
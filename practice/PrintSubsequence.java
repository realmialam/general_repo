
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence{


	public static void main(String args[]){

		int [] arr = new int[]{1,2,3};
		List<Integer> output = new ArrayList<>();
		print(arr, output, 0, arr.length);

	}


	public static void print(int [] arr, List<Integer> output, int idx, int size){

		if(idx >= size){
			
			System.out.println(output);
			return;
		
		}

		// take the element present at index = idx
		output.add(arr[idx]);
		print(arr, output, idx+1, size);
		output.remove(output.size()-1);
		print(arr, output, idx+1, size);



	}



}



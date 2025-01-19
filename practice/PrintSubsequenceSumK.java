
import java.util.Scanner;	
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class PrintSubsequenceSumK{

	public static void main(String args[]){

		int [] arr = new int[]{2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		List<Integer> output = new ArrayList<>();
		int idx = 0;
		printWithSumK(arr, k, output, idx, arr.length);


	}

	public static void printWithSumK(int [] arr, int k, List<Integer> output, int idx, int size){

		if(idx >= size){

			int sum = output.stream().mapToInt((Integer val) -> val).sum();
			if(sum == k){

				for(Integer num : output){
					System.out.print(num + " ");
				}
				System.out.println();
			}

			return;
		
		}
		
		// take the element at index = idx
		output.add(arr[idx]);
		printWithSumK(arr, k, output, idx+1, size);
		output.remove(output.size()-1);

		// do not take the elememt at index = idx
		printWithSumK(arr, k, output, idx + 1, size);

		

	}



}
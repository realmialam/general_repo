import java.util.Scanner;

class MaxSubArraySum2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi");

		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0; i<size; i++){
			int temp = sc.nextInt();
			arr[i] = temp;
		}


		// cumulative sum array
		int[] cumSumArray = new int[size];
		cumSumArray[0] = arr[0];
		for(int i=1; i<size; i++){
			cumSumArray[i] = arr[i] + cumSumArray[i-1];
		}

		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i<size; i++){
			for(int j=i; j<size; j++){
				int sum = 0;
				if(i==0){
					sum = cumSumArray[j];
				}else{
					sum = cumSumArray[j] - cumSumArray[i-1];
				}

				maxSum = sum > maxSum ? sum : maxSum;

				// System.out.println(i + " , " + j);
			}
		}
		

		System.out.println("Max sum: " + maxSum);
	}
}





import java.util.Scanner;

class MaxSubArraySum1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi");

		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0; i<size; i++){
			int temp = sc.nextInt();
			arr[i] = temp;
		}

		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				int sum = 0; 
				for(int k=i; k<=j; k++){
					sum += arr[k];
				}

				maxSum = sum > maxSum ? sum : maxSum;
			}
		}

		System.out.println("Max sum: " + maxSum);
	}
}





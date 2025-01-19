

import java.util.Scanner;

class SubaArray{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<size; i++){
			int temp = sc.nextInt();
			arr[i] = temp;
		}

		printSubArray1(arr);
		System.out.println("-----");
		printSubArray2(arr);
	}


	private static void printSubArray1(int [] arr){

		System.out.println("sub array is as below");
		int size = arr.length;
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				for(int k=i; k<=j; k++){
					System.out.print(arr[k] + ", ");
				}
				System.out.println();
			}

			
		}
	}

	private static void printSubArray2(int [] arr){

		System.out.println("sub array is as below");
		int size = arr.length;
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				for(int k=j; k<=i; k++){
					System.out.print(arr[k] + ", ");
				}
				System.out.println();
			}

			
		}
	}
}
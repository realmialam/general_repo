public class InsertionSort{

	public static void main(String args[]){

		int [] arr = new int[]{7,8,9,3,4,5,6,7,9,76,56,4,4};
		int len = arr.length;
		insertionSort(arr, len);
		for(int i=0; i<len; i++){

			System.out.println(arr[i]);

		}

	}


	public static void insertionSort(int[] arr, int n){

		for(int i=0; i<n; i++){

			int j=i;
			while(j>0 && arr[j-1]>arr[j]){

				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;

				j--;

			}

		}


	}


}
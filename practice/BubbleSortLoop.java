public class BubbleSortLoop{


	public static void main(String args[]){

		int [] arr = new int[]{6,7,8,3,4,6,7,0,-1};
		bubbleSort(arr, arr.length);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}


	public static void bubbleSort(int[] arr, int n){


		for(int i=0; i<n-1; i++){

			for(int j=0; j<n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}
	}



}
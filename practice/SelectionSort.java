public class SelectionSort{

	public static void main(String args[]){


		int [] arr = new int[]{6,7,8,3,4,67,9,0};

		selectionSort(arr, arr.length);


		for(int i=0; i<arr.length; i++){
			
			System.out.println(arr[i]);

		}
		



	}


	public static void selectionSort(int [] arr, int n){

		if(n<=1){
			return;
		}


		for(int i=0; i<n-1; i++){

			int minIdx = i;
			for(int j=i; j<n; j++){
				if(arr[j] < arr[minIdx]){
				
					minIdx = j;

				}
				
			}

			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;


		}

		

	}
	
	



}







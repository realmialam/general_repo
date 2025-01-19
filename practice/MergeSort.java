public class MergeSort{

	public static void main(String args[]){

		int [] arr = new int []{5,6,7,89,3,3,45,5,6,7,8};
		int end = arr.length;
		int start = 0;
		
		mergeSort(arr, start, end-1);

		for(int i=0; i<end; i++){

			System.out.println(arr[i]);
		}

		

	}

	public static void mergeSort(int[] arr, int start, int end){
		
		if(start >= end){
			return;
		}
		
		int mid = (start + end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);

		merge(arr, start, mid, end);
		

	}


	public static void merge(int [] arr, int start, int mid, int end){

		int n1 = mid-start+1;
		int n2 = end - mid;
		
		int [] temp1 = new int [n1];
		int [] temp2 = new int [n2];


		for(int i=0; i<n1; i++){
			temp1[i] = arr[start+i];
		}

		for(int i=0; i<n2; i++){
			temp2[i] = arr[mid+i+1];
		}

		
		int i=0, j=0, k=start;
		
		while(i<n1 &&  j<n2){

			if(temp1[i] > temp2[j]){

				arr[k] = temp2[j];
				j++;
			}else{
				arr[k] = temp1[i];
				i++;
			}
			k++;
		}

		while(i < n1){

			arr[k] = temp1[i];
			k++;
			i++;
		}

		while(j < n2){

			arr[k] = temp2[j];
			k++;
			j++;
		}

	}
	


}
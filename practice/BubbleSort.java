
public class BubbleSort{

	public static void main(String args[]){

		int [] arr = new int[]{7,7,8,6,8,9,3,5,-9};
		
		bubbleSort(arr, arr.length, 0);

		for(int i=0; i<arr.length; i++){

			System.out.println(arr[i] + " " );
		}

	}

	public static void bubbleSort(int [] arr, int size, int currentIdx){

		if(size == 1)
			return;

		
		if(currentIdx == size - 1){
			bubbleSort(arr, size-1, 0);
			return;
		}		

		if(arr[currentIdx] > arr[currentIdx+1]){
			int temp = arr[currentIdx];
			arr[currentIdx] = arr[currentIdx+1];
			arr[currentIdx+1] = temp;
		}

		bubbleSort(arr, size, currentIdx+1);
		return;
		

	}

	

}
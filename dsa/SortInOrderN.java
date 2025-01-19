import java.util.Scanner;
class SortInOrderN{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		int sz = sc.nextInt();
		int arr[] = new int[sz];
		for(int i=0; i<sz; i++){
			arr[i] = sc.nextInt();
		}


		// sort in order N

		int low = 0;
		int mid = 0;
		int high = sz-1;

		while(mid <= high){

			if(arr[mid] == 0){
				System.out.println(arr[mid]);
				swap(arr, low, mid);
				mid++;
				low++;
				
				print(arr, sz);
			}else if(arr[mid] == 1){
				System.out.println(arr[mid]);
				mid++;
				
				print(arr, sz);
			}else{
				System.out.println(arr[mid]);
				swap(arr, mid, high);
				high--;
				
				print(arr, sz);
			}
		}

		System.out.println("sorted array..");

		for(int i=0; i<sz; i++){
			System.out.println(arr[i]);
		}


	}

	private static void swap(int [] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return;
	}

	private static void print(int [] arr,  int sz){
		for(int i=0; i<sz; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

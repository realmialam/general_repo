import java.util.Scanner;

class RemoveDuplicatesCharacters{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		int sz = sc.nextInt();
		char charArray [] = new char[sz];
		for(int i=0; i<sz; i++){
			charArray[i] = sc.next().charAt(0);
		}

		print(charArray);
		removeDuplicates(charArray);
		print(charArray);

	}

	private static void removeDuplicates(char [] arr){
		int len = arr.length;
		int prev = 0;
		for(int i=1; i<len; i++){
			if(arr[prev] != arr[i]){
				prev++;
				arr[prev] = arr[i];
			}
		}

	}
	
	private static void print(char [] arr){
		int sz = arr.length;
		for(int i=0; i<sz; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}




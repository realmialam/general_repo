import java.util.Scanner;
class FindPairSumK{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
	System.out.println("Hi");
	int sz = sc.nextInt();

	// int [] arr = new int[sz];
	int [] arr = new int[sz];

	for(int i=0; i<sz; i++){
		arr[i] = sc.nextInt();
	}

	System.out.println("K: ");
	int k = sc.nextInt();

	int start = 0;
	int end = sz-1;


	while(end > start){
		int pairSum = arr[end] + arr[start];

		if(pairSum > k){
			end--;
		}else if(pairSum < k){
			start++;
		}else{
			System.out.println(start +  " , " + end);
			break;
		}
	}
	}
}
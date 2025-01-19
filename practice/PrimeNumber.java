public class PrimeNumber{

	public static void main(String args[]){
		
		PrimeNumber pm = new PrimeNumber();
		for(int i=1; i<100; i=i+2){
			if(pm.method1(i)){
				System.out.println(i + " Prime ");
			}else{
				System.out.println(i + " Not a Prime ");
			}
		}

		pm.primeSieve(100);
		
	}

	private boolean method1(int n){
		if(n<=1){
			return false;
		}

		if(n==2){
			return true;
		}
		for(int i=2; i*i<=n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;

	}

	private int [] primeSieve(int n){

		int [] arr = new int[n+1];
		// mark all odd numbers as prime numbers
		for(int i=3; i<n+1; i=i+2){
			arr[i] = 1;
		}

		for(int i=3; i<n+1; i++){

			if(arr[i]==1){
				for(int j = i*i; j<n+1; j = j+i){
					arr[j] = 0;
				}
			}
		}

		arr[2] = 1;
		arr[1] = arr[0] = 0;


		for(int i=0; i<n+1; i++){

			if(arr[i] == 1){
				System.out.println(i + " is a prime number..");
			}
		}

		return arr;

		
	}



}

import java.util.Scanner;
class SquareRoot{
	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		int n = sc.nextInt();
		System.out.println("p:");
		int p = sc.nextInt();

		System.out.println("root:" + root(n,p));

	}

	private static float root(int n, int p){

		float ans = -1;

		int s=0;
		int e=n;

		while(s<=e){
			int mid = (s+e)/2;

			if(mid*mid == n){
				return mid;
			}else if(mid*mid < n){
				ans = mid;
				s = mid+1;
			}else{
				e = mid-1;
			}
		}

		// for floating points
		float inc = 0.1f;
		for(int i=1; i<=p; i++){
			while(ans*ans < n){
				ans += inc;
			}

			inc = inc/10;
			ans = ans - inc;
		}

		return ans;
	}
}
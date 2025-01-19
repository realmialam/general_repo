import java.util.*;

class FastPower{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int exponent = sc.nextInt();
		int base = sc.nextInt();

		System.out.println(fastPower(base, exponent));


	}

	public static int fastPower(int a, int b){
		if(b==0){
			return 1;
		}

		int small = fastPower(a, b/2);
		if((b&1) == 1){
			return a*small*small;
		}else{
			return small*small;
		}
	}
}
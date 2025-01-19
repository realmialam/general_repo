
import java.util.*;

public class GoodSubArray{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int power = sc.nextInt();
		int result = fastPower(base, power);
		System.out.println(result);
	}

	public static int fastPower(int base, int power){
	
		if(power==0){
			return 1;
		}

		int temp = power;
		int result = fastPower(base, power/2);
		
		if(temp%2==0){
			return result *  result;
		}else{
			return base *  result *  result;
		
		}
	}
}
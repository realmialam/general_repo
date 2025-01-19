
import java.util.Scanner;
public class PowerToN{

	public static int calPower(int num, int pow){
		if(pow==0){
			return 1;
		}

		int tempVal = calPower(num, pow/2);
		if(pow%2==0){ // case of even number
			return tempVal * tempVal;
		}else{ //  case of odd number
			return num * tempVal * tempVal;
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();

		int numToPow = calPower(num, pow);
		System.out.println(numToPow);
	}
}
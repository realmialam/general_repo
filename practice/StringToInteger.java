
import java.util.*;

public class StringToInteger{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int result = 0;
		result = func(str);
		System.out.println(result);

	}

	public static int func(String str){

		if(str.isEmpty()){
			return 0;
		}
		
		int len = str.length();
		char ch = str.charAt(0);

		int digit = ch - '0';
		
		int result = digit * (int)Math.pow(10, len-1);

		return result + func(str.substring(1));	

	}

	


}
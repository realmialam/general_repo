
import java.util.*;

class StringToInteger{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int ans = toInteger(str);
		System.out.println(ans);
	}

	public static int toInteger(String str){
		if(str.length()==1){
			return Integer.valueOf(str.charAt(0) + "");
		}

		int num = Integer.valueOf(str.charAt(0) + "");
		int pos = str.length()-1;
		int temp = num * (int)(Math.pow(10, pos));
		System.out.println(temp);

		return  temp + toInteger(str.substring(1));

	}
}
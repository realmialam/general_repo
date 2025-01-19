
import java.util.Scanner;
public class StringInReverse{

	public static String reverseString(String str, String outputStr){
		// base case
		if(str.length()==0){
			return outputStr;
		}

		int length = str.length();
		outputStr += str.charAt(length-1);
		return reverseString(str.substring(0,length-1), outputStr);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		String outputStr = reverseString(inputStr, "");
		System.out.println(outputStr);
	}
}
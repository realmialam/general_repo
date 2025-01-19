
import java.util.Scanner;
public class PrintSubsequences{

	private static void printSubsequence(String str, int idx, String seq){

		if(idx == str.length()){
			System.out.println(seq);
			return;
		}

		char current = str.charAt(idx);
		printSubsequence(str, idx+1, seq + current);
		printSubsequence(str, idx+1, seq);
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		printSubsequence(str, 0, "");
	}
}
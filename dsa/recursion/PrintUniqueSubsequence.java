
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;



public class PrintUniqueSubsequence{


	private static void printUnique(String str, int idx, String outStr, Set<String> uniqueSet ){

		if(idx == str.length()){
			uniqueSet.add(outStr);
			return;
		}

		char temp = str.charAt(idx);

		printUnique(str, idx+1, outStr + temp, uniqueSet);
		printUnique(str, idx+1, outStr, uniqueSet);
	}

	private static void print(Set<String> st){
		for(String str : st){
			System.out.println(str);
		}
		return;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Set<String> uniqueSet  = new HashSet<String>();

		printUnique(str, 0, "", uniqueSet);
		print(uniqueSet);
	}
}
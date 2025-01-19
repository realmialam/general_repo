import java.util.Scanner;

public class PermutationString{

	private static void printAll(String str, String permutation){

		if(str.length()<=0){
			System.out.println(permutation);
			return;
		}

		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			printAll(str.substring(0,i)+str.substring(i+1), permutation+ch);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		printAll(str, "");
	}
}
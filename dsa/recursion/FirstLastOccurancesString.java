
import java.util.Scanner;
public class FirstLastOccurancesString{

	public static void printFirstLast(String str, int index, String element, int first, int last){

		// base case
		if(str.length()==0 || index == str.length()){
			System.out.println(last + " , " + first);
			return;
		}

		if(element.equals(str.charAt(index))){
			if(first == -1){
				first = index;
				last = index;
			}
			else{
				last = index;
			}
		}

		printFirstLast(str, index+1, element, first, last);

	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		String element = sc.next();

		printFirstLast(inputStr,0, element, -1, -1);

	}
}
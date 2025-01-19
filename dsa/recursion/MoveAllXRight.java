
import java.util.Scanner;
public class MoveAllXRight{

	public static void printAllOutput(String str, int xCount){
		for(int i=1; i<=xCount; i++){
			str +="x";
		}
		System.out.println(str);
		return;
	}

	public static void moveX(String str, int idx, int xCount, String outputStr){
		if(str.length()==0){
			System.out.println(str);
			return;
		}

		if(idx==str.length()){
			printAllOutput(outputStr, xCount);
			return;
		}

		if(str.charAt(idx) == 'X' || str.charAt(idx)=='x'){
			xCount++;
			moveX(str, idx+1, xCount, outputStr);
		}else{
			outputStr += str.charAt(idx);
			moveX(str, idx+1, xCount, outputStr);
		}

		return;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		moveX(str, 0, 0, "");
	}

}
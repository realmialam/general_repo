import java.util.Scanner;
class BitManipiulation{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// check for even and odd

		while(num != -1){
			if((num&1) > 0){
				System.out.println("odd");
			}else{
				System.out.println("even");
			}

			// i-th bit from right side
			System.out.println("i-th bit:");
			int i = sc.nextInt();
			System.out.println(num + " in bit:" + Integer.toBinaryString(num));
			if(ithBit(num, i)){
				System.out.println("set bit");
			}else{
				System.out.println("reset bit");
			}


			num = sc.nextInt();
		}
	}

	private static boolean ithBit(int n, int i){
		boolean setBit = false;

		int temp = 1<<i;
		if((n&temp)>0){
			setBit = true;
		}else{
			setBit = false;
		}
		return setBit;
	}
}
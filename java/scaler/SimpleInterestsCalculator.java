import java.util.Scanner;
public class SimpleInterestsCalculator{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal: ");
		double p = sc.nextInt();
		System.out.print("Rate: ");
		double r = sc.nextInt();
		System.out.print("Time: ");
		double t = sc.nextInt();

		double si = (p*r*t)/100;
		System.out.println("\nSI: " + si);

	}
}	
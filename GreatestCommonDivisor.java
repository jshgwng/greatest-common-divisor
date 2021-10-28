import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int n1 = scanner.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = scanner.nextInt();

		int greatestCommonDivisor = 1;
		int k = 2;

		while (k <= n1 && k <= n2){
			if(n1 % k == 0 && n2 % k == 0) {
				greatestCommonDivisor = k;
				k++;
			}
		}
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 +" is "+ greatestCommonDivisor);
	}
}

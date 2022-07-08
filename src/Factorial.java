import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f,mul=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer:");
		f = s.nextInt();
		for(int i=1;i<=f;i++) {
			mul = mul*i;
		}
		System.out.println("Factorial of "+f+" : "+mul);
		// TODO Auto-generated method stub

	}

}

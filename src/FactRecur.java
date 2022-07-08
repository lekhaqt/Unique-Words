import java.io.*;
import java.util.*;
public class FactRecur {
	
	static int factorial(int n) {
		if(n==0 || n==1)
			 return 1;
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		int ans = factorial(5);
		System.out.println("factorial of 5 is: " +ans);
		
		// TODO Auto-generated method stub

	}

}

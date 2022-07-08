import java.util.Scanner;
public class PallenArray {
	
	public static void main(String[] args) {
		int var = 0;
		int reverse = 0;
		int numCopy = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers of elements to be enter  ");
		int num = scan.nextInt();
		System.out.println("Enter " +num+" elements");
		numCopy = num;
		
	String[] array = new String[num];
	
	for(int i=0; i<num; i++)
	{
		array[i] = new Integer(scan.nextInt()).toString();
		String rev = "";
		for(int k= array[i].length()-1;k>=0;k--) {
			rev +=array[i].charAt(k);
	  }
		if(array[i].equals(rev))
	
		{		
			System.out.println("It is a Palindrome");
      	}
		else
			System.out.println("It is not a Palindrome");
	  }
    }
}	

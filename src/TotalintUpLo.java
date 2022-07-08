import java.util.Scanner;
public class TotalintUpLo {
	
	    
	    int countUpper(String str)
	 {
	    int count = 0;
	    int length = str.length();
	    for(int i=0;i<length;i++)
	    {
	    	char ch = str.charAt(i);
	    	if(ch>='A' && ch<='Z')
	    	{
	    		count++;
	    	}
	    }
	    	 return count;
	    }
	    int countLower(String str)
	    {	
	        int count = 0;
	        int length = str.length();
	        
	        for(int i=0;i<length;i++)
	    {
	    	char ch = str.charAt(i);
	    	if(ch>='a' && ch<='z')
	    	{
	    		count++;
	    	}
	    }
	    return count;
	 }
	  
	    int countDigits(String str)
	    {	
	        int count = 0;
	        int length = str.length();
	        
	        for(int i=0;i<length;i++)
	    {
	    	char ch = str.charAt(i);
	    	if(ch>='0' && ch<='9')
	    	{
	    		count++;
	    	}
	    }
	    return count;
	 }    
	    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TotalintUpLo obj = new TotalintUpLo();
		
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
	
	    System.out.println("No of lowercase letters:" +obj.countLower(str));
	    System.out.println("No of uppercase letters:" +obj.countUpper(str));
	    System.out.println("No of digits:" +obj.countDigits(str));
	   
	    }
	}

 

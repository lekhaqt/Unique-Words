import java.io.*;
class OccuChar {

     static int OccurrenceStr(char ch, String s)
     {
    	 if(s.length() == 0)
             return 0;
    	 int count = 0;
    	 
    	 if(s.charAt(0)==ch)
    		 count++;
    	 count += OccurrenceStr(ch, s.substring(1));
    	 
    	 return count;
     }
     public static void main(String[] args) {
    	 String str = "Volcanooo";
    	 char c = 'o';
    	 System.out.println(OccurrenceStr(c,str));
    	 
		// TODO Auto-generated method stub

	}

}

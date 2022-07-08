
public class ReverseWordStrg {

	public static void main(String[] args) {
		String input[] = "Java Code".split(" ");
		String output = " ";
		for(int i  = input.length-1;i>=0;i--)
		{
		   output += input[i] +" ";
		   
		}
		System.out.println(output);
		// TODO Auto-generated method stub

	}

}

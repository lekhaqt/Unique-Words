import java.io.*;
public class PositiveNum {

	public static void main(String[] args) throws IOException
	{
		BufferedReader bufred = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(bufred.readLine());
		int add = 0, x = 0, j = 0;
		for(int i=1;i<n;i++)
		{
			add = i;
			j = i+1;
			
			while(add<n)
			{
				add = add+j;
				j++;
			}
			if(add==n)
			{
				for(int k=i;k<j;k++) 
				{
					if(k==i)
						System.out.print(k);
					else
						System.out.print("+" +k);
				}
				System.out.println();
				}
			}
		}
		// TODO Auto-generated method stub
  }



public class DuplicateChar {

	public static void main(String[] args) {
		String str = "Assignment completion";
		int count;
		char string[] = str.toCharArray();
		
		System.out.println("Duplicate characters in a give string:");
		for(int i=0;i<string.length;i++) {
			count = 1;
		for(int j = i+1; j<string.length;j++) {
			if(string[i]==string[j] && string[i]!= ' ') {
				count++;
				string[j]='O';
			}
		}
		if(count>1 && string[i]!= 'O')
			System.out.println(string[i]);
		}
		
	}

}



public class SelectionSort {
	
	public static void selectSort(int[] arr) {
		for(int i=0;i<arr.length-1; i++)
		{
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
			  if(arr[j]<arr[index]) {
				  index = j;
			  }
		}
		  int smallerNumber = arr[index];
		  arr[index] = arr[i];
		  arr[i] = smallerNumber;
	    }
	}
	public static void main(String[] args) {
		int[] array = {7,19,1,4,33,12,85,46};
		System.out.println("Before Selection Sort");
        for(int i:array)	{
        	System.out.print(i+" ");
        }
        System.out.println();
        selectSort(array);
        System.out.println("After Selection Sort");
        for (int i:array)
        {
        	System.out.println(i+" ");
        
        }
		// TODO Auto-generated method stub

	}

}

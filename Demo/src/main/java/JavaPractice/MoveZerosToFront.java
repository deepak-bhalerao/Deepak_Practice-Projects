package JavaPractice;

public class MoveZerosToFront 
{
	 public static void main(String[] args) 
	 {
	        int num[] = {1, 0, 56, 0, 20, 30, 0, 75};

	        moveZerosToFront(num);

	        System.out.print("Output: {");
	        for (int i = 0; i < num.length; i++) 
	        {
	            System.out.print(num[i]);
	            if (i < num.length - 1) 
	            {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("}");
	    }
	    static void moveZerosToFront(int[] arr) 
	    {
	        int nonZeroIndex = 0;

	        // Iterate through the array, collect non-zero elements
	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] != 0) {
	                arr[nonZeroIndex] = arr[i];
	                nonZeroIndex++;
	            }
	        }
	        // Fill the remaining positions with zeros
	        for (int i = nonZeroIndex; i < arr.length; i++) 
	        {
	            arr[i] = 0;
	        }
	    }
}
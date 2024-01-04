package JavaPractice;
import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class SortedNum 
{

	public static void main(String[] args) 
	{
        int arr[]= {234, 780, 451, 63, 456, 98, 75, 43};
       
         // System.out.println(arr);
    		   
          Arrays.sort(arr);
          
	     for(int i=0; i<arr.length; i++)
	     {
	    	 System.out.println(arr[i]);
	     }
	        
	}

}

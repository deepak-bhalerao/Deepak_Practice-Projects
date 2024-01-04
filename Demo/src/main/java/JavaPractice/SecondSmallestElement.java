package JavaPractice;

import java.util.Arrays;

public class SecondSmallestElement 
{

	public static void main(String[] args) 
	{
       int arr[]= {10, 20, 30, 63, 57, 45, 95};
        int size= arr.length;
        
        Arrays.sort(arr);
       System.out.println("Sorted array:: "+Arrays.toString(arr));
        
        int res =arr[1];
        System.out.println("2nd Smallest element is:: "+res);
        
	}
}

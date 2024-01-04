package JavaPractice;

public class SwappingNum
{

	public static void main(String[] args) 
	{
		int a=10, b=20, temp;
		
		System.out.println("Before swapping:");
		
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		temp=a; a=b; b=temp;
		
		System.out.println("After swapping:");
		
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}

}

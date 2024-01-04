package JavaPractice;

public class PlaceJava 
{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Hello"); 
		
		sb.replace(1,4,"Java"); 
		
		System.out.println(sb);    //prints HJavalo  
	}

}

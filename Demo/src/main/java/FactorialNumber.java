
public class FactorialNumber 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 5; i++) 
        {
            long factorial = findFactorial(i);
            System.out.println("Factorial of " + i + " = " + factorial);
        }
    }

    public static long findFactorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
    //======*** Other Method ***============
//      {  
//    	int i,fact=1;  
//    	  int number=5;   //It is the number to calculate factorial    
//    	  
//      for(i=1; i<=number; i++)
//    	  {    
//    	      fact=fact*i;    
//    	  }    
//    	  System.out.println("Factorial of "+number+" is: "+fact);    
//      }
}

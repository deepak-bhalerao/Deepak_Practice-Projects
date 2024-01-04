package JavaPractice;

class one 
{
  public one() 
  {
    System.out.println(1);
   }
 }
    class Two extends one 
   {
    	public Two() 
    	{
    		System.out.println(2);
    	}
   }
    class Three extends Two 
    {
    	public Three() 
    	{
    		System.out.println(3);
    	}
    }
    public class IntervQuestion 
    {
    	
    public static void main(String[] args) 
    {
    Three obj = new Three();
//	 obj.Three();
//	 obj.Two();
//	 obj.One();
    
    }
}

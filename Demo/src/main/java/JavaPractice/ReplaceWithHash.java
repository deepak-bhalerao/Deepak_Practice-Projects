package JavaPractice;

public class ReplaceWithHash 
{
	    public static void main(String[] args) 
	    {
	        String input = "my name is Alexander";
	        String output = "my nam# is Al##xand###r";
	         System.out.println(output);
	    }

	    public static String replaceWithHash(String input) 
	    {
	        StringBuilder result = new StringBuilder();
	        boolean shouldReplace = false;

	        for (char e : input.toCharArray()) 
	        {
	            if (Character.isLetter(e)) 
	            {
	                if (shouldReplace) 
	                {
	                    result.append("#");
	                } else 
	                {
	                    result.append(e);
	                }
	            } else 
	            {
	                result.append(e);
	                shouldReplace = true;
	            }
	        }

	         return result.toString();
	    }
}

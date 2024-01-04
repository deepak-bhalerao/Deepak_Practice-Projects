package JavaPractice;

public class ChangeCase
{

	public static void main(String[] args) 
	{
		String input = "abc";
        String output = changeCase(input);
	      System.out.println(output);
	    
	}

	    public static String changeCase(String input) 
	    {
	        if (input == null || input.length() < 3) 
	        {
	            // Input is too short to perform the transformation
	            return input;
	        }

	        // Convert the first character to uppercase
	        char firstChar = Character.toUpperCase(input.charAt(0));
	        
	        // Convert the last character to uppercase
	        char lastChar = Character.toUpperCase(input.charAt(input.length() - 1));

	        // Create a StringBuilder to manipulate the string
	        StringBuilder result = new StringBuilder(input);
	        
	        // Set the first character to uppercase
	        result.setCharAt(0, firstChar);
	        
	        // Set the last character to uppercase
	        result.setCharAt(input.length() - 1, lastChar);

	        return result.toString();
	    }
	
 }



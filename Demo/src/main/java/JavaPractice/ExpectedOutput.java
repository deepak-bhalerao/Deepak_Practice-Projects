package JavaPractice;

public class ExpectedOutput {

	    public static void main(String[] args) 
	    {
	        String input = "A1DB34C2";
	        String transformedString = transformString(input);
	        System.out.println("Transformed String: " + transformedString);
	    }

	    public static String transformString(String input) 
	    {
	        StringBuilder alphabeticChars = new StringBuilder();
	        StringBuilder numericChars = new StringBuilder();

	        for (char ch : input.toCharArray()) 
	        {
	            if (Character.isLetter(ch)) 
	            {
	                alphabeticChars.append(ch);
	            } else if (Character.isDigit(ch)) 
	            {
	                numericChars.append(ch);
	            }
	        }

	        return alphabeticChars.toString() + numericChars.toString();
	    }
}


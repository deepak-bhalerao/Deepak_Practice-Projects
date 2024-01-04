package JavaPractice;

public class CountWord 
{
	 public static void main(String[] args) 
	 {
	        String inputString = "This is a sample sentence for word counting";

	        int wordCount = countWords(inputString);
	        
	        System.out.println("Word count: " + wordCount);
	    }
 
	    public static int countWords(String input) 
	    {
	        // Split the input string into words using regular expression
	       
	    	String[] words = input.split("\\s+");   // This splits on one or more whitespace characters

	           // Return the count of words
	        return words.length;
	    }

}

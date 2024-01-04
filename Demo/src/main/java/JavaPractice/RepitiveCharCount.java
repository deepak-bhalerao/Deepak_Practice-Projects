package JavaPractice;

public class RepitiveCharCount 
{
	    public static void main(String[] args) 
	    {
	        String inputString = "Java programming";

	        int[] charCount = new int[256]; // Assuming ASCII characters

	        // Convert the string to a character array
	        char[] characters = inputString.toCharArray();

	        // Count the occurrences of each character in the string
	        for (char c : characters) 
	        {
	            charCount[c]++;
	        }

	        // Print characters with more than one occurrence
	        for (char c : characters) 
	        {
	            if (charCount[c] > 1) 
	            {
	                System.out.println("Character '" + c + "' occurs " + charCount[c] + " times.");
	                charCount[c] = 0; // Reset the count to avoid duplicate output
	            }
	        }
	    }
  }


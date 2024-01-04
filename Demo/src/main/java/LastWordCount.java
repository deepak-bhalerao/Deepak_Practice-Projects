
public class LastWordCount 
{
	    public static void main(String[] args) 
	    {
	        String input = "   "; // Replace with your input string

	        // Split the input string into words
	        String[] words = input.split(" ");

	        // Check if there are words in the input
	        if (words.length > 0) 
	        {
	            // Get the last word
	            String lastWord = words[words.length - 1];

	            // Calculate and print the character count of the last word
	            int characterCount = lastWord.length();
	            System.out.println("Character count of the last word: " + characterCount);
	            
	        } else
	        {
	            System.out.println("No words found in the input string.");
	        }
	    }
	
}

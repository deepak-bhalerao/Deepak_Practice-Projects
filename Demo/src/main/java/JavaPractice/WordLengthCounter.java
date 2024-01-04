package JavaPractice;

import java.util.HashMap;

public class WordLengthCounter 
{

    public static void main(String[] args) 
    {
        String inputString = "My Name is Virat Kohli"; //Interview Ques. write java code with HashMap given string each 
                                                       //words count and output should be like "My=2 name=4 is=2 Virat=5 Kohli=5". 

        // Create a HashMap to store word lengths
        HashMap<String, Integer> wordLengths = new HashMap<>();

        String[] words = inputString.split("\\s+"); 

        // Count the length of each word and store in the HashMap
        for (String word : words) 
        {
            // Calculate and store the length of the word
            wordLengths.put(word, word.length());
        }

        // Print the output
        for (String word : wordLengths.keySet()) 
        {
            System.out.println(word + "=" + wordLengths.get(word));
        }
    }
}

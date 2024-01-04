package JavaPractice;

import java.util.HashMap;

public class MainTest
{
    public static void main(String[] args) 
    {
       String s1="Deepak Anil Bhalerao";
       
    // Create a HashMap to store word lengths
     HashMap<String, Integer> hmap=new HashMap<>();
     String words[]= s1.split("\\s+");
     
     // Count the length of each word and store in the HashMap 
     for(String word : words)
      {
    // Calculate and store the length of the word
         hmap.put(word, word.length());
         
      }
      // Print the output
        for (String wrd : hmap.keySet()) 
        {
            System.out.println(wrd + "=" + hmap.get(wrd));
        }
  }
}

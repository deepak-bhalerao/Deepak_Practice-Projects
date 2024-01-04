package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class GivenStringLexicalOrder 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Map<String, Integer> substringFrequency = new HashMap<>();

        // Find all substrings and their frequencies
        for (int i = 0; i < inputString.length(); i++) 
        {
            for (int j = i + 1; j <= inputString.length(); j++) 
            {
                String substring = inputString.substring(i, j);
                substringFrequency.put(substring, substringFrequency.getOrDefault(substring, 0) + 1);
            }
        }

        // Sort the substrings in lexical order
        SortedSet<String> sortedSubstrings = new TreeSet<>(substringFrequency.keySet());

        // Display sorted substrings and their frequencies
        for (String substring : sortedSubstrings) 
        {
            int frequency = substringFrequency.get(substring);
            System.out.println(substring + " - " + frequency);
        }
    }
}

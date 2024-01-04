package JavaPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOccurence 
{

	public static void main(String[] args) 
	{
        String input = "Apple orange Apple orange Apple orange";

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count word occurrences using Java 8 Streams and a Map
        Map<String, Long> wordCountMap = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the word count
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }

}

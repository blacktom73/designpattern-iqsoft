package hu.mitro.java8.streams.examples2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// Dictionary example
//	- Command pattern
//	- Singleton pattern
//
//	1. Frequency of word length
//	2. Frequency of character
//	3. Number of characters
//	4. Length of the longest word
//	5. Length of the shortest word
//	6. Average word length
//	7. Anagrams of a word
//	8. Anagram groups with a given number of items
//	9. Frequency of anagram groups
//	10. Ratio of words with and without anagrams
//
//	https://docs.oracle.com/javafx/2/charts/bar-chart.htm#CIHJFHDE
//	bar chart example
public class Program {

	public static void main(String[] args) {
		DictionaryStatistics statistics = DictionaryStatistics.getInstance();
		List<String> words = statistics.getWords();

		//	1. Frequency of word length
		Map<Integer, Long> wordLengthFreq = words.stream()
				.collect(Collectors.groupingBy(w -> w.length(), Collectors.counting()));
		System.out.println(wordLengthFreq);
		// or ...
		words.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()))
				.forEach((key, value) -> System.out.println(key + ": " + value));

		//	2. Frequency of characters
		words.stream()
				.map(s -> s.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.forEach((key, value) -> System.out.println(key + ": " + value));

		//	3. Number of characters
		int sum = words.stream()
				.mapToInt(String::length).sum();
		System.out.println(sum);

		//	4. Length of the longest word
		//	5. Length of the shortest word
		//	6. Average word length
		IntSummaryStatistics collect = words.stream()
				.collect(Collectors.summarizingInt(String::length));
		System.out.println(collect);

		//	7. Anagrams of a word



		//	8. Anagram groups with a given number of items



		//	9. Frequency of anagram groups


		
		//	10. Ratio of words with and without anagrams
	}

	//		long uniqueWords = 0;
	//		try (Stream<String> lines = Files.lines(Paths.get("dictionary.txt", Charset.defaultCharset()))) {
	//			uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")).distinct().count());
	//		} catch (IOException ex){
	//			ex.printStackTrace();
	//		}

}

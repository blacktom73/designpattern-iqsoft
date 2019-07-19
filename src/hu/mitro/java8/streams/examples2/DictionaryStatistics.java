package hu.mitro.java8.streams.examples2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class DictionaryStatistics {

	public static DictionaryStatistics INSTANCE;
	private List<String> words;

	private DictionaryStatistics() {
		words = new ArrayList<>();
		readDictionaryFile();
	}

	public static DictionaryStatistics getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DictionaryStatistics();
		}
		return INSTANCE;
	}

	private void readDictionaryFile() {
		Path filePath = Paths.get("dictionary.txt");
		try {
			Files.lines(filePath).forEach(w -> words.add(w));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public List<String> getWords() {
		return words;
	}
}

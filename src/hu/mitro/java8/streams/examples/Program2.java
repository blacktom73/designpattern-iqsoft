package hu.mitro.java8.streams.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//	1. Find all transactions in the year 2011 and sort them by value (small to high).
//	2. What are all the unique cities where the traders work?
//	3. Find all traders from Cambridge and sort them by name.
//	4. Return a string of all traders’ names sorted alphabetically.
//	5. Are any traders based in Milan?
//	6. Print all transactions’ values from the traders living in Cambridge.
//	7. What’s the highest value of all the transactions?
//	8. Find the transaction with the smallest value.
public class Program2 {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(brian, 2011, 300),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);

		//	1. Find all transactions in the year 2011 and sort them by value (small to high).
		transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList())
				.forEach(System.out::println);

		//	2. What are all the unique cities where the traders work?
		transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.forEach(System.out::println);

		//	3. Find all traders from Cambridge and sort them by name.
		transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(transaction -> transaction.getTrader())
				.sorted(Comparator.comparing(Trader::getName))
				.distinct()
				.forEach(System.out::println);

		//	4. Return a string of all traders’ names sorted alphabetically.
		System.out.println(transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.reduce("", (name1, name2) -> name1.concat(name2) + " "));

		//	5. Are any traders based in Milan?

		//	6. Print all transactions’ values from the traders living in Cambridge.

		//	7. What’s the highest value of all the transactions?

		//	8. Find the transaction with the smallest value.

	}

}

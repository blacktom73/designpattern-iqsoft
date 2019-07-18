package hu.mitro.java8.streams;

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
public class Program {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);

		//	1. Find all transactions in the year 2011 and sort them by value (small to high).
		// TODO sorting
		List<Transaction> tr2011 = transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
//				.sorted()
				.collect(Collectors.toList());
		System.out.println(tr2011);

		//	2. What are all the unique cities where the traders work?
		List<String> uniqueCities = transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(uniqueCities);

		//	3. Find all traders from Cambridge and sort them by name.
		Comparator<Trader> traderComparatorByName = (o1, o2) -> o1.getName().compareTo(o2.getName());

		List<Trader> cambridgeTraders = transactions.stream()
				.map(transaction -> transaction.getTrader())
				.sorted(traderComparatorByName)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(cambridgeTraders);

		//	4. Return a string of all traders’ names sorted alphabetically.
		List<String> traders = transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.sorted()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(traders);

		//	5. Are any traders based in Milan?
		boolean isAnyInMilan = transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.anyMatch(city -> city.equals("Milan"));
		System.out.println(isAnyInMilan);

		//	6. Print all transactions’ values from the traders living in Cambridge.
		List<Integer> values = transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(transaction -> transaction.getValue())
				.collect(Collectors.toList());
		System.out.println(values);

		//	7. What’s the highest value of all the transactions?
		Integer highestValue = transactions.stream()
				.map(transaction -> transaction.getValue())
				.max(Integer::compare).get();
		System.out.println(highestValue);

		//	8. Find the transaction with the smallest value.
		// TODO
		Transaction smallestValue = transactions.stream()
				.map(transaction -> transaction)
				.min((t1, t2)-> t1.getValue()).get();
		System.out.println(smallestValue);

	}
}

package hu.mitro.decorator.library;

public interface Borrowable {

	void borrowItem(String borrower);

	void returnItem(String borrower);

	void info();

}

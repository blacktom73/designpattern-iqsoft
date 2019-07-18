package hu.mitro.designpatterns.library;

public interface Borrowable {

	void borrowItem(String borrower);

	void returnItem(String borrower);

	void info();

}

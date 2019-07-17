package hu.mitro.decorator.decorator.library;

import java.util.Date;


public class Book implements Item, Borrowable {

	String author;
	Date publicationDate;
	int numberOfCopies;
	String title;
	String nameOfBorrower;

	public Book(String author, Date publicationDate) {
		this.author = author;
		this.publicationDate = publicationDate;
		items.add(this);
	}

	@Override
	public void borrowItem(String borrower) {
		numberOfCopies--;
		nameOfBorrower = borrower;
	}

	@Override
	public void returnItem(String borrower) {
		numberOfCopies++;
		nameOfBorrower = borrower;
	}

	@Override
	public void info() {
		System.out.println("Book{" +
				"numberOfCopies=" + numberOfCopies +
				", author='" + author + '\'' +
				", title='" + title + '\'' +
				", publicationDate=" + publicationDate +
				", borrowed by= " + nameOfBorrower + '}');
	}

}

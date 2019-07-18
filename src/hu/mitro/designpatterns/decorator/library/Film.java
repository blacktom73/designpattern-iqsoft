package hu.mitro.designpatterns.decorator.library;

public class Film implements Item, Borrowable {

	String director;
	double playTime;
	int numberOfCopies;
	String title;
	String nameOfBorrower;

	public Film(String director, double playTime) {
		this.director = director;
		this.playTime = playTime;
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

	public void info() {
		System.out.println("Film{" +
				"numberOfCopies=" + numberOfCopies +
				", director='" + director + '\'' +
				", title='" + title + '\'' +
				", playTime=" + playTime +
				", borrowed by= " + nameOfBorrower + '}');
	}
}

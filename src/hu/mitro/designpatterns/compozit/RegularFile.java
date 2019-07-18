package hu.mitro.designpatterns.compozit;

public class RegularFile extends Item {

	int size;

	public RegularFile(String name, int size) {
		super(name);
		this.size = size;
	}

	@Override
	public String toString() {
		return "---- " + name + " | " + size;
	}
}

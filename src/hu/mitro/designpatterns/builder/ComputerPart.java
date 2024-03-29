package hu.mitro.designpatterns.builder;

public abstract class ComputerPart {

	String name;

	public ComputerPart(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComputerPart{" +
				"name='" + name + '\'' +
				'}';
	}
}

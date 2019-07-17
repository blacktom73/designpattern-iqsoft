package hu.mitro.decorator.visitor;

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

	public void accept(Visitor countingVisitor) {
		countingVisitor.visit(this);
	}


}

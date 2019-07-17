package hu.mitro.decorator.visitor;

public interface Visitor {

	void visit(Directory directory);

	void visit(SpecialFile specialFile);

	void visit(RegularFile regularFile);

}

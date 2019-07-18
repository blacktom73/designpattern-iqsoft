package hu.mitro.designpatterns.visitor;

public interface Visitor {

	void visit(Directory directory);

	void visit(SpecialFile specialFile);

	void visit(RegularFile regularFile);

}

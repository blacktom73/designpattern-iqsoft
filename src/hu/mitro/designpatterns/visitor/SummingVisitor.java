package hu.mitro.designpatterns.visitor;

public class SummingVisitor implements Visitor {

	int sumOfRegularfiles = 0;
	int sumOfSpecialfiles = 0;

	//	@Override
	//	public void visit(Directory directory) {
	//		int sumOfRF = 0;
	//		int sumOfSF = 0;
	//		for (Item item : directory.subDirectories) {
	//			if (item instanceof RegularFile) {
	//				sumOfRF += ((RegularFile) item).size;
	//			} else
	//				if (item instanceof SpecialFile) {
	//					sumOfSF += ((SpecialFile) item).size;
	//				}
	//		}
	//		System.out.println("Directory " + directory.name + " has regular files in  " + sumOfRF + " size,"
	//				+ " special files in " + sumOfSF + " sizes.");
	//	}

	@Override
	public void visit(Directory directory) {
		// Do nothing.
	}

	@Override
	public void visit(SpecialFile specialFile) {
		sumOfSpecialfiles += specialFile.size;
	}

	@Override
	public void visit(RegularFile regularFile) {
		sumOfRegularfiles += regularFile.size;
	}
}

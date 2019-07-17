package hu.mitro.decorator.visitor;

public class CountingVisitor implements Visitor {

	int nrOfDirectories = 0;
	int nrOfRegularfiles = 0;
	int nrOfSpecialfiles = 0;

	//	@Override
	//	public void visit(Directory directory) {
	//		int coutRF = 0;
	//		int coutSF = 0;
	//		for (Item item : directory.subDirectories) {
	//			if (item instanceof RegularFile) {
	//				coutRF++;
	//			} else
	//				if (item instanceof SpecialFile) {
	//					coutSF++;
	//				}
	//		}
	//		System.out.println("Directory " + directory.name + " has "
	//				+ coutRF + " regular files, " + coutSF + " special files.");
	//	}

	@Override
	public void visit(Directory directory) {
		nrOfDirectories++;
	}

	@Override
	public void visit(SpecialFile specialFile) {
		nrOfSpecialfiles++;
	}

	@Override
	public void visit(RegularFile regularFile) {
		nrOfRegularfiles++;
	}
}

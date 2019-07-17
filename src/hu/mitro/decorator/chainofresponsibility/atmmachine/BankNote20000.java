package hu.mitro.decorator.chainofresponsibility.atmmachine;

public class BankNote20000 extends Detector {

	public BankNote20000(Detector detector) {
		super(20000, detector);
	}

}

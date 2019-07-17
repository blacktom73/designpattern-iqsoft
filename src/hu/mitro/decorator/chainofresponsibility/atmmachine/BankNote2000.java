package hu.mitro.decorator.chainofresponsibility.atmmachine;

public class BankNote2000 extends Detector {

	public BankNote2000(Detector detector) {
		super(2000, detector);
	}
}

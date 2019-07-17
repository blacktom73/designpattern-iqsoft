package hu.mitro.decorator.chainofresponsibility.atmmachine;

public class BankNote10000 extends Detector {

	public BankNote10000(Detector detector) {
		super(10000, detector);
	}
}

package hu.mitro.decorator.chainofresponsibility.atmmachine;

public class BankNote1000 extends Detector  {

	public BankNote1000(Detector detector) {
		super(1000, detector);
	}
}

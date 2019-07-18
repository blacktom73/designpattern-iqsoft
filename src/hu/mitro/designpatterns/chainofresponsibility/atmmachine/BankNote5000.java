package hu.mitro.designpatterns.chainofresponsibility.atmmachine;

public class BankNote5000 extends Detector {

	public BankNote5000(Detector detector) {
		super(5000, detector);
	}
}

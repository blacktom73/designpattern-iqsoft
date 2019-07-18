package hu.mitro.designpatterns.chainofresponsibility.atmmachine;

public class BankNote500 extends Detector {

	public BankNote500(Detector detector) {
		super(500, detector);
	}
}

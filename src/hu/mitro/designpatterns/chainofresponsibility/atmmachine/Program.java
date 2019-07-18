package hu.mitro.designpatterns.chainofresponsibility.atmmachine;

public class Program {

	public static Detector createChain(){
		Detector d500 = new BankNote500(null);
		Detector d1000 = new BankNote1000(d500);
		Detector d2000 = new BankNote2000(d1000);
		Detector d5000 = new BankNote5000(d2000);
		Detector d10000 = new BankNote10000(d5000);
		Detector d20000 = new BankNote20000(d10000);
		return d20000;
	}
	public static void main(String[] args) {
		Detector detector = createChain();
		detector.detect(115500);
		detector.print();
	}

}

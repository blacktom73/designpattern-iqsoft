package hu.mitro.decorator.chainofresponsibility.atmmachine;

public class Detector {

	private int value;
	private int count;
	private Detector next;

	public Detector(int value, Detector next) {
		this.count = 0;
		this.value = value;
		this.next = next;
	}

	public void detect(int value) {
		this.count = value / this.value;
		if (next != null) {
			next.detect(value % this.value);
		}
	}

	public void print() {
		System.out.println("Detector" + value + ": " + this.count);
		if (next != null) {
			next.print();
		}
	}

}

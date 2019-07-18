package hu.mitro.designpatterns.builder;

public class Program {

	public static void main(String[] args) {
		Computer computer = new Computer.Builder()
				.processor(new Processor("I7-4790K"))
				.memory(new Memory("16GB Kingstone"))
				.display(new Display("Asus 4K"))
				.hdd(new Hdd("Seagate Barracuda"))
				.build();
		System.out.println(computer);
	}
}

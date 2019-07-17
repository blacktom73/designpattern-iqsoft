package hu.mitro.decorator.builder;

public class Computer {

	Processor processor;
	Memory memory;
	Display display;
	Hdd hdd;

	private Computer(Builder builder) {
		this.processor = builder.processor;
		this.memory = builder.memory;
		this.display = builder.display;
		this.hdd = builder.hdd;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"processor=" + processor +
				", memory=" + memory +
				", display=" + display +
				", hdd=" + hdd +
				'}';
	}

	public static class Builder {

		Processor processor;
		Memory memory;
		Display display;
		Hdd hdd;

		public Builder() {
		}

		public Builder processor(Processor processor) {
			this.processor = processor;
			return this;
		}

		public Builder memory(Memory memory) {
			this.memory = memory;
			return this;
		}

		public Builder display(Display display) {
			this.display = display;
			return this;
		}

		public Builder hdd(Hdd hdd) {
			this.hdd = hdd;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

		@Override
		public String toString() {
			return "Builder{" +
					"processor=" + processor +
					", memory=" + memory +
					", display=" + display +
					", hdd=" + hdd +
					'}';
		}
	}
}

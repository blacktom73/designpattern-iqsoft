package hu.mitro.decorator.state;

public class Program {

	public static void main(String[] args) {
		TrafficLamp trafficLamp = new TrafficLamp();
		trafficLamp.start();
		System.out.println(trafficLamp.checkState());
	}
}

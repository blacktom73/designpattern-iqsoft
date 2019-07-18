package hu.mitro.designpatterns.observer;

public class Program {

	public static void main(String[] args) {
		ApplicationLogger applicationLogger = ApplicationLogger.getInstance();

		Logger consoleLogger = new ConsoleLogger();
		applicationLogger.attach(consoleLogger);
		applicationLogger.info("Test message to the console logger ...");

		System.out.println("-------------------------");

		Logger emailLogger = new EmailLogger();
		applicationLogger.attach(emailLogger);
		applicationLogger.error("Test message to the email logger ...");

		System.out.println("-------------------------");

		Logger consoleLogger2 = new ConsoleLogger();
		applicationLogger.attach(consoleLogger2);
		applicationLogger.info("Test message2 to the console logger ...");

		System.out.println("-------------------------");

		applicationLogger.detach(consoleLogger2);
		applicationLogger.info("Test message3 to the console logger ...");
	}
}

package hu.mitro.designpatterns.observer;

import java.time.LocalDateTime;


public class ConsoleLogger extends Logger {

	@Override
	public void logInfo(String message, Severity severity) {
		System.out.println("[" + severity.getSeverity() + "] "
				+ LocalDateTime.now() + " - " + message);
	}

	@Override
	public void logError(String message, Severity severity) {
		System.out.println("[" + severity.getSeverity() + "] "
				+ LocalDateTime.now() + " - " + message);
	}
}

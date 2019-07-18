package hu.mitro.designpatterns.observer;

import java.time.LocalDateTime;


public class EmailLogger extends Logger {

	@Override
	public void logInfo(String message, Severity severity) {
		System.out.println("An email has sent with message:\n[" + severity.getSeverity() + "] "
				+ LocalDateTime.now() + " - " + message);
	}

	@Override
	public void logError(String message, Severity severity) {
		System.out.println("An email has sent with message:\n[" + severity.getSeverity() + "] "
				+ LocalDateTime.now() + " - " + message);
	}
}

package hu.mitro.decorator.observer;

import java.util.HashSet;
import java.util.Set;


public class ApplicationLogger {

	private static ApplicationLogger instance;
	Set<Logger> loggers;

	private ApplicationLogger() {
		loggers = new HashSet<>();
	}

	public static ApplicationLogger getInstance() {
		if (instance == null) {
			instance = new ApplicationLogger();
		}
		return instance;
	}

	public void attach(Logger logger) {
		loggers.add(logger);
	}

	public void detach(Logger logger) {
		loggers.remove(logger);
	}

	public void info(String message) {
		for (Logger logger : loggers) {
			logger.logInfo(message, Severity.INFO);
		}
	}

	public void error(String message) {
		for (Logger logger : loggers) {
			logger.logError(message, Severity.ERROR);
		}
	}

}

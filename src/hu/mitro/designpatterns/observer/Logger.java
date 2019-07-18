package hu.mitro.designpatterns.observer;

public abstract class Logger {

	public abstract void logInfo(String message, Severity severity);

	public abstract void logError(String message, Severity severity);

}

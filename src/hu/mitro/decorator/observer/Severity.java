package hu.mitro.decorator.observer;

public enum Severity {

	FATAL("FATAL"),
	INFO("INFO"),
	DEBUG("DEBUG"),
	ERROR("ERROR");

	String severity;

	Severity(String severity) {
		this.severity = severity;
	}

	public String getSeverity() {
		return severity;
	}
}

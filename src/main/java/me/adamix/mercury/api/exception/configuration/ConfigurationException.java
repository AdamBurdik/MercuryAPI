package me.adamix.mercury.api.exception.configuration;

public class ConfigurationException extends RuntimeException {
	public ConfigurationException(String message) {
		super(message);
	}

	public ConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}
}

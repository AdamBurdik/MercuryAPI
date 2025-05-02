package me.adamix.mercury.api.exception.configuration;

public class MissingConfigurationPropertyException extends ConfigurationException {
	public MissingConfigurationPropertyException(String property, String sourceName) {
		super("Missing required property '" + property + "' in: " + sourceName);
	}
}


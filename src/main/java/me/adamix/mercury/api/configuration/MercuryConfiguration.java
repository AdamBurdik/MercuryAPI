package me.adamix.mercury.api.configuration;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

/**
 * The MercuryConfiguration interface defines methods for accessing configuration data.
 * This interface can be implemented by various configuration formats (e.g., TOML, JSON, YAML).
 */
public interface MercuryConfiguration extends MercuryTable {

	/**
	 * Retrieves the name of the configuration source.
	 *
	 * @return The name of the configuration source.
	 */
	@NotNull String name();

	/**
	 * Retrieves the path of the configuration source.
	 * @return The path to the configuration source.
	 */
	@NotNull Path filePath();
}

package me.adamix.mercury.api.configuration;

import me.adamix.mercury.api.entity.type.MercuryEntityType;
import me.adamix.mercury.api.exception.configuration.MissingConfigurationPropertyException;
import me.adamix.mercury.api.math.MercuryPosition;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Set;

/**
 * Represents a configuration section or structured data node within the Mercury configuration system.<br>
 *
 * <p>This interface provides access to nested configuration values using dotted key notation.
 * It acts like a table or map for structured data, supporting both flat and nested entries.</p>
 *
 */
public interface MercuryTable {

	/**
	 * Retrieves the name of the configuration source.
	 *
	 * @return The name of the configuration source.
	 */
	@NotNull String name();

	/**
	 * Checks if the configuration contains a given property.
	 *
	 * @param dottedKey The dotted key representing the property to check.
	 * @return True if the property exists, false otherwise.
	 */
	boolean contains(@NotNull String dottedKey);

	/**
	 * Retrieves an object associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The object corresponding to the key, or null if not found.
	 */
	@Nullable Object getObject(@NotNull String dottedKey);

	/**
	 * Retrieves a string value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The string value corresponding to the key, or null if not found.
	 */
	@Nullable String getString(@NotNull String dottedKey);

	/**
	 * Retrieves an integer value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The integer value corresponding to the key, or null if not found.
	 */
	@Nullable Integer getInteger(@NotNull String dottedKey);

	/**
	 * Retrieves a long value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The long value corresponding to the key, or null if not found.
	 */
	@Nullable Long getLong(@NotNull String dottedKey);

	/**
	 * Retrieves a float value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The float value corresponding to the key, or null if not found.
	 */
	@Nullable Float getFloat(@NotNull String dottedKey);

	/**
	 * Retrieves a double value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The double value corresponding to the key, or null if not found.
	 */
	@Nullable Double getDouble(@NotNull String dottedKey);

	/**
	 * Retrieves a boolean value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The boolean value corresponding to the key, or null if not found.
	 */
	@Nullable Boolean getBoolean(@NotNull String dottedKey);

	/**
	 * Retrieves a table value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryTableOld object corresponding to the key, or null if not found.
	 */
	@Nullable MercuryTable getTable(@NotNull String dottedKey);

	/**
	 * Retrieves an array value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryArrayOld object corresponding to the key, or null if not found.
	 */
	@Nullable MercuryArray getArray(@NotNull String dottedKey);

	/**
	 * Retrieves a position value associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryPosition corresponding to the key, or null if not found.
	 */
	@Nullable MercuryPosition getPosition(@NotNull String dottedKey);


	/**
	 * Retrieves an object value associated with the given dotted key, ensuring the value exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Object corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the value is not found.
	 */
	default @NotNull Object getObjectSafe(@NotNull String dottedKey) {
		Object object = getObject(dottedKey);
		if (object == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return object;
	}

	/**
	 * Retrieves a string value associated with the given dotted key, ensuring the value exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The String value corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the value is not found.
	 */
	default @NotNull String getStringSafe(@NotNull String dottedKey) {
		String value = getString(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves an integer value associated with the given dotted key, ensuring the value exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Integer value corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the value is not found.
	 */
	default int getIntegerSafe(@NotNull String dottedKey) {
		Integer value = getInteger(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves a long value associated with the given dotted key, ensuring the value exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Long value corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the value is not found.
	 */
	default long getLongSafe(@NotNull String dottedKey) {
		Long value = getLong(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves a float value associated with the given dotted key, ensuring the value exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Float value corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the value is not found.
	 */
	default float getFloatSafe(@NotNull String dottedKey) {
		Float value = getFloat(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves a double value associated with the given dotted key, ensuring the value exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Double value corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the value is not found.
	 */
	default double getDoubleSafe(@NotNull String dottedKey) {
		Double value = getDouble(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves a boolean value associated with the given dotted key, ensuring the value exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Boolean value corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the value is not found.
	 */
	default boolean getBooleanSafe(@NotNull String dottedKey) {
		Boolean value = getBoolean(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves a MercuryTableOld associated with the given dotted key, ensuring the table exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryTableOld corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the table is not found.
	 */
	default @NotNull MercuryTable getTableSafe(@NotNull String dottedKey) {
		MercuryTable value = getTable(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves a MercuryArrayOld associated with the given dotted key, ensuring the array exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryArrayOld corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the array is not found.
	 */
	default @NotNull MercuryArray getArraySafe(@NotNull String dottedKey) {
		MercuryArray value = getArray(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}


	/**
	 * Retrieves a Key object associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Key object corresponding to the key, or null if not found.
	 */
	default @Nullable Key getKey(@NotNull String dottedKey) {
		String value = getString(dottedKey);
		return value != null ? Key.key(value) : null;
	}

	/**
	 * Retrieves a Key object associated with the given dotted key, ensuring the key exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Key object corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the key is not found.
	 */
	default @NotNull Key getKeySafe(@NotNull String dottedKey) {
		Key value = getKey(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves a MercuryPosition associated with the given dotted key, ensuring the position exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryPosition corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the position is not found.
	 */
	default @NotNull MercuryPosition getPositionSafe(@NotNull String dottedKey) {
		MercuryPosition position = getPosition(dottedKey);
		if (position == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return position;
	}

	/**
	 * Retrieves a Material object associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Material corresponding to the key, or null if not found.
	 */
	default @Nullable Material getMaterial(@NotNull String dottedKey) {
		String value = getString(dottedKey);
		if (value == null) {
			return null;
		}
		return Material.matchMaterial(value);
	}

	/**
	 * Retrieves a Material object associated with the given dotted key, ensuring the material exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The Material corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the material is not found.
	 */
	default @NotNull Material getMaterialSafe(@NotNull String dottedKey) {
		Material value = getMaterial(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	/**
	 * Retrieves an MercuryEntityType associated with the given dotted key.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryEntityType corresponding to the key, or null if not found.
	 */
	default @Nullable MercuryEntityType getEntityType(@NotNull String dottedKey) {
		String value = getString(dottedKey);
		if (value == null) {
			return null;
		}
		return MercuryEntityType.valueOf(value.toUpperCase());
	}

	/**
	 * Retrieves an MercuryEntityType associated with the given dotted key, ensuring the entity type exists.
	 *
	 * @param dottedKey The dotted key representing the property.
	 * @return The MercuryEntityType corresponding to the key.
	 * @throws MissingConfigurationPropertyException if the entity type is not found.
	 */
	default @NotNull MercuryEntityType getEntityTypeSafe(@NotNull String dottedKey) {
		MercuryEntityType value = getEntityType(dottedKey);
		if (value == null) {
			throw new MissingConfigurationPropertyException(dottedKey, name());
		}
		return value;
	}

	Set<Map.Entry<String, Object>> dottedEntrySet(boolean includeTables);

	Set<String> keySet();
	Set<String> dottedKeySet();
}

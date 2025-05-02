package me.adamix.mercury.api.configuration;

import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * The MercuryArray interface defines methods for accessing array data in a configuration.
 * This interface is used to interact with an array of items within a configuration.
 */
public interface MercuryArray {
	/**
	 * Retrieves the name of the configuration source.
	 *
	 * @return The name of the configuration source.
	 */
	@NotNull String name();

	/**
	 * Returns the size of the array.
	 *
	 * @return The size of the array.
	 */
	int size();

	/**
	 * Retrieves an object at the given index.
	 *
	 * @param index The index of the object in the array.
	 * @return The object at the specified index, or null if not found.
	 */
	@Nullable Object getObject(int index);

	/**
	 * Retrieves an object at the given index, ensuring the object exists.
	 *
	 * @param index The index of the object in the array.
	 * @return The object at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	@NotNull Object getObjectSafe(int index);

	/**
	 * Retrieves a string value at the given index.
	 *
	 * @param index The index of the string value in the array.
	 * @return The string value at the specified index, or null if not found.
	 */
	@Nullable String getString(int index);

	/**
	 * Retrieves a string value at the given index, ensuring the string exists.
	 *
	 * @param index The index of the string value in the array.
	 * @return The string value at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	@NotNull String getStringSafe(int index);

	/**
	 * Retrieves an integer value at the given index.
	 *
	 * @param index The index of the integer value in the array.
	 * @return The integer value at the specified index, or null if not found.
	 */
	@Nullable Integer getInteger(int index);

	/**
	 * Retrieves an integer value at the given index, ensuring the integer exists.
	 *
	 * @param index The index of the integer value in the array.
	 * @return The integer value at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	int getIntegerSafe(int index);

	/**
	 * Retrieves a long value at the given index.
	 *
	 * @param index The index of the long value in the array.
	 * @return The long value at the specified index, or null if not found.
	 */
	@Nullable Long getLong(int index);

	/**
	 * Retrieves a long value at the given index, ensuring the long exists.
	 *
	 * @param index The index of the long value in the array.
	 * @return The long value at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	long getLongSafe(int index);

	/**
	 * Retrieves a float value at the given index.
	 *
	 * @param index The index of the float value in the array.
	 * @return The float value at the specified index, or null if not found.
	 */
	@Nullable Float getFloat(int index);

	/**
	 * Retrieves a float value at the given index, ensuring the float exists.
	 *
	 * @param index The index of the float value in the array.
	 * @return The float value at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	float getFloatSafe(int index);

	/**
	 * Retrieves a double value at the given index.
	 *
	 * @param index The index of the double value in the array.
	 * @return The double value at the specified index, or null if not found.
	 */
	@Nullable Double getDouble(int index);

	/**
	 * Retrieves a double value at the given index, ensuring the double exists.
	 *
	 * @param index The index of the double value in the array.
	 * @return The double value at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	double getDoubleSafe(int index);

	/**
	 * Retrieves a boolean value at the given index.
	 *
	 * @param index The index of the boolean value in the array.
	 * @return The boolean value at the specified index, or null if not found.
	 */
	@Nullable Boolean getBoolean(int index);

	/**
	 * Retrieves a boolean value at the given index, ensuring the boolean exists.
	 *
	 * @param index The index of the boolean value in the array.
	 * @return The boolean value at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	boolean getBooleanSafe(int index);

	/**
	 * Retrieves a MercuryArray object at the given index.
	 *
	 * @param index The index of the MercuryArray object in the array.
	 * @return The MercuryArray object at the specified index, or null if not found.
	 */
	@Nullable MercuryArray getArray(int index);

	/**
	 * Retrieves a MercuryArray object at the given index, ensuring the array exists.
	 *
	 * @param index The index of the MercuryArray object in the array.
	 * @return The MercuryArray object at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	@NotNull MercuryArray getArraySafe(int index);

	/**
	 * Retrieves a MercuryTable object at the given index.
	 *
	 * @param index The index of the MercuryTable object in the array.
	 * @return The MercuryTable object at the specified index, or null if not found.
	 */
	@Nullable MercuryTable getTable(int index);

	/**
	 * Retrieves a MercuryTable object at the given index, ensuring the table exists.
	 *
	 * @param index The index of the MercuryTable object in the array.
	 * @return The MercuryTable object at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	@NotNull MercuryTable getTableSafe(int index);

	/**
	 * Retrieves a Key object at the given index.
	 *
	 * @param index The index of the Key object in the array.
	 * @return The Key object at the specified index, or null if not found.
	 */
	default @Nullable Key getKey(int index) {
		String string = getString(index);
		if (string == null) {
			return null;
		}
		return Key.key(string);
	}

	/**
	 * Retrieves a Key object at the given index, ensuring the Key exists.
	 *
	 * @param index The index of the Key object in the array.
	 * @return The Key object at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	default @NotNull Key getKeySafe(int index) {
		return Key.key(getStringSafe(index));
	}

	/**
	 * Retrieves a Material object at the given index.
	 *
	 * @param index The index of the Material object in the array.
	 * @return The Material object at the specified index, or null if not found.
	 */
	default @Nullable Material getMaterial(int index) {
		String string = getString(index);
		if (string == null) {
			return null;
		}
		return Material.getMaterial(string);
	}

	/**
	 * Retrieves a Material object at the given index, ensuring the Material exists.
	 *
	 * @param index The index of the Material object in the array.
	 * @return The Material object at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	default @NotNull Material getMaterialSafe(int index) {
		return Material.getMaterial(getString(index));
	}

	/**
	 * Retrieves an EntityType object at the given index.
	 *
	 * @param index The index of the EntityType object in the array.
	 * @return The EntityType object at the specified index, or null if not found.
	 */
	default @Nullable EntityType getEntityType(int index) {
		String string = getString(index);
		if (string == null) {
			return null;
		}
		return EntityType.fromName(string);
	}

	/**
	 * Retrieves an EntityType object at the given index, ensuring the EntityType exists.
	 *
	 * @param index The index of the EntityType object in the array.
	 * @return The EntityType object at the specified index.
	 * @throws IndexOutOfBoundsException if the index is invalid.
	 */
	default @NotNull EntityType getEntityTypeSafe(int index) {
		return EntityType.fromName(getString(index));
	}
}

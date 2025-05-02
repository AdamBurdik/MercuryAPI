package me.adamix.mercury.api.attribute;

import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

/**
 * Represents an instance of a specific attribute, with functionality to modify its value
 * and manage modifiers that influence the final value of the attribute.
 */
public interface MercuryAttributeInstance {

	/**
	 * Sets a new value for this attribute instance.
	 *
	 * @param value the new value to set
	 * @return the updated attribute instance
	 */
	@NotNull
	MercuryAttributeInstance setValue(double value);

	/**
	 * Adds a modifier to this attribute instance, which can change its final value.
	 *
	 * @param key the key that identifies the modifier
	 * @param modifier the modifier to add
	 * @return the updated attribute instance
	 */
	@NotNull
	MercuryAttributeInstance addModifier(@NotNull Key key, @NotNull MercuryAttributeModifier modifier);

	/**
	 * Removes a modifier from this attribute instance, if it exists.
	 *
	 * @param key the key of the modifier to remove
	 * @return the removed modifier if it existed, {@code null} otherwise
	 */
	@Nullable
	MercuryAttributeModifier removeModifier(@NotNull Key key);

	/**
	 * Retrieves a specific modifier from this attribute instance by its key.
	 *
	 * @param key the key of the modifier to retrieve
	 * @return the modifier if present, {@code null} otherwise
	 */
	@Nullable
	MercuryAttributeModifier get(@Nullable Key key);

	/**
	 * Gets all the modifiers currently applied to this attribute instance.
	 *
	 * @return a collection of all modifiers
	 */
	@NotNull
	Collection<MercuryAttributeModifier> getModifiers();

	/**
	 * Clears all modifiers applied to this attribute instance.
	 */
	void clear();

	/**
	 * Calculates the final value of this attribute after applying all modifiers.
	 *
	 * @return the final calculated value of the attribute
	 */
	double calculateFinal();
}

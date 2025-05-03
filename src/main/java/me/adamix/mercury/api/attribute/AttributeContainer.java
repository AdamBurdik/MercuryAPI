package me.adamix.mercury.api.attribute;

import me.adamix.mercury.api.entity.MercuryEntity;
import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a container that stores and manages attributes of an entity.
 */
public interface AttributeContainer {

	/**
	 * Sets an attribute and its corresponding instance to this container.
	 *
	 * @param attribute the attribute to set
	 * @param instance the instance of the attribute
	 * @return the updated attribute container
	 */
	@NotNull
	AttributeContainer set(@NotNull MercuryAttribute attribute, MercuryAttributeInstance instance);

	/**
	 * Checks if the given attribute is present in the container.
	 *
	 * @param attribute the attribute to check
	 * @return {@code true} if the attribute is present, {@code false} otherwise
	 */
	boolean has(@NotNull MercuryAttribute attribute);

	/**
	 * Retrieves the instance of the given attribute if it exists.
	 *
	 * @param attribute the attribute to retrieve
	 * @return the attribute instance if present, {@code null} otherwise
	 */
	@Nullable
	MercuryAttributeInstance get(@NotNull MercuryAttribute attribute);

	/**
	 * Clears all attributes in the container.
	 */
	void clear();

	/**
	 * Merges all attribute instances from this and specified container, into specified container.
	 * @param attributeContainer the attribute container to merge stuff into
	 */
	void merge(@NotNull AttributeContainer attributeContainer);

	/**
	 * Applies the attributes to the provided {@link MercuryEntity}.
	 *
	 * @param entity the entity to apply the attributes to
	 */
	void apply(@NotNull MercuryEntity entity);

	/**
	 * Applies attributes to a bukkit {@link LivingEntity}.
	 *
	 * @param bukkitLivingEntity the bukkit living entity to apply the attributes to
	 */
	@ApiStatus.Internal
	void apply(@NotNull LivingEntity bukkitLivingEntity);
}

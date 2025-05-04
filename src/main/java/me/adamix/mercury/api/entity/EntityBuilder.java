package me.adamix.mercury.api.entity;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.entity.component.MercuryEntityComponent;
import me.adamix.mercury.api.entity.type.MercuryEntityType;
import org.jetbrains.annotations.NotNull;


public interface EntityBuilder {
	@NotNull EntityBuilder type(@NotNull MercuryEntityType type);
	@NotNull EntityBuilder components(@NotNull MercuryEntityComponent... components);
	@NotNull EntityBuilder health(long health);
	@NotNull EntityBuilder maxHealth(long maxHealth);
	@NotNull EntityBuilder attributes(@NotNull AttributeContainer attributeContainer);
	@NotNull EntityBuilder flags(long flags);

	/**
	 * Builds the entity from the provided fields.
	 *
	 * @return {@link MercuryEntity} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryEntity build();

	/**
	 * Shortcut for retrieving item builder.
	 * @return {@link EntityBuilder} instance.
	 */
	static @NotNull EntityBuilder get() {
		return MercuryCore.builders().entity();
	}
}

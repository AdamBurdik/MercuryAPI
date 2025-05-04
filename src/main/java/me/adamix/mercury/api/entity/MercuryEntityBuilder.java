package me.adamix.mercury.api.entity;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.entity.component.MercuryEntityComponent;
import me.adamix.mercury.api.entity.type.MercuryEntityType;
import org.jetbrains.annotations.NotNull;


public interface MercuryEntityBuilder {
	@NotNull MercuryEntityBuilder type(@NotNull MercuryEntityType type);
	@NotNull MercuryEntityBuilder components(@NotNull MercuryEntityComponent... components);
	@NotNull MercuryEntityBuilder health(long health);
	@NotNull MercuryEntityBuilder maxHealth(long maxHealth);
	@NotNull MercuryEntityBuilder attributes(@NotNull AttributeContainer attributeContainer);
	@NotNull MercuryEntityBuilder flags(long flags);

	/**
	 * Builds the entity from the provided fields.
	 *
	 * @return {@link MercuryEntity} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryEntity build();

	/**
	 * Shortcut for retrieving item builder.
	 * @return {@link MercuryEntityBuilder} instance.
	 */
	static @NotNull MercuryEntityBuilder get() {
		return MercuryCore.builders().entity();
	}
}

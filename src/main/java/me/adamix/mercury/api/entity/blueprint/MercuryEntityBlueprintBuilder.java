package me.adamix.mercury.api.entity.blueprint;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.entity.component.MercuryEntityComponent;
import org.jetbrains.annotations.NotNull;

public interface MercuryEntityBlueprintBuilder {
	@NotNull MercuryEntityBlueprintBuilder components(@NotNull MercuryEntityComponent... components);
	@NotNull MercuryEntityBlueprintBuilder health(long health);
	@NotNull MercuryEntityBlueprintBuilder maxHealth(long maxHealth);
	@NotNull MercuryEntityBlueprintBuilder attributes(@NotNull AttributeContainer attributeContainer);
	@NotNull MercuryEntityBlueprintBuilder flags(long flags);

	/**
	 * Builds the entity blueprint from the provided fields.
	 *
	 * @return {@link MercuryEntityBlueprint} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryEntityBlueprint build();

	/**
	 * Shortcut for retrieving item builder.
	 * @return {@link MercuryEntityBlueprintBuilder} instance.
	 */
	static @NotNull MercuryEntityBlueprintBuilder get() {
		return MercuryCore.builders().entityBlueprint();
	}
}

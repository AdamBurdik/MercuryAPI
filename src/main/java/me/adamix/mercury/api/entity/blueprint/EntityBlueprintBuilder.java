package me.adamix.mercury.api.entity.blueprint;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.entity.component.MercuryEntityComponent;
import me.adamix.mercury.api.entity.type.MercuryEntityType;
import org.jetbrains.annotations.NotNull;

public interface EntityBlueprintBuilder {
	@NotNull EntityBlueprintBuilder type(@NotNull MercuryEntityType type);
	@NotNull EntityBlueprintBuilder components(@NotNull MercuryEntityComponent... components);
	@NotNull EntityBlueprintBuilder health(long health);
	@NotNull EntityBlueprintBuilder maxHealth(long maxHealth);
	@NotNull EntityBlueprintBuilder attributes(@NotNull AttributeContainer attributeContainer);
	@NotNull EntityBlueprintBuilder flags(long flags);

	/**
	 * Builds the entity blueprint from the provided fields.
	 *
	 * @return {@link MercuryEntityBlueprint} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryEntityBlueprint build();

	/**
	 * Shortcut for retrieving item builder.
	 * @return {@link EntityBlueprintBuilder} instance.
	 */
	static @NotNull EntityBlueprintBuilder get() {
		return MercuryCore.builders().entityBlueprint();
	}
}

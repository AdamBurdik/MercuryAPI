package me.adamix.mercury.api.entity.blueprint;

import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.entity.MercuryEntity;
import me.adamix.mercury.api.entity.component.MercuryEntityComponent;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents blueprint for {@link MercuryEntity} which contains all generic data.
 * Typically used to define entities loaded from config file.
 */
public interface MercuryEntityBlueprint {
	/**
	 * Returns the key that identifies the blueprint.
	 *
	 * @return the {@link Key} of the blueprint
	 */
	@NotNull Key blueprintKey();

	/**
	 * Returns all components attached to this blueprint.
	 *
	 * @return an array of {@link MercuryEntityComponent}
	 */
	@NotNull MercuryEntityComponent[] components();

	/**
	 * Returns initial health of entity spawned from this blueprint.
	 * @return Initial health
	 */
	long health();

	/**
	 * Returns maximum amount of health entity from this blueprint can have.
	 * @return Maximum amount of health.
	 */
	long maxHealth();

	/**
	 * Returns long representing flags of this blueprint.
	 * @return Flags of this blueprint, or 0 if no flags are present.
	 */
	long flags();

	/**
	 * Returns attribute container.
	 *
	 * @return {@link AttributeContainer} instance or null.
	 */
	@Nullable AttributeContainer attributeContainer();

	/**
	 * Builds mercury entity.
	 *
	 * @return {@link MercuryEntity} instance.
	 */
	@NotNull MercuryEntity build();
}

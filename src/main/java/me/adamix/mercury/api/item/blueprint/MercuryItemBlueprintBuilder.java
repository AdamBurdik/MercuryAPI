package me.adamix.mercury.api.item.blueprint;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.item.component.MercuryItemComponent;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public interface MercuryItemBlueprintBuilder {
	@NotNull MercuryItemBlueprintBuilder key(@NotNull Key key);
	@NotNull MercuryItemBlueprintBuilder name(@NotNull String name);
	@NotNull MercuryItemBlueprintBuilder material(@NotNull Material material);
	@NotNull MercuryItemBlueprintBuilder components(@NotNull MercuryItemComponent... components);

	/**
	 * Builds the item blueprint from the provided fields.
	 *
	 * @return {@link MercuryItemBlueprint} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryItemBlueprint build();

	/**
	 * Shortcut for retrieving item blueprint builder.
	 * @return {@link MercuryItemBlueprintBuilder} instance.
	 */
	static @NotNull MercuryItemBlueprintBuilder get() {
		return MercuryCore.builders().itemBlueprint();
	}
}

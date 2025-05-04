package me.adamix.mercury.api.item.blueprint;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.item.component.MercuryItemComponent;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public interface ItemBlueprintBuilder {
	@NotNull ItemBlueprintBuilder key(@NotNull Key key);
	@NotNull ItemBlueprintBuilder name(@NotNull String name);
	@NotNull ItemBlueprintBuilder material(@NotNull Material material);
	@NotNull ItemBlueprintBuilder attributes(@NotNull AttributeContainer attributeContainer);
	@NotNull ItemBlueprintBuilder components(@NotNull MercuryItemComponent... components);

	/**
	 * Builds the item blueprint from the provided fields.
	 *
	 * @return {@link MercuryItemBlueprint} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryItemBlueprint build();

	/**
	 * Shortcut for retrieving item blueprint builder.
	 * @return {@link ItemBlueprintBuilder} instance.
	 */
	static @NotNull ItemBlueprintBuilder get() {
		return MercuryCore.builders().itemBlueprint();
	}
}

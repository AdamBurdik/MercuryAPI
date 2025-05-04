package me.adamix.mercury.api.item;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.item.component.MercuryItemComponent;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface MercuryItemBuilder {
	@NotNull MercuryItemBuilder uuid(@NotNull UUID uuid);
	@NotNull MercuryItemBuilder name(@NotNull String name);
	@NotNull MercuryItemBuilder material(@NotNull Material material);
	@NotNull MercuryItemBuilder attributes(@NotNull AttributeContainer attributeContainer);
	@NotNull MercuryItemBuilder components(@NotNull MercuryItemComponent... components);

	/**
	 * Builds the item from the provided fields.
	 *
	 * @return {@link MercuryItem} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryItem build();

	/**
	 * Shortcut for retrieving item builder.
	 * @return {@link MercuryItemBuilder} instance.
	 */
	static @NotNull MercuryItemBuilder get() {
		return MercuryCore.builders().item();
	}
}

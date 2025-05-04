package me.adamix.mercury.api.item;

import me.adamix.mercury.api.MercuryCore;
import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.item.component.MercuryItemComponent;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface ItemBuilder {
	@NotNull ItemBuilder uuid(@NotNull UUID uuid);
	@NotNull ItemBuilder name(@NotNull String name);
	@NotNull ItemBuilder material(@NotNull Material material);
	@NotNull ItemBuilder attributes(@NotNull AttributeContainer attributeContainer);
	@NotNull ItemBuilder components(@NotNull MercuryItemComponent... components);

	/**
	 * Builds the item from the provided fields.
	 *
	 * @return {@link MercuryItem} instance.
	 * @throws IllegalStateException if a required field is missing.
	 */
	@NotNull MercuryItem build();

	/**
	 * Shortcut for retrieving item builder.
	 * @return {@link ItemBuilder} instance.
	 */
	static @NotNull ItemBuilder get() {
		return MercuryCore.builders().item();
	}
}

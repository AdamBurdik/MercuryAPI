package me.adamix.mercury.api.item.blueprint;

import me.adamix.mercury.api.item.MercuryItem;
import me.adamix.mercury.api.item.component.MercuryItemComponent;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Represents blueprint for custom item.
 */

public interface MercuryItemBlueprint {
	/**
	 * Returns the unique identifier of this item instance.
	 *
	 * @return the unique {@link UUID} of the item
	 */
	@NotNull
	UUID uniqueId();

	/**
	 * Returns the key that identifies the blueprint this item was created from.
	 *
	 * @return the {@link Key} of the item's blueprint
	 */
	@NotNull
	Key blueprintKey();

	/**
	 * Returns the display name of this item.
	 *
	 * @return the name of the item
	 */
	@NotNull
	String name();

	/**
	 * Returns the material used to represent this item in Minecraft.
	 *
	 * @return the {@link Material} of the item
	 */
	@NotNull
	Material material();

	/**
	 * Returns all components attached to this item.
	 *
	 * @return an array of {@link MercuryItemComponent}
	 */
	@NotNull
	MercuryItemComponent[] components();

	/**
	 * Builds mercury item.
	 * @param itemUniqueId unique id of the item.
	 * @return {@link MercuryItem} instance.
	 */
	@NotNull MercuryItem build(@NotNull UUID itemUniqueId);
}

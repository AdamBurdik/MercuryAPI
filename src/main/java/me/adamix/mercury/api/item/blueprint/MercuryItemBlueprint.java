package me.adamix.mercury.api.item.blueprint;

import me.adamix.mercury.api.item.MercuryItem;
import me.adamix.mercury.api.item.component.MercuryItemComponent;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Represents blueprint for {@link MercuryItem} which contains all generic data.
 * Typically used to define items loaded from config file.
 */
public interface MercuryItemBlueprint {
	/**
	 * Returns the key that identifies the blueprint.
	 *
	 * @return the {@link Key} of the blueprint
	 */
	@NotNull
	Key blueprintKey();

	/**
	 * Returns the display name of this blueprint.
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
	 * Returns all components attached to this blueprint.
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

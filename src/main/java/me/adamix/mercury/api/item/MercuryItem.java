package me.adamix.mercury.api.item;

import me.adamix.mercury.api.item.component.MercuryItemComponent;
import me.adamix.mercury.api.player.MercuryPlayer;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Represents custom item with support for components.
 */
public interface MercuryItem {

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
	 * @return the {@link Key} of the item blueprint, or null if item was not created from blueprint.
	 */
	@Nullable
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
	 * Checks if the item has a specific type of component.
	 *
	 * @param clazz the class of the component to check
	 * @return {@code true} if the component is present, {@code false} otherwise
	 */
	boolean hasComponent(Class<? extends MercuryItemComponent> clazz);

	/**
	 * Retrieve specific component from the item.
	 * @param clazz the class of the component.
	 * @return {@link MercuryItemComponent} instance, or null.
	 * @param <T> the type of the component
	 */
	<T extends MercuryItemComponent> @Nullable T getComponent(Class<T> clazz);

	/**
	 * Converts this custom item into a bukkit {@link ItemStack} for the given player.
	 *
	 * @param player the player context used for rendering or personalization
	 * @return the bukkit {@link ItemStack}.
	 */
	@NotNull
	ItemStack toItemStack(MercuryPlayer player);
}

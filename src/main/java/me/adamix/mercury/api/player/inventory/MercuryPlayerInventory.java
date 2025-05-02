package me.adamix.mercury.api.player.inventory;

import me.adamix.mercury.api.item.MercuryItem;
import me.adamix.mercury.api.player.MercuryPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a custom inventory system for a {@link MercuryPlayer}.
 */
public interface MercuryPlayerInventory {

	/**
	 * Sets the item at the specified index.
	 *
	 * @param index the slot index to place the item
	 * @param item  the item to place in the slot, or {@code null} to clear it
	 */
	void setItem(int index, @Nullable MercuryItem item);

	/**
	 * Adds an item to the inventory, placing it in the first available slot.
	 *
	 * @param item the item to add
	 */
	void addItem(@NotNull MercuryItem item);

	/**
	 * Retrieves the item at the specified index.
	 *
	 * @param index the slot index to retrieve from
	 * @return the item at the given index, or {@code null} if the slot is empty
	 */
	@Nullable MercuryItem get(int index);

	/**
	 * Synchronizes all custom items to the bukkit inventory for the given player.
	 *
	 * @param player the player whose inventory should be updated
	 */
	void update(@NotNull MercuryPlayer player);
}

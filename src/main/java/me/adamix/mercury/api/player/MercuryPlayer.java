package me.adamix.mercury.api.player;

import me.adamix.mercury.api.player.inventory.MercuryPlayerInventory;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.MissingResourceException;

public interface MercuryPlayer {
	/**
	 * Retrieves bukkit player instance.
	 *
	 * @return {@link Player} instance.
	 */
	@ApiStatus.Internal
	@NotNull Player getBukkitPlayer();

	/**
	 * Retrieves id of player translation
	 *
	 * @return translation id.
	 */
	@NotNull String getTranslationId();

	/**
	 * Retrieves the name of player.
	 *
	 * @return the name of player
	 */
	@NotNull String getName();

	/**
	 * Retrieves the player inventory.
	 * @return {@link MercuryPlayerInventory} instance.
	 */
	@NotNull MercuryPlayerInventory getInventory();

	/**
	 * Sets the translation of player.
	 *
	 * @param translationId new translation id.
	 * @throws MissingResourceException if translation with specified id does not exist.
	 */
	void setTranslation(@NotNull String translationId);


	/**
	 * Get translation message from configuration and send it to player.
	 *
	 * @param dottedKey dotted key of translation.
	 */
	default void sendTranslatableMessage(@NotNull String dottedKey) {
		sendTranslatableMessage(dottedKey, Map.of());
	}

	/**
	 * Gets translation message from configuration, parse arguments and sends it to player.
	 *
	 * @param dottedKey   dotted key of translation.
	 * @param argumentMap argument map to parse.
	 */
	void sendTranslatableMessage(@NotNull String dottedKey, @NotNull Map<String, Object> argumentMap);

	/**
	 * Sends a message to player
	 *
	 * @param component message component.
	 */
	void sendMessage(@NotNull Component component);
}

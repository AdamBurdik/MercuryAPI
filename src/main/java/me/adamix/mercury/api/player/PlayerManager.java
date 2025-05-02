package me.adamix.mercury.api.player;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.UUID;

public interface PlayerManager {
	/**
	 * Creates mercury player instance from bukkit player.
	 * @param bukkitPlayer bukkit player instance.
	 * @return {@link MercuryPlayer} instance.
	 */
	@NotNull MercuryPlayer create(@NotNull Player bukkitPlayer);

	/**
	 * Retrieves mercury player instance by uuid.
	 * @param uuid uuid to retrieve player by.
	 * @return {@link MercuryPlayer} instance, or null.
	 */
	@Nullable MercuryPlayer get(@NotNull UUID uuid);

	/**
	 * Removes player from internal map.<br> Usually called when player leaves.
	 * @param uuid uuid of player to remove.
	 */
	void remove(@NotNull UUID uuid);

	/**
	 * Retrieves list of currently online players.
	 * @return {@link Collection} with online players.
	 */
	@NotNull Collection<MercuryPlayer> getOnlinePlayers();
}

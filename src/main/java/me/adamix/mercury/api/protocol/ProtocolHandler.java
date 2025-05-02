package me.adamix.mercury.api.protocol;

import com.comphenix.protocol.ProtocolManager;
import me.adamix.mercury.api.protocol.data.EntityMetadata;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface ProtocolHandler {
	/**
	 * Creates metadata for the specified {@link Entity}.
	 *
	 * @param bukkitEntity the entity to generate metadata for
	 * @return the generated {@link EntityMetadata}
	 */

	@NotNull EntityMetadata createEntityMetadata(@NotNull Entity bukkitEntity);

	/**
	 * Sends the given {@link EntityMetadata} to the specified player.
	 *
	 * @param metadata the metadata to send
	 * @param bukkitPlayer the player to receive the metadata
	 * @param protocolManager protocol manager instance.
	 */

	void sendEntityMetadata(@NotNull EntityMetadata metadata, @NotNull Player bukkitPlayer, @NotNull ProtocolManager protocolManager);
}

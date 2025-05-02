package me.adamix.mercury.api.protocol;

import me.adamix.mercury.api.entity.MercuryEntity;
import me.adamix.mercury.api.player.MercuryPlayer;
import me.adamix.mercury.api.protocol.data.EntityMetadata;
import org.jetbrains.annotations.NotNull;

public interface MercuryProtocol {
	/**
	 * Creates metadata for the specified {@link MercuryEntity}.
	 *
	 * @param entity the entity to generate metadata for
	 * @return the generated {@link EntityMetadata}
	 */
	@NotNull EntityMetadata createEntityMetadata(@NotNull MercuryEntity entity);

	/**
	 * Sends the given {@link EntityMetadata} to the specified player.
	 *
	 * @param metadata the metadata to send
	 * @param player   the player to receive the metadata
	 */
	void sendEntityMetadata(@NotNull EntityMetadata metadata, @NotNull MercuryPlayer player);
}

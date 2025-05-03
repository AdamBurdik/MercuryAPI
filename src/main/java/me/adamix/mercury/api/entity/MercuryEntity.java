package me.adamix.mercury.api.entity;

import me.adamix.mercury.api.entity.component.MercuryEntityComponent;
import me.adamix.mercury.api.player.MercuryPlayer;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Represents interface for generic entity.
 */
public interface MercuryEntity {

	/**
	 * Returns bukkit entity.
	 *
	 * @return {@link Entity} instance or null
	 */
	@Nullable Entity bukkitEntity();

	/**
	 * Returns whenever entity is alive.<br>
	 * Alive means its spawned in the world.
	 *
	 * @return Whenever entity is alive.
	 */
	boolean isAlive();

	/**
	 * Returns list of players that sees this entity.
	 * @return List of players
	 */
	@NotNull List<MercuryPlayer> getViewers();

	/**
	 * Adds player to viewer list.
	 * @param player Player to add to viewer list.
	 */
	void addViewer(@NotNull MercuryPlayer player);

	/**
	 * Removes player from viewer list.
	 * @param player Player to remove from viewer list.
	 */
	void removeViewer(@NotNull MercuryPlayer player);

	/**
	 * Returns list of all components on this entity.
	 * @return List of entity components.
	 */
	@NotNull List<MercuryEntityComponent> getComponents();

	/**
	 * Adds component, if not already present, to this entity.
	 * @param component Component to add.
	 */
	void addComponent(@NotNull MercuryEntityComponent component);

	/**
	 * Retrieves component from this entity.
	 * @param clazz Class object representing the component type.
	 * @param <T> Type of the component extending {@link MercuryEntityComponent}.
	 * @return Component instance if present, or null.
	 */
	<T extends MercuryEntityComponent> @Nullable T getComponent(@NotNull Class<T> clazz);

	/**
	 * Removes component from this entity.
	 * @param clazz Class object representing the component type.
	 * @param <T> Type of the component extending {@link MercuryEntityComponent}.
	 */
	<T extends MercuryEntityComponent> void removeComponent(@NotNull Class<T> clazz);
}

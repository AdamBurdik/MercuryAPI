package me.adamix.mercury.api.entity;

import me.adamix.mercury.api.attribute.AttributeContainer;
import me.adamix.mercury.api.entity.component.MercuryEntityComponent;
import me.adamix.mercury.api.entity.type.MercuryEntityType;
import me.adamix.mercury.api.math.MercuryPosition;
import me.adamix.mercury.api.player.MercuryPlayer;
import net.kyori.adventure.key.Key;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.UUID;

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
	 * Returns key of the blueprint this entity was built from.
	 * @return {@link Key}, or null.
	 */
	@Nullable Key getBlueprintKey();

	/**
	 * Returns uuid of this entity.
	 * @return Uuid of this entity, or null if entity has not been spawned yet.
	 */
	@Nullable UUID getUuid();

	/**
	 * Returns world of this entity.
	 * @return {@link World} of this entity, or null if entity has not been spawned yet.
	 */
	@Nullable World getWorld();

	/**
	 * Returns current position of this entity.
	 * @return {@link MercuryPosition} of this entity, or null if entity has not been spawned yet.
	 */
	@Nullable MercuryPosition getPosition();

	/**
	 * Spawns entity in specified world.<br>
	 * Should be called to spawn entity. For spawning use {@link EntityManager#spawn(MercuryEntity, World, MercuryPosition)}
	 * @param world World to spawn entity in.
	 * @param position Position to spawn entity at.
	 */
	@ApiStatus.Internal
	void setWorld(@NotNull World world, @NotNull MercuryPosition position);

	/**
	 * Called after new world is set.
	 */
	void spawn();

	/**
	 * Called after entity is loaded back to world.<br>
	 * Usually after server starts.
	 */
	void load();

	/**
	 * Returns type of this entity.
	 * @return Entity type.
	 */
	@NotNull MercuryEntityType type();

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
	@NotNull Set<MercuryPlayer> getViewers();

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
	@NotNull Set<MercuryEntityComponent> getComponents();

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

	/**
	 * Returns current health of this entity.
	 *
	 * @return Current health.
	 */
	long getHealth();

	/**
	 * Returns maximum value of health entity can have.
	 * @return Maximum health value.
	 */
	long getMaxHealth();

	/**
	 * Sets current health to specified value.
	 *
	 * @param health New health value to set.
	 */
	void setHealth(long health);

	/**
	 * Sets maximum health value of this entity.
	 * @param maxHealth New maximum health value.
	 */
	void setMaxHealth(long maxHealth);

	/**
	 * Changes current health by specified amount.
	 *
	 * @param amount Amount to change health by.
	 */
	void changeHealth(long amount);

	/**
	 * Returns attribute container.
	 *
	 * @return {@link AttributeContainer} instance or null.
	 */
	@Nullable AttributeContainer attributeContainer();

	/**
	 * Returns long representing flags of this entity.
	 * @return Flags of this entity, or 0 if no flags are present.
	 */
	long flags();
}

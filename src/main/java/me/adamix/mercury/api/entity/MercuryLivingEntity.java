package me.adamix.mercury.api.entity;

import me.adamix.mercury.api.attribute.AttributeContainer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

/**
 * Represents interface for living entity.
 */
public interface MercuryLivingEntity extends MercuryEntity {

	/**
	 * Returns bukkit living entity.
	 *
	 * @return {@link Entity} instance or null
	 */
	@Override
	@Nullable LivingEntity bukkitEntity();

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
}

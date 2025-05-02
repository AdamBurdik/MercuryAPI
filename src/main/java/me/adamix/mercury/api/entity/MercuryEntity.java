package me.adamix.mercury.api.entity;

import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public interface MercuryEntity {
	@NotNull LivingEntity bukkitEntity();
}

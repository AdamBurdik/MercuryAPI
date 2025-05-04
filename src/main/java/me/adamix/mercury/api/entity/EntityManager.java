package me.adamix.mercury.api.entity;

import me.adamix.mercury.api.math.MercuryPosition;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public interface EntityManager {
	@Nullable MercuryEntity getEntity(@NotNull UUID uuid);

	void spawn(@NotNull MercuryEntity entity, @NotNull World world, @NotNull MercuryPosition position);

	List<MercuryEntity> getEntityList();
}

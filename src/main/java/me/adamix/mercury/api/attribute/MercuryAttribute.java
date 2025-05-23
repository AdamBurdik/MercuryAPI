package me.adamix.mercury.api.attribute;

import net.kyori.adventure.translation.Translatable;
import org.bukkit.attribute.Attribute;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum MercuryAttribute implements Translatable {
	DAMAGE,
	ATTACK_SPEED(Attribute.ATTACK_SPEED),
	MOVEMENT_SPEED(Attribute.MOVEMENT_SPEED),
	MAX_HEALTH,
	HEALTH;

	@Nullable
	private final Attribute bukkitAttribute;

	public Attribute bukkitAttribute() {
		return bukkitAttribute;
	}

	MercuryAttribute() {
		this(null);
	}

	MercuryAttribute(@Nullable Attribute bukkitAttribute) {
		this.bukkitAttribute = bukkitAttribute;
	}

	@Override
	public @NotNull String translationKey() {
		return "attribute." + this.name().toLowerCase();
	}
}

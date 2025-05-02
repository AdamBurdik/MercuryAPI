package me.adamix.mercury.api.item.rarity;

import me.adamix.mercury.api.item.component.ItemRarityComponent;
import net.kyori.adventure.translation.Translatable;
import org.jetbrains.annotations.NotNull;

public enum ItemRarity implements Translatable {
	UNCOMMON,
	COMMON,
	RARE,
	EPIC,
	LEGENDARY,
	MYTHICAL,
	UNIQUE;

	@Override
	public @NotNull String translationKey() {
		return "item.rarity." + this.name().toLowerCase();
	}

	public ItemRarityComponent toComponent() {
		return new ItemRarityComponent(this);
	}
}

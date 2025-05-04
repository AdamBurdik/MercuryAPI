package me.adamix.mercury.api.builders;

import me.adamix.mercury.api.entity.EntityBuilder;
import me.adamix.mercury.api.entity.blueprint.EntityBlueprintBuilder;
import me.adamix.mercury.api.item.ItemBuilder;
import me.adamix.mercury.api.item.blueprint.ItemBlueprintBuilder;
import org.jetbrains.annotations.NotNull;

public interface MercuryBuilderFactory {
	@NotNull ItemBlueprintBuilder itemBlueprint();
	@NotNull ItemBuilder item();

	@NotNull EntityBuilder entity();
	@NotNull EntityBlueprintBuilder entityBlueprint();
}

package me.adamix.mercury.api.builders;

import me.adamix.mercury.api.entity.MercuryEntityBuilder;
import me.adamix.mercury.api.entity.blueprint.MercuryEntityBlueprintBuilder;
import me.adamix.mercury.api.item.MercuryItemBuilder;
import me.adamix.mercury.api.item.blueprint.MercuryItemBlueprintBuilder;
import org.jetbrains.annotations.NotNull;

public interface MercuryBuilderFactory {
	@NotNull MercuryItemBlueprintBuilder itemBlueprint();
	@NotNull MercuryItemBuilder item();

	@NotNull MercuryEntityBuilder entity();
	@NotNull MercuryEntityBlueprintBuilder entityBlueprint();
}

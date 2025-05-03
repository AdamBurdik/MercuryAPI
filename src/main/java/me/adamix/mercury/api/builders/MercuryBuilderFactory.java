package me.adamix.mercury.api.builders;

import me.adamix.mercury.api.item.MercuryItemBuilder;
import me.adamix.mercury.api.item.blueprint.MercuryItemBlueprintBuilder;
import org.jetbrains.annotations.NotNull;

public interface MercuryBuilderFactory {
	@NotNull MercuryItemBlueprintBuilder itemBlueprint();
	@NotNull MercuryItemBuilder item();
}

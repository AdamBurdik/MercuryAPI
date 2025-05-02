package me.adamix.mercury.api.item;

import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ItemManager {
	@Nullable MercuryItem buildItem(@NotNull Key blueprintId);
}

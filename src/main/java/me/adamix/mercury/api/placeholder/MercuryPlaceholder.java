package me.adamix.mercury.api.placeholder;

import me.adamix.mercury.api.player.MercuryPlayer;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

@FunctionalInterface
public interface MercuryPlaceholder {
	String get(@NotNull MercuryPlayer player, @NotNull ArgumentQueue args, @NotNull Map<String, Object> data);
}

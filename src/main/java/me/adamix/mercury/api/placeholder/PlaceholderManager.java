package me.adamix.mercury.api.placeholder;

import me.adamix.mercury.api.player.MercuryPlayer;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface PlaceholderManager {

	/**
	 * Registers a placeholder with the given name.
	 *
	 * @param name        the unique name of the placeholder
	 * @param placeholder the placeholder logic to associate with the name
	 */
	void registerPlaceholder(@NotNull String name, @NotNull MercuryPlaceholder placeholder);

	/**
	 * Parses the input text and replaces all registered placeholders using the given player context.
	 *
	 * @param text   the raw input text with placeholders
	 * @param player the player context used for parsing
	 * @return the parsed {@link Component} with placeholders replaced
	 */
	default Component parse(@NotNull String text, @NotNull MercuryPlayer player) {
		return parse(text, player, Map.of());
	}

	/**
	 * Parses the input text and replaces all registered placeholders using the given player and custom data.
	 *
	 * @param text   the raw input text with placeholders
	 * @param player the player context used for parsing
	 * @param data   additional contextual data used by placeholders
	 * @return the parsed {@link Component} with placeholders replaced
	 */
	Component parse(@NotNull String text, @NotNull MercuryPlayer player, @NotNull Map<String, Object> data);
}

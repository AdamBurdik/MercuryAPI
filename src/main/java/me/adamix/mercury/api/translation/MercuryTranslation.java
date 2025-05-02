package me.adamix.mercury.api.translation;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

public interface MercuryTranslation {
	/**
	 * Retrieves translation by key as string.
	 * @param dottedKey key to get translation of.
	 * @return translation {@link String}.
	 */
	@NotNull String get(@NotNull String dottedKey);

	/**
	 * Retrieves translation by key as component.
	 * @param dottedKey key to get translation of.
	 * @return translation {@link Component}.
	 */
	@NotNull Component getComponent(@NotNull String dottedKey);
}

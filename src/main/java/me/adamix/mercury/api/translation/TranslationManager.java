package me.adamix.mercury.api.translation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.nio.file.Path;

public interface TranslationManager {
	/**
	 * Removes loaded all translations from internal map.
	 */
	void unloadTranslations();

	/**
	 * Parses and loads translation from specified toml file.
	 * @param file file to load translation from.
	 *
	 * @throws java.io.IOException if error occurs while parsing.
	 */
	void loadTranslation(@NotNull File file);

	/**
	 * Parses and loads all translation files from specified directory.
	 * @param path path to load all translations from.
	 *
	 * @throws java.io.IOException if error occurs while parsing any of the file.
	 */
	void loadAllTranslations(@NotNull Path path);

	/**
	 * Retrieves translation by id.
	 * @param translationId id which is configured for all translations.
	 * @return Translation instance, or default translation if translationId is null.<br>
	 * If default translation is also null, returns null
	 */
	@Nullable MercuryTranslation getTranslation(@Nullable String translationId);
}

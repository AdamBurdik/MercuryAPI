package me.adamix.mercury.api.entity.blueprint;

import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.util.Set;

public interface EntityBlueprintManager {
	/**
	 * Registers an entity blueprint.
	 *
	 * @param blueprint Blueprint to register.
	 */
	void registerBlueprint(@NotNull MercuryEntityBlueprint blueprint);

	/**
	 * Parses and loads all entity blueprint files from specified directory.
	 *
	 * @param path Path to load blueprints from.
	 */
	void registerAllItemBlueprints(@NotNull Path path);

	/**
	 * Unloads all loaded blueprints from memory.
	 */
	void unloadBlueprints();

	/**
	 * Returns entity blueprint.
	 * @param key Key if blueprint to get.
	 * @return {@link MercuryEntityBlueprint} instance, or null.
	 */
	@Nullable MercuryEntityBlueprint getBlueprint(@NotNull Key key);

	/**
	 * Retrieves set of all registered blueprint keys.
	 *
	 * @return {@link Set} with keys of registered blueprints.
	 */
	@NotNull Set<Key> getKeySet();
}

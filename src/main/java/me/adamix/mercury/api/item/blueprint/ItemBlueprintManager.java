package me.adamix.mercury.api.item.blueprint;

import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.util.Set;

public interface ItemBlueprintManager {
	/**
	 * Registers an item blueprint.
	 *
	 * @param blueprint blueprint to register.
	 */
	void registerBlueprint(@NotNull MercuryItemBlueprint blueprint);

	/**
	 * Parses and loads all item blueprint files from specified directory.
	 *
	 * @param path path to load blueprints from.
	 */
	void registerAllItemBlueprints(@NotNull Path path);

	/**
	 * Unloads all loaded blueprints from memory.
	 */
	void unloadBlueprints();

	/**
	 * Returns item blueprint.
	 * @param key Key if blueprint to get.
	 * @return {@link MercuryItemBlueprint} instance, or null.
	 */
	@Nullable MercuryItemBlueprint getBlueprint(@NotNull Key key);

	/**
	 * Retrieves set of all registered blueprint keys.
	 *
	 * @return {@link Set} with keys of registered blueprints.
	 */
	@NotNull Set<Key> getItemIdSet();
}

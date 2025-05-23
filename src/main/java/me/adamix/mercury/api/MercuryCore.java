package me.adamix.mercury.api;

import me.adamix.mercury.api.builders.MercuryBuilderFactory;
import me.adamix.mercury.api.data.DataInstance;
import me.adamix.mercury.api.data.DataManager;
import me.adamix.mercury.api.entity.EntityManager;
import me.adamix.mercury.api.entity.MercuryEntity;
import me.adamix.mercury.api.entity.blueprint.EntityBlueprintManager;
import me.adamix.mercury.api.item.ItemManager;
import me.adamix.mercury.api.item.blueprint.ItemBlueprintManager;
import me.adamix.mercury.api.placeholder.PlaceholderManager;
import me.adamix.mercury.api.player.MercuryPlayer;
import me.adamix.mercury.api.player.PlayerManager;
import me.adamix.mercury.api.protocol.MercuryProtocol;
import me.adamix.mercury.api.task.MercuryTask;
import me.adamix.mercury.api.translation.MercuryTranslation;
import me.adamix.mercury.api.translation.TranslationManager;
import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public abstract class MercuryCore {
	private static MercuryCore instance;

	public static void setInstance(@NotNull MercuryCore instance) {
		MercuryCore.instance = instance;
	}

	private static MercuryCore getInstance() {
		if (instance == null) {
			throw new IllegalStateException("MercuryCore instance has not been set. Call MercuryCore.setInstance() before using static access.");
		}
		return instance;
	}

	/**
	 * Loads all necessary stuff for mercury core to work.
	 *
	 * @throws IllegalStateException if mercury core is already loaded.
	 */
	@ApiStatus.Internal
	public abstract void load(@NotNull MercuryAPI api);

	/**
	 * Unloads and saves all necessary stuff from mercury core.
	 *
	 * @throws IllegalStateException if mercury core is not loaded yet.
	 */
	@ApiStatus.Internal
	public abstract void unload();

	/**
	 * Retrieves instance of the builder factory.
	 * @return {@link MercuryBuilderFactory} instance.
	 */
	public abstract @NotNull MercuryBuilderFactory getBuilderFactory();

	/**
	 * Retrieves instance of the core plugin.
	 * @return {@link MercuryAPI} instance.
	 */
	@ApiStatus.Internal
	public abstract MercuryAPI corePlugin();

	/**
	 * Retrieves translation manager instance.
	 * @return {@link TranslationManager} instance.
	 */
	@ApiStatus.Internal
	public abstract TranslationManager getTranslationManager();


	/**
	 * Retrieves player manager instance.
	 * @return {@link PlayerManager} instance.
	 */
	@ApiStatus.Internal
	public abstract PlayerManager getPlayerManager();

	/**
	 * Retrieves data manager instance.
	 * @return {@link DataManager} instance.
	 */
	@ApiStatus.Internal
	public abstract DataManager getDataManager();

	/**
	 * Retrieves placeholder manager instance.
	 * @return {@link PlaceholderManager} instance.
	 */
	@ApiStatus.Internal
	public abstract PlaceholderManager getPlaceholderManager();

	/**
	 * Retrieves entity manager instance.
	 * @return {@link EntityManager} instance.
	 */
	@ApiStatus.Internal
	public abstract EntityManager getEntityManager();

	/**
	 * Retrieves entity blueprint manager instance.
	 * @return {@link EntityBlueprintManager} instance.
	 */
	@ApiStatus.Internal
	public abstract EntityBlueprintManager getEntityBlueprintManager();

	/**
	 * Retrieves item manager instance.
	 * @return {@link ItemManager} instance.
	 */
	@ApiStatus.Internal
	public abstract ItemManager getItemManager();

	/**
	 * Retrieves item blueprint manager instance.
	 * @return {@link ItemBlueprintManager} instance.
	 */
	@ApiStatus.Internal
	public abstract ItemBlueprintManager getItemBlueprintManager();

	/**
	 * Retrieves protocol instance.
	 * @return {@link MercuryProtocol} instance.
	 */
	@ApiStatus.Internal
	public abstract MercuryProtocol getProtocol();





	/**
	 * Retrieves instance of the builder factory.
	 * @return {@link MercuryBuilderFactory} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	public static @NotNull MercuryBuilderFactory builders() {
		return getInstance().getBuilderFactory();
	}

	/**
	 * Retrieves translation manager instance.
	 * @return {@link TranslationManager} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static TranslationManager translationManager() {
		return getInstance().getTranslationManager();
	}

	/**
	 * Retrieves player manager instance.
	 * @return {@link PlayerManager} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static PlayerManager playerManager() {
		return getInstance().getPlayerManager();
	}

	/**
	 * Retrieves placeholder manager instance.
	 * @return {@link PlaceholderManager} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static PlaceholderManager placeholderManager() {
		return getInstance().getPlaceholderManager();
	}

	/**
	 * Retrieves entity manager instance.
	 * @return {@link EntityManager} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static EntityManager entityManager() {
		return getInstance().getEntityManager();
	}

	/**
	 * Retrieves entity blueprint manager instance.
	 * @return {@link EntityBlueprintManager} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static EntityBlueprintManager entityBlueprintManager() {
		return getInstance().getEntityBlueprintManager();
	}

	/**
	 * Retrieves item manager instance.
	 * @return {@link ItemManager} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static ItemManager itemManager() {
		return getInstance().getItemManager();
	}

	/**
	 * Retrieves item blueprint manager instance.
	 * @return {@link ItemBlueprintManager} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static ItemBlueprintManager itemBlueprintManager() {
		return getInstance().getItemBlueprintManager();
	}

	/**
	 * Retrieves protocol instance.
	 * @return {@link MercuryProtocol} instance.
	 * @throws IllegalStateException if core instance has not been set.
	 */
	@ApiStatus.Internal
	public static MercuryProtocol protocol() {
		return getInstance().getProtocol();
	}

	/**
	 * Retrieves translation of the specifed player.
	 * @param player to get translation of.
	 * @return {@link MercuryTranslation} instance.
	 */
	public static @NotNull MercuryTranslation getPlayerTranslation(@NotNull MercuryPlayer player) {
		MercuryTranslation translation = translationManager().getTranslation(player.getTranslationId());
		if (translation == null) {
			// This should never be executed. Default translation should be always present. If not server won't start in the first place.
			throw new IllegalStateException("Unable to get translation of player " + player.getName() + " with translation id: " + player.getTranslationId() + "!");
		}
		return translation;
	}

	/**
	 * Spawns an entity in world at specified location
	 * @param mob mob to spawn
	 * @param location location where mob should be spawned
	 */
	public static void spawnEntity(@NotNull MercuryEntity mob, @NotNull Location location) {

	}

	/**
	 * Retrieves mercury player instance from uuid.
	 * @param uuid uuid of the player.
	 * @return {@link MercuryPlayer} instance, or null if player is not online
	 */
	public static @Nullable MercuryPlayer getPlayer(@NotNull UUID uuid) {
		return playerManager().get(uuid);
	}

	/**
	 * Schedules sync task to run after specified delay.
	 * @param delay delay in ticks to wait before running the task.
	 * @param runnable task to run.
	 * @return {@link MercuryTask} instance that has been scheduled.
	 */
	public static @NotNull MercuryTask runDelayed(long delay, @NotNull Runnable runnable) {
		// ToDO figure out how to manage tasks
		throw new NotImplementedException();
	}

	/**
	 * Loads data from database into cache.
	 * @param uuid unique id of data.
	 * @param clazz the class of data to load.
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	public static <T extends DataInstance> void loadData(@NotNull UUID uuid, Class<T> clazz) {
		getInstance().getDataManager().loadData(uuid, clazz);
	}

	/**
	 * Unloads data from cache. DOES NOT SAVE TO DATABASE
	 * @param uuid unique id of data.
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	public static <T extends DataInstance> void unloadData(@NotNull UUID uuid, Class<T> clazz) {
		getInstance().getDataManager().unloadData(uuid, clazz);
	}

	/**
	 * Retrieves data from cache.
	 * @param uuid unique id of data.
	 * @param clazz the class of data to retrieve.
	 * @return {@link T} instance.
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	public static <T extends DataInstance> @NotNull T getData(@NotNull UUID uuid, Class<T> clazz) {
		return getInstance().getDataManager().getData(uuid, clazz);
	}

	/**
	 * Saves data from cache to database. DOES NOT UNLOAD FROM CACHE
	 * @param uuid unique id of data.
	 * @param clazz the class of data to save.
	 * @param <T> the type of data. Must implement {@link DataInstance}
	 */
	public static <T extends DataInstance> void saveData(@NotNull UUID uuid, Class<T> clazz) {
		getInstance().getDataManager().saveData(uuid, clazz);
	}
}
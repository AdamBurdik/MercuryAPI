package me.adamix.mercury.api.data;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface DataManager {
	/**
	 * Registers data holder for specific data type.
	 * @param dataHolder holder instance to register.
	 * @param clazz the class of data to register holder for.
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	<T extends DataInstance> void registerDataHolder(@NotNull DataHolder<T> dataHolder, @NotNull Class<? extends DataInstance> clazz);

	/**
	 * Retrieves data holder.
	 * @param clazz the class of data to retrieve holder for.
	 * @return {@link DataHolder <T>} instance
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	<T extends DataInstance> @Nullable DataHolder<T> getDataHolder(@NotNull Class<T> clazz);

	/**
	 * Loads data from database into cache.
	 * @param uuid unique id of data.
	 * @param clazz the class of data to load.
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	<T extends DataInstance> void loadData(@NotNull UUID uuid, Class<T> clazz);

	/**
	 * Unloads data from cache. DOES NOT SAVE TO DATABASE
	 * @param uuid unique id of data.
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	<T extends DataInstance> void unloadData(@NotNull UUID uuid, Class<T> clazz);

	/**
	 * Retrieves data from cache.
	 * @param uuid unique id of data.
	 * @param clazz the class of data to retrieve.
	 * @return {@link T} instance.
	 * @param <T> the type of data. Must implement {@link DataInstance}.
	 */
	<T extends DataInstance> @NotNull T getData(@NotNull UUID uuid, Class<T> clazz);

	/**
	 * Saves data from cache to database. DOES NOT UNLOAD FROM CACHE
	 * @param uuid unique id of data.
	 * @param clazz the class of data to save.
	 * @param <T> the type of data. Must implement {@link DataInstance}
	 */
	<T extends DataInstance> void saveData(@NotNull UUID uuid, Class<T> clazz);

	/**
	 * Closes database connection.
	 */
	@ApiStatus.Internal
	void close();
}

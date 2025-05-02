package me.adamix.mercury.api.data;

import org.dizitart.no2.collection.NitriteCollection;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a database abstraction used within Mercury for accessing and managing data collections.
 */
public interface MercuryDatabase {

	/**
	 * Retrieves a collection from the database by its identifier.
	 *
	 * @param id the unique identifier of the collection
	 * @return the {@link NitriteCollection} associated with the given ID
	 */
	NitriteCollection getCollection(@NotNull String id);

	/**
	 * Closes the database connection and releases any held resources.
	 */
	void close();
}

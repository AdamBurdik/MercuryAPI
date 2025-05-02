package me.adamix.mercury.api.task;

public interface MercuryTask {
	/**
	 * Retrieves if this task is queued.<br> Same as {@link org.bukkit.scheduler.BukkitScheduler#isQueued(int)}
	 *
	 * @return bool, if this task is queued.
	 */
	boolean isQueued();

	/**
	 * Retrieves if this task is running.<br> Same as {@link org.bukkit.scheduler.BukkitScheduler#isCurrentlyRunning(int)}
	 *
	 * @return bool, if this task is currently running.
	 */
	boolean isCurrentlyRunning();

	/**
	 * Cancels this task.<br> Same as {@link org.bukkit.scheduler.BukkitScheduler#cancelTask(int)}
	 */
	void cancel();
}

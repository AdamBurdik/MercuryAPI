package me.adamix.mercury.api.data;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface DataInstance {
	@NotNull Map<String, Object> serialize();
}

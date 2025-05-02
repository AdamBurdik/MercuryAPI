package me.adamix.mercury.api.attribute;

import net.kyori.adventure.key.Key;
import org.bukkit.attribute.AttributeModifier;
import org.jetbrains.annotations.NotNull;

public interface MercuryAttributeModifier {
	@NotNull Key key();

	double value();

	@NotNull Operation operation();

	@NotNull AttributeModifier toBukkit();

	enum Operation {
		ADD_VALUE(AttributeModifier.Operation.ADD_NUMBER),
		MULTIPLY_BASE(AttributeModifier.Operation.ADD_SCALAR),
		MULTIPLY_TOTAL(AttributeModifier.Operation.MULTIPLY_SCALAR_1);

		private final AttributeModifier.Operation bukkitOperation;

		public AttributeModifier.Operation bukkitOperation() {
			return this.bukkitOperation;
		}

		Operation(AttributeModifier.Operation bukkitOperation) {
			this.bukkitOperation = bukkitOperation;
		}
	}
}

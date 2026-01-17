/*
 * Copyright (c) MoriyaShiine. All Rights Reserved.
 */
package moriyashiine.enchancement.common.component.entity;

import dev.onyxstudios.cca.api.v3.component.tick.ServerTickingComponent;

public class InCombatComponent implements ServerTickingComponent {
	private int combatTicks = 0;

	@Override
	public void readData(ReadView readView) {
		combatTicks = readView.getInt("CombatTicks", 0);
	}

	@Override
	public void writeData(WriteView writeView) {
		writeView.putInt("CombatTicks", combatTicks);
	}

	@Override
	public void serverTick() {
		if (combatTicks > 0) {
			combatTicks--;
		}
	}

	public boolean inCombat() {
		return combatTicks > 0;
	}

	public void setInCombat() {
		combatTicks = 320;
	}
}

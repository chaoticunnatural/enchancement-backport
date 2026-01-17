/*
 * Copyright (c) MoriyaShiine. All Rights Reserved.
 */
package moriyashiine.enchancement.common.component.entity;

import dev.onyxstudios.cca.api.v3.component.Component;

public class SafeLightningComponent implements Component {
	private boolean safe = false;

	@Override
	public void readData(ReadView readView) {
		safe = readView.getBoolean("Safe", false);
	}

	@Override
	public void writeData(WriteView writeView) {
		writeView.putBoolean("Safe", safe);
	}

	public boolean isSafe() {
		return safe;
	}

	public void setSafe(boolean safe) {
		this.safe = safe;
	}
}

/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.mail.gui;

import net.minecraft.entity.player.InventoryPlayer;

import forestry.core.gui.ContainerTile;
import forestry.core.gui.slots.SlotFiltered;
import forestry.core.gui.slots.SlotOutput;
import forestry.mail.tiles.TilePhilatelist;

public class ContainerPhilatelist extends ContainerTile<TilePhilatelist> {

	public ContainerPhilatelist(InventoryPlayer player, TilePhilatelist tile) {
		super(tile, player, 8, 111);

		// Filter
		addSlotToContainer(new SlotFiltered(tile, TilePhilatelist.SLOT_FILTER, 80, 19));

		// Collected Stamps
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				addSlotToContainer(new SlotOutput(tile, j + i * 9 + TilePhilatelist.SLOT_BUFFER_1, 8 + j * 18, 46 + i * 18));
			}
		}
	}
}

package com.dream.dreammod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DreamTab extends CreativeTabs {

	public DreamTab(int index, String label) {
		super(index, label);
	}

	
	@Override
	public Item getTabIconItem() {
		
		return Items.ENDER_EYE;
	}
}

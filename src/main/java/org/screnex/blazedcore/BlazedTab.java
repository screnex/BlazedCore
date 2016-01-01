package org.screnex.blazedcore;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlazedTab extends CreativeTabs {
	ItemStack icon;
	public BlazedTab(String lable) {
		super(lable);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return icon.getItem();
	}
	
	public void init(ItemStack stack) {
		icon = stack;
	}
	


	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return icon;
	}
}

package org.screnex.blazedcore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class BlazedAxe extends ItemAxe {
	/**
	 * @param material - Tool mat
	 * @param name - Pick unlocalised name
	 * @param texture - Pick texture
	 * @param tab - Pick creative tab
	 * @param id - GameRegistry Id
	 */
	public BlazedAxe(ToolMaterial material, String name, String texture, CreativeTabs tab, String id) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, id);
	}
	
	/**
	 * @param material - Tool mat
	 * @param name - Pick unlocalised name
	 * @param texture - Pick texture
	 * @param tab - Pick creative tab
	 */
	public BlazedAxe(ToolMaterial material, String name, String texture, CreativeTabs tab) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
	}
}

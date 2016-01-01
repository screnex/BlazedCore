package org.screnex.blazedcore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class BlazedSpade extends ItemSpade {
	/**
	 * @param material - Tool mat
	 * @param name - Pick unlocalised name
	 * @param texture - Pick texture
	 * @param tab - Pick creative tab
	 * @param id - GameRegistry Id
	 */
	public BlazedSpade(ToolMaterial material, String name, String texture, CreativeTabs tab, String id) {
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
	public BlazedSpade(ToolMaterial material, String name, String texture, CreativeTabs tab) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
	}
}

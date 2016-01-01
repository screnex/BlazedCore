package org.screnex.blazedcore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlazedItem extends Item {
	private EnumRarity rarity = EnumRarity.common;
	
	/**
	 * @param name - Unlocalised name
	 * @param texture - Texture name
	 * @param tab - Creative tab
	 * @param id - GameRegistry Id
	 */
	public BlazedItem(String name, String texture, CreativeTabs tab, String id) {
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, id);
	}
	
	/**
	 * @param name - Unlocalised name
	 * @param texture - Texture name
	 * @param tab - Creative tab
	 */
	public BlazedItem(String name, String texture, CreativeTabs tab) {
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
	}
	
	/**
	 * @param name - Unlocalised name
	 * @param texture - Texture name
	 * @param tab - Creative tab
	 * @param rarity - Rarity
	 * @param id - GameRegistry Id
	 */
	public BlazedItem(String name, String texture, CreativeTabs tab, EnumRarity rarity, String id) {
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		this.rarity = rarity;
		GameRegistry.registerItem(this, id);
	}
	
	/**
	 * @param name - Unlocalised name
	 * @param texture - Texture name
	 * @param tab - Creative tab
	 * @param rarity - Item rarity
	 */
	public BlazedItem(String name, String texture, CreativeTabs tab, EnumRarity rarity) {
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		this.rarity = rarity;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return rarity;
	}
}

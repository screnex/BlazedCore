package org.screnex.blazedcore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BlazedLeggings extends ItemArmor {
	private String model;

	/**
	 * @param material - Armor mat
	 * @param name - Helmet unlocalized name
	 * @param texture - Helmet texture
	 * @param model - Armor model l.1
	 * @param tab - Helmet tab
	 * @param id - GameRegistry id
	 */
	public BlazedLeggings(ArmorMaterial material, String name, String texture, String model, CreativeTabs tab, String id) {
		super(material, 0, 2);
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		this.model = model;
		GameRegistry.registerItem(this, id);
	}

	/**
	 * @param material - Armor mat
	 * @param name - Helmet unlocalized name
	 * @param texture - Helmet texture
	 * @param model - Armor model l.1
	 * @param tab - Helmet tab
	 */
	public BlazedLeggings(ArmorMaterial material, String name, String texture, String model, CreativeTabs tab) {
		super(material, 0, 2);
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		this.model = model;
	}
	
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
		return model;
	}
}

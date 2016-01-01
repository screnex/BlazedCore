package org.screnex.blazedcore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class BlazedKatana extends ItemSword {
	private float damageVsEntity;
	
	/**
	 * @param material - Tool mat
	 * @param name - Pick unlocalised name
	 * @param texture - Pick texture
	 * @param tab - Pick creative tab
	 * @param id - GameRegistry Id
	 */
	public BlazedKatana(ToolMaterial material, String name, String texture, CreativeTabs tab, String id) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		this.damageVsEntity = material.getDamageVsEntity() + 3F;
		GameRegistry.registerItem(this, id);
	}
	
	/**
	 * @param material - Tool mat
	 * @param name - Pick unlocalised name
	 * @param texture - Pick texture
	 * @param tab - Pick creative tab
	 */
	public BlazedKatana(ToolMaterial material, String name, String texture, CreativeTabs tab) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(texture);
		this.setCreativeTab(tab);
		this.damageVsEntity = material.getDamageVsEntity() + 3F;
	}
	
	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		return (int)((3 * super.getDurabilityForDisplay(stack)) / 4);
	}
	
	@Override
	public int getMaxDamage() {
		return (int)((3 * super.getMaxDamage()) / 4);
	}
	
	@Override
	public int getItemEnchantability() {
		return (int)(super.getItemEnchantability() * 1.5);
	}
	
	public float getKnockBack(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase attacker) {
		return 0.2F;
	}
}

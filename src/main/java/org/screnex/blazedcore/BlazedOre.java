package org.screnex.blazedcore;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlazedOre extends BlazedBlock {
	private Item drop;
	private int number;
	
	public BlazedOre(Material material) {
		super(material);
	}
	
	/**
	 * @param material - Ore material
	 * @param name - Unlocalised name
	 * @param texture - Ore texture name
	 * @param tab - Creative tab
	 * @param tool - Tool type
	 * @param harvestlevel - Harvest level
	 * @param hardness - Block hardness
	 * @param id - GR id
	 */
	public BlazedOre(Material material, String name, String texture, CreativeTabs tab, String tool, int harvestlevel, float hardness, String id) {
		this(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setHarvestLevel(tool, harvestlevel);
		this.setLightLevel(0F);
		this.setResistance(7.5F);
		GameRegistry.registerBlock(this, id);
	}
	
	/**
	 * @param material - Ore material
	 * @param name - Unlocalised name
	 * @param texture - Ore texture name
	 * @param tab - Creative tab
	 * @param tool - Tool type
	 * @param harvestlevel - Harvest level
	 * @param hardness - Block hardness
	 */
	public BlazedOre(Material material, String name, String texture, CreativeTabs tab, String tool, int harvestlevel, float hardness) {
		this(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setHarvestLevel(tool, harvestlevel);
		this.setLightLevel(0F);
		this.setResistance(7.5F);
	}
	
	/**
	 * @param material - Ore material
	 * @param name - Unlocalised name
	 * @param texture - Ore texture name
	 * @param tab - Creative tab
	 * @param tool - Tool type
	 * @param harvestlevel - Harvest level
	 * @param hardness - Block hardness
	 * @param id - GR id
	 */
	public BlazedOre(Material material, String name, String texture, CreativeTabs tab, String tool, int harvestlevel, float hardness, Item drop, String id) {
		this(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setHarvestLevel(tool, harvestlevel);
		this.setLightLevel(0F);
		this.setResistance(7.5F);
		this.drop = drop;
		GameRegistry.registerBlock(this, id);
	}
	
	/**
	 * @param material - Ore material
	 * @param name - Unlocalised name
	 * @param texture - Ore texture name
	 * @param tab - Creative tab
	 * @param tool - Tool type
	 * @param harvestlevel - Harvest level
	 * @param hardness - Block hardness
	 */
	public BlazedOre(Material material, String name, String texture, CreativeTabs tab, String tool, int harvestlevel, float hardness, Item drop) {
		this(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setHarvestLevel(tool, harvestlevel);
		this.setLightLevel(0F);
		this.setResistance(7.5F);
		this.drop = drop;
	}
	
	/**
	 * @param material - Ore material
	 * @param name - Unlocalised name
	 * @param texture - Ore texture name
	 * @param tab - Creative tab
	 * @param tool - Tool type
	 * @param harvestlevel - Harvest level
	 * @param hardness - Block hardness
	 * @param id - GR id
	 */
	public BlazedOre(Material material, String name, String texture, CreativeTabs tab, String tool, int harvestlevel, float hardness, Item drop, int number, String id) {
		this(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setHarvestLevel(tool, harvestlevel);
		this.setLightLevel(0F);
		this.setResistance(7.5F);
		this.drop = drop;
		this.number = number;
		GameRegistry.registerBlock(this, id);
	}
	
	/**
	 * @param material - Ore material
	 * @param name - Unlocalised name
	 * @param texture - Ore texture name
	 * @param tab - Creative tab
	 * @param tool - Tool type
	 * @param harvestlevel - Harvest level
	 * @param hardness - Block hardness
	 */
	public BlazedOre(Material material, String name, String texture, CreativeTabs tab, String tool, int harvestlevel, float hardness, Item drop, int number) {
		this(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setHarvestLevel(tool, harvestlevel);
		this.setLightLevel(0F);
		this.setResistance(7.5F);
		this.drop = drop;
		this.number = number;
	}
	
	@Override
	public Item getItemDropped(int i, Random random, int j) {
		if (drop != null) return drop;
		else return Item.getItemFromBlock(this);
	}
	
	@Override
    public int quantityDropped(Random par1Random) {
		if (number > 1) return number;
        else return 1;
    }
	
	public int quantityDroppedWithBonus(int par1, Random par2Random) {
        if ((par1 > 0) && (Item.getItemFromBlock(this) != this.getItemDropped(0, par2Random, par1))) {
            int var3 = par2Random.nextInt(par1 + 2) - 1;
            if (var3 < 0) var3 = 0;
            return this.quantityDropped(par2Random) * (var3 + 1);
        }
        else return this.quantityDropped(par2Random);
    }
	
	@Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
        if (this.getItemDropped(par5, par1World.rand, par7) != Item.getItemFromBlock(this)) {
        	int var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 16, 33);
            this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
        }
    }
}

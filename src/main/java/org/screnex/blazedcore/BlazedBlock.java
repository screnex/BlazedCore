package org.screnex.blazedcore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlazedBlock extends Block {
	/**
	 * @param material - Block Material
	 * @param name - Block Unlocalised name
	 * @param texture - Block Texture name
	 * @param hardness - Block Hardness
	 * @param resistance - Block Blast resistance
	 * @param lightlevel - Block Lightlevel
	 * @param tool - Required tool
	 * @param HarvLevel - Required Tool tier to harvest block
	 * @param tab - Creative Tab
	 * @param id - GameRegistry id
	 */
	public BlazedBlock(Material material, String name, String texture, float hardness, float resistance, float lightlevel, String tool, int HarvLevel, CreativeTabs tab, String id) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightlevel);
		this.setHarvestLevel(tool, HarvLevel);
		this.setCreativeTab(tab);
		GameRegistry.registerBlock(this, id);
	}
	
	/**
	 * @param material - Block Material
	 * @param name - Block Unlocalised name
	 * @param texture - Block Texture name
	 * @param hardness - Block Hardness
	 * @param resistance - Block Blast resistance
	 * @param lightlevel - Block Lightlevel
	 * @param tool - Required tool
	 * @param HarvLevel - Required Tool tier to harvest block
	 * @param tab - Creative Tab
	 */
	public BlazedBlock(Material material, String name, String texture, float hardness, float resistance, float lightlevel, String tool, int HarvLevel, CreativeTabs tab) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(texture);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightlevel);
		this.setHarvestLevel(tool, HarvLevel);
		this.setCreativeTab(tab);
	}
	
	public BlazedBlock(Material material) {
		super(material);
	}
}

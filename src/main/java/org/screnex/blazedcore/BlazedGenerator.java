package org.screnex.blazedcore;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BlazedGenerator implements IWorldGenerator {
	private int[] dimensions;
	private Block what;
	private Block where;
	private int maxY, minY, vpc, opv;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		for (int i = 0; i < dimensions.length; i++) {
			int dimID = dimensions[i];
			if (world.provider.dimensionId == dimID) {
				for (int j = 0; j < this.vpc; j++) {
					int X = chunkX*16 + random.nextInt(16);
					int Y = this.minY + random.nextInt(this.maxY - this.minY);
					int Z = chunkZ*16 + random.nextInt(16);
					(new WorldGenMinable(this.what, 1, this.opv, this.where)).generate(world, random, X, Y, Z);
				}
			}
		}
	}
	
	/**
	 * @param block - Generating block
	 * @param block2 - Block changing to generating
	 * @param dimensions - Array of dimension ids where generator works
	 * @param maxY - Maximum available Y
	 * @param minY - Minimum available Y
	 * @param vpc - Veins per chunk
	 * @param opv - Ore blocks per vein
	 */
	public BlazedGenerator(Block block, Block block2, int[] dimensions, int maxY, int minY, int vpc, int opv) {
		this.dimensions = dimensions;
		this.what = block;
		this.where = block2;
		this.maxY = maxY;
		this.minY = minY;
		this.vpc = vpc;
		this.opv = opv;
	}
}

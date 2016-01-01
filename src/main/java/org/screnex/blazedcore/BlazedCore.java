package org.screnex.blazedcore;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cpw.mods.fml.common.Mod;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

@Mod(modid="BlazedCore", name="BlazedCore", version=BlazedCore.version)
public class BlazedCore {
	protected static final String version = "1.0b1";
	@Mod.Instance("BlazedCore")
	public static BlazedCore instance;
	
	/*public static void removeRecipe(ItemStack result) {
		List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
		List<IRecipe> recipeListCopy = copyList(recipeList);
		recipeListCopy.stream().filter(recipe -> ItemStack.areItemStacksEqual(result, recipe.getRecipeOutput())).forEach(recipeList::remove);
	}
	
	public static <T> List<T> copyList(List<T> list) {
		try {
			Constructor constructor = list.getClass().getConstructor(Collection.class);
			return (List<T>) constructor.newInstance(list);
		} catch (Exception exception) {
			return new ArrayList<>(list);
		}
	}*/
}

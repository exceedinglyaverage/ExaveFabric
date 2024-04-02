package net.exave.exavecraft.datagen;

import net.exave.exavecraft.blocks.ModBlocks;
import net.exave.exavecraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TIN_INGOT, RecipeCategory.MISC, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_TIN, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE), RecipeCategory.MISC, ModItems.TIN_INGOT,
                0.25f, 200, "tin");
        offerBlasting(exporter, List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE), RecipeCategory.MISC, ModItems.TIN_INGOT,
                0.25f, 200, "tin");

    }
}

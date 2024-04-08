package net.exave.exavecraft.datagen;

import net.exave.exavecraft.blocks.ModBlocks;
import net.exave.exavecraft.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ModTags.Blocks.HAMMER_MINEABLE).add(Blocks.STONE,
                Blocks.GRANITE,
                Blocks.POLISHED_GRANITE,
                Blocks.DIORITE,
                Blocks.POLISHED_DIORITE,
                Blocks.ANDESITE,
                Blocks.POLISHED_ANDESITE,
                Blocks.COBBLESTONE,
                Blocks.SANDSTONE,
                Blocks.CHISELED_SANDSTONE,
                Blocks.CUT_SANDSTONE,
                Blocks.MOSSY_COBBLESTONE,
                Blocks.OBSIDIAN,
                Blocks.NETHERRACK,
                Blocks.BASALT,
                Blocks.POLISHED_BASALT,
                Blocks.STONE_BRICKS,
                Blocks.CRACKED_STONE_BRICKS,
                Blocks.CHISELED_STONE_BRICKS,
                Blocks.NETHER_BRICKS,
                Blocks.TERRACOTTA,
                Blocks.WHITE_TERRACOTTA,
                Blocks.ORANGE_TERRACOTTA,
                Blocks.MAGENTA_TERRACOTTA,
                Blocks.LIGHT_BLUE_TERRACOTTA,
                Blocks.LIME_TERRACOTTA,
                Blocks.PINK_TERRACOTTA,
                Blocks.GRAY_TERRACOTTA,
                Blocks.LIGHT_GRAY_TERRACOTTA,
                Blocks.CYAN_TERRACOTTA,
                Blocks.PURPLE_TERRACOTTA,
                Blocks.BLUE_TERRACOTTA,
                Blocks.BROWN_TERRACOTTA,
                Blocks.GREEN_TERRACOTTA,
                Blocks.RED_TERRACOTTA,
                Blocks.BLACK_TERRACOTTA,
                Blocks.PRISMARINE,
                Blocks.PRISMARINE_BRICKS,
                Blocks.DARK_PRISMARINE,
                Blocks.RED_SANDSTONE,
                Blocks.CHISELED_RED_SANDSTONE,
                Blocks.CUT_RED_SANDSTONE,
                Blocks.END_STONE,
                Blocks.END_STONE_BRICKS,
                Blocks.BLACKSTONE,
                Blocks.CHISELED_POLISHED_BLACKSTONE,
                Blocks.POLISHED_BLACKSTONE,
                Blocks.TUFF,
                Blocks.CALCITE,
                Blocks.DRIPSTONE_BLOCK,
                Blocks.DEEPSLATE,
                Blocks.COBBLED_DEEPSLATE,
                Blocks.DEEPSLATE_BRICKS,
                Blocks.POLISHED_DEEPSLATE,
                Blocks.DEEPSLATE_TILES,
                Blocks.SMOOTH_BASALT,
                Blocks.ICE,
                Blocks.PACKED_ICE,
                Blocks.BLUE_ICE,
                Blocks.MUD_BRICKS,
                Blocks.PACKED_MUD
        );

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_TIN_BLOCK,
                        ModBlocks.TIN_BLOCK,
                        ModBlocks.TIN_ORE,
                        ModBlocks.DEEPSLATE_TIN_ORE,
                        ModBlocks.REGEN_COAL_ORE,
                        ModBlocks.REGEN_DEEPSLATE_COAL_ORE,
                        ModBlocks.REGEN_IRON_ORE,
                        ModBlocks.REGEN_DEEPSLATE_IRON_ORE,
                        ModBlocks.REGEN_COPPER_ORE,
                        ModBlocks.REGEN_DEEPSLATE_COPPER_ORE,
                        ModBlocks.REGEN_GOLD_ORE,
                        ModBlocks.REGEN_DEEPSLATE_GOLD_ORE,
                        ModBlocks.REGEN_REDSTONE_ORE,
                        ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE,
                        ModBlocks.REGEN_EMERALD_ORE,
                        ModBlocks.REGEN_DEEPSLATE_EMEARLD_ORE,
                        ModBlocks.REGEN_LAPIS_ORE,
                        ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE,
                        ModBlocks.REGEN_DIAMOND_ORE,
                        ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE,
                        ModBlocks.REGEN_NETHER_QUARTZ_ORE,
                        ModBlocks.REGEN_NETHER_GOLD_ORE,
                        ModBlocks.REGEN_TIN_ORE,
                        ModBlocks.REGEN_DEEPSLATE_TIN_ORE


                );

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RAW_TIN_BLOCK,
                        ModBlocks.TIN_BLOCK,
                        ModBlocks.TIN_ORE,
                        ModBlocks.REGEN_IRON_ORE,
                        ModBlocks.REGEN_DEEPSLATE_IRON_ORE,
                        ModBlocks.REGEN_COPPER_ORE,
                        ModBlocks.REGEN_DEEPSLATE_COPPER_ORE,
                        ModBlocks.REGEN_TIN_ORE,
                        ModBlocks.REGEN_DEEPSLATE_TIN_ORE,
                        ModBlocks.REGEN_LAPIS_ORE,
                        ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE
                        );
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.REGEN_REDSTONE_ORE,
                        ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE,
                        ModBlocks.REGEN_EMERALD_ORE,
                        ModBlocks.REGEN_DEEPSLATE_EMEARLD_ORE,
                        ModBlocks.REGEN_DIAMOND_ORE,
                        ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE,
                        ModBlocks.REGEN_GOLD_ORE,
                        ModBlocks.REGEN_DEEPSLATE_GOLD_ORE
                );


    }
}

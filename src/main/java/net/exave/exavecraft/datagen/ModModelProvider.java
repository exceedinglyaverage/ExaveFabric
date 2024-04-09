package net.exave.exavecraft.datagen;

import net.exave.exavecraft.blocks.ModBlocks;
import net.exave.exavecraft.blocks.crops.MedicalHerbCropBlock;
import net.exave.exavecraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TIN_ORE);

        blockStateModelGenerator.registerCrop(ModBlocks.MEDICAL_HERB_CROP, MedicalHerbCropBlock.AGE, 0, 1, 2, 3, 4, 5);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BRONZE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BRONZE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BRONZE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BRONZE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BRONZE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_BOOTS));


        itemModelGenerator.register(ModItems.MEDICAL_HERB, Models.GENERATED);
        itemModelGenerator.register(ModItems.BASIC_BANDAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUALITY_BANDAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEDICATED_BANDAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERGENCY_BANDAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_COIN, Models.GENERATED);


    }
}

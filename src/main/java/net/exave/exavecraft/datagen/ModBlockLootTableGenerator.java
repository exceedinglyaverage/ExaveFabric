package net.exave.exavecraft.datagen;



import net.exave.exavecraft.blocks.ModBlocks;
import net.exave.exavecraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {

    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.REDSTONE_PEDESTAL);


        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE, oreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.MEDICAL_HERB_CROP).properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 5));
        this.addDrop(ModBlocks.MEDICAL_HERB_CROP, this.cropDrops(ModBlocks.MEDICAL_HERB_CROP, ModItems.MEDICAL_HERB, ModItems.MEDICAL_HERB_SEEDS, builder2));


    }
}

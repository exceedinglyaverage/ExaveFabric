package net.exave.exavecraft.items;

import net.exave.exavecraft.ExaveCraft;
import net.exave.exavecraft.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    public static final ItemGroup EXAVE_CRAFT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ExaveCraft.MOD_ID, "exavecraft_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("exavecraft_item_group"))
                    .icon(() -> new ItemStack(ModItems.RAW_TIN)).entries((displayContext, entries) -> {




                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.STEEL_BLOCK);

                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);



                        entries.add(ModBlocks.REDSTONE_PEDESTAL);



                        entries.add(ModBlocks.WILD_WHEAT);
                        entries.add(ModBlocks.WILD_POTATO);
                        entries.add(ModBlocks.WILD_CARROT);
                        entries.add(ModBlocks.WILD_BEETROOT);

                        entries.add(ModBlocks.WILD_MEDICAL_HERB);
                        entries.add(ModItems.MEDICAL_HERB_SEEDS);
                        entries.add(ModItems.MEDICAL_HERB);


                        entries.add(ModItems.WOODEN_HAMMER);
                        entries.add(ModItems.STONE_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.GOLDEN_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);

                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_HOE);
                        entries.add(ModItems.BRONZE_HAMMER);

                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_HAMMER);

                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);

                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                        entries.add(ModItems.BASIC_BANDAGE);
                        entries.add(ModItems.QUALITY_BANDAGE);
                        entries.add(ModItems.MEDICATED_BANDAGE);
                        entries.add(ModItems.EMERGENCY_BANDAGE);





                    }).build());

    public static void registerItemGroups(){

    }
}

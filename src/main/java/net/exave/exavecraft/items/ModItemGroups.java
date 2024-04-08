package net.exave.exavecraft.items;

import net.exave.exavecraft.ExaveCraft;
import net.exave.exavecraft.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
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


                       // entries.add(ModBlocks.REGEN_COAL_ORE);
                       // entries.add(ModBlocks.REGEN_DEEPSLATE_COAL_ORE);
                       // entries.add(ModBlocks.REGEN_IRON_ORE);
                       // entries.add(ModBlocks.REGEN_DEEPSLATE_IRON_ORE);
                       // entries.add(ModBlocks.REGEN_COPPER_ORE);
                      //  entries.add(ModBlocks.REGEN_DEEPSLATE_COPPER_ORE);
                      //  entries.add(ModBlocks.REGEN_GOLD_ORE);
                       // entries.add(ModBlocks.REGEN_DEEPSLATE_GOLD_ORE);
                       // entries.add(ModBlocks.REGEN_REDSTONE_ORE);
                       // entries.add(ModBlocks.REGEN_DEEPSLATE_REDSTONE_ORE);
                      //  entries.add(ModBlocks.REGEN_EMERALD_ORE);
                      //  entries.add(ModBlocks.REGEN_DEEPSLATE_EMEARLD_ORE);
                      //  entries.add(ModBlocks.REGEN_LAPIS_ORE);
                       // entries.add(ModBlocks.REGEN_DEEPSLATE_LAPIS_ORE);
                       // entries.add(ModBlocks.REGEN_DIAMOND_ORE);
                      //  entries.add(ModBlocks.REGEN_DEEPSLATE_DIAMOND_ORE);
                      //  entries.add(ModBlocks.REGEN_NETHER_GOLD_ORE);
                       // entries.add(ModBlocks.REGEN_NETHER_QUARTZ_ORE);
                      //  entries.add(ModBlocks.REGEN_TIN_ORE);
                       // entries.add(ModBlocks.REGEN_DEEPSLATE_TIN_ORE);


                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.STEEL_INGOT);


                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);

                        entries.add(ModBlocks.REDSTONE_PEDESTAL);


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


                        entries.add(ModItems.IRON_COIN);
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.DIAMOND_COIN);
                        entries.add(ModItems.NETHERITE_COIN);


                    }).build());

    public static void registerItemGroups(){

    }
}

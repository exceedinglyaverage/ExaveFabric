package net.exave.exavecraft.items;

import net.exave.exavecraft.ExaveCraft;
import net.exave.exavecraft.blocks.ModBlocks;
import net.exave.exavecraft.items.healing.BandageItem;
import net.exave.exavecraft.items.tools.HammerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    //ingots and raw
    public static Item RAW_TIN= registerItem("raw_tin",
            new Item(new FabricItemSettings()));
    public static Item TIN_INGOT= registerItem("tin_ingot",
            new Item(new FabricItemSettings()));
    public static Item BRONZE_INGOT= registerItem("bronze_ingot",
            new Item(new FabricItemSettings()));
    public static Item STEEL_INGOT= registerItem("steel_ingot",
            new Item(new FabricItemSettings()));

    //tools
    public static Item WOODEN_HAMMER= registerItem("wooden_hammer",
            new HammerItem(ModToolMaterial.WOOD_HEAVY, 5, -3.2f, new FabricItemSettings()));
    public static Item STONE_HAMMER= registerItem("stone_hammer",
            new HammerItem(ModToolMaterial.STEEL_HEAVY, 6, -3.2f, new FabricItemSettings()));
    public static Item GOLDEN_HAMMER= registerItem("golden_hammer",
            new HammerItem(ModToolMaterial.GOLD_HEAVY, 5, -3, new FabricItemSettings()));
    public static Item IRON_HAMMER= registerItem("iron_hammer",
            new HammerItem(ModToolMaterial.IRON_HEAVY, 5, -3.1f, new FabricItemSettings()));
    public static Item DIAMOND_HAMMER= registerItem("diamond_hammer",
            new HammerItem(ModToolMaterial.DIAMOND_HEAVY, 4, -3, new FabricItemSettings()));
    public static Item NETHERITE_HAMMER= registerItem("netherite_hammer",
            new HammerItem(ModToolMaterial.NETHERITE_HEAVY, 5, -3, new FabricItemSettings().fireproof()));
    public static Item BRONZE_SWORD= registerItem("bronze_sword",
            new SwordItem(ModToolMaterial.BRONZE, 3, -2.4f, new FabricItemSettings()));
    public static Item BRONZE_PICKAXE= registerItem("bronze_pickaxe",
            new PickaxeItem(ModToolMaterial.BRONZE, 1, -2.8f, new FabricItemSettings()));
    public static Item BRONZE_SHOVEL= registerItem("bronze_shovel",
            new ShovelItem(ModToolMaterial.BRONZE, 1.5f, -3f, new FabricItemSettings()));
    public static Item BRONZE_AXE= registerItem("bronze_axe",
            new AxeItem(ModToolMaterial.BRONZE, 6, -3.1f, new FabricItemSettings()));
    public static Item BRONZE_HOE= registerItem("bronze_hoe",
            new HoeItem(ModToolMaterial.BRONZE, -2, -1, new FabricItemSettings()));

    public static Item BRONZE_HAMMER= registerItem("bronze_hammer",
            new AxeItem(ModToolMaterial.BRONZE_HEAVY, 5, -3.1f, new FabricItemSettings()));
    public static Item STEEL_SWORD= registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static Item STEEL_PICKAXE= registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static Item STEEL_SHOVEL= registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 1.5f, -3f, new FabricItemSettings()));
    public static Item STEEL_AXE= registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 5, -3, new FabricItemSettings()));
    public static Item STEEL_HOE= registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, -3, 0, new FabricItemSettings()));
    public static Item STEEL_HAMMER= registerItem("steel_hammer",
            new AxeItem(ModToolMaterial.STEEL_HEAVY, 4, -3, new FabricItemSettings().maxDamage(500)));


    //food

    public static Item MEDICAL_HERB= registerItem("medical_herb",
            new Item(new FabricItemSettings().food(ModFoodComponents.MEDICAL_HERB)));
     //healing
     public static Item BASIC_BANDAGE= registerItem("basic_bandage",
             new BandageItem(new FabricItemSettings().maxCount(8),5, 60));
    public static Item QUALITY_BANDAGE= registerItem("quality_bandage",
            new BandageItem(new FabricItemSettings().maxCount(4),10, 90));
    public static Item MEDICATED_BANDAGE= registerItem("medicated_bandage",
            new BandageItem(new FabricItemSettings().maxCount(2),15, 120));
    public static Item EMERGENCY_BANDAGE= registerItem("emergency_bandage",
            new BandageItem(new FabricItemSettings().maxCount(1),20, 135));
    //coins
    public static Item IRON_COIN= registerItem("iron_coin",
            new Item(new FabricItemSettings()));
    public static Item COPPER_COIN= registerItem("copper_coin",
            new Item(new FabricItemSettings()));
    public static Item GOLD_COIN= registerItem("gold_coin",
            new Item(new FabricItemSettings()));
    public static Item DIAMOND_COIN= registerItem("diamond_coin",
            new Item(new FabricItemSettings()));
    public static Item NETHERITE_COIN= registerItem("netherite_coin",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExaveCraft.MOD_ID, name), item);
    }
    public static void registerModItems(){
        ExaveCraft.LOGGER.info("Registering Mod Items for " + ExaveCraft.MOD_ID);

    }
}

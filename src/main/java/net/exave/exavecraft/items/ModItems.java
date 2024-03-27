package net.exave.exavecraft.items;

import net.exave.exavecraft.ExaveCraft;
import net.exave.exavecraft.blocks.ModBlocks;
import net.exave.exavecraft.items.healing.BandageItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    //ingots and raw
    public static Item RAW_TIN= registerItem("raw_tin",
            new Item(new FabricItemSettings()));
    public static Item TIN_INGOT= registerItem("tin_ingot",
            new Item(new FabricItemSettings()));
     //healing
     public static Item BASIC_BANDAGE= registerItem("basic_bandage",
             new BandageItem(new FabricItemSettings().maxCount(8),5, 30));
    public static Item QUALITY_BANDAGE= registerItem("quality_bandage",
            new BandageItem(new FabricItemSettings().maxCount(4),10, 45));
    public static Item MEDICATED_BANDAGE= registerItem("medicated_bandage",
            new BandageItem(new FabricItemSettings().maxCount(2),15, 60));
    public static Item EMERGENCY_BANDAGE= registerItem("emergency_bandage",
            new BandageItem(new FabricItemSettings().maxCount(1),20, 75));
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

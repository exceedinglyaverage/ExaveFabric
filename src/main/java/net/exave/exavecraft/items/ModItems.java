package net.exave.exavecraft.items;

import net.exave.exavecraft.ExaveCraft;
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

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(RAW_TIN);
        entries.add(TIN_INGOT);
        entries.add(IRON_COIN);
        entries.add(COPPER_COIN);
        entries.add(GOLD_COIN);
        entries.add(DIAMOND_COIN);
        entries.add(NETHERITE_COIN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExaveCraft.MOD_ID, name), item);
    }
    public static void registerModItems(){
        ExaveCraft.LOGGER.info("Registering Mod Items for " + ExaveCraft.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}

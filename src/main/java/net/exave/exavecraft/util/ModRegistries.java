package net.exave.exavecraft.util;

import net.exave.exavecraft.items.ModItems;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {
    public static void registerModStuffs(){
        registerModCompostables();

    }

    private static void registerModCompostables() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.MEDICAL_HERB, 0.70f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.MEDICAL_HERB_SEEDS, 0.40f);
    }
}

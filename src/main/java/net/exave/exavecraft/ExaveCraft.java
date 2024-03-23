package net.exave.exavecraft;

import net.exave.exavecraft.blocks.ModBlocks;
import net.exave.exavecraft.items.ModItemGroups;
import net.exave.exavecraft.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExaveCraft implements ModInitializer {
	public static final String MOD_ID ="exavecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
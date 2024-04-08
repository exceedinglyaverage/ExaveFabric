package net.exave.exavecraft.blocks;

import net.exave.exavecraft.ExaveCraft;
import net.exave.exavecraft.blocks.redstone.RedstonePedestalBlock;

import net.exave.exavecraft.blocks.server.RegenOreBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

  //  public static final Block REGEN_IRON_ORE = registerBlock("regen_iron_ore",
          //  new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
  //  public static final Block REGEN_DEEPSLATE_IRON_ORE = registerBlock("regen_deepslate_iron_ore",
   //         new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
   // public static final Block REGEN_COAL_ORE = registerBlock("regen_coal_ore",
          //  new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
  //  public static final Block REGEN_DEEPSLATE_COAL_ORE = registerBlock("regen_deepslate_coal_ore",
          //  new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
 //   public static final Block REGEN_COPPER_ORE = registerBlock("regen_copper_ore",
   //         new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
   //public static final Block REGEN_DEEPSLATE_COPPER_ORE = registerBlock("regen_deepslate_copper_ore",
   //         new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE)));
   // public static final Block REGEN_DIAMOND_ORE = registerBlock("regen_diamond_ore",
          //  new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
   // public static final Block REGEN_DEEPSLATE_DIAMOND_ORE = registerBlock("regen_deepslate_diamond_ore",
       //     new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));
   // public static final Block REGEN_EMERALD_ORE = registerBlock("regen_emerald_ore",
     //       new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));
   // public static final Block REGEN_DEEPSLATE_EMEARLD_ORE = registerBlock("regen_deepslate_emerald_ore",
   //         new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));
  //  public static final Block REGEN_GOLD_ORE = registerBlock("regen_gold_ore",
    //        new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
   // public static final Block REGEN_DEEPSLATE_GOLD_ORE = registerBlock("regen_deepslate_gold_ore",
     //       new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)));
    //public static final Block REGEN_NETHER_GOLD_ORE = registerBlock("regen_nether_gold_ore",
       //     new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));
    //public static final Block REGEN_LAPIS_ORE = registerBlock("regen_lapis_ore",
      //      new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE)));
   // public static final Block REGEN_DEEPSLATE_LAPIS_ORE = registerBlock("regen_deepslate_lapis_ore",
     //       new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE)));
   // public static final Block REGEN_REDSTONE_ORE = registerBlock("regen_redstone_ore",
       //  new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
   // public static final Block REGEN_DEEPSLATE_REDSTONE_ORE = registerBlock("regen_deepslate_redstone_ore",
         //   new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
   // public static final Block REGEN_TIN_ORE = registerBlock("regen_tin_ore",
      //  new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
   // public static final Block REGEN_DEEPSLATE_TIN_ORE = registerBlock("regen_deepslate_tin_ore",
         //   new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
   // public static final Block REGEN_NETHER_QUARTZ_ORE = registerBlock("regen_nether_quartz_ore",
        //    new RegenOreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE), UniformIntProvider.create(3, 3)));


    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE), UniformIntProvider.create(3, 3)));

    public static final Block REDSTONE_PEDESTAL = registerBlock("redstone_pedestal",
            new RedstonePedestalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).luminance(state -> state.get(RedstonePedestalBlock.LIT) ? 4 : 0)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ExaveCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ExaveCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        ExaveCraft.LOGGER.info("Registering Mod Blocks for" + ExaveCraft.MOD_ID);
    }
}

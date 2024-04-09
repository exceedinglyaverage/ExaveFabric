package net.exave.exavecraft;

import net.exave.exavecraft.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ExaveCraftModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MEDICAL_HERB_CROP, RenderLayer.getCutout());



    }
}

package net.exave.exavecraft.datagen;

import net.exave.exavecraft.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS,
                        ModItems.STEEL_HELMET, ModItems.STEEL_CHESTPLATE, ModItems.STEEL_LEGGINGS, ModItems.STEEL_BOOTS);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE, ModItems.STEEL_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
            .add(ModItems.BRONZE_SHOVEL, ModItems.STEEL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BRONZE_AXE, ModItems.STEEL_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE, ModItems.STEEL_HOE);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD, ModItems.STEEL_SWORD);

    }

}

package net.exave.exavecraft.items.tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.exave.exavecraft.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class HammerItem extends MiningToolItem {
    private final TagKey<Block> effectiveBlocks;

    public HammerItem(ToolMaterial material, float attackDamage, float attackSpeed,  Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.HAMMER_MINEABLE, settings);
        this.effectiveBlocks = ModTags.Blocks.HAMMER_MINEABLE;
    }
}

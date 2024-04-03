package net.exave.exavecraft.items;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial
{
    WOOD_HEAVY(MiningLevels.WOOD, 118, 4.0f, 0.0f, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE_HEAVY(MiningLevels.STONE, 261, 8.0f, 1.0f, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_HEAVY(MiningLevels.IRON, 500, 12.0f, 2.0f, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    DIAMOND_HEAVY(MiningLevels.DIAMOND, 3122, 16.0f, 3.0f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    GOLD_HEAVY(MiningLevels.WOOD, 64, 24.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    NETHERITE_HEAVY(MiningLevels.NETHERITE, 4062, 18.0f, 4.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BRONZE(MiningLevels.IRON, 131, 6.0f, 2.0f, 5, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    BRONZE_HEAVY(MiningLevels.IRON, 261, 12.0f, 2.0f, 5, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),

    STEEL(MiningLevels.DIAMOND, 250, 8.0f, 3.0f, 14, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    STEEL_HEAVY(MiningLevels.DIAMOND, 500, 16.0f, 3.0f, 14, () -> Ingredient.ofItems(ModItems.STEEL_INGOT));




    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}


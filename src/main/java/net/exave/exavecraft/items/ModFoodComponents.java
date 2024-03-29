package net.exave.exavecraft.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent MEDICAL_HERB = new FoodComponent.Builder().hunger(1).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600),.5f).
            statusEffect(new StatusEffectInstance(StatusEffects.POISON, 300),.1f).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300),.1f).build();
}

package net.exave.exavecraft.items.healing;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BandageItem extends Item {
    private final Integer heals;
    private final Integer cooldown;
    public BandageItem(Settings settings, Integer heals, Integer cooldown) {
        super(settings);
        this.heals = heals;
        this.cooldown = cooldown;
    }




    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        user.getItemCooldownManager().set(this, cooldown);
        ItemStack itemStack = user.getStackInHand(hand);
        user.heal(heals);
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.pass(user.getStackInHand(hand));

    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        PlayerEntity player = context.getPlayer();

        player.getItemCooldownManager().set(this, cooldown);
        player.heal(heals);

        if (!player.getAbilities().creativeMode) {
            context.getStack().decrement(1);
        }

        return ActionResult.PASS;
    }
    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        user.getItemCooldownManager().set(this, cooldown);
        ItemStack itemStack = user.getStackInHand(hand);
        if (entity instanceof LivingEntity){
            entity.heal(heals);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return ActionResult.PASS;
    }

}

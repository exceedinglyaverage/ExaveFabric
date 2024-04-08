package net.exave.exavecraft.blocks.server;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class RegenOreBlock extends ExperienceDroppingBlock {
    public static final BooleanProperty DEPLETED = BooleanProperty.of("depleted");
    public RegenOreBlock(Settings settings, IntProvider experience) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(DEPLETED, false));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        if (state.get(DEPLETED).booleanValue()){
            if (random.nextFloat() < 0.075f) {
                world.setBlockState(pos, state.cycle(DEPLETED));
            }
        }
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        boolean b = state.get(DEPLETED);
        return b;
    }

    private void mineOre(World world, BlockPos pos, BlockState state, ItemStack tool){

    if (!state.get(DEPLETED).booleanValue()){

        world.setBlockState(pos, state.with(DEPLETED, true), Block.NOTIFY_LISTENERS);

    }
    else {
        world.setBlockState(pos, state.with(DEPLETED, true), Block.NOTIFY_LISTENERS);
    }
     }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {

        if (!MinecraftClient.getInstance().player.isCreative()){
       this.depeleteOre(world, pos, state);}
    }

    private void depeleteOre(WorldAccess world, BlockPos pos, BlockState state) {
        boolean d =state.get(DEPLETED);

        if (d == true){
            world.setBlockState(pos, state.with(DEPLETED, true), Block.NOTIFY_LISTENERS);

        }
        else {
            world.setBlockState(pos, state.with(DEPLETED, true), Block.NOTIFY_LISTENERS);
        }


    }

    @Override
     public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
         super.afterBreak(world, player, pos, state, blockEntity, tool);
         this.mineOre(world, pos, state, tool);
     }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(DEPLETED);
    }

}


package com.Tutorial.TutorialMod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;


public class SpinBlock extends BaseHorizontalBlock {

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(2, 12, 4, 13, 13, 14),
            Block.makeCuboidShape(2, 1, 13, 12, 12, 14),
            Block.makeCuboidShape(12, 1, 4, 13, 12, 14),
            Block.makeCuboidShape(3, 1, 4, 13, 12, 5),
            Block.makeCuboidShape(2, 1, 4, 3, 12, 14),
            Block.makeCuboidShape(6, 1, 8, 8, 12, 10),
            Block.makeCuboidShape(2, 0, 4, 13, 1, 14),
            Block.makeCuboidShape(3, 13, 5, 12, 14, 13)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();


    public SpinBlock(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));

    }
}
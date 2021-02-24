package com.Tutorial.TutorialMod.datagen.loot;

import com.Tutorial.TutorialMod.core.init.BlockInit;
import com.Tutorial.TutorialMod.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

public class TutorialBlockLootTables extends BlockLootTables {

    @Override
    protected void addTables() {
        this.registerLootTable(BlockInit.EXAMPLE_ORE.get(), (block) -> {
            return droppingItemWithFortune(block, ItemInit.EXAMPLE_ITEM.get());

        });
        this.registerLootTable(BlockInit.NETHER_EXAMPLE_ORE.get(), (block) -> {
            return droppingItemWithFortune(block, ItemInit.EXAMPLE_ITEM.get());
        });
        this.registerLootTable(BlockInit.END_EXAMPLE_ORE.get(), (block) -> {
            return droppingItemWithFortune(block, ItemInit.EXAMPLE_ITEM.get());
        });

        this.registerDropSelfLootTable(BlockInit.BRUH_BLOCK.get());
        this.registerDropSelfLootTable(BlockInit.DREAM_BLOCK.get());
        this.registerDropSelfLootTable(BlockInit.SPIN_BLOCK.get());
        this.registerDropSelfLootTable(BlockInit.TEST_BLOCK.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}


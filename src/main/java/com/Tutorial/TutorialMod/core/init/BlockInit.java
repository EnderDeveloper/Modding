package com.Tutorial.TutorialMod.core.init;

import com.Tutorial.TutorialMod.TutorialMod;
import com.Tutorial.TutorialMod.common.blocks.SpinBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            TutorialMod.MOD_ID);


    public static final RegistryObject<Block> BRUH_BLOCK = BLOCKS
            .register("bruh_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GREEN)

                    .hardnessAndResistance(15f, 30f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(1)
                    .sound(SoundType.METAL)
                    .setRequiresTool()));

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS
            .register("test_block", () -> new Block(AbstractBlock.Properties.create(Material.GLASS, MaterialColor.AIR)

                    .hardnessAndResistance(5f, 10f)
                    .harvestTool(ToolType.AXE)
                    .harvestLevel(2)
                    .sound(SoundType.GLASS)
                    .setRequiresTool()));


    public static final RegistryObject<Block> DREAM_BLOCK = BLOCKS
            .register("dream_block", () -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GREEN)

                    .hardnessAndResistance(2.9f, 6.5f)
                    .harvestTool(ToolType.SHOVEL)
                    .harvestLevel(3)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .setRequiresTool()));

    public static final RegistryObject<Block> SPIN_BLOCK = BLOCKS
            .register("spin_block", () -> new SpinBlock(AbstractBlock.Properties.create(Material.ICE, MaterialColor.BLUE)

                    .hardnessAndResistance(2f, 3f)
                    .harvestTool(ToolType.AXE)
                    .harvestLevel(2)
                    .sound(SoundType.WOOD)
                    .setRequiresTool()));


//Ores

    public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS
            .register("example_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)

                    .hardnessAndResistance(3f, 3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(3)
                    .sound(SoundType.STONE)
                    .setRequiresTool()));

    public static final RegistryObject<Block> NETHER_EXAMPLE_ORE = BLOCKS
            .register("nether_example_ore", () -> new Block(AbstractBlock.Properties.from(BlockInit.EXAMPLE_ORE.get())));

    public static final RegistryObject<Block> END_EXAMPLE_ORE = BLOCKS
            .register("end_example_ore", () -> new Block(AbstractBlock.Properties.from(BlockInit.EXAMPLE_ORE.get())));
}










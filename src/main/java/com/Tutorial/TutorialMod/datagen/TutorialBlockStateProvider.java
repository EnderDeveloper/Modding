package com.Tutorial.TutorialMod.datagen;

import com.Tutorial.TutorialMod.TutorialMod;
import com.Tutorial.TutorialMod.core.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Map;
import java.util.function.Supplier;

public class TutorialBlockStateProvider extends BlockStateProvider {

    public TutorialBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.EXAMPLE_ORE);
        simpleBlock(BlockInit.NETHER_EXAMPLE_ORE);
        simpleBlock(BlockInit.END_EXAMPLE_ORE);
        simpleBlock(BlockInit.BRUH_BLOCK);
        simpleBlock(BlockInit.TEST_BLOCK);
        simpleBlock(BlockInit.DREAM_BLOCK);
    }

    public void simpleBlock(Supplier<? extends Block> blockSupplier) {
        simpleBlock(blockSupplier.get());
    }

    public void templateExtenderHorizontalBlock(Supplier<? extends Block> blockSupplier, Map<String, ResourceLocation> textures) {
        Block block = blockSupplier.get();
        horizontalBlock(block, templateExtender(block, textures));
    }

    @Override
    public void simpleBlock(Block block, ModelFile model) {
        super.simpleBlock(block, model);
        this.simpleBlockItem(block, model);
    }

    @Override
    public void horizontalBlock(Block block, ModelFile model) {
        super.horizontalBlock(block, model);
        this.simpleBlockItem(block, model);
    }

    public BlockModelBuilder templateExtender(Block block, Map<String, ResourceLocation> textures) {
        ResourceLocation name = block.getRegistryName();
        BlockModelBuilder builder = this.models().withExistingParent(name.getPath(), new ResourceLocation(name.getNamespace(), ModelProvider.BLOCK_FOLDER + "/template_" + name.getPath()));
        textures.forEach((key, texture) -> builder.texture(key, texture));
        return builder;
    }
}
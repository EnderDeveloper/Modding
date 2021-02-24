package com.Tutorial.TutorialMod.datagen;

import com.Tutorial.TutorialMod.TutorialMod;
import com.Tutorial.TutorialMod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class TutorialItemModelProvider extends ItemModelProvider {

    public TutorialItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.EXAMPLE_ITEM);
        simpleItem(ItemInit.SPECIAL_ITEM);
        simpleItem(ItemInit.SHADED_ITEM);
        simpleItem(ItemInit.EXAMPLE_SHOVEL);
        simpleItem(ItemInit.EXAMPLE_PICKAXE);
        simpleItem(ItemInit.EXAMPLE_AXE);
        simpleItem(ItemInit.EXAMPLE_HOE);
        simpleItem(ItemInit.EXAMPLE_SWORD);
        simpleItem(ItemInit.CHERRY_FOOD);
        simpleItem(ItemInit.EXAMPLE_FOOD);

    }

    public void simpleItem(Supplier<? extends Item> itemSupplier) {
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("items/generated"))
                .texture("layer0", new ResourceLocation(location.getNamespace(), ITEM_FOLDER + "/" + location.getPath()));
    }
}

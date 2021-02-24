package com.Tutorial.TutorialMod.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new TutorialLootTableProvider(generator));
        }
        if (event.includeClient()) {
            generator.addProvider(new TutorialBlockStateProvider(generator, event.getExistingFileHelper()));
            generator.addProvider(new TutorialItemModelProvider(generator, event.getExistingFileHelper()));
        }
    }
}



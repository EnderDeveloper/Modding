package com.Tutorial.TutorialMod.client.event;

import com.Tutorial.TutorialMod.TutorialMod;
import com.Tutorial.TutorialMod.core.init.ItemInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void renderHand(final RenderHandEvent event) {
        if (event.getItemStack().getItem().equals(ItemInit.SPECIAL_ITEM.get())) {
            event.setCanceled(true);
        }

    }
}

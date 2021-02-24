package com.Tutorial.TutorialMod.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {
    public static final Food EXAMPLE_FOOD = new Food.Builder().effect(() -> new EffectInstance(Effects.SPEED, 200, 3), 1.0f)
            .effect(() -> new EffectInstance(Effects.HASTE, 60, 3), 0.2f)
            .effect(() -> new EffectInstance(Effects.ABSORPTION, 100), 0.5f)
            .hunger(6).saturation(0.2f).setAlwaysEdible().build();

    public static final Food CHERRY_FOOD =
            new Food.Builder().effect(() -> new EffectInstance(Effects.STRENGTH, 200, 5), 1.0f)
                    .effect(() -> new EffectInstance(Effects.RESISTANCE, 60, 3), 0.2f)
                    .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 10000), 0.05f)
                    .hunger(20).saturation(1f).setAlwaysEdible().build();
}

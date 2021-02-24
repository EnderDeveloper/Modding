package com.Tutorial.TutorialMod.core.init;

import com.Tutorial.TutorialMod.TutorialMod;
import com.Tutorial.TutorialMod.common.items.SpecialItem;
import com.Tutorial.TutorialMod.core.enums.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            TutorialMod.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).isImmuneToFire()));


    public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item",
            () -> new SpecialItem(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).isImmuneToFire()));

    public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("example_food",
            () -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)
                    .food(FoodInit.EXAMPLE_FOOD)));

    public static final RegistryObject<Item> CHERRY_FOOD = ITEMS.register("cherry_food",
            () -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)
                    .food(FoodInit.CHERRY_FOOD)));

    public static final RegistryObject<Item> SHADED_ITEM = ITEMS.register("shaded_item",
            () -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).isImmuneToFire()));

    // Block Items

    public static final RegistryObject<BlockItem> BRUH_BLOCK = ITEMS.register("bruh_block",
            () -> new BlockItem(BlockInit.BRUH_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block",
            () -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<BlockItem> DREAM_BLOCK = ITEMS.register("dream_block",
            () -> new BlockItem(BlockInit.DREAM_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<BlockItem> EXAMPLE_ORE = ITEMS.register("example_ore",
            () -> new BlockItem(BlockInit.EXAMPLE_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<BlockItem> NETHER_EXAMPLE_ORE = ITEMS.register("nether_example_ore",
            () -> new BlockItem(BlockInit.NETHER_EXAMPLE_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<BlockItem> END_EXAMPLE_ORE = ITEMS.register("end_example_ore",
            () -> new BlockItem(BlockInit.END_EXAMPLE_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<BlockItem> SPIN_BLOCK = ITEMS.register("spin_block",
            () -> new BlockItem(BlockInit.SPIN_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    //Tools
    public static final RegistryObject<Item> EXAMPLE_SWORD = ITEMS.register("example_sword",
            () -> new SwordItem(ModItemTier.EXAMPLE, 7, 5.0f, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_AXE = ITEMS.register("example_axe",
            () -> new AxeItem(ModItemTier.EXAMPLE, 9, 2.5f, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_SHOVEL = ITEMS.register("example_shovel",
            () -> new ShovelItem(ModItemTier.EXAMPLE, 4, 3.0f, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_HOE = ITEMS.register("example_hoe",
            () -> new HoeItem(ModItemTier.EXAMPLE, 0, 3.0f, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe",
            () -> new PickaxeItem(ModItemTier.EXAMPLE, 4, 3.0f, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

}







package net.kaison.stygianwildwood.item;

import net.kaison.stygianwildwood.StygianWildwoodMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StygianWildwoodMod.MOD_ID);

    //Example Add Item
    //public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
    //        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STYGIAN_CRYSTAL = ITEMS.register("stygian_crystal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

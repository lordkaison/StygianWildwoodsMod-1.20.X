package net.kaison.stygianwildwood.item;

import net.kaison.stygianwildwood.StygianWildwoodMod;
import net.kaison.stygianwildwood.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StygianWildwoodMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STYGIAN_WILDWOOD_TAB = CREATIVE_MODE_TABS.register("stygian_wildwood_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STYGIAN_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.stygian_wildwood_tab")).displayItems((displayParameters,output) -> {

                       // output.accept(ModItems.ALEXANDRITE.get());
                        //Item
                        output.accept(ModItems.STYGIAN_CRYSTAL.get());

                        //Blocks
                        output.accept(ModBlocks.STYGIAN_CRYSTAL_BLOCK.get());
                        output.accept(ModBlocks.STYGIAN_SAND.get());
                        output.accept(ModBlocks.STYGIAN_STONE.get());
                        output.accept(ModBlocks.COBBLED_STYGIAN_STONE.get());
                        output.accept(ModBlocks.POLISHED_STYGIAN_STONE.get());
                        output.accept(ModBlocks.STYGIAN_STONE_BRICKS.get());
                        output.accept(ModBlocks.STYGIAN_STONE_TILES.get());
                        output.accept(ModBlocks.CRACKED_STYGIAN_STONE_BRICKS.get());
                        output.accept(ModBlocks.CRACKED_STYGIAN_STONE_TILES.get());
                        output.accept(ModBlocks.SMOOTH_STYGIAN_STONE_BRICKS.get());

                        //Glass
                        output.accept(ModBlocks.STYGIAN_GLASS.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

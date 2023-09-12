package net.kaison.stygianwildwood.block;

import net.kaison.stygianwildwood.StygianWildwoodMod;
import net.kaison.stygianwildwood.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StygianWildwoodMod.MOD_ID);

    //Example to register custom blocks
    //public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandrite_block",
    //        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    //Blocks
    public static final RegistryObject<Block> STYGIAN_CRYSTAL_BLOCK = registerBlock("stygian_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> STYGIAN_SAND = registerBlock("stygian_sand",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static final RegistryObject<Block> STYGIAN_STONE = registerBlock("stygian_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> COBBLED_STYGIAN_STONE = registerBlock("cobbled_stygian_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));

    public static final RegistryObject<Block> POLISHED_STYGIAN_STONE = registerBlock("polished_stygian_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> STYGIAN_STONE_BRICKS = registerBlock("stygian_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> STYGIAN_STONE_TILES = registerBlock("stygian_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> CRACKED_STYGIAN_STONE_BRICKS = registerBlock("cracked_stygian_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> CRACKED_STYGIAN_STONE_TILES = registerBlock("cracked_stygian_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> SMOOTH_STYGIAN_STONE_BRICKS = registerBlock("smooth_stygian_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));






    //Glass
    public static final RegistryObject<Block> STYGIAN_GLASS = registerBlock("stygian_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

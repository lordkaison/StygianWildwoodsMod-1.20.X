package net.kaison.stygianwildwood.datagen;

import net.kaison.stygianwildwood.StygianWildwoodMod;
import net.kaison.stygianwildwood.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, StygianWildwoodMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Blocks
        blockWithItem(ModBlocks.STYGIAN_CRYSTAL_BLOCK);
        blockWithItem(ModBlocks.STYGIAN_SAND);
        blockWithItem(ModBlocks.COBBLED_STYGIAN_STONE);
        blockWithItem(ModBlocks.STYGIAN_STONE);
        blockWithItem(ModBlocks.POLISHED_STYGIAN_STONE);
        blockWithItem(ModBlocks.STYGIAN_STONE_BRICKS);
        blockWithItem(ModBlocks.STYGIAN_STONE_TILES);
        blockWithItem(ModBlocks.CRACKED_STYGIAN_STONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_STYGIAN_STONE_TILES);
        blockWithItem(ModBlocks.SMOOTH_STYGIAN_STONE_BRICKS);

        //Glass
        blockWithItem(ModBlocks.STYGIAN_GLASS);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}

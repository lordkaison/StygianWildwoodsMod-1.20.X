package net.kaison.stygianwildwood.datagen.loot;

import net.kaison.stygianwildwood.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Blocks
        this.dropSelf(ModBlocks.STYGIAN_CRYSTAL_BLOCK.get());
        this.dropSelf(ModBlocks.STYGIAN_SAND.get());
        this.dropSelf(ModBlocks.COBBLED_STYGIAN_STONE.get());
        this.add(ModBlocks.STYGIAN_STONE.get(),
                block -> createSingleItemTableWithSilkTouch(ModBlocks.STYGIAN_STONE.get(), ModBlocks.COBBLED_STYGIAN_STONE.get()));
        this.dropSelf(ModBlocks.POLISHED_STYGIAN_STONE.get());
        this.dropSelf(ModBlocks.STYGIAN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.STYGIAN_STONE_TILES.get());
        this.dropSelf(ModBlocks.CRACKED_STYGIAN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_STYGIAN_STONE_TILES.get());
        this.dropSelf(ModBlocks.SMOOTH_STYGIAN_STONE_BRICKS.get());

        //Glass
        this.dropSelf(ModBlocks.STYGIAN_GLASS.get());




    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

    }
}

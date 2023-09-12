package net.kaison.stygianwildwood.datagen;

import net.kaison.stygianwildwood.StygianWildwoodMod;
import net.kaison.stygianwildwood.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, StygianWildwoodMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //Blocks
                .add(ModBlocks.STYGIAN_CRYSTAL_BLOCK.get(),
                ModBlocks.STYGIAN_STONE.get(),
                ModBlocks.COBBLED_STYGIAN_STONE.get(),
                ModBlocks.POLISHED_STYGIAN_STONE.get(),
                ModBlocks.STYGIAN_STONE_BRICKS.get(),
                ModBlocks.STYGIAN_STONE_TILES.get(),
                ModBlocks.CRACKED_STYGIAN_STONE_BRICKS.get(),
                ModBlocks.CRACKED_STYGIAN_STONE_TILES.get(),
                ModBlocks.SMOOTH_STYGIAN_STONE_BRICKS.get()

                //Glass

                );

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.STYGIAN_SAND.get()
                );

    }
}

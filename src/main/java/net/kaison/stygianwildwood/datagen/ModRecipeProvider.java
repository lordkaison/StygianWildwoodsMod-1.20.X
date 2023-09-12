package net.kaison.stygianwildwood.datagen;

import net.kaison.stygianwildwood.block.ModBlocks;
import net.kaison.stygianwildwood.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder  {

    private List<ItemLike> STYGIAN_STONE_SMELTABLES = List.of(ModBlocks.COBBLED_STYGIAN_STONE.get());
    private List<ItemLike> CRACKED_STYGIAN_STONE_BRICKS_SMELTABLES = List.of(ModBlocks.STYGIAN_STONE_BRICKS.get());
    private List<ItemLike> CRACKED_STYGIAN_STONE_TILES_SMELTABLES = List.of(ModBlocks.STYGIAN_STONE_TILES.get());
    private List<ItemLike> SMOOTH_STYGIAN_STONE_BRICKS_SMELTABLES = List.of(ModBlocks.STYGIAN_STONE.get());
    private List<ItemLike> STYGIAN_GLASS_SMELTABLES = List.of(ModBlocks.STYGIAN_SAND.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //Example Shaped Recipe
    //    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
    //            .pattern("AAA")
    //            .pattern("AAA")
    //            .pattern("AAA")
    //            .define('A', ModItems.ALEXANDRITE.get())
    //            .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item()
    //                    .of(ModItems.ALEXANDRITE.get()).build()))
    //            .save(pWriter);

        //Example Shapeless Recipe
    //    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
    //            .requires(ModBlocks.ALEXANDRITE_BLOCK.get())
    //            .unlockedBy("has_alexandrite_block", inventoryTrigger(ItemPredicate.Builder.item()
   //                     .of(ModBlocks.ALEXANDRITE_BLOCK.get()).build()))
    //                    .save(pWriter);

    //9:00 for ore smelting

        //Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STYGIAN_CRYSTAL_BLOCK.get())
                    .pattern("AAA")
                    .pattern("AAA")
                    .pattern("AAA")
                    .define('A', ModItems.STYGIAN_CRYSTAL.get())
                    .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item()
                            .of(ModItems.STYGIAN_CRYSTAL.get()).build()))
                    .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STYGIAN_CRYSTAL.get(), 9)
                .requires(ModBlocks.STYGIAN_CRYSTAL_BLOCK.get())
                .unlockedBy("has_stygian_crystal_block", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.STYGIAN_CRYSTAL_BLOCK.get()).build()))
                .save(pWriter);

        oreSmelting(pWriter, STYGIAN_STONE_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.STYGIAN_STONE.get(), 0.25f, 200, "stygian_crystal");
        oreBlasting(pWriter, STYGIAN_STONE_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.STYGIAN_STONE.get(), 0.25f, 100, "stygian_crystal");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_STYGIAN_STONE.get())
                .pattern("   ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.COBBLED_STYGIAN_STONE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.COBBLED_STYGIAN_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STYGIAN_STONE_BRICKS.get())
                .pattern("   ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.POLISHED_STYGIAN_STONE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.POLISHED_STYGIAN_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STYGIAN_STONE_TILES.get())
                .pattern("   ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.STYGIAN_STONE_BRICKS.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.STYGIAN_STONE_BRICKS.get()).build()))
                .save(pWriter);

        oreSmelting(pWriter, CRACKED_STYGIAN_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.CRACKED_STYGIAN_STONE_BRICKS.get(), 0.25f, 200, "stygian_crystal");
        oreBlasting(pWriter, CRACKED_STYGIAN_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.CRACKED_STYGIAN_STONE_BRICKS.get(), 0.25f, 100, "stygian_crystal");

        oreSmelting(pWriter, CRACKED_STYGIAN_STONE_TILES_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.CRACKED_STYGIAN_STONE_TILES.get(), 0.25f, 200, "stygian_crystal");
        oreBlasting(pWriter, CRACKED_STYGIAN_STONE_TILES_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.CRACKED_STYGIAN_STONE_TILES.get(), 0.25f, 100, "stygian_crystal");

        oreSmelting(pWriter, SMOOTH_STYGIAN_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.SMOOTH_STYGIAN_STONE_BRICKS.get(), 0.25f, 200, "stygian_crystal");
        oreBlasting(pWriter, SMOOTH_STYGIAN_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.SMOOTH_STYGIAN_STONE_BRICKS.get(), 0.25f, 100, "stygian_crystal");

        //Glass
        oreSmelting(pWriter, STYGIAN_GLASS_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.STYGIAN_GLASS.get(), 0.25f, 200, "stygian_crystal");
        oreBlasting(pWriter, STYGIAN_GLASS_SMELTABLES, RecipeCategory.MISC,
                ModBlocks.STYGIAN_GLASS.get(), 0.25f, 100, "stygian_crystal");







    }
}

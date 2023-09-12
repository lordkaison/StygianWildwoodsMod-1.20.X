package net.kaison.stygianwildwood.datagen;

import net.kaison.stygianwildwood.StygianWildwoodMod;
import net.kaison.stygianwildwood.block.ModBlocks;
import net.kaison.stygianwildwood.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static net.kaison.stygianwildwood.item.ModItems.STYGIAN_CRYSTAL;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StygianWildwoodMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Example Add Item
        //simpleItem(ModItems.ALEXANDRITE);
        simpleItem(ModItems.STYGIAN_CRYSTAL);



    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StygianWildwoodMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}

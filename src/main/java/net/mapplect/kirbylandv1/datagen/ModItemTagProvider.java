package net.mapplect.kirbylandv1.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mapplect.kirbylandv1.block.ModBlocks;
import net.mapplect.kirbylandv1.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.MAGNOLIA_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAGNOLIA_LOG.asItem())
                .add(ModBlocks.MAGNOLIA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAGNOLIA_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAGNOLIA_WOOD.asItem());


        getOrCreateTagBuilder(ModTags.Items.MAGNOLIA_LOGS)
                .add(ModBlocks.MAGNOLIA_LOG.asItem())
                .add(ModBlocks.MAGNOLIA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAGNOLIA_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAGNOLIA_WOOD.asItem());





    }
}

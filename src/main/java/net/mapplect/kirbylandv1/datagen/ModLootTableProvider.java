package net.mapplect.kirbylandv1.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mapplect.kirbylandv1.block.ModBlocks;
import net.mapplect.kirbylandv1.block.custom.TomatoCropBlock;
import net.mapplect.kirbylandv1.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.JADE_BLOCK);
        addDrop(ModBlocks.COBALT_BLOCK);
        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.TOPAZ_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.OPAL_BLOCK);
        addDrop(ModBlocks.ZINC_BLOCK);

        addDrop(ModBlocks.RUBY_ORE, copperLikeOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));

        addDrop(ModBlocks.JADE_ORE, copperLikeOreDrops(ModBlocks.JADE_ORE, ModItems.RAW_JADE));
        addDrop(ModBlocks.DEEPSLATE_JADE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_JADE_ORE, ModItems.RAW_JADE));

        addDrop(ModBlocks.SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));


        addDrop(ModBlocks.BRONZE_ORE, ironLikeOreDrops(ModBlocks.BRONZE_ORE, ModItems.RAW_BRONZE));
        addDrop(ModBlocks.DEEPSLATE_BRONZE_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_BRONZE_ORE, ModItems.RAW_BRONZE));

        addDrop(ModBlocks.DEEPSLATE_COBALT_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_COBALT_ORE, ModItems.RAW_COBALT));

        addDrop(ModBlocks.ZINC_ORE, ironLikeOreDrops(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC));

        addDrop(ModBlocks.LEAD_ORE, ironLikeOreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.DEEPSLATE_LEAD_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE, ModItems.RAW_LEAD));

        addDrop(ModBlocks.OPAL_ORE, ironLikeOreDrops(ModBlocks.OPAL_ORE, ModItems.RAW_OPAL));
        addDrop(ModBlocks.DEEPSLATE_OPAL_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_OPAL_ORE, ModItems.RAW_OPAL));

        addDrop(ModBlocks.PLATINUM_ORE, ironLikeOreDrops(ModBlocks.PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE, ModItems.RAW_PLATINUM));

        addDrop(ModBlocks.TIN_ORE, ironLikeOreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN));

        addDrop(ModBlocks.TITANIUM_ORE, ironLikeOreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM));

        addDrop(ModBlocks.TOPAZ_ORE, ironLikeOreDrops(ModBlocks.TOPAZ_ORE, ModItems.RAW_TOPAZ));
        addDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_TOPAZ_ORE, ModItems.RAW_TOPAZ));

        addDrop(ModBlocks.URANIUM_ORE, ironLikeOreDrops(ModBlocks.URANIUM_ORE, ModItems.RAW_URANIUM));
        addDrop(ModBlocks.DEEPSLATE_URANIUM_ORE, ironLikeOreDrops(ModBlocks.DEEPSLATE_URANIUM_ORE, ModItems.RAW_URANIUM));


        addDrop(ModBlocks.MAGNOLIA_WOOD);
        addDrop(ModBlocks.STRIPPED_MAGNOLIA_WOOD);
        addDrop(ModBlocks.MAGNOLIA_LOG);
        addDrop(ModBlocks.STRIPPED_MAGNOLIA_LOG);
        addDrop(ModBlocks.MAGNOLIA_PLANKS);

        addDrop(ModBlocks.MAGNOLIA_LEAVES, leavesDrops(ModBlocks.MAGNOLIA_LEAVES, ModBlocks.ZINC_ORE, 0.0025f)); // ZINC IS PLACEHOLDER FOR SAPLINGS :)


        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder));







    }
    public LootTable.Builder ironLikeOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop,
                this.applyExplosionDecay(drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }



    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));

    }
}

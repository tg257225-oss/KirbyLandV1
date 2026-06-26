package net.mapplect.kirbylandv1.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mapplect.kirbylandv1.block.ModBlocks;
import net.mapplect.kirbylandv1.item.ModItems;
import net.mapplect.kirbylandv1.util.ModTags;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD, ModBlocks.LEAD_ORE, ModBlocks.DEEPSLATE_LEAD_ORE);
    private static final List<ItemConvertible> BRONZE_SMELTABLES = List.of(ModItems.RAW_BRONZE, ModBlocks.BRONZE_ORE, ModBlocks.DEEPSLATE_BRONZE_ORE);
    private static final List<ItemConvertible> JADE_SMELTABLES = List.of(ModItems.RAW_JADE, ModBlocks.JADE_ORE, ModBlocks.DEEPSLATE_JADE_ORE);
    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE, ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
    private static final List<ItemConvertible> TOPAZ_SMELTABLES = List.of(ModItems.RAW_TOPAZ, ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
    private static final List<ItemConvertible> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM, ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE);
    private static final List<ItemConvertible> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM, ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE);
    private static final List<ItemConvertible> COBALT_SMELTABLES = List.of(ModItems.RAW_COBALT, ModBlocks.DEEPSLATE_COBALT_ORE);
    private static final List<ItemConvertible> OPAL_SMELTABLES = List.of(ModItems.RAW_OPAL, ModBlocks.OPAL_ORE, ModBlocks.DEEPSLATE_OPAL_ORE);
    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);
    private static final List<ItemConvertible> URANIUM_SMELTABLES = List.of(ModItems.RAW_URANIUM, ModBlocks.URANIUM_ORE, ModBlocks.DEEPSLATE_URANIUM_ORE);
    private static final List<ItemConvertible> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC, ModBlocks.ZINC_ORE);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.Ruby,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.Ruby,
                0.7f, 100, "ruby");

        offerSmelting(exporter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.Jade,
                0.7f, 200, "jade");
        offerBlasting(exporter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.Jade,
                0.7f, 100, "jade");

        offerSmelting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.Sapphire,
                0.7f, 200, "sapphire");
        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.Sapphire,
                0.7f, 100, "sapphire");

        offerSmelting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.Lead,
                1.0f, 200, "lead");
        offerBlasting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.Lead,
                1.0f, 100, "lead");

        offerSmelting(exporter, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.Bronze,
                1.0f, 200, "bronze");
        offerBlasting(exporter, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.Bronze,
                1.0f, 100, "bronze");

        offerSmelting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.Topaz,
                1.0f, 200, "topaz");
        offerBlasting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.Topaz,
                1.0f, 100, "topaz");

        offerSmelting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.Platinum,
                1.0f, 200, "platinum");
        offerBlasting(exporter, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.Platinum,
                1.0f, 100, "platinum");

        offerSmelting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Titanium,
                1.0f, 200, "titanium");
        offerBlasting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Titanium,
                1.0f, 100, "titanium");

        offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.Tin,
                1.0f, 200, "tin");
        offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.Tin,
                1.0f, 100, "tin");

        offerSmelting(exporter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.Zinc,
                1.1f, 200, "zinc");
        offerBlasting(exporter, ZINC_SMELTABLES, RecipeCategory.MISC, ModItems.Zinc,
                1.1f, 100, "zinc");

        offerSmelting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.Cobalt,
                1.3f, 200, "cobalt");
        offerBlasting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.Cobalt,
                1.3f, 100, "cobalt");

        offerSmelting(exporter, OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.Opal,
                1.0f, 200, "opal");
        offerBlasting(exporter, OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.Opal,
                1.0f, 100, "opal");

        offerSmelting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Uranium,
                1.8f, 400, "uranium");
        offerBlasting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Uranium,
                1.8f, 200, "uranium");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Ruby, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Bronze, RecipeCategory.DECORATIONS, ModBlocks.BRONZE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Cobalt, RecipeCategory.DECORATIONS, ModBlocks.COBALT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Jade, RecipeCategory.DECORATIONS, ModBlocks.JADE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Lead, RecipeCategory.DECORATIONS, ModBlocks.LEAD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Opal, RecipeCategory.DECORATIONS, ModBlocks.OPAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Platinum, RecipeCategory.DECORATIONS, ModBlocks.PLATINUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Sapphire, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Tin, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Titanium, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Topaz, RecipeCategory.DECORATIONS, ModBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Zinc, RecipeCategory.DECORATIONS, ModBlocks.ZINC_BLOCK);

        offerPlanksRecipe(exporter, ModBlocks.MAGNOLIA_PLANKS, ModTags.Items.MAGNOLIA_LOGS, 4);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BAGUETTE, 2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WHEAT)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter);




    }
}

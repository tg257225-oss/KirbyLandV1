package net.mapplect.kirbylandv1.world;

import net.mapplect.kirbylandv1.KirbyLandV1;
import net.mapplect.kirbylandv1.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registryKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BRONZE_ORE_KEY = registryKey("bronze_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_BRONZE_ORE_KEY = registryKey("deepslate_bronze_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_COBALT_ORE_KEY = registryKey("deepslate_cobalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_JADE_ORE_KEY = registryKey("deepslate_jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_LEAD_ORE_KEY = registryKey("deepslate_lead_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_OPAL_ORE_KEY = registryKey("deepslate_opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_PLATINUM_ORE_KEY = registryKey("deepslate_platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_RUBY_ORE_KEY = registryKey("deepslate_ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_SAPPHIRE_ORE_KEY = registryKey("deepslate_sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_TIN_ORE_KEY = registryKey("deepslate_tin_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_TITANIUM_ORE_KEY = registryKey("deepslate_titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_TOPAZ_ORE_KEY = registryKey("deepslate_topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_ORE_KEY = registryKey("jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registryKey("lead_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OPAL_ORE_KEY = registryKey("opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registryKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registryKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registryKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registryKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registryKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZINC_ORE_KEY = registryKey("zinc_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registryKey("uranium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_URANIUM_ORE_KEY = registryKey("deepslate_uranium_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldBronzeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.BRONZE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_BRONZE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobaltOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_COBALT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldJadeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.JADE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldLeadOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.LEAD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_LEAD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldOpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldPlatinumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.PLATINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTinOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TIN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldZincOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ZINC_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldUraniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.URANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState()));


        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 10));
        register(context, DEEPSLATE_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 10));

        register(context, BRONZE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBronzeOres, 6));
        register(context, DEEPSLATE_BRONZE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBronzeOres, 6));

        register(context, DEEPSLATE_COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobaltOres, 4));

        register(context, JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeOres, 10));
        register(context, DEEPSLATE_JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeOres, 10));

        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 10));
        register(context, DEEPSLATE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 10));

        register(context, LEAD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLeadOres, 6));
        register(context, DEEPSLATE_LEAD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLeadOres, 6));

        register(context, OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOpalOres, 8));
        register(context, DEEPSLATE_OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOpalOres, 8));

        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 8));
        register(context, DEEPSLATE_TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 8));

        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres, 6));
        register(context, DEEPSLATE_PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres, 6));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 6));
        register(context, DEEPSLATE_TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 6));

        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 6));
        register(context, DEEPSLATE_TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 6));

        register(context, URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldUraniumOres, 4));
        register(context, DEEPSLATE_URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldUraniumOres, 4));

        register(context, ZINC_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldZincOres, 8));




    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(KirbyLandV1.MOD_ID, name));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }




}

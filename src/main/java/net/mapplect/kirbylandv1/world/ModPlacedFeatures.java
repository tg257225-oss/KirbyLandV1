package net.mapplect.kirbylandv1.world;

import net.mapplect.kirbylandv1.KirbyLandV1;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_RUBY_ORE_PLACED_KEY = registerKey("deepslate_ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> BRONZE_ORE_PLACED_KEY = registerKey("bronze_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_BRONZE_ORE_PLACED_KEY = registerKey("deepslate_bronze_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_COBALT_ORE_PLACED_KEY = registerKey("deepslate_cobalt_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_JADE_ORE_PLACED_KEY = registerKey("deepslate_jade_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_LEAD_ORE_PLACED_KEY = registerKey("deepslate_lead_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_OPAL_ORE_PLACED_KEY = registerKey("deepslate_opal_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_PLATINUM_ORE_PLACED_KEY = registerKey("deepslate_platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY = registerKey("deepslate_sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_TIN_ORE_PLACED_KEY = registerKey("deepslate_tin_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_TITANIUM_ORE_PLACED_KEY = registerKey("deepslate_titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_TOPAZ_ORE_PLACED_KEY = registerKey("deepslate_topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final RegistryKey<PlacedFeature> OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed");
    public static final RegistryKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
    public static final RegistryKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_URANIUM_ORE_PLACED_KEY = registerKey("deepslate_uranium_ore_placed");


    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, BRONZE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BRONZE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_BRONZE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_BRONZE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, DEEPSLATE_COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_COBALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, JADE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JADE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_JADE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_JADE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, LEAD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_LEAD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_LEAD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, OPAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_OPAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_OPAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_SAPPHIRE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_TOPAZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_TOPAZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, URANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.URANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));
        register(context, DEEPSLATE_URANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_URANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(8))));

        register(context, ZINC_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ZINC_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(80))));



    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(KirbyLandV1.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }


}

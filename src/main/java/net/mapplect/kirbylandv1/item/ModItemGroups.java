package net.mapplect.kirbylandv1.item;

import com.sun.jna.platform.win32.WinDef;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mapplect.kirbylandv1.KirbyLandV1;
import net.mapplect.kirbylandv1.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KirbyLandV1.MOD_ID, "ore"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.Ruby)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Ruby);
                        entries.add(ModItems.Void_Steel);
                        entries.add(ModItems.Quantum_Shard);
                        entries.add(ModItems.Lead);
                        entries.add(ModItems.Chrome);
                        entries.add(ModItems.Platinum);
                        entries.add(ModItems.Sapphire);
                        entries.add(ModItems.Topaz);
                        entries.add(ModItems.Opal);
                        entries.add(ModItems.Bronze);
                        entries.add(ModItems.Tin);
                        entries.add(ModItems.Jade);
                        entries.add(ModItems.Titanium);
                        entries.add(ModItems.Uranium);
                        entries.add(ModItems.Zinc);
                        entries.add(ModItems.Cobalt);
                        entries.add(ModItems.Lead);


                        entries.add(ModItems.RAW_SAPPHIRE);
                        entries.add(ModItems.RAW_TOPAZ);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RAW_OPAL);
                        entries.add(ModItems.RAW_BRONZE);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.RAW_JADE);
                        entries.add((ModItems.RAW_TITANIUM));
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.RAW_URANIUM);



                        entries.add(ModItems.Rune);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModBlocks.GEM_POLISHING_STATION);


                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.JADE_ORE);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BRONZE_ORE);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.OPAL_BLOCK);
                        entries.add(ModBlocks.COBALT_BLOCK);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.OPAL_ORE);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.ZINC_ORE);
                        entries.add(ModBlocks.ZINC_BLOCK);
                        entries.add(ModBlocks.URANIUM_ORE);

                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_OPAL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_COBALT_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BRONZE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_URANIUM_ORE);

                        entries.add(ModBlocks.MAGNOLIA_LOG);
                        entries.add(ModBlocks.MAGNOLIA_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAGNOLIA_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAGNOLIA_LOG);
                        entries.add(ModBlocks.MAGNOLIA_PLANKS);
                        entries.add(ModBlocks.MAGNOLIA_LEAVES);


                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.STRAWBERRY);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.CHOCOLATE);
                        entries.add(ModItems.FRIED_EGGS);
                        entries.add(ModItems.BAGUETTE);
                        entries.add(ModItems.EGGS_BENEDICT);





                    }).build());




    public static void registerItemGroups() {
        KirbyLandV1.LOGGER.info("Registering Item Groups for " + KirbyLandV1.MOD_ID);
    }
}
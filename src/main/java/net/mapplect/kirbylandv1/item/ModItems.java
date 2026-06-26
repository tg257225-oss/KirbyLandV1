package net.mapplect.kirbylandv1.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mapplect.kirbylandv1.KirbyLandV1;
import net.mapplect.kirbylandv1.block.ModBlocks;
import net.mapplect.kirbylandv1.item.custom.MetalDetectorItem;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item Sapphire = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new FabricItemSettings()));

    public static final Item Topaz = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item RAW_TOPAZ = registerItem("raw_topaz", new Item(new FabricItemSettings()));

    public static final Item Ruby = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item Opal = registerItem("opal", new Item(new FabricItemSettings()));
    public static final Item RAW_OPAL = registerItem("raw_opal", new Item(new FabricItemSettings()));

    public static final Item Bronze = registerItem("bronze", new Item(new FabricItemSettings()));
    public static final Item RAW_BRONZE = registerItem("raw_bronze", new Item(new FabricItemSettings()));

    public static final Item Tin = registerItem("tin", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));

    public static final Item Jade = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item RAW_JADE = registerItem("raw_jade", new Item(new FabricItemSettings()));

    public static final Item Titanium = registerItem("titanium", new Item(new FabricItemSettings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new FabricItemSettings()));

    public static final Item Uranium = registerItem("uranium", new Item(new FabricItemSettings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new FabricItemSettings()));

    public static final Item Platinum = registerItem("platinum", new Item(new FabricItemSettings()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings()));

    public static final Item Zinc = registerItem("zinc", new Item(new FabricItemSettings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new FabricItemSettings()));

    public static final Item Cobalt = registerItem("cobalt", new Item(new FabricItemSettings()));
    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new FabricItemSettings()));

    public static final Item Lead = registerItem("lead", new Item(new FabricItemSettings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings()));

    public static final Item Chrome = registerItem("chrome", new Item(new FabricItemSettings()));
    public static final Item Quantum_Shard = registerItem("quantum_shard", new Item(new FabricItemSettings()));
    public static final Item Rune = registerItem("rune", new Item(new FabricItemSettings()));
    public static final Item Void_Steel = registerItem("void_steel", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item CHOCOLATE = registerItem("chocolate", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE)));
    public static final Item FRIED_EGGS = registerItem("fried_eggs", new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGGS)));
    public static final Item EGGS_BENEDICT = registerItem("eggs_benedict", new Item(new FabricItemSettings().food(ModFoodComponents.EGGS_BENEDICT)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item BAGUETTE = registerItem("baguette", new Item(new FabricItemSettings().food(ModFoodComponents.BAGUETTE)));


    private static void addItemsToTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(Sapphire);
        entries.add(Ruby);
        entries.add(Topaz);
        entries.add(Opal);
        entries.add(Bronze);
        entries.add(Tin);
        entries.add(Jade);
        entries.add(Titanium);
        entries.add(Uranium);
        entries.add(Zinc);
        entries.add(Cobalt);
        entries.add(Lead);
        entries.add(Platinum);
        entries.add(RAW_URANIUM);

        entries.add(Chrome);
        entries.add(Void_Steel);
        entries.add(Quantum_Shard);
        entries.add(Rune);

    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KirbyLandV1.MOD_ID, name), item);
    }
    public static void registerModItems() {
        KirbyLandV1.LOGGER.info("Registering Mod Items for " + KirbyLandV1.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToTabItemGroup);
    }

}

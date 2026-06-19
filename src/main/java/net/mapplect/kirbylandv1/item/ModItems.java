package net.mapplect.kirbylandv1.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mapplect.kirbylandv1.KirbyLandV1;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item Sapphire = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item Topaz = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item Ruby = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item Opal = registerItem("opal", new Item(new FabricItemSettings()));
    public static final Item Bronze = registerItem("bronze", new Item(new FabricItemSettings()));
    public static final Item Tin = registerItem("tin", new Item(new FabricItemSettings()));
    public static final Item Jade = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item Titanium = registerItem("titanium", new Item(new FabricItemSettings()));
    public static final Item Uranium = registerItem("uranium", new Item(new FabricItemSettings()));
    public static final Item Void_Steel = registerItem("void_steel", new Item(new FabricItemSettings()));
    public static final Item Zinc = registerItem("zinc", new Item(new FabricItemSettings()));
    public static final Item Cobalt = registerItem("cobalt", new Item(new FabricItemSettings()));
    public static final Item Lead = registerItem("lead", new Item(new FabricItemSettings()));
    public static final Item Chrome = registerItem("chrome", new Item(new FabricItemSettings()));
    public static final Item Platinum = registerItem("platinum", new Item(new FabricItemSettings()));
    public static final Item Quantum_Shard = registerItem("quantum_shard", new Item(new FabricItemSettings()));



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
        entries.add(Void_Steel);
        entries.add(Zinc);
        entries.add(Cobalt);
        entries.add(Lead);
        entries.add(Chrome);
        entries.add(Platinum);
        entries.add(Quantum_Shard);

    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KirbyLandV1.MOD_ID, name), item);
    }
    public static void registerModItems() {
        KirbyLandV1.LOGGER.info("Registering Mod Items for " + KirbyLandV1.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToTabItemGroup);
    }

}

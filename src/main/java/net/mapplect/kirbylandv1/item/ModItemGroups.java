package net.mapplect.kirbylandv1.item;

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
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.JADE_ORE);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.COBALT_ORE);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BRONZE_ORE);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.OPAL_BLOCK);
                        entries.add(ModBlocks.COBALT_BLOCK);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.PLATINUM_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        KirbyLandV1.LOGGER.info("Registering Item Groups for " + KirbyLandV1.MOD_ID);
    }
}
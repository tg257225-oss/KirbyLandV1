package net.mapplect.kirbylandv1;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.mapplect.kirbylandv1.block.ModBlocks;
import net.mapplect.kirbylandv1.item.ModItemGroups;
import net.mapplect.kirbylandv1.item.ModItems;
import net.mapplect.kirbylandv1.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KirbyLandV1 implements ModInitializer {
	public static final String MOD_ID = "kirbylandv1";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		StrippableBlockRegistry.register(ModBlocks.MAGNOLIA_LOG, ModBlocks.STRIPPED_MAGNOLIA_LOG);
		StrippableBlockRegistry.register(ModBlocks.STRIPPED_MAGNOLIA_WOOD, ModBlocks.STRIPPED_MAGNOLIA_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGNOLIA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGNOLIA_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAGNOLIA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAGNOLIA_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGNOLIA_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGNOLIA_LEAVES, 30, 60);

		ModWorldGeneration.generateModWorldGen();

	}
}
package net.mapplect.kirbylandv1;

import net.fabricmc.api.ModInitializer;

import net.mapplect.kirbylandv1.block.ModBlocks;
import net.mapplect.kirbylandv1.item.ModItemGroups;
import net.mapplect.kirbylandv1.item.ModItems;
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

	}
}
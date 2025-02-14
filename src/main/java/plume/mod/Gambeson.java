package plume.mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import plume.mod.block.ModBlocks;
import plume.mod.item.ModItemGroups;
import plume.mod.item.ModItems;

public class Gambeson implements ModInitializer {
	public static final String MOD_ID = "gambeson";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.initialize();
	}
}
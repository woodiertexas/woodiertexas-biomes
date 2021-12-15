package net.fabricmc.woodiertexas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.CallbackI;

public class WoodiertexasBiomes implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("woodiertexasbiomes");

	public static final Block BLACKWOOD_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
	//public static final Block GLOWING_BLACKWOOD_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//Blackwood Block
		Registry.register(Registry.BLOCK, new Identifier("woodiertexasbiomes", "blackwood_log"), BLACKWOOD_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("woodiertexasbiomes", "blackwood_log"), new BlockItem(BLACKWOOD_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

	}
}

package net.fabricmc.woodiertexas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodiertexasBiomes implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("woodiertexasbiomes");

	//Blocks
	public static final Block BLACKWOOD_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
	public static final Block BLACKWOOD_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
	public static final Block GLOWING_BLACKWOOD_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2.0f));
	public static final Block GLOWING_BLACKWOOD_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f));

	//Plants
	public static final Block FUNNY_LILY_PAD = new WoodiertexasPlantBlocks();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//Blackwood Log
		Registry.register(Registry.BLOCK, new Identifier("woodiertexasbiomes", "blackwood_log"), BLACKWOOD_LOG);
		Registry.register(Registry.ITEM, new Identifier("woodiertexasbiomes", "blackwood_log"), new BlockItem(BLACKWOOD_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//Blackwood Planks
		Registry.register(Registry.BLOCK, new Identifier("woodiertexasbiomes", "blackwood_planks"), BLACKWOOD_PLANKS);
		Registry.register(Registry.ITEM, new Identifier("woodiertexasbiomes", "blackwood_planks"), new BlockItem(BLACKWOOD_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//Glowing Blackwood Log
		Registry.register(Registry.BLOCK, new Identifier("woodiertexasbiomes", "glowing_blackwood_log"), GLOWING_BLACKWOOD_LOG);
		Registry.register(Registry.ITEM, new Identifier("woodiertexasbiomes", "glowing_blackwood_log"), new BlockItem(GLOWING_BLACKWOOD_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//Glowing Blackwood Planks
		Registry.register(Registry.BLOCK, new Identifier("woodiertexasbiomes", "glowing_blackwood_planks"), GLOWING_BLACKWOOD_PLANKS);
		Registry.register(Registry.ITEM, new Identifier("woodiertexasbiomes", "glowing_blackwood_planks"), new BlockItem(GLOWING_BLACKWOOD_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		//Plants
		Registry.register(Registry.BLOCK, new Identifier("woodiertexasbiomes", "funny_lily_pad"), FUNNY_LILY_PAD);
		Registry.register(Registry.ITEM, new Identifier("woodiertexasbiomes", "funny_lily_pad"), new BlockItem(FUNNY_LILY_PAD, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	}
}

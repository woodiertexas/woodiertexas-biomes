package net.fabricmc.woodiertexas;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.PlantBlock;

public class WoodiertexasPlantBlocks extends PlantBlock {
    public WoodiertexasPlantBlocks() {
        super(FabricBlockSettings.of(Material.PLANT).breakInstantly().nonOpaque());
    }
}

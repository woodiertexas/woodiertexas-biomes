package net.fabricmc.woodiertexas;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodiertexasBiomesClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("woodiertexasbiomesCLIENT");

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(WoodiertexasBiomes.FUNNY_LILY_PAD, RenderLayer.getCutout());
    }
}

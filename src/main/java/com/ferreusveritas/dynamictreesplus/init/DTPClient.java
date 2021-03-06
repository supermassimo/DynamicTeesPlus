package com.ferreusveritas.dynamictreesplus.init;

import com.ferreusveritas.dynamictreesplus.blocks.CactusBranchBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.registries.ForgeRegistries;

public class DTPClient {

    public static void setup() {
        registerRenderLayers();
    }

    private static void registerRenderLayers () {
        ForgeRegistries.BLOCKS.getValues().stream().filter(block -> block instanceof CactusBranchBlock)
                .forEach(block -> RenderTypeLookup.setRenderLayer(block, RenderType.cutoutMipped()));
    }

}

package com.ferreusveritas.dynamictreesplus.trees;

import com.ferreusveritas.dynamictrees.api.registry.TypedRegistry;
import com.ferreusveritas.dynamictrees.blocks.branches.BranchBlock;
import com.ferreusveritas.dynamictrees.trees.Family;
import com.ferreusveritas.dynamictreesplus.blocks.CactusBranchBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class CactusFamily extends Family {

    public static final TypedRegistry.EntryType<Family> TYPE = TypedRegistry.newType(CactusFamily::new);

    public CactusFamily(final ResourceLocation registryName) {
        super(registryName);
    }

    @Override
    public Material getDefaultBranchMaterial() {
        return Material.CACTUS;
    }

    @Override
    public SoundType getDefaultBranchSoundType() {
        return SoundType.WOOL;
    }

    @Override
    protected BranchBlock createBranchBlock() {
        return new CactusBranchBlock(this.getProperties());
    }

    @Override
    public int getPrimaryThickness() {
        return 5;
    }

    @Override
    public int getSecondaryThickness() {
        return 4;
    }

}

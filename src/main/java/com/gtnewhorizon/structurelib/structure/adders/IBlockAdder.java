package com.gtnewhorizon.structurelib.structure.adders;


import net.minecraft.world.level.block.Block;

public interface IBlockAdder<T> {

    /**
     * Callback on block added, needs to check if block is valid (and add it)
     *
     * @param block block attempted to add
     * @return is structure still valid
     */
    boolean apply(T t, Block block);
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.paintjob;

import net.minecraft.item.ItemStack;

public class Paintjob
{
    public int ID;
    public String displayName;
    public String iconName;
    public String textureName;
    public ItemStack[] dyesNeeded;
    
    public Paintjob(final int id, final String iconName, final String textureName, final ItemStack[] dyesNeeded) {
        this(id, "", iconName, textureName, dyesNeeded);
    }
    
    public Paintjob(final int id, final String displayName, final String iconName, final String textureName, final ItemStack[] dyesNeeded) {
        this.ID = id;
        this.displayName = displayName;
        this.iconName = iconName;
        this.textureName = textureName;
        this.dyesNeeded = dyesNeeded;
    }
}

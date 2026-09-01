// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public abstract class ItemShootable extends Item
{
    public ShootableType type;
    
    public ItemShootable(final ShootableType t) {
        this.type = t;
        this.maxStackSize = this.type.maxStackSize;
        this.setMaxDurability(this.type.roundsPerItem);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public abstract EntityShootable getEntity(final World p0, final Vec3 p1, final float p2, final float p3, final double p4, final double p5, final double p6, final EntityLivingBase p7, final float p8, final int p9, final InfoType p10);
    
    public abstract EntityShootable getEntity(final World p0, final Vector3f p1, final Vector3f p2, final EntityLivingBase p3, final float p4, final float p5, final float p6, final int p7, final InfoType p8);
    
    public abstract EntityShootable getEntity(final World p0, final Vector3f p1, final Vector3f p2, final EntityLivingBase p3, final float p4, final float p5, final float p6, final int p7, final InfoType p8, final Boolean p9);
    
    public abstract EntityShootable getEntity(final World p0, final Vec3 p1, final float p2, final float p3, final EntityLivingBase p4, final float p5, final float p6, final int p7, final InfoType p8);
    
    public abstract EntityShootable getEntity(final World p0, final EntityLivingBase p1, final float p2, final float p3, final float p4, final boolean p5, final int p6, final InfoType p7, final float p8, final float p9, final float p10);
}

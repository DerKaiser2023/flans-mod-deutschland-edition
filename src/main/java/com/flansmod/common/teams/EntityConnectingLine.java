// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.projectile.EntityFishHook;

public class EntityConnectingLine extends EntityFishHook
{
    public Object connectedTo;
    
    public EntityConnectingLine(final World world) {
        super(world);
    }
    
    public EntityConnectingLine(final World world, final EntityPlayer player, final ITeamBase base) {
        super(world);
        this.caughtEntity = (Entity)this;
        this.ignoreFrustumCheck = true;
        this.angler = player;
        ((EntityConnectingLine)(this.angler.fishEntity = this)).setSize(0.25f, 0.25f);
        this.setPosition(base.getPosX(), base.getPosY(), base.getPosZ());
        this.yOffset = 0.0f;
        this.motionX = 0.0;
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.connectedTo = base;
    }
    
    public EntityConnectingLine(final World world, final EntityPlayer player, final ITeamObject object) {
        super(world);
        this.caughtEntity = (Entity)this;
        this.ignoreFrustumCheck = true;
        this.angler = player;
        ((EntityConnectingLine)(this.angler.fishEntity = this)).setSize(0.25f, 0.25f);
        this.setPosition(object.getPosX(), object.getPosY(), object.getPosZ());
        this.yOffset = 0.0f;
        this.motionX = 0.0;
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.connectedTo = object;
    }
    
    public void onUpdate() {
        final ItemStack currentItemstack = this.angler.inventory.getCurrentItem();
        if (currentItemstack == null || !(currentItemstack.getItem() instanceof ItemOpStick) || currentItemstack.getMetadata() != 1) {
            this.setDead();
            this.angler.fishEntity = null;
        }
    }
}

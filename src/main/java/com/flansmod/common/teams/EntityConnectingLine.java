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
        this.field_146043_c = (Entity)this;
        this.field_70158_ak = true;
        this.field_146042_b = player;
        ((EntityConnectingLine)(this.field_146042_b.field_71104_cf = this)).func_70105_a(0.25f, 0.25f);
        this.func_70107_b(base.getPosX(), base.getPosY(), base.getPosZ());
        this.field_70129_M = 0.0f;
        this.field_70159_w = 0.0;
        this.field_70179_y = 0.0;
        this.field_70181_x = 0.0;
        this.connectedTo = base;
    }
    
    public EntityConnectingLine(final World world, final EntityPlayer player, final ITeamObject object) {
        super(world);
        this.field_146043_c = (Entity)this;
        this.field_70158_ak = true;
        this.field_146042_b = player;
        ((EntityConnectingLine)(this.field_146042_b.field_71104_cf = this)).func_70105_a(0.25f, 0.25f);
        this.func_70107_b(object.getPosX(), object.getPosY(), object.getPosZ());
        this.field_70129_M = 0.0f;
        this.field_70159_w = 0.0;
        this.field_70179_y = 0.0;
        this.field_70181_x = 0.0;
        this.connectedTo = object;
    }
    
    public void func_70071_h_() {
        final ItemStack currentItemstack = this.field_146042_b.field_71071_by.func_70448_g();
        if (currentItemstack == null || !(currentItemstack.func_77973_b() instanceof ItemOpStick) || currentItemstack.func_77960_j() != 1) {
            this.func_70106_y();
            this.field_146042_b.field_71104_cf = null;
        }
    }
}

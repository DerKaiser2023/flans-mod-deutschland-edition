// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.tools;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.Entity;

public class EntityParachute extends Entity implements IEntityAdditionalSpawnData
{
    public ToolType type;
    
    public EntityParachute(final World w) {
        super(w);
        this.ignoreFrustumCheck = true;
        System.out.println(w.isRemote ? "Client paraspawn" : "Server paraspawn");
    }
    
    public EntityParachute(final World w, final ToolType t, final EntityPlayer player) {
        this(w);
        this.type = t;
        if (canUseParachute((Entity)player)) {
            --player.posY;
            this.setPosition(player.posX, player.posY - 1.5, player.posZ);
        }
        else {
            this.setDead();
        }
    }
    
    public static boolean canUseParachute(final Entity player) {
        final List list = player.worldObj.getCollidingBoundingBoxes(player, player.boundingBox.expand(0.0, 3.0, 0.0));
        return list.size() == 0;
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity.ridingEntity != this)) {
            this.setDead();
        }
        if (this.riddenByEntity != null) {
            this.riddenByEntity.fallDistance = 0.0f;
        }
        this.motionY = -0.3;
        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityLivingBase) {
            final float speedMultiplier = 0.025f;
            final double moveForwards = ((EntityLivingBase)this.riddenByEntity).moveForward;
            final double moveStrafing = ((EntityLivingBase)this.riddenByEntity).moveStrafing;
            final double sinYaw = -Math.sin(this.riddenByEntity.rotationYaw * 3.1415927f / 180.0f);
            final double cosYaw = Math.cos(this.riddenByEntity.rotationYaw * 3.1415927f / 180.0f);
            this.motionX += (moveForwards * sinYaw + moveStrafing * cosYaw) * speedMultiplier * 0.0;
            this.motionZ += (moveForwards * cosYaw - moveStrafing * sinYaw) * speedMultiplier * 0.0;
            this.prevRotationYaw = this.rotationYaw;
            this.rotationYaw = this.riddenByEntity.rotationYaw;
        }
        this.motionX *= 0.0;
        this.motionZ *= 0.0;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (this.onGround || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)).getMaterial() == Material.water) {
            this.setDead();
        }
    }
    
    protected void fall(final float par1) {
    }
    
    public boolean attackEntityFrom(final DamageSource source, final float f) {
        this.setDead();
        return true;
    }
    
    protected void entityInit() {
    }
    
    protected void readEntityFromNBT(final NBTTagCompound tags) {
        this.type = ToolType.getType(tags.getString("Type"));
    }
    
    protected void writeEntityToNBT(final NBTTagCompound tags) {
        tags.setString("Type", this.type.shortName);
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack(this.type.item, 1, 0);
        return stack;
    }
    
    public void writeSpawnData(final ByteBuf buffer) {
        ByteBufUtils.writeUTF8String(buffer, this.type.shortName);
    }
    
    public void readSpawnData(final ByteBuf additionalData) {
        this.type = ToolType.getType(ByteBufUtils.readUTF8String(additionalData));
    }
}

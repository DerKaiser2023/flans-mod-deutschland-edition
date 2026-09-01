// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import com.flansmod.common.guns.ItemBullet;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import com.flansmod.common.driveables.DriveableData;
import net.minecraft.entity.Entity;
import java.util.ArrayList;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.item.ItemStack;

public class PacketCurrentMissile extends PacketBase
{
    public int entityid;
    public ItemStack missile;
    
    public PacketCurrentMissile() {
    }
    
    public PacketCurrentMissile(final int entityid, final ItemStack missile) {
        this.entityid = entityid;
        this.missile = missile;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.entityid);
        ByteBufUtils.writeItemStack(data, this.missile);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.entityid = data.readInt();
        this.missile = ByteBufUtils.readItemStack(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final Entity e = playerEntity.worldObj.getEntityByID(this.entityid);
        if (e != null && e instanceof EntityDriveable) {
            final EntityDriveable v = (EntityDriveable)e;
            if (!v.worldObj.isRemote && System.currentTimeMillis() - v.lastshellswitchedat > 1000L) {
                v.lastshellswitchedat = System.currentTimeMillis();
                final DriveableData dd = v.getDriveableData();
                final ArrayList<ItemStack> notnull = new ArrayList<ItemStack>();
                for (final ItemStack is : dd.missiles) {
                    if (is != null) {
                        notnull.add(is);
                    }
                }
                if (notnull.size() > 0) {
                    final ItemStack[] newmissiles = new ItemStack[v.getDriveableType().numMissileSlots];
                    newmissiles[notnull.size() - 1] = notnull.get(0);
                    int i = -1;
                    for (final ItemStack is : notnull) {
                        if (++i == 0) {
                            continue;
                        }
                        newmissiles[i - 1] = is;
                    }
                    dd.missiles = newmissiles;
                    PacketPlaySound.sendSoundPacket(e.posX, e.posY, e.posZ, 4.0, e.dimension, "AnalogComputerSound", false);
                }
            }
        }
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final Entity e = clientPlayer.worldObj.getEntityByID(this.entityid);
        if (e != null && e instanceof EntityDriveable && this.missile.getItem() instanceof ItemBullet) {
            ((EntityDriveable)e).currentAmmo = ((ItemBullet)this.missile.getItem()).type.name;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import com.flansmod.client.TickHandlerClient;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.types.InfoType;

public class PacketKillMessage extends PacketBase
{
    public InfoType killedBy;
    public int itemDamage;
    public String killerName;
    public String killedName;
    public boolean headshot;
    public boolean dumbMessage;
    public float distance;
    
    public PacketKillMessage() {
        this.dumbMessage = false;
    }
    
    public PacketKillMessage(final boolean head, final InfoType weapon, final int itmDmg, final String victim, final String murderer, final Float dist) {
        this.dumbMessage = false;
        this.killedBy = weapon;
        this.itemDamage = itmDmg;
        this.killerName = murderer;
        this.killedName = victim;
        this.headshot = head;
        this.distance = dist;
    }
    
    public PacketKillMessage(final String murderer, final String victim) {
        this.dumbMessage = false;
        this.dumbMessage = true;
        this.killerName = murderer;
        this.killedName = victim;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        if (!this.dumbMessage) {
            data.writeBoolean(this.headshot);
            this.writeUTF(data, this.killedBy.shortName);
            data.writeInt(this.itemDamage);
            data.writeFloat(this.distance);
        }
        data.writeBoolean(this.dumbMessage);
        this.writeUTF(data, this.killerName);
        this.writeUTF(data, this.killedName);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        if (!this.dumbMessage) {
            this.headshot = data.readBoolean();
            this.killedBy = InfoType.getType(this.readUTF(data));
            this.itemDamage = data.readInt();
            this.distance = data.readFloat();
        }
        this.dumbMessage = data.readBoolean();
        this.killerName = this.readUTF(data);
        this.killedName = this.readUTF(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Player kill Killer: " + this.killerName + " Killed " + this.killedName + " using: " + this.killedBy.shortName + " Headshot: " + this.headshot);
        FlansMod.log("Distance " + this.distance);
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        if (!this.dumbMessage) {
            TickHandlerClient.addKillMessage(this.headshot, this.killedBy, this.itemDamage, this.killerName, this.killedName);
        }
        else {
            TickHandlerClient.addKillMessageDumb(this.killerName, this.killedName);
        }
    }
}

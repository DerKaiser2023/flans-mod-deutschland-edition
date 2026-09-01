// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityDriveable;

public class PacketPlaneControl extends PacketDriveableControl
{
    public boolean gear;
    public boolean doors;
    public boolean wings;
    public boolean flare;
    public boolean flaps;
    public int state;
    
    public PacketPlaneControl() {
    }
    
    public PacketPlaneControl(final EntityDriveable driveable) {
        super(driveable);
        final EntityPlane plane = (EntityPlane)driveable;
        this.gear = plane.varGear;
        this.doors = plane.varDoor;
        this.wings = plane.varWing;
        this.state = plane.anim.state;
        this.flaps = plane.varFlap;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        super.encodeInto(ctx, data);
        data.writeBoolean(this.gear);
        data.writeBoolean(this.doors);
        data.writeBoolean(this.wings);
        data.writeBoolean(this.flaps);
        data.writeInt(this.state);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        super.decodeInto(ctx, data);
        this.gear = data.readBoolean();
        this.doors = data.readBoolean();
        this.wings = data.readBoolean();
        this.flaps = data.readBoolean();
        this.state = data.readInt();
    }
    
    @Override
    protected void updateDriveable(final EntityDriveable driveable, final boolean clientSide) {
        super.updateDriveable(driveable, clientSide);
        final EntityPlane plane = (EntityPlane)driveable;
        plane.varDoor = this.doors;
        plane.varGear = this.gear;
        plane.varWing = this.wings;
        plane.varFlap = this.flaps;
        plane.anim.state = this.state;
    }
}

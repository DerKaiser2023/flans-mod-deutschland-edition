// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityDriveable;

public class PacketVehicleControl extends PacketDriveableControl
{
    public boolean doors;
    public String seatBelt;
    
    public PacketVehicleControl() {
    }
    
    public PacketVehicleControl(final EntityDriveable driveable) {
        super(driveable);
        final EntityVehicle vehicle = (EntityVehicle)driveable;
        this.doors = vehicle.varDoor;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        super.encodeInto(ctx, data);
        data.writeBoolean(this.doors);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        super.decodeInto(ctx, data);
        this.doors = data.readBoolean();
    }
    
    @Override
    protected void updateDriveable(final EntityDriveable driveable, final boolean clientSide) {
        super.updateDriveable(driveable, clientSide);
        final EntityVehicle vehicle = (EntityVehicle)driveable;
        vehicle.varDoor = this.doors;
    }
}

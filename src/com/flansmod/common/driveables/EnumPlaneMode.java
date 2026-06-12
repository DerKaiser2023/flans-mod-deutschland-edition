// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

public enum EnumPlaneMode
{
    PLANE, 
    VTOL, 
    HELI, 
    SIXDOF;
    
    public static EnumPlaneMode getMode(final String s) {
        if (s.toLowerCase().equals("vtol")) {
            return EnumPlaneMode.VTOL;
        }
        if (s.toLowerCase().equals("heli")) {
            return EnumPlaneMode.HELI;
        }
        return EnumPlaneMode.PLANE;
    }
}

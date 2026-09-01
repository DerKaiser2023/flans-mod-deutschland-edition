// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

public enum EnumSecondaryFunction
{
    ZOOM, 
    ADS_ZOOM, 
    MELEE, 
    CUSTOM_MELEE;
    
    public static EnumSecondaryFunction get(String s) {
        s = s.toLowerCase();
        if (s.equals("zoom")) {
            return EnumSecondaryFunction.ZOOM;
        }
        if (s.equals("melee")) {
            return EnumSecondaryFunction.MELEE;
        }
        if (s.equals("custommelee")) {
            return EnumSecondaryFunction.CUSTOM_MELEE;
        }
        return EnumSecondaryFunction.ADS_ZOOM;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

public enum EnumFireMode
{
    SEMIAUTO, 
    FULLAUTO, 
    MINIGUN, 
    BURST;
    
    public static EnumFireMode getFireMode(String s) {
        s = s.toLowerCase();
        if (s.equals("fullauto")) {
            return EnumFireMode.FULLAUTO;
        }
        if (s.equals("minigun")) {
            return EnumFireMode.FULLAUTO;
        }
        if (s.equals("burst")) {
            return EnumFireMode.BURST;
        }
        return EnumFireMode.SEMIAUTO;
    }
}

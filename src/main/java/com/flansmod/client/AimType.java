// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.util.StatCollector;

public enum AimType
{
    HOLD, 
    TOGGLE;
    
    public String getName() {
        return StatCollector.translateToLocal(String.format("aimtype.%s.name", this.name().toLowerCase()));
    }
    
    public static AimType fromString(final String input) {
        for (final AimType aimType : values()) {
            if (aimType.name().equalsIgnoreCase(input)) {
                return aimType;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}

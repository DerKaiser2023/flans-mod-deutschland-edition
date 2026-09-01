// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

public enum EnumAttachmentType
{
    barrel, 
    sights, 
    stock, 
    grip, 
    gadget, 
    slide, 
    pump, 
    accessory, 
    generic;
    
    public static EnumAttachmentType get(final String s) {
        for (final EnumAttachmentType type : values()) {
            if (type.toString().equals(s)) {
                return type;
            }
        }
        return EnumAttachmentType.generic;
    }
}

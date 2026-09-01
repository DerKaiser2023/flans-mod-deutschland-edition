// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.util.StatCollector;

public enum FlanMouseButton
{
    LEFT(0), 
    RIGHT(1);
    
    private int buttonNumber;
    
    private FlanMouseButton(final int button) {
        this.buttonNumber = button;
    }
    
    public String getName() {
        return StatCollector.func_74838_a(String.format("firebutton.%s.name", this.name().toLowerCase()));
    }
    
    public int getButton() {
        return this.buttonNumber;
    }
    
    public static FlanMouseButton fromString(final String input) {
        for (final FlanMouseButton buttonType : values()) {
            if (buttonType.name().equalsIgnoreCase(input)) {
                return buttonType;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}

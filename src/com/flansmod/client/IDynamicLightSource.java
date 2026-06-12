// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.entity.Entity;

public interface IDynamicLightSource
{
    Entity getAttachmentEntity();
    
    int getLightLevel();
}

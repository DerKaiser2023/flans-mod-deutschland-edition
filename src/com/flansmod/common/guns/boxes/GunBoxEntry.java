// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.boxes;

import java.util.ArrayList;
import net.minecraft.item.ItemStack;
import java.util.List;
import com.flansmod.common.types.InfoType;

public class GunBoxEntry
{
    public InfoType type;
    public List<ItemStack> requiredParts;
    public List<GunBoxEntry> ammoEntryList;
    
    public GunBoxEntry(final InfoType aType, final List<ItemStack> aParts) {
        this.type = aType;
        this.requiredParts = aParts;
    }
    
    public void addAmmoEntry(final GunBoxEntry ammo) {
        if (this.ammoEntryList == null) {
            this.ammoEntryList = new ArrayList<GunBoxEntry>();
        }
        this.ammoEntryList.add(ammo);
    }
    
    public boolean isAmmoNullOrEmpty() {
        return this.ammoEntryList == null || this.ammoEntryList.isEmpty();
    }
}

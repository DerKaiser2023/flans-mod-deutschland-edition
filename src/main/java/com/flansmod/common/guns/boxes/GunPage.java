// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.boxes;

public class GunPage
{
    public String pageName;
    public GunBoxEntry[] gunList;
    
    public GunPage(final String n) {
        this.pageName = n;
    }
    
    public void addGunList(final GunBoxEntry[] list) {
        this.gunList = list;
    }
    
    public int getSize() {
        return this.gunList.length;
    }
    
    public boolean isPageEmpty() {
        return this.gunList.length == 0;
    }
    
    public void setPageName(final String name) {
        this.pageName = name;
    }
}

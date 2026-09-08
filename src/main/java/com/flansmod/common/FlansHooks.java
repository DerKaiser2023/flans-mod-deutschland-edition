// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Loader;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FlansHooks
{
    public Class BuildCraftEnergy;
    public ItemStack BuildCraftFuelBucket;
    public ItemStack BuildCraftOilBucket;
    public boolean BuildCraftLoaded;
    public boolean hbmLoaded;
    
    public void hook() {
        if (Loader.isModLoaded("BuildCraft|Energy")) {
            this.BuildCraftFuelBucket = this.getBuildCraftItem("bucketFuel");
            this.BuildCraftOilBucket = this.getBuildCraftItem("bucketOil");
            System.out.println("[Flan] BuildCraft integration loaded.");
            this.BuildCraftLoaded = true;
        }
        if (Loader.isModLoaded("hbm")) {
            this.hbmLoaded = true;
            System.out.println("[Flan] HBM Nuclear Tech integration loaded.");
        }
    }
    
    public ItemStack getBuildCraftItem(final String name) {
        try {
            if (this.BuildCraftEnergy == null) {
                this.BuildCraftEnergy = Class.forName("buildcraft.BuildCraftEnergy");
            }
            if (this.BuildCraftEnergy == null) {
                this.BuildCraftEnergy = Class.forName("net.minecraft.src.buildcraft.BuildCraftEnergy");
            }
            final Object ret = this.BuildCraftEnergy.getField(name).get(null);
            if (ret instanceof Item) {
                return new ItemStack((Item)ret);
            }
            throw new Exception();
        }
        catch (final Exception e) {
            System.out.println("[Flan] Unable to retrieve BuildCraft item " + name + ".");
            return null;
        }
    }
    
    public boolean spawnHbmNuke(final World world, double x, double y, double z, int radius) {
        if (!this.hbmLoaded || world.isRemote || radius <= 0) {
            return false;
        }
        try {
            Class<?> nukeClass = Class.forName("com.hbm.entity.logic.EntityNukeExplosionMK5");
            java.lang.reflect.Method statFac = nukeClass.getMethod("statFac", World.class, int.class, double.class, double.class, double.class);
            Entity nuke = (Entity) statFac.invoke(null, world, radius, x, y, z);
            if (nuke != null && !nuke.isDead) {
                world.playSoundEffect(x, y, z, "random.explode", 1.0f, world.rand.nextFloat() * 0.1f + 0.9f);
                world.spawnEntityInWorld(nuke);
                return true;
            }
        }
        catch (final Exception e) {
            System.out.println("[Flan] Failed to spawn HBM nuke.");
            e.printStackTrace();
        }
        return false;
    }
}

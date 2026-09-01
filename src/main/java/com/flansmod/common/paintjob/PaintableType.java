// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.paintjob;

import com.flansmod.common.FlansMod;
import net.minecraft.init.Items;
import java.util.Collection;
import net.minecraft.item.ItemStack;
import com.flansmod.common.types.TypeFile;
import java.util.ArrayList;
import com.flansmod.common.types.InfoType;

public abstract class PaintableType extends InfoType
{
    public ArrayList<Paintjob> paintjobs;
    public Paintjob defaultPaintjob;
    private int nextPaintjobID;
    private String paintjobName;
    
    public PaintableType(final TypeFile file) {
        super(file);
        this.paintjobs = new ArrayList<Paintjob>();
        this.nextPaintjobID = 1;
    }
    
    public void preRead(final TypeFile file) {
    }
    
    public void postRead(final TypeFile file) {
        this.defaultPaintjob = new Paintjob(0, this.iconPath, this.texture, new ItemStack[0]);
        this.defaultPaintjob = new Paintjob(0, "default", this.iconPath, this.texture, new ItemStack[0]);
        final ArrayList<Paintjob> newPaintjobList = new ArrayList<Paintjob>();
        newPaintjobList.add(this.defaultPaintjob);
        newPaintjobList.addAll(this.paintjobs);
        this.paintjobs = newPaintjobList;
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].toLowerCase().equals("paintjob")) {
                final ItemStack[] dyeStacks = new ItemStack[(split.length - 3) / 2];
                for (int i = 0; i < (split.length - 3) / 2; ++i) {
                    dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 4]), this.getDyeDamageValue(split[i * 2 + 3]));
                }
                this.paintjobs.add(new Paintjob(this.nextPaintjobID++, split[1], split[2], dyeStacks));
            }
        }
        catch (final Exception e) {
            FlansMod.log("Reading paintable file failed : " + this.shortName);
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
        try {
            if (split[0].toLowerCase().equals("advpaintjob")) {
                final ItemStack[] dyeStacks = new ItemStack[(split.length - 4) / 2];
                for (int i = 0; i < (split.length - 4) / 2; ++i) {
                    dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 5]), this.getDyeDamageValue(split[i * 2 + 4]));
                }
                this.paintjobs.add(new Paintjob(this.nextPaintjobID++, split[1], split[2], split[3], dyeStacks));
            }
        }
        catch (final Exception e) {
            FlansMod.log("Reading file failed : " + this.shortName);
            e.printStackTrace();
        }
    }
    
    public Paintjob getPaintjob(final int i) {
        return this.paintjobs.get(i);
    }
    
    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }
}

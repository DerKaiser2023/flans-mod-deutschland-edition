// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.nbt.NBTTagCompound;
import java.util.Iterator;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.types.InfoType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.util.IIcon;
import com.flansmod.common.paintjob.IPaintableItem;
import net.minecraft.item.Item;

public class ItemAttachment extends Item implements IPaintableItem
{
    public AttachmentType type;
    public boolean barisLaser;
    public boolean barisInfrared;
    public IIcon[] icons;
    
    public ItemAttachment(final AttachmentType t) {
        this.barisLaser = false;
        this.barisInfrared = false;
        this.type = t;
        this.type.item = this;
        this.maxStackSize = t.maxStackSize;
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanGuns);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
        this.barisLaser = t.barisLaser;
        this.barisInfrared = t.barisInfrared;
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister icon) {
        this.icons = new IIcon[this.type.paintjobs.size()];
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
        for (int i = 0; i < this.type.paintjobs.size(); ++i) {
            this.icons[i] = icon.registerIcon("FlansMod:" + this.type.paintjobs.get(i).iconName);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(final ItemStack stack) {
        return this.icons[stack.getMetadata()];
    }
    
    public void addInformation(final ItemStack stack, final EntityPlayer player, final List lines, final boolean b) {
        if (!this.type.getPaintjob(stack.getMetadata()).displayName.equals("default")) {
            lines.add("§b§o" + this.type.getPaintjob(stack.getMetadata()).displayName);
        }
        if (!this.type.packName.isEmpty()) {
            lines.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    public PaintableType GetPaintableType() {
        return this.type;
    }
    
    public void getSubItems(final Item item, final CreativeTabs tabs, final List list) {
        final PaintableType type = ((IPaintableItem)item).GetPaintableType();
        if (FlansMod.addAllPaintjobsToCreative) {
            for (final Paintjob paintjob : type.paintjobs) {
                this.addPaintjobToList(item, type, paintjob, list);
            }
        }
        else {
            this.addPaintjobToList(item, type, type.defaultPaintjob, list);
        }
    }
    
    private void addPaintjobToList(final Item item, final PaintableType type, final Paintjob paintjob, final List list) {
        final ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
        final NBTTagCompound tags = new NBTTagCompound();
        paintableStack.setTagCompound(tags);
        list.add(paintableStack);
    }
}

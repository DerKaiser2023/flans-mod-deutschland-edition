// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.flansmod.common.driveables.CollisionBox;
import com.flansmod.common.driveables.EnumDriveablePart;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.driveables.DriveableData;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import com.flansmod.common.types.EnumType;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.parts.PartType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.util.IIcon;
import com.flansmod.common.paintjob.IPaintableItem;
import net.minecraft.item.Item;

public class ItemMecha extends Item implements IPaintableItem
{
    public MechaType type;
    public IIcon[] icons;
    
    public ItemMecha(final MechaType type1) {
        this.field_77777_bU = 1;
        this.type = type1;
        ((ItemMecha)(this.type.item = this)).func_77637_a((CreativeTabs)FlansMod.tabFlanMechas);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void func_77624_a(final ItemStack stack, final EntityPlayer player, final List lines, final boolean b) {
        if (!this.type.packName.isEmpty()) {
            lines.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        final NBTTagCompound tags = this.getTagCompound(stack, player.field_70170_p);
        final String engineName = tags.func_74779_i("Engine");
        final PartType part = PartType.getPart(engineName);
        if (part != null) {
            lines.add(part.name);
        }
    }
    
    public boolean func_77651_p() {
        return true;
    }
    
    private NBTTagCompound getTagCompound(final ItemStack stack, final World world) {
        if (stack.field_77990_d == null) {
            (stack.field_77990_d = new NBTTagCompound()).func_74778_a("Type", this.type.shortName);
            stack.field_77990_d.func_74778_a("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
        }
        return stack.field_77990_d;
    }
    
    public ItemStack func_77659_a(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        final float cosYaw = MathHelper.func_76134_b(-entityplayer.field_70177_z * 0.01745329f - 3.141593f);
        final float sinYaw = MathHelper.func_76126_a(-entityplayer.field_70177_z * 0.01745329f - 3.141593f);
        final float cosPitch = -MathHelper.func_76134_b(-entityplayer.field_70125_A * 0.01745329f);
        final float sinPitch = MathHelper.func_76126_a(-entityplayer.field_70125_A * 0.01745329f);
        final double length = 5.0;
        final Vec3 posVec = Vec3.func_72443_a(entityplayer.field_70165_t, entityplayer.field_70163_u + 1.62 - entityplayer.field_70129_M, entityplayer.field_70161_v);
        final Vec3 lookVec = posVec.func_72441_c(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        final MovingObjectPosition movingobjectposition = world.func_72901_a(posVec, lookVec, true);
        if (movingobjectposition == null) {
            return itemstack;
        }
        if (movingobjectposition.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK) {
            final int i = movingobjectposition.field_72311_b;
            final int j = movingobjectposition.field_72312_c;
            final int k = movingobjectposition.field_72309_d;
            if (!world.field_72995_K) {
                world.func_72838_d((Entity)new EntityMecha(world, i + 0.5, j + 1.5 + this.type.yOffset, k + 0.5, entityplayer, this.type, this.getData(itemstack, world), this.getTagCompound(itemstack, world)));
            }
            if (!entityplayer.field_71075_bZ.field_75098_d) {
                --itemstack.field_77994_a;
            }
        }
        return itemstack;
    }
    
    public DriveableData getData(final ItemStack itemstack, final World world) {
        return new DriveableData(this.getTagCompound(itemstack, world), itemstack.func_77960_j());
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    public void func_150895_a(final Item item, final CreativeTabs tabs, final List list) {
        final ItemStack mechaStack = new ItemStack(item, 1, 0);
        final NBTTagCompound tags = new NBTTagCompound();
        tags.func_74778_a("Type", this.type.shortName);
        if (PartType.defaultEngines.containsKey(EnumType.mecha)) {
            tags.func_74778_a("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
        }
        for (final EnumDriveablePart part : EnumDriveablePart.values()) {
            tags.func_74768_a(part.getShortName() + "_Health", (this.type.health.get(part) == null) ? 0 : this.type.health.get(part).health);
            tags.func_74757_a(part.getShortName() + "_Fire", false);
        }
        mechaStack.field_77990_d = tags;
        list.add(mechaStack);
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.icons = new IIcon[this.type.paintjobs.size()];
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
        for (int i = 0; i < this.type.paintjobs.size(); ++i) {
            this.icons[i] = icon.func_94245_a("FlansMod:" + this.type.paintjobs.get(i).iconName);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon func_77650_f(final ItemStack stack) {
        return this.icons[stack.func_77960_j()];
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    public PaintableType GetPaintableType() {
        return this.type;
    }
}

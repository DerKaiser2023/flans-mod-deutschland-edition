// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import java.util.ArrayList;
import com.flansmod.common.types.IFlanItem;
import net.minecraft.item.Item;

public class ItemAAGun extends Item implements IFlanItem
{
    public static final ArrayList<String> names;
    @SideOnly(Side.CLIENT)
    private ArrayList<IIcon> icons;
    public AAGunType type;
    
    public ItemAAGun(final AAGunType type1) {
        this.field_77777_bU = 1;
        this.type = type1;
        ((ItemAAGun)(this.type.item = this)).func_77637_a((CreativeTabs)FlansMod.tabFlanGuns);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
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
            if (!world.field_72995_K && world.isSideSolid(i, j, k, ForgeDirection.UP)) {
                world.func_72838_d((Entity)new EntityAAGun(world, this.type, i + 0.5, j + 1.0, k + 0.5, entityplayer));
            }
            if (!entityplayer.field_71075_bZ.field_75098_d) {
                --itemstack.field_77994_a;
            }
        }
        return itemstack;
    }
    
    public Entity spawnAAGun(final World world, final double x, final double y, final double z, final ItemStack stack) {
        final Entity entity = new EntityAAGun(world, this.type, x, y, z, null);
        if (!world.field_72995_K) {
            world.func_72838_d(entity);
        }
        return entity;
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    static {
        names = new ArrayList<String>();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import java.util.Iterator;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketBaseEdit;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import net.minecraft.item.Item;

public class ItemOpStick extends Item
{
    public static final String[] teamNames;
    public static final String[] stickNames;
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    
    public ItemOpStick() {
        this.func_77655_b("opStick");
        this.func_77627_a(true);
    }
    
    public boolean func_77629_n_() {
        return true;
    }
    
    public boolean func_77662_d() {
        return true;
    }
    
    public void clickedEntity(final World world, final EntityPlayer player, final Entity clicked) {
        if (!(player instanceof EntityPlayerMP)) {
            return;
        }
        if (clicked instanceof ITeamBase) {
            this.clickedBase(world, (EntityPlayerMP)player, (ITeamBase)clicked);
        }
        if (clicked instanceof ITeamObject) {
            this.clickedObject(world, (EntityPlayerMP)player, (ITeamObject)clicked);
        }
    }
    
    public static void openBaseEditGUI(final ITeamBase base, final EntityPlayerMP player) {
        final String[] maps = new String[TeamsManager.getInstance().maps.values().size()];
        if (maps.length == 0) {
            TeamsManager.messagePlayer(player, "Maps are not yet set up. Use /teams help");
            return;
        }
        int currentMapID = -1;
        int i = 0;
        for (final TeamsMap map : TeamsManager.getInstance().maps.values()) {
            maps[i] = map.name;
            if (map == base.getMap()) {
                currentMapID = i;
            }
            ++i;
        }
        FlansMod.getPacketHandler().sendTo(new PacketBaseEdit(base.getBaseID(), base.getName(), maps, currentMapID, base.getDefaultOwnerID()), player);
    }
    
    public void clickedBase(final World world, final EntityPlayerMP player, final ITeamBase base) {
        final int damage = player.field_71071_by.func_70448_g().func_77960_j();
        final TeamsManager teamsManager = TeamsManager.getInstance();
        switch (damage) {
            case 0: {
                int currentOwnerID = base.getDefaultOwnerID();
                currentOwnerID = ++currentOwnerID % 4;
                base.setDefaultOwnerID(currentOwnerID);
                base.setOwnerID(currentOwnerID);
                for (final ITeamObject object : base.getObjects()) {
                    object.onBaseSet(currentOwnerID);
                }
                TeamsManager.messagePlayer(player, "Base owner changed to " + ItemOpStick.teamNames[currentOwnerID]);
                break;
            }
            case 1: {
                if (player.field_71104_cf == null) {
                    final EntityConnectingLine hook = new EntityConnectingLine(world, (EntityPlayer)player, base);
                    world.func_72838_d((Entity)hook);
                    break;
                }
                if (player.field_71104_cf instanceof EntityConnectingLine) {
                    final EntityConnectingLine line = (EntityConnectingLine)player.field_71104_cf;
                    if (line.connectedTo instanceof ITeamObject) {
                        final ITeamObject object2 = (ITeamObject)line.connectedTo;
                        object2.setBase(base);
                        base.addObject(object2);
                        line.func_70106_y();
                        player.field_71104_cf = null;
                        TeamsManager.messagePlayer(player, "Successfully connected.");
                    }
                    else {
                        TeamsManager.messagePlayer(player, "Cannot connect bases to bases.");
                    }
                    break;
                }
                break;
            }
            case 2: {
                openBaseEditGUI(base, player);
                break;
            }
            case 3: {
                base.destroy();
            }
        }
    }
    
    public void clickedObject(final World world, final EntityPlayerMP player, final ITeamObject object) {
        final int damage = player.field_71071_by.func_70448_g().func_77960_j();
        final TeamsManager teamsManager = TeamsManager.getInstance();
        switch (damage) {
            case 1: {
                if (player.field_71104_cf == null) {
                    final EntityConnectingLine hook = new EntityConnectingLine(world, (EntityPlayer)player, object);
                    world.func_72838_d((Entity)hook);
                    break;
                }
                if (player.field_71104_cf instanceof EntityConnectingLine) {
                    final EntityConnectingLine line = (EntityConnectingLine)player.field_71104_cf;
                    if (line.connectedTo instanceof ITeamBase) {
                        final ITeamBase base = (ITeamBase)line.connectedTo;
                        object.setBase(base);
                        base.addObject(object);
                        TeamsManager.messagePlayer(player, "Successfully connected.");
                    }
                    else {
                        TeamsManager.messagePlayer(player, "Cannot connect objects to objects.");
                    }
                    break;
                }
                break;
            }
            case 3: {
                object.destroy();
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister register) {
        this.icons = new IIcon[ItemOpStick.stickNames.length];
        for (int i = 0; i < ItemOpStick.stickNames.length; ++i) {
            this.icons[i] = register.func_94245_a("FlansMod:" + ItemOpStick.stickNames[i]);
            this.field_77791_bV = this.icons[i];
        }
    }
    
    public IIcon func_77617_a(final int damage) {
        final int j = MathHelper.func_76125_a(damage, 0, 15);
        return this.icons[j];
    }
    
    public String func_77667_c(final ItemStack stack) {
        return super.func_77658_a() + "." + stack.func_77960_j();
    }
    
    static {
        teamNames = new String[] { "No Team", "Spectators", "Team 1", "Team 2" };
        stickNames = new String[] { "opStick_ownership", "opStick_connecting", "opStick_mapping", "opStick_destruction", "Shekel", "GunIcon" };
    }
}

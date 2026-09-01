// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import com.flansmod.common.PlayerData;
import com.flansmod.common.teams.Team;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.FlansMod;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import com.flansmod.common.PlayerHandler;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.types.InfoType;
import net.minecraft.util.EntityDamageSourceIndirect;

public class EntityDamageSourceFlans extends EntityDamageSourceIndirect
{
    public InfoType weapon;
    public EntityPlayer shooter;
    public boolean headshot;
    public boolean melee;
    
    public EntityDamageSourceFlans(final String s, final Entity entity, final EntityPlayer player, final InfoType wep, final boolean head, final boolean isMelee) {
        super(s, entity, (Entity)player);
        this.weapon = wep;
        this.shooter = player;
        this.headshot = head;
        this.melee = isMelee;
    }
    
    public Entity getDamageSourceEntity() {
        return this.field_76386_o;
    }
    
    public IChatComponent func_151519_b(final EntityLivingBase living) {
        if (!(living instanceof EntityPlayer) || this.shooter == null || PlayerHandler.getPlayerData(this.shooter) == null) {
            return super.func_151519_b(living);
        }
        final EntityPlayer player = (EntityPlayer)living;
        final Team killedTeam = PlayerHandler.getPlayerData(player).team;
        final Team killerTeam = PlayerHandler.getPlayerData(this.shooter).team;
        final float dist = player.func_70032_d((Entity)this.shooter);
        final PlayerData playerData = PlayerHandler.getPlayerData(player);
        ++playerData.died;
        final PlayerData playerData2 = PlayerHandler.getPlayerData(this.shooter);
        ++playerData2.killStreak;
        PlayerHandler.getPlayerData(this.shooter).killStreakTimer = 0;
        if (PlayerHandler.getPlayerData(this.shooter).killStreak > 1) {
            return (IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GREEN + this.shooter.func_70005_c_() + EnumChatFormatting.DARK_AQUA + "'s Kill Streak: " + EnumChatFormatting.RED + Integer.toString(PlayerHandler.getPlayerData(this.shooter).killStreak) + " kills");
        }
        if (this.weapon != null && this.shooter != null && this.shooter.func_70694_bm() != null) {
            FlansMod.getPacketHandler().sendToDimension(new PacketKillMessage(this.headshot, this.weapon, this.shooter.func_70694_bm().func_77960_j(), ((killedTeam == null) ? "f" : Character.valueOf(killedTeam.textColour)) + player.func_70005_c_(), ((killerTeam == null) ? "f" : Character.valueOf(killerTeam.textColour)) + this.shooter.func_70005_c_(), dist), living.field_71093_bK);
        }
        return (IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "[" + EnumChatFormatting.RED + "Flansmod" + EnumChatFormatting.DARK_GRAY + "] " + EnumChatFormatting.ITALIC + EnumChatFormatting.DARK_RED + player.func_70005_c_() + EnumChatFormatting.RESET + EnumChatFormatting.GRAY + " Was killed by " + EnumChatFormatting.ITALIC + EnumChatFormatting.DARK_GREEN + this.shooter.func_70005_c_() + (FlansMod.showDistanceInKillMessage ? ("" + EnumChatFormatting.RESET + EnumChatFormatting.GRAY + " from " + EnumChatFormatting.ITALIC + EnumChatFormatting.DARK_AQUA + String.format("%.1f", dist) + "m" + EnumChatFormatting.RESET + EnumChatFormatting.GRAY + " away") : ""));
    }
}

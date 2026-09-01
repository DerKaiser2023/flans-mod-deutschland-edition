// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumChatFormatting;
import java.util.List;
import com.flansmod.common.PlayerData;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.PlayerHandler;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandShekel extends CommandBase
{
    public boolean canCommandSenderUseCommand(final ICommandSender sender) {
        return true;
    }
    
    public String getCommandName() {
        return "shekel";
    }
    
    public void processCommand(final ICommandSender sender, final String[] split) {
        if (split == null || split.length == 0 || split[0].equals("help") || split[0].equals("?")) {
            if (split != null && split.length == 2) {
                this.sendHelpInformation(sender, Integer.parseInt(split[1]));
            }
            else {
                this.sendHelpInformation(sender, 1);
            }
            return;
        }
        if (split[0].equals("withdraw")) {
            final EntityPlayerMP player = this.getPlayer(sender.getCommandSenderName());
            if (player != null) {
                if (PlayerHandler.getPlayerData((EntityPlayer)player).shekels > 9) {
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 4));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§2Use this to buy shit from NPCs."));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7Each Physical Shekel Represents 10 Shekels"));
                    final PlayerData playerData = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData.shekels;
                    final PlayerData playerData2 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData2.shekels;
                    final PlayerData playerData3 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData3.shekels;
                    final PlayerData playerData4 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData4.shekels;
                    final PlayerData playerData5 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData5.shekels;
                    final PlayerData playerData6 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData6.shekels;
                    final PlayerData playerData7 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData7.shekels;
                    final PlayerData playerData8 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData8.shekels;
                    final PlayerData playerData9 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData9.shekels;
                    final PlayerData playerData10 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData10.shekels;
                }
                else if (PlayerHandler.getPlayerData((EntityPlayer)player).shekels < 10) {
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7You need 10 Shekels to withdraw a physical Shekel"));
                }
            }
            return;
        }
        if (split[0].equals("balance")) {
            final EntityPlayerMP player = this.getPlayer(sender.getCommandSenderName());
            if (player != null) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("§2You have " + PlayerHandler.getPlayerData((EntityPlayer)player).shekels + " shekels"));
            }
            return;
        }
        if (split[0].equals("bloodletting")) {
            final EntityPlayerMP player = this.getPlayer(sender.getCommandSenderName());
            if (player != null) {
                PlayerHandler.getPlayerData((EntityPlayer)player).minorBleed = 10;
                sender.addChatMessage((IChatComponent)new ChatComponentText("§2You are bleeding out now!"));
            }
            return;
        }
        if (split[0].equals("Seppuku")) {
            final EntityPlayerMP player = this.getPlayer(sender.getCommandSenderName());
            if (player != null) {
                PlayerHandler.getPlayerData((EntityPlayer)player).minorBleed = 50;
                sender.addChatMessage((IChatComponent)new ChatComponentText("§2You are seriously bleeding out now!"));
            }
            return;
        }
        if (split[0].equals("withdraw5")) {
            final EntityPlayerMP player = this.getPlayer(sender.getCommandSenderName());
            if (player != null) {
                if (PlayerHandler.getPlayerData((EntityPlayer)player).shekels > 49) {
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 4));
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 4));
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 4));
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 4));
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 4));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§2Use this to buy shit from NPCs"));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7Each Physical Shekel Represents 10 Shekels"));
                    final PlayerData playerData11 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData11.shekels;
                    final PlayerData playerData12 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData12.shekels;
                    final PlayerData playerData13 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData13.shekels;
                    final PlayerData playerData14 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData14.shekels;
                    final PlayerData playerData15 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData15.shekels;
                    final PlayerData playerData16 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData16.shekels;
                    final PlayerData playerData17 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData17.shekels;
                    final PlayerData playerData18 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData18.shekels;
                    final PlayerData playerData19 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData19.shekels;
                    final PlayerData playerData20 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData20.shekels;
                    final PlayerData playerData21 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData21.shekels;
                    final PlayerData playerData22 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData22.shekels;
                    final PlayerData playerData23 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData23.shekels;
                    final PlayerData playerData24 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData24.shekels;
                    final PlayerData playerData25 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData25.shekels;
                    final PlayerData playerData26 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData26.shekels;
                    final PlayerData playerData27 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData27.shekels;
                    final PlayerData playerData28 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData28.shekels;
                    final PlayerData playerData29 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData29.shekels;
                    final PlayerData playerData30 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData30.shekels;
                    final PlayerData playerData31 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData31.shekels;
                    final PlayerData playerData32 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData32.shekels;
                    final PlayerData playerData33 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData33.shekels;
                    final PlayerData playerData34 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData34.shekels;
                    final PlayerData playerData35 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData35.shekels;
                    final PlayerData playerData36 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData36.shekels;
                    final PlayerData playerData37 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData37.shekels;
                    final PlayerData playerData38 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData38.shekels;
                    final PlayerData playerData39 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData39.shekels;
                    final PlayerData playerData40 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData40.shekels;
                    final PlayerData playerData41 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData41.shekels;
                    final PlayerData playerData42 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData42.shekels;
                    final PlayerData playerData43 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData43.shekels;
                    final PlayerData playerData44 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData44.shekels;
                    final PlayerData playerData45 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData45.shekels;
                    final PlayerData playerData46 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData46.shekels;
                    final PlayerData playerData47 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData47.shekels;
                    final PlayerData playerData48 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData48.shekels;
                    final PlayerData playerData49 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData49.shekels;
                    final PlayerData playerData50 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData50.shekels;
                    final PlayerData playerData51 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData51.shekels;
                    final PlayerData playerData52 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData52.shekels;
                    final PlayerData playerData53 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData53.shekels;
                    final PlayerData playerData54 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData54.shekels;
                    final PlayerData playerData55 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData55.shekels;
                    final PlayerData playerData56 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData56.shekels;
                    final PlayerData playerData57 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData57.shekels;
                    final PlayerData playerData58 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData58.shekels;
                    final PlayerData playerData59 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData59.shekels;
                    final PlayerData playerData60 = PlayerHandler.getPlayerData((EntityPlayer)player);
                    --playerData60.shekels;
                }
                else if (PlayerHandler.getPlayerData((EntityPlayer)player).shekels < 50) {
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7You need 50 Shekels to withdraw 5 at once"));
                }
            }
            return;
        }
        sender.addChatMessage((IChatComponent)new ChatComponentText(split[0] + " is not a valid teams command. Try /shekel help"));
    }
    
    public List addTabCompletionOptions(final ICommandSender sender, final String[] prm) {
        if (prm.length <= 1) {
            return getListOfStringsMatchingLastWord(prm, new String[] { "help", "vehiclesCanZoom" });
        }
        return null;
    }
    
    public void sendHelpInformation(final ICommandSender sender, final int page) {
        if (page > 2 || page < 1) {
            final ChatComponentText text = new ChatComponentText("Invalid help page, should be in the range (1-2)");
            text.getChatStyle().setColor(EnumChatFormatting.RED);
            sender.addChatMessage((IChatComponent)text);
            return;
        }
        sender.addChatMessage((IChatComponent)new ChatComponentText("§2Listing teams non op commands §f[Page " + page + " of 2]"));
        switch (page) {
            case 1: {
                sender.addChatMessage((IChatComponent)new ChatComponentText("/shekel help"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/shekel withdraw to withdraw 10 points as a physical item"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/shekel withdraw5 to withdraw 50 points as 5 physical items"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/shekel balance to see your shekel count"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("Check if there are unlockable features for this map at Spectator Spawn"));
                break;
            }
            case 2: {
                sender.addChatMessage((IChatComponent)new ChatComponentText("No extra commands here"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("Ahem, despite being only 13% of the population, African Americans are responsible for over 50% of violent crimes"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("yet they are only 40 something% of the prison population. If you calculate tax income vs government program spending,"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("in the year 2014, black people created a deficit of at least 300 billion dollars, while Whites created a surplus."));
                break;
            }
        }
    }
    
    public EntityPlayerMP getPlayer(final String name) {
        return MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(name);
    }
    
    public String getCommandUsage(final ICommandSender icommandsender) {
        return "/shekel <help/withdraw/withdraw5>";
    }
}

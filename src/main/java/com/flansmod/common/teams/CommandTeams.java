// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumChatFormatting;
import java.util.List;
import com.flansmod.common.PlayerData;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.PlayerHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.flansmod.common.FlansMod;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandTeams extends CommandBase
{
    public static TeamsManager teamsManager;
    
    public String getCommandName() {
        return "teams";
    }
    
    public void processCommand(final ICommandSender sender, final String[] split) {
        if (CommandTeams.teamsManager == null) {
            sender.addChatMessage((IChatComponent)new ChatComponentText("Teams mod is broken. You will need to look at the server side logs to see what's wrong"));
            return;
        }
        if (split == null || split.length == 0 || split[0].equals("help") || split[0].equals("?")) {
            if (split != null && split.length == 2) {
                this.sendHelpInformation(sender, Integer.parseInt(split[1]));
            }
            else {
                this.sendHelpInformation(sender, 1);
            }
            return;
        }
        if (split[0].equals("off")) {
            CommandTeams.teamsManager.currentRound = null;
            final TeamsManager teamsManager = CommandTeams.teamsManager;
            TeamsManager.enabled = false;
            TeamsManager.messageAll("Flan's Teams Mod disabled");
            return;
        }
        if (split[0].equals("on")) {
            final TeamsManager teamsManager2 = CommandTeams.teamsManager;
            TeamsManager.enabled = true;
            TeamsManager.messageAll("Flan's Teams Mod enabled");
            return;
        }
        final TeamsManager teamsManager3 = CommandTeams.teamsManager;
        if (!TeamsManager.enabled) {
            sender.addChatMessage((IChatComponent)new ChatComponentText("Teams mod is disabled. Try /teams on"));
            return;
        }
        if (split[0].equals("survival")) {
            final TeamsManager teamsManager4 = CommandTeams.teamsManager;
            TeamsManager.explosions = true;
            final TeamsManager teamsManager5 = CommandTeams.teamsManager;
            TeamsManager.driveablesBreakBlocks = false;
            final TeamsManager teamsManager6 = CommandTeams.teamsManager;
            TeamsManager.bombsEnabled = true;
            final TeamsManager teamsManager7 = CommandTeams.teamsManager;
            TeamsManager.bulletsEnabled = true;
            final TeamsManager teamsManager8 = CommandTeams.teamsManager;
            TeamsManager.forceAdventureMode = false;
            final TeamsManager teamsManager9 = CommandTeams.teamsManager;
            TeamsManager.overrideHunger = false;
            final TeamsManager teamsManager10 = CommandTeams.teamsManager;
            TeamsManager.canBreakGuns = true;
            final TeamsManager teamsManager11 = CommandTeams.teamsManager;
            TeamsManager.canBreakGlass = true;
            final TeamsManager teamsManager12 = CommandTeams.teamsManager;
            TeamsManager.armourDrops = true;
            final TeamsManager teamsManager13 = CommandTeams.teamsManager;
            TeamsManager.weaponDrops = 1;
            final TeamsManager teamsManager14 = CommandTeams.teamsManager;
            TeamsManager.vehiclesNeedFuel = true;
            final TeamsManager teamsManager15 = CommandTeams.teamsManager;
            final TeamsManager teamsManager16 = CommandTeams.teamsManager;
            final TeamsManager teamsManager17 = CommandTeams.teamsManager;
            final TeamsManager teamsManager18 = CommandTeams.teamsManager;
            final TeamsManager teamsManager19 = CommandTeams.teamsManager;
            TeamsManager.mgLife = (TeamsManager.planeLife = (TeamsManager.vehicleLife = (TeamsManager.aaLife = (TeamsManager.mechaLove = 0))));
            final TeamsManager teamsManager20 = CommandTeams.teamsManager;
            TeamsManager.messageAll("Flan's Mod switching to survival presets");
            return;
        }
        if (split[0].equals("arena")) {
            final TeamsManager teamsManager21 = CommandTeams.teamsManager;
            TeamsManager.explosions = false;
            final TeamsManager teamsManager22 = CommandTeams.teamsManager;
            TeamsManager.driveablesBreakBlocks = false;
            final TeamsManager teamsManager23 = CommandTeams.teamsManager;
            TeamsManager.bombsEnabled = true;
            final TeamsManager teamsManager24 = CommandTeams.teamsManager;
            TeamsManager.bulletsEnabled = true;
            final TeamsManager teamsManager25 = CommandTeams.teamsManager;
            TeamsManager.forceAdventureMode = true;
            final TeamsManager teamsManager26 = CommandTeams.teamsManager;
            TeamsManager.overrideHunger = true;
            final TeamsManager teamsManager27 = CommandTeams.teamsManager;
            TeamsManager.canBreakGuns = true;
            final TeamsManager teamsManager28 = CommandTeams.teamsManager;
            TeamsManager.canBreakGlass = false;
            final TeamsManager teamsManager29 = CommandTeams.teamsManager;
            TeamsManager.armourDrops = false;
            final TeamsManager teamsManager30 = CommandTeams.teamsManager;
            TeamsManager.weaponDrops = 2;
            final TeamsManager teamsManager31 = CommandTeams.teamsManager;
            TeamsManager.vehiclesNeedFuel = false;
            final TeamsManager teamsManager32 = CommandTeams.teamsManager;
            final TeamsManager teamsManager33 = CommandTeams.teamsManager;
            final TeamsManager teamsManager34 = CommandTeams.teamsManager;
            final TeamsManager teamsManager35 = CommandTeams.teamsManager;
            final TeamsManager teamsManager36 = CommandTeams.teamsManager;
            TeamsManager.mgLife = (TeamsManager.planeLife = (TeamsManager.vehicleLife = (TeamsManager.aaLife = (TeamsManager.mechaLove = 120))));
            TeamsManager.messageAll("Flan's Mod switching to arena mode presets");
            return;
        }
        if (split[0].equals("listGametypes")) {
            sender.addChatMessage((IChatComponent)new ChatComponentText("§2Showing all avaliable gametypes"));
            sender.addChatMessage((IChatComponent)new ChatComponentText("§2To pick a gametype, use \"/teams setGametype <gametype>\" with the name in brackets"));
            for (final Gametype gametype : Gametype.gametypes.values()) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("§f" + gametype.name + " (" + gametype.shortName + ")"));
            }
            return;
        }
        if (split[0].equals("listMaps")) {
            if (CommandTeams.teamsManager.maps == null) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("The map list is null"));
                return;
            }
            sender.addChatMessage((IChatComponent)new ChatComponentText("§2Listing maps"));
            for (final TeamsMap map : CommandTeams.teamsManager.maps.values()) {
                sender.addChatMessage((IChatComponent)new ChatComponentText(((CommandTeams.teamsManager.currentRound != null && map == CommandTeams.teamsManager.currentRound.map) ? "§4" : "") + map.name + " (" + map.shortName + ")"));
            }
        }
        else if (split[0].equals("addMap")) {
            if (split.length < 3) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("You need to specify a map name"));
                return;
            }
            final String shortName = split[1];
            String name = split[2];
            for (int i = 3; i < split.length; ++i) {
                name = name + " " + split[i];
            }
            CommandTeams.teamsManager.maps.put(shortName, new TeamsMap(sender.getEntityWorld(), shortName, name));
            sender.addChatMessage((IChatComponent)new ChatComponentText("Added new map : " + name + " (" + shortName + ")"));
        }
        else if (split[0].equals("removeMap")) {
            if (split.length != 2) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("You need to specify a map's short name"));
                return;
            }
            if (CommandTeams.teamsManager.maps.containsKey(split[1])) {
                CommandTeams.teamsManager.maps.remove(split[1]);
                sender.addChatMessage((IChatComponent)new ChatComponentText("Removed map " + split[1]));
            }
            else {
                sender.addChatMessage((IChatComponent)new ChatComponentText("Map (" + split[1] + ") not found"));
            }
        }
        else if (split[0].equals("setRound")) {
            if (split.length != 2) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("You need to specify the round index (see /teams listRounds)"));
                return;
            }
            final TeamsRound round = CommandTeams.teamsManager.rounds.get(Integer.parseInt(split[1]));
            if (round != null) {
                CommandTeams.teamsManager.nextRound = round;
                TeamsManager.messageAll("§2Next round will be " + round.gametype.shortName + " in " + round.map.name);
            }
        }
        else if (split[0].equals("listTeams") || split[0].equals("listAllTeams")) {
            if (Team.teams.size() == 0) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("§4No teams available. You need a content pack that has some teams with it"));
                return;
            }
            sender.addChatMessage((IChatComponent)new ChatComponentText("§2Showing all avaliable teams"));
            sender.addChatMessage((IChatComponent)new ChatComponentText("§2To pick these teams, use /teams setTeams <team1> <team2> with the names in brackets"));
            for (final Team team : Team.teams) {
                sender.addChatMessage((IChatComponent)new ChatComponentText("§" + team.textColour + team.name + " (" + team.shortName + ")"));
            }
        }
        else {
            if (split[0].equals("getSticks") || split[0].equals("getOpSticks") || split[0].equals("getOpKit")) {
                final EntityPlayerMP player = this.getPlayer(sender.getCommandSenderName());
                if (player != null) {
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 0));
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 1));
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 2));
                    player.inventory.addItemStackToInventory(new ItemStack((Item)FlansMod.opStick, 1, 3));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§2Enjoy your op sticks."));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7The Stick of Connecting connects objects (spawners, banners etc) to bases (flagpoles etc)"));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7The Stick of Ownership sets the team that currently owns a base"));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7The Stick of Mapping sets the map that a base is currently associated with"));
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§7The Stick of Destruction deletes bases and team objects"));
                }
                return;
            }
            if (split[0].equals("shekel")) {
                final EntityPlayerMP player = this.getPlayer(sender.getCommandSenderName());
                if (player != null) {
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
                return;
            }
            if (split[0].toLowerCase().equals("autobalance")) {
                if (split.length != 2) {
                    sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                    return;
                }
                TeamsManager.autoBalance = Boolean.parseBoolean(split[1]);
                sender.addChatMessage((IChatComponent)new ChatComponentText("Autobalance is now " + (TeamsManager.autoBalance ? "enabled" : "disabled")));
            }
            else if (split[0].equals("useRotation")) {
                if (split.length != 2) {
                    sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                    return;
                }
                TeamsManager.voting = !Boolean.parseBoolean(split[1]);
                sender.addChatMessage((IChatComponent)new ChatComponentText("Voting is now " + (TeamsManager.voting ? "enabled" : "disabled")));
            }
            else if (split[0].equals("voting")) {
                if (split.length != 2) {
                    sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                    return;
                }
                TeamsManager.voting = Boolean.parseBoolean(split[1]);
                sender.addChatMessage((IChatComponent)new ChatComponentText("Voting is now " + (TeamsManager.voting ? "enabled" : "disabled")));
            }
            else {
                if (split[0].equals("listRounds") || split[0].equals("listRotation")) {
                    sender.addChatMessage((IChatComponent)new ChatComponentText("§2Current Round List"));
                    for (int j = 0; j < TeamsManager.getInstance().rounds.size(); ++j) {
                        final TeamsRound entry = TeamsManager.getInstance().rounds.get(j);
                        if (entry.map == null) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Round had null map"));
                            return;
                        }
                        if (entry.gametype == null) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Round had null gametype"));
                            return;
                        }
                        String s = j + ". " + entry.map.shortName + ", " + entry.gametype.shortName;
                        if (entry == TeamsManager.getInstance().currentRound) {
                            s = "§4" + s;
                        }
                        for (int k = 0; k < entry.teams.length; ++k) {
                            s = s + ", " + entry.teams[k].shortName;
                        }
                        s = s + ", " + entry.timeLimit;
                        s = s + ", " + entry.scoreLimit;
                        s = s + ", Pop : " + (int)(entry.popularity * 100.0f) + "%";
                        sender.addChatMessage((IChatComponent)new ChatComponentText(s));
                    }
                    return;
                }
                if (split[0].equals("removeRound") || split[0].equals("removeMapFromRotation") || split[0].equals("removeFromRotation") || split[0].equals("removeRotation")) {
                    if (split.length != 2) {
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <ID>"));
                        return;
                    }
                    final int map2 = Integer.parseInt(split[1]);
                    sender.addChatMessage((IChatComponent)new ChatComponentText("Removed map " + map2 + " (" + TeamsManager.getInstance().rounds.get(map2).map.shortName + ") from rotation"));
                    TeamsManager.getInstance().rounds.remove(map2);
                }
                else if (split[0].equals("addMapToRotation") || split[0].equals("addToRotation") || split[0].equals("addRotation") || split[0].equals("addRound")) {
                    if (split.length < 8) {
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <Map> <Gametype> <Team1> <Team2> ... <TimeLimit> <ScoreLimit> <isNextRoundOn true/false>"));
                        return;
                    }
                    final TeamsMap map3 = TeamsManager.getInstance().maps.get(split[1]);
                    if (map3 == null) {
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Could not find map : " + split[1]));
                        return;
                    }
                    final Gametype gametype = Gametype.getGametype(split[2]);
                    if (gametype == null) {
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Could not find gametype : " + split[2]));
                        return;
                    }
                    if (split.length != 6 + gametype.numTeamsRequired) {
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <Map> <Gametype> <Team1> <Team2> ... <ScoreLimit> <TimeLimit> <isNextRoundOn true/false>"));
                        return;
                    }
                    final Team[] teams = new Team[gametype.numTeamsRequired];
                    for (int l = 0; l < teams.length; ++l) {
                        teams[l] = Team.getTeam(split[3 + l]);
                    }
                    sender.addChatMessage((IChatComponent)new ChatComponentText("Added map (" + map3.shortName + ") to rotation"));
                    TeamsManager.getInstance().rounds.add(new TeamsRound(map3, gametype, teams, Integer.parseInt(split[3 + gametype.numTeamsRequired]), Integer.parseInt(split[4 + gametype.numTeamsRequired]), Boolean.getBoolean(split[5 + gametype.numTeamsRequired])));
                }
                else {
                    if (split[0].equals("start") || split[0].equals("begin")) {
                        CommandTeams.teamsManager.start();
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Started teams map rotation"));
                        return;
                    }
                    if (split[0].equals("nextMap") || split[0].equals("next") || split[0].equals("nextRound")) {
                        CommandTeams.teamsManager.roundTimeLeft = 1;
                        return;
                    }
                    if (split[0].equals("forceAdventure") || split[0].equals("forceAdventureMode")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.forceAdventureMode = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Adventure mode will " + (TeamsManager.forceAdventureMode ? "now" : "no longer") + " be forced"));
                    }
                    else if (split[0].equals("overrideHunger") || split[0].equals("noHunger")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.overrideHunger = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Players will " + (TeamsManager.overrideHunger ? "no longer" : "now") + " get hungry during rounds"));
                    }
                    else if (split[0].equals("explosions")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.explosions = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Expolsions are now " + (TeamsManager.explosions ? "enabled" : "disabled")));
                    }
                    else if (split[0].equals("raiding")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.raiding = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("LabJac Raiding Expolsions are now " + (TeamsManager.raiding ? "enabled" : "disabled")));
                    }
                    else if (split[0].equals("pacifism")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.violence = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Pacifism is now " + (TeamsManager.violence ? "enabled" : "disabled")));
                    }
                    else if (split[0].equals("bleeding")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.bleeding = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Blood is now " + (TeamsManager.bleeding ? "enabled" : "disabled")));
                    }
                    else if (split[0].equals("seaLevel")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <Y coord>"));
                            return;
                        }
                        TeamsManager.seaLevel = Integer.parseInt(split[1]);
                        if (TeamsManager.seaLevel > 0 && TeamsManager.seaLevel < 256) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Sea level is now considered to be " + TeamsManager.seaLevel + " meters"));
                        }
                        else {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Enter a proper number numbnuts"));
                        }
                    }
                    else if (split[0].equals("bombs") || split[0].equals("allowBombs")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.bombsEnabled = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Bombs are now " + (TeamsManager.bombsEnabled ? "enabled" : "disabled")));
                    }
                    else if (split[0].equals("bullets") || split[0].equals("bulletsEnabled")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.bulletsEnabled = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Bullets are now " + (TeamsManager.bulletsEnabled ? "enabled" : "disabled")));
                    }
                    else if (split[0].equals("canBreakGuns")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.canBreakGuns = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("AAGuns and MGs can " + (TeamsManager.canBreakGuns ? "now" : "no longer") + " be broken"));
                    }
                    else if (split[0].equals("canBreakGlass")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.canBreakGlass = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Glass and glowstone can " + (TeamsManager.canBreakGlass ? "now" : "no longer") + " be broken"));
                    }
                    else if (split[0].equals("armourDrops") || split[0].equals("armorDrops")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.armourDrops = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Armour will " + (TeamsManager.armourDrops ? "now" : "no longer") + " be dropped"));
                    }
                    else if (split[0].equals("weaponDrops")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <on/off/smart>"));
                            return;
                        }
                        if (split[1].toLowerCase().equals("on")) {
                            TeamsManager.weaponDrops = 1;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Weapons will be dropped normally"));
                        }
                        else if (split[1].toLowerCase().equals("off")) {
                            TeamsManager.weaponDrops = 0;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Weapons will be not be dropped"));
                        }
                        else if (split[1].toLowerCase().equals("smart")) {
                            TeamsManager.weaponDrops = 2;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Smart drops enabled"));
                        }
                    }
                    else if (split[0].equals("fuelNeeded")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.vehiclesNeedFuel = Boolean.parseBoolean(split[1]);
                        sender.addChatMessage((IChatComponent)new ChatComponentText("Vehicles will " + (TeamsManager.vehiclesNeedFuel ? "now" : "no longer") + " require fuel"));
                    }
                    else if (split[0].equals("mgLife")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                            return;
                        }
                        TeamsManager.mgLife = Integer.parseInt(split[1]);
                        if (TeamsManager.mgLife > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("MGs will despawn after " + TeamsManager.mgLife + " seconds"));
                        }
                        else {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("MGs will not despawn"));
                        }
                    }
                    else if (split[0].equals("planeLife")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                            return;
                        }
                        TeamsManager.planeLife = Integer.parseInt(split[1]);
                        if (TeamsManager.planeLife > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Planes will despawn after " + TeamsManager.planeLife + " seconds"));
                        }
                        else {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Planes will not despawn"));
                        }
                    }
                    else if (split[0].equals("vehicleLife")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                            return;
                        }
                        TeamsManager.vehicleLife = Integer.parseInt(split[1]);
                        if (TeamsManager.vehicleLife > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Vehicles will despawn after " + TeamsManager.vehicleLife + " seconds"));
                        }
                        else {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Vehicles will not despawn"));
                        }
                    }
                    else if (split[0].equals("planeRate")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <tickDelay>"));
                            return;
                        }
                        TeamsManager.planeRate = Integer.parseInt(split[1]);
                        if (TeamsManager.planeRate > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Planes will spam everyone with their position data every " + split[1] + " tick(s)"));
                        }
                        else {
                            TeamsManager.planeRate = 1;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("It has to at least be 1 silly head"));
                        }
                    }
                    else if (split[0].equals("vehicleRate")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <tickDelay>"));
                            return;
                        }
                        TeamsManager.vehicleRate = Integer.parseInt(split[1]);
                        if (TeamsManager.vehicleRate > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Land/Sea vehicles will spam everyone with their position data every " + split[1] + " tick(s)"));
                        }
                        else {
                            TeamsManager.vehicleRate = 1;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("It has to at least be 1 silly head"));
                        }
                    }
                    else if (split[0].equals("seatRate")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <tickDelay>"));
                            return;
                        }
                        TeamsManager.seatRate = Integer.parseInt(split[1]);
                        if (TeamsManager.seatRate > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Seats/turrets will spam everyone with their data every " + split[1] + " tick(s)"));
                        }
                        else {
                            TeamsManager.seatRate = 1;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("It has to at least be 1 silly head"));
                        }
                    }
                    else if (split[0].equals("mechaLife")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                            return;
                        }
                        TeamsManager.mechaLove = Integer.parseInt(split[1]);
                        if (TeamsManager.mechaLove > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Mechas will despawn after " + TeamsManager.mechaLove + " seconds"));
                        }
                        else {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Mechas will not despawn"));
                        }
                    }
                    else if (split[0].equals("aaLife")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                            return;
                        }
                        TeamsManager.aaLife = Integer.parseInt(split[1]);
                        if (TeamsManager.aaLife > 0) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("AA Guns will despawn after " + TeamsManager.aaLife + " seconds"));
                        }
                        else {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("AA Guns will not despawn"));
                        }
                    }
                    else if (split[0].equals("vehiclesBreakBlocks")) {
                        if (split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        TeamsManager.driveablesBreakBlocks = false;
                        sender.addChatMessage((IChatComponent)new ChatComponentText("I retconned this feature. No more breaking blocks!"));
                    }
                    else {
                        if (split[0].equals("vehiclesCanZoom") && split.length != 2) {
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <true/false>"));
                            return;
                        }
                        if (split[0].equals("scoreDisplayTime")) {
                            if (split.length != 2) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                                return;
                            }
                            TeamsManager.scoreDisplayTime = Integer.parseInt(split[1]) * 20;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Score summary menu will appear for " + TeamsManager.scoreDisplayTime / 20 + " seconds"));
                        }
                        else if (split[0].equals("votingTime")) {
                            if (split.length != 2) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                                return;
                            }
                            TeamsManager.votingTime = Integer.parseInt(split[1]) * 20;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Voting menu will appear for " + TeamsManager.votingTime / 20 + " seconds"));
                        }
                        else if (split[0].toLowerCase().equals("autobalancetime")) {
                            if (split.length != 2) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams " + split[0] + " <time>"));
                                return;
                            }
                            TeamsManager.autoBalanceInterval = Integer.parseInt(split[1]) * 20;
                            sender.addChatMessage((IChatComponent)new ChatComponentText("Autobalance will now occur every " + TeamsManager.autoBalanceInterval / 20 + " seconds"));
                        }
                        else if (split[0].equals("setVariable")) {
                            if (TeamsManager.getInstance().currentRound == null) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("There is no gametype to set variables for"));
                                return;
                            }
                            if (split.length != 3) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams setVariable <variable> <value>"));
                                return;
                            }
                            if (TeamsManager.getInstance().currentRound.gametype.setVariable(split[1], split[2])) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Set variable " + split[1] + " in gametype " + TeamsManager.getInstance().currentRound.gametype.shortName + " to " + split[2]));
                            }
                            else {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Variable " + split[1] + " did not exist in gametype " + TeamsManager.getInstance().currentRound.gametype.shortName));
                            }
                        }
                        else {
                            if (split[0].equals("ping")) {
                                int ping_sum = 0;
                                int ping_cnt = 0;
                                final List<EntityPlayer> list = TeamsManager.getPlayers();
                                for (final EntityPlayer player2 : list) {
                                    if (player2 instanceof EntityPlayerMP) {
                                        final EntityPlayerMP pm = (EntityPlayerMP)player2;
                                        sender.addChatMessage((IChatComponent)new ChatComponentText("[Ping] " + pm.ping + " : " + pm.getDisplayName()));
                                        if (pm.ping <= 0) {
                                            continue;
                                        }
                                        ping_sum += pm.ping;
                                        ++ping_cnt;
                                    }
                                }
                                if (ping_cnt > 0) {
                                    sender.addChatMessage((IChatComponent)new ChatComponentText("[PingAverage] " + String.format("%.1f", ping_sum / (double)ping_cnt)));
                                }
                                return;
                            }
                            if (!split[0].equals("bltss")) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText(split[0] + " is not a valid teams command. Try /teams help"));
                                return;
                            }
                            if (split.length != 3) {
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Incorrect Usage : Should be /teams bltss <0 ... 100> <0 ... 1000>"));
                                sender.addChatMessage((IChatComponent)new ChatComponentText("Bullet use player snapshot = Min[default=0] + (Ping / Divisor[default=50])"));
                                return;
                            }
                            int bmn = Integer.parseInt(split[1]);
                            int bdv = Integer.parseInt(split[2]);
                            if (bmn < 0) {
                                bmn = 0;
                            }
                            if (bmn > 100) {
                                bmn = 100;
                            }
                            if (bdv < 0) {
                                bdv = 0;
                            }
                            if (bdv > 1000) {
                                bdv = 1000;
                            }
                            sender.addChatMessage((IChatComponent)new ChatComponentText("[BulletDelay] Min=" + bmn + " : Divisor=" + bdv));
                        }
                    }
                }
            }
        }
    }
    
    public List addTabCompletionOptions(final ICommandSender sender, final String[] prm) {
        if (prm.length <= 1) {
            return getListOfStringsMatchingLastWord(prm, new String[] { "help", "off", "arena", "survival", "getSticks", "listGametypes", "setGametype", "listAllTeams", "listTeams", "setTeams", "addMap", "listMaps", "removeMap", "setMap", "useRotation", "voting", "addRound", "listRounds", "removeRound", "nextMap", "goToMap", "votingTime", "scoreDisplayTime", "setVariable", "forceAdventure", "overrideHunger", "explosions", "canBreakGuns", "canBreakGlass", "armourDrops", "weaponDrops", "fuelNeeded", "mgLife", "planeLife", "vehicleLife", "aaLife", "vehiclesBreakBlocks", "ping", "bltss", "showbltss", "vehiclesCanZoom" });
        }
        return null;
    }
    
    public void sendHelpInformation(final ICommandSender sender, final int page) {
        if (page > 4 || page < 1) {
            final ChatComponentText text = new ChatComponentText("Invalid help page, should be in the range (1-4)");
            text.getChatStyle().setColor(EnumChatFormatting.RED);
            sender.addChatMessage((IChatComponent)text);
            return;
        }
        sender.addChatMessage((IChatComponent)new ChatComponentText("§2Listing teams commands §f[Page " + page + " of 4]"));
        switch (page) {
            case 1: {
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams help [page]"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams off"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams arena"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams survival"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams getSticks"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams listGametypes"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams listTeams"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams addMap <shortName> <longName>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams listMaps"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams removeMap <shortName>"));
                break;
            }
            case 2: {
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams useRotation <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams voting <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams addRound <map> <gametype> <team1> <team2> <TimeLimit> <ScoreLimit> <isNextRoundOn true/false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams listRounds"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams removeRound <ID>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams nextMap"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams votingTime <time>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams scoreDisplayTime <time>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams pacifism <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams raiding <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams seaLevel <Y coordinate>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams bleeding <true / false>"));
                break;
            }
            case 3: {
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams setVariable <variable> <value>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams forceAdventure <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams overrideHunger <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams explosions <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams canBreakGuns <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams canBreakGlass <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams armourDrops <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams weaponDrops <off / on / smart>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams fuelNeeded <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams mgLife <time>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams planeLife <time>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams vehicleLife <time>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams aaLife <time>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams vehiclesBreakBlocks <true / false>"));
                break;
            }
            case 4: {
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams ping <PlayerName>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams bltss <0 ... 100> <0 ... 1000>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams showbltss"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams vehiclesCanZoom <true / false>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams planeRate <ticks>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams vehicleRate <ticks>"));
                sender.addChatMessage((IChatComponent)new ChatComponentText("/teams seatRate <ticks>"));
                break;
            }
        }
    }
    
    public EntityPlayerMP getPlayer(final String name) {
        return MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(name);
    }
    
    public String getCommandUsage(final ICommandSender icommandsender) {
        return "Try \"/teams help\"";
    }
    
    static {
        CommandTeams.teamsManager = TeamsManager.getInstance();
    }
}

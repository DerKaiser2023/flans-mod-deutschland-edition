// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import java.util.Comparator;
import java.util.Collections;
import com.flansmod.common.PlayerData;
import java.util.Collection;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import net.minecraft.item.Item;
import com.flansmod.common.FlansMod;
import java.util.ArrayList;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.types.EnumType;
import net.minecraft.item.ItemStack;
import java.util.List;
import com.flansmod.common.types.InfoType;

public class Team extends InfoType
{
    public static List<Team> teams;
    public List<String> members;
    public List<PlayerClass> classes;
    public List<PlayerClass> classesLocked;
    public static Team spectators;
    public int score;
    public int teamColour;
    public char textColour;
    public ItemStack hat;
    public ItemStack chest;
    public ItemStack legs;
    public ItemStack shoes;
    
    public Team(final String s, final String s1, final int teamCol, final char textCol) {
        super(new TypeFile(EnumType.team, s, "", false));
        this.members = new ArrayList<String>();
        this.classes = new ArrayList<PlayerClass>();
        this.classesLocked = new ArrayList<PlayerClass>();
        this.score = 0;
        this.teamColour = 16777215;
        this.textColour = 'f';
        this.shortName = s;
        this.name = s1;
        this.teamColour = teamCol;
        this.textColour = textCol;
        Team.teams.add(this);
    }
    
    public Team(final TypeFile file) {
        super(file);
        this.members = new ArrayList<String>();
        this.classes = new ArrayList<PlayerClass>();
        this.classesLocked = new ArrayList<PlayerClass>();
        this.score = 0;
        this.teamColour = 16777215;
        this.textColour = 'f';
        Team.teams.add(this);
    }
    
    @Override
    protected void preRead(final TypeFile file) {
    }
    
    @Override
    protected void postRead(final TypeFile file) {
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("TeamColour")) {
                this.teamColour = (Integer.parseInt(split[1]) << 16) + (Integer.parseInt(split[2]) << 8) + Integer.parseInt(split[3]);
            }
            if (split[0].equals("TextColour")) {
                if (split[1].equals("Black")) {
                    this.textColour = '0';
                }
                if (split[1].equals("Blue")) {
                    this.textColour = '1';
                }
                if (split[1].equals("Green")) {
                    this.textColour = '2';
                }
                if (split[1].equals("Aqua")) {
                    this.textColour = '3';
                }
                if (split[1].equals("Red")) {
                    this.textColour = '4';
                }
                if (split[1].equals("Purple")) {
                    this.textColour = '5';
                }
                if (split[1].equals("Orange")) {
                    this.textColour = '6';
                }
                if (split[1].equals("LGrey")) {
                    this.textColour = '7';
                }
                if (split[1].equals("Grey")) {
                    this.textColour = '8';
                }
                if (split[1].equals("LBlue")) {
                    this.textColour = '9';
                }
                if (split[1].equals("LGreen")) {
                    this.textColour = 'a';
                }
                if (split[1].equals("LAqua")) {
                    this.textColour = 'b';
                }
                if (split[1].equals("Red")) {
                    this.textColour = 'c';
                }
                if (split[1].equals("Pink")) {
                    this.textColour = 'd';
                }
                if (split[1].equals("Yellow")) {
                    this.textColour = 'e';
                }
                if (split[1].equals("White")) {
                    this.textColour = 'f';
                }
            }
            if (split[0].equals("Hat") || split[0].equals("Helmet")) {
                if (split[1].equals("None")) {
                    return;
                }
                for (final Item item : FlansMod.armourItems) {
                    final ArmourType armour = ((ItemTeamArmour)item).type;
                    if (armour != null && armour.shortName.equals(split[1])) {
                        this.hat = new ItemStack(item);
                    }
                }
            }
            if (split[0].equals("Chest") || split[0].equals("Top")) {
                if (split[1].equals("None")) {
                    return;
                }
                for (final Item item : FlansMod.armourItems) {
                    final ArmourType armour = ((ItemTeamArmour)item).type;
                    if (armour != null && armour.shortName.equals(split[1])) {
                        this.chest = new ItemStack(item);
                    }
                }
            }
            if (split[0].equals("Legs") || split[0].equals("Bottom")) {
                if (split[1].equals("None")) {
                    return;
                }
                for (final Item item : FlansMod.armourItems) {
                    final ArmourType armour = ((ItemTeamArmour)item).type;
                    if (armour != null && armour.shortName.equals(split[1])) {
                        this.legs = new ItemStack(item);
                    }
                }
            }
            if (split[0].equals("Shoes") || split[0].equals("Boots")) {
                if (split[1].equals("None")) {
                    return;
                }
                for (final Item item : FlansMod.armourItems) {
                    final ArmourType armour = ((ItemTeamArmour)item).type;
                    if (armour != null && armour.shortName.equals(split[1])) {
                        this.shoes = new ItemStack(item);
                    }
                }
            }
            if (split[0].equals("AddDefaultClass") || split[0].equals("AddClass")) {
                this.classes.add(PlayerClass.getClass(split[1]));
            }
        }
        catch (final Exception e) {
            System.out.println("Reading team file failed.");
            e.printStackTrace();
        }
    }
    
    public static Team getTeam(final String s) {
        for (final Team team : Team.teams) {
            if (team.shortName.equals(s)) {
                return team;
            }
        }
        return null;
    }
    
    public void removePlayer(final EntityPlayer player) {
        this.removePlayer(player.getCommandSenderName());
    }
    
    public String removePlayer(final String username) {
        this.members.remove(username);
        if (PlayerHandler.getPlayerData(username) != null) {
            PlayerHandler.getPlayerData(username).team = null;
        }
        return username;
    }
    
    public EntityPlayer addPlayer(final EntityPlayer player) {
        this.addPlayer(player.getCommandSenderName());
        return player;
    }
    
    public String addPlayer(final String username) {
        final ArrayList<String> list = new ArrayList<String>();
        list.add(username);
        for (final Team team : Team.teams) {
            team.members.removeAll(list);
        }
        this.members.add(username);
        final PlayerData playerData = PlayerHandler.getPlayerData(username);
        PlayerHandler.getPlayerData(username).team = this;
        playerData.newTeam = this;
        return username;
    }
    
    public String removeWorstPlayer() {
        this.sortPlayers();
        if (this.members.size() == 0) {
            return null;
        }
        return this.removePlayer(this.members.get(this.members.size() - 1));
    }
    
    public void sortPlayers() {
        Collections.sort(this.members, new ComparatorScore());
    }
    
    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return null;
    }
    
    static {
        Team.teams = new ArrayList<Team>();
    }
    
    public static class ComparatorScore implements Comparator<String>
    {
        @Override
        public int compare(final String a, final String b) {
            final PlayerData dataA = PlayerHandler.getPlayerData(a);
            final PlayerData dataB = PlayerHandler.getPlayerData(b);
            if (dataA == null || dataB == null) {
                return 0;
            }
            return dataB.score - dataA.score;
        }
    }
}

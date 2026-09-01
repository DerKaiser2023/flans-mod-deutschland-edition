// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.nbt.NBTTagCompound;

public class TeamsRound implements Comparable<TeamsRound>
{
    public Gametype gametype;
    public TeamsMap map;
    public Team[] teams;
    public int timeLimit;
    public int scoreLimit;
    public float popularity;
    public int roundsSincePlayed;
    public boolean isNextRoundOn;
    
    public TeamsRound(final TeamsMap map2, final Gametype gametype2, final Team[] teams2, final int timeLimit, final int scoreLimit, final boolean isNext) {
        this.isNextRoundOn = false;
        this.map = map2;
        this.gametype = gametype2;
        this.teams = teams2;
        this.timeLimit = timeLimit;
        this.scoreLimit = scoreLimit;
        this.popularity = 0.5f;
        this.isNextRoundOn = isNext;
    }
    
    public TeamsRound(final NBTTagCompound tags) {
        this.isNextRoundOn = false;
        this.map = TeamsManager.getInstance().maps.get(tags.getString("Map"));
        this.gametype = Gametype.getGametype(tags.getString("Gametype"));
        this.timeLimit = tags.getInteger("TimeLimit");
        this.scoreLimit = tags.getInteger("ScoreLimit");
        this.teams = new Team[tags.getInteger("NumTeams")];
        for (int i = 0; i < this.teams.length; ++i) {
            this.teams[i] = Team.getTeam(tags.getString("Team_" + i));
        }
        this.popularity = tags.getFloat("Pop");
        this.isNextRoundOn = tags.getBoolean("NextRound");
    }
    
    public void writeToNBT(final NBTTagCompound tags) {
        tags.setString("Map", this.map.shortName);
        tags.setString("Gametype", this.gametype.shortName);
        tags.setInteger("TimeLimit", this.timeLimit);
        tags.setInteger("ScoreLimit", this.scoreLimit);
        tags.setInteger("NumTeams", this.teams.length);
        for (int i = 0; i < this.teams.length; ++i) {
            tags.setString("Team_" + i, this.teams[i].shortName);
        }
        tags.setFloat("Pop", this.popularity);
        tags.setBoolean("NextRound", this.isNextRoundOn);
    }
    
    public int getTeamID(final Team team) {
        if (team == Team.spectators) {
            return 1;
        }
        if (team == this.teams[0]) {
            return 2;
        }
        if (team == this.teams[1]) {
            return 3;
        }
        return 0;
    }
    
    public Team getTeam(final int id) {
        switch (id) {
            case 0: {
                return null;
            }
            case 1: {
                return Team.spectators;
            }
            default: {
                return this.teams[id - 2];
            }
        }
    }
    
    public Team getOtherTeam(final Team team) {
        if (team == Team.spectators || team == null || this.teams.length != 2) {
            return team;
        }
        if (team == this.teams[0]) {
            return this.teams[1];
        }
        return this.teams[0];
    }
    
    public float getWeight() {
        return this.popularity * 4.0f + this.roundsSincePlayed;
    }
    
    @Override
    public int compareTo(final TeamsRound o) {
        if (this.getWeight() < o.getWeight()) {
            return 1;
        }
        if (this.getWeight() > o.getWeight()) {
            return -1;
        }
        return 0;
    }
}

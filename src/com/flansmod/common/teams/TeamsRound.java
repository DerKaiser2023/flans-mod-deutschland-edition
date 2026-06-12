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
        this.map = TeamsManager.getInstance().maps.get(tags.func_74779_i("Map"));
        this.gametype = Gametype.getGametype(tags.func_74779_i("Gametype"));
        this.timeLimit = tags.func_74762_e("TimeLimit");
        this.scoreLimit = tags.func_74762_e("ScoreLimit");
        this.teams = new Team[tags.func_74762_e("NumTeams")];
        for (int i = 0; i < this.teams.length; ++i) {
            this.teams[i] = Team.getTeam(tags.func_74779_i("Team_" + i));
        }
        this.popularity = tags.func_74760_g("Pop");
        this.isNextRoundOn = tags.func_74767_n("NextRound");
    }
    
    public void writeToNBT(final NBTTagCompound tags) {
        tags.func_74778_a("Map", this.map.shortName);
        tags.func_74778_a("Gametype", this.gametype.shortName);
        tags.func_74768_a("TimeLimit", this.timeLimit);
        tags.func_74768_a("ScoreLimit", this.scoreLimit);
        tags.func_74768_a("NumTeams", this.teams.length);
        for (int i = 0; i < this.teams.length; ++i) {
            tags.func_74778_a("Team_" + i, this.teams[i].shortName);
        }
        tags.func_74776_a("Pop", this.popularity);
        tags.func_74757_a("NextRound", this.isNextRoundOn);
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

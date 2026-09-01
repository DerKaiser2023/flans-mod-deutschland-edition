// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import java.io.DataOutput;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.File;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import com.flansmod.common.network.PacketTeamSelect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldSettings;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import com.flansmod.common.types.InfoType;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.GunType;
import java.util.Collection;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.guns.ItemShootable;
import net.minecraft.entity.Entity;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import java.util.List;
import java.util.Collections;
import com.flansmod.common.network.PacketVoting;
import com.flansmod.common.PlayerData;
import com.flansmod.common.network.PacketRoundFinished;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import java.util.Iterator;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;
import java.util.HashMap;
import java.util.ArrayList;

public class TeamsManager
{
    public static boolean enabled;
    public static TeamsManager instance;
    public static boolean voting;
    public static boolean explosions;
    public static boolean driveablesBreakBlocks;
    public static boolean raiding;
    public static boolean violence;
    public static boolean bleeding;
    public static boolean bombsEnabled;
    public static boolean shellsEnabled;
    public static boolean missilesEnabled;
    public static boolean bulletsEnabled;
    public static boolean forceAdventureMode;
    public static boolean canBreakGuns;
    public static boolean canBreakGlass;
    public static boolean armourDrops;
    public static boolean vehiclesNeedFuel;
    public static boolean overrideHunger;
    public static int weaponDrops;
    public static int mgLife;
    public static int planeLife;
    public static int vehicleLife;
    public static int mechaLove;
    public static int aaLife;
    public static int seaLevel;
    public static int planeRate;
    public static int vehicleRate;
    public static int seatRate;
    public static int scoreDisplayTime;
    public static int votingTime;
    public TeamsRound currentRound;
    public ArrayList<TeamsRound> rounds;
    public HashMap<String, TeamsMap> maps;
    private int nextBaseID;
    public ArrayList<ITeamBase> bases;
    public ArrayList<ITeamObject> objects;
    private long time;
    public int roundTimeLeft;
    public int interRoundTimeLeft;
    public TeamsRound[] voteOptions;
    public TeamsRound nextRound;
    public static boolean autoBalance;
    public static int autoBalanceInterval;
    public static int bulletSnapshotMin;
    public static int bulletSnapshotDivisor;
    
    public TeamsManager() {
        this.nextBaseID = 1;
        TeamsManager.instance = this;
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
        this.bases = new ArrayList<ITeamBase>();
        this.objects = new ArrayList<ITeamObject>();
        this.maps = new HashMap<String, TeamsMap>();
        this.rounds = new ArrayList<TeamsRound>();
        new GametypeTDM();
        new GametypeZombies();
        new GametypeDM();
        new GametypeCTF();
    }
    
    public void reset() {
        this.currentRound = null;
        this.bases = new ArrayList<ITeamBase>();
        this.objects = new ArrayList<ITeamObject>();
        this.maps = new HashMap<String, TeamsMap>();
        this.rounds = new ArrayList<TeamsRound>();
    }
    
    public static TeamsManager getInstance() {
        return TeamsManager.instance;
    }
    
    public void tick() {
        if (this.time % 40L == 0L) {
            final FlansMod instance = FlansMod.INSTANCE;
            FlansMod.getPacketHandler().sendToAll(new PacketTeamInfo());
            this.showTeamsMenuToAll(true);
        }
        if (!TeamsManager.enabled) {
            return;
        }
        if (this.currentRound != null) {
            this.currentRound.gametype.tick();
        }
        ++this.time;
        for (final ITeamBase base : this.bases) {
            base.tick();
        }
        for (final ITeamObject object : this.objects) {
            object.tick();
        }
        if (TeamsManager.overrideHunger && this.currentRound != null) {
            for (final World world : MinecraftServer.getServer().worldServers) {
                for (final Object player : world.playerEntities) {
                    ((EntityPlayer)player).getFoodStats().addStats(20, 10.0f);
                }
            }
        }
        if (this.interRoundTimeLeft > 0) {
            --this.interRoundTimeLeft;
            if (TeamsManager.voting) {
                if (this.nextRound != null) {
                    this.startNextRound();
                    this.interRoundTimeLeft = 0;
                    return;
                }
                if (this.interRoundTimeLeft == TeamsManager.votingTime) {
                    this.pickVoteOptions();
                }
                if (this.interRoundTimeLeft <= TeamsManager.votingTime) {
                    if (this.voteOptions == null) {
                        this.pickVoteOptions();
                    }
                    this.displayVotingGUI();
                }
            }
            if (this.interRoundTimeLeft == 0) {
                this.startNextRound();
            }
        }
        if (this.currentRound != null && this.roundTimeLeft > 0) {
            if (this.autoBalance() && this.time % TeamsManager.autoBalanceInterval == TeamsManager.autoBalanceInterval - 200 && this.needAutobalance()) {
                messageAll("§fAutobalancing teams...");
            }
            if (this.autoBalance() && this.time % TeamsManager.autoBalanceInterval == 0L && this.needAutobalance()) {
                this.autobalance();
            }
            --this.roundTimeLeft;
            boolean roundEnded = this.roundTimeLeft == 0;
            if (roundEnded) {
                messageAll(this.randomTimeOutString());
            }
            for (final Team team : this.currentRound.teams) {
                if (this.currentRound.gametype.teamHasWon(team)) {
                    roundEnded = true;
                    messageAll(team.name + " won the round!");
                }
            }
            if (roundEnded) {
                this.roundTimeLeft = 0;
                this.interRoundTimeLeft = (TeamsManager.voting ? (TeamsManager.votingTime + TeamsManager.scoreDisplayTime) : TeamsManager.scoreDisplayTime);
                this.displayScoreboardGUI();
                this.currentRound.gametype.roundEnd();
                PlayerHandler.roundEnded();
            }
        }
    }
    
    public boolean needAutobalance() {
        if (!this.autoBalance() || this.currentRound == null || this.currentRound.teams.length != 2) {
            return false;
        }
        final int membersTeamA = this.currentRound.teams[0].members.size();
        final int membersTeamB = this.currentRound.teams[1].members.size();
        return Math.abs(membersTeamA - membersTeamB) > 1;
    }
    
    public void autobalance() {
        if (!this.autoBalance() || this.currentRound == null || this.currentRound.teams.length != 2) {
            return;
        }
        final int membersTeamA = this.currentRound.teams[0].members.size();
        final int membersTeamB = this.currentRound.teams[1].members.size();
        if (membersTeamA - membersTeamB > 1) {
            for (int i = 0; i < (membersTeamA - membersTeamB) / 2; ++i) {
                final EntityPlayerMP playerToKick = this.getPlayer(this.currentRound.teams[1].addPlayer(this.currentRound.teams[0].removeWorstPlayer()));
                messagePlayer(playerToKick, "You were moved to the other team by the autobalancer.");
                this.sendClassMenuToPlayer(playerToKick);
            }
        }
        if (membersTeamB - membersTeamA > 1) {
            for (int i = 0; i < (membersTeamB - membersTeamA) / 2; ++i) {
                final EntityPlayerMP playerToKick = this.getPlayer(this.currentRound.teams[0].addPlayer(this.currentRound.teams[1].removeWorstPlayer()));
                messagePlayer(playerToKick, "You were moved to the other team by the autobalancer.");
                this.sendClassMenuToPlayer(playerToKick);
            }
        }
    }
    
    public String randomTimeOutString() {
        switch (Gametype.rand.nextInt(4)) {
            case 0: {
                return "That's time!";
            }
            case 1: {
                return "How dull; a tie...";
            }
            case 2: {
                return "Everybody's a loser but the clock.";
            }
            default: {
                return "Time up.";
            }
        }
    }
    
    public void displayScoreboardGUI() {
        for (final EntityPlayer player : getPlayers()) {
            final PlayerData data = PlayerHandler.getPlayerData(player);
            if (!data.builder) {
                sendPacketToPlayer(new PacketRoundFinished(TeamsManager.scoreDisplayTime), (EntityPlayerMP)player);
            }
        }
    }
    
    public void displayVotingGUI() {
        for (final EntityPlayer player : getPlayers()) {
            final PlayerData data = PlayerHandler.getPlayerData(player);
            if (!data.builder) {
                sendPacketToPlayer(new PacketVoting(this), (EntityPlayerMP)player);
            }
        }
    }
    
    public void pickVoteOptions() {
        Collections.sort(this.rounds);
        this.voteOptions = new TeamsRound[Math.min(5, this.rounds.size())];
        for (int i = 0; i < this.voteOptions.length; ++i) {
            this.voteOptions[i] = this.rounds.get(i);
        }
        this.voteOptions[Gametype.rand.nextInt(this.voteOptions.length)] = this.rounds.get(Gametype.rand.nextInt(this.rounds.size()));
    }
    
    public void start() {
        if (!TeamsManager.enabled || this.rounds.size() == 0) {
            return;
        }
        if (this.currentRound != null) {
            this.currentRound.gametype.roundCleanup();
            this.resetScores();
        }
        this.currentRound = this.rounds.get(0);
        this.startRound();
    }
    
    public void startNextRound() {
        if (!TeamsManager.enabled || this.rounds.size() == 0) {
            return;
        }
        if (this.nextRound == null) {
            if (TeamsManager.voting) {
                int winner = 0;
                int mostVotes = 0;
                final int[] numVotes = new int[this.voteOptions.length];
                for (final PlayerData data : PlayerHandler.serverSideData.values()) {
                    if (data.vote > 0) {
                        final int[] array = numVotes;
                        final int n = data.vote - 1;
                        ++array[n];
                    }
                }
                for (int i = 0; i < this.voteOptions.length; ++i) {
                    if (numVotes[i] > mostVotes) {
                        mostVotes = numVotes[i];
                        winner = i;
                    }
                }
                this.nextRound = this.voteOptions[winner];
                for (final TeamsRound teamsRound : this.rounds) {
                    final TeamsRound round = teamsRound;
                    ++teamsRound.roundsSincePlayed;
                }
                for (int i = 0; i < this.voteOptions.length; ++i) {
                    if (i == winner) {
                        this.voteOptions[i].popularity = 1.0f - (1.0f - this.voteOptions[i].popularity) * 0.8f;
                        this.voteOptions[i].roundsSincePlayed = 0;
                    }
                    else {
                        final TeamsRound teamsRound2 = this.voteOptions[i];
                        teamsRound2.popularity *= 0.9f;
                        final TeamsRound teamsRound3 = this.voteOptions[i];
                        teamsRound3.popularity += 0.01f;
                    }
                }
                for (final PlayerData data : PlayerHandler.serverSideData.values()) {
                    data.vote = 0;
                }
            }
            else {
                int lastRoundID = this.rounds.indexOf(this.currentRound);
                final int nextRoundID = ++lastRoundID % this.rounds.size();
                this.nextRound = this.rounds.get(nextRoundID);
            }
        }
        if (this.currentRound != null) {
            for (final ITeamBase base : this.currentRound.map.bases) {
                base.roundCleanup();
            }
            this.currentRound.gametype.roundCleanup();
        }
        this.resetScores();
        if (this.nextRound != null) {
            this.currentRound = this.nextRound;
        }
        this.startRound();
        this.nextRound = null;
    }
    
    private void startRound() {
        this.currentRound.gametype.roundStart();
        this.roundTimeLeft = this.currentRound.timeLimit * 60 * 20;
        for (final ITeamBase base : this.bases) {
            base.startRound();
        }
        for (final EntityPlayer player : getPlayers()) {
            this.forceRespawn((EntityPlayerMP)player);
        }
        this.showTeamsMenuToAll();
        messageAll("§fA new round has started!");
    }
    
    public void showTeamsMenuToAll() {
        this.showTeamsMenuToAll(false);
    }
    
    public void showTeamsMenuToAll(final boolean info) {
        for (final EntityPlayer player : getPlayers()) {
            final PlayerData data = PlayerHandler.getPlayerData(player);
            if (data == null) {
                continue;
            }
            if (data.builder && this.playerIsOp(player)) {
                continue;
            }
            this.sendTeamsMenuToPlayer((EntityPlayerMP)player, info);
        }
    }
    
    @SubscribeEvent
    public void onPlayerInteract(final EntityInteractEvent event) {
        if (event.entityPlayer.inventory.getCurrentItem() != null && event.entityPlayer.inventory.getCurrentItem().getItem() instanceof ItemOpStick) {
            ((ItemOpStick)event.entityPlayer.inventory.getCurrentItem().getItem()).clickedEntity(event.entityPlayer.worldObj, event.entityPlayer, event.target);
        }
    }
    
    @SubscribeEvent
    public void onEntityHurt(final LivingAttackEvent event) {
        if (!TeamsManager.enabled || this.currentRound == null) {
            return;
        }
        if (event.entity instanceof EntityPlayerMP) {
            final EntityPlayerMP player = (EntityPlayerMP)event.entity;
            final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)player);
            final DamageSource source = event.source;
            if (data.team == Team.spectators && source != DamageSource.generic) {
                event.setCanceled(true);
                return;
            }
            if (source instanceof EntityDamageSource && source.getEntity() instanceof EntityPlayerMP) {
                final EntityPlayerMP attacker = (EntityPlayerMP)source.getEntity();
                final PlayerData attackerData = PlayerHandler.getPlayerData((EntityPlayer)attacker);
                if (attackerData == null) {
                    return;
                }
                if (attacker == player) {
                    return;
                }
                if (attackerData.team == Team.spectators) {
                    event.setCanceled(true);
                    return;
                }
                if ((attackerData.team == null && data.team != null) || (attackerData.team != null && data.team == null)) {
                    event.setCanceled(true);
                    return;
                }
                if (attackerData.team != null && data.team != null && this.roundTimeLeft > 0 && !this.currentRound.gametype.playerCanAttack(attacker, attackerData.team, player, data.team)) {
                    event.setCanceled(true);
                }
            }
        }
    }
    
    @SubscribeEvent
    public void onEntityKilled(final LivingDeathEvent event) {
        if (!TeamsManager.enabled) {
            return;
        }
        if (this.currentRound != null) {
            this.currentRound.gametype.entityKilled(event.entity, event.source);
            if (event.entity instanceof EntityPlayerMP) {
                this.currentRound.gametype.playerKilled((EntityPlayerMP)event.entity, event.source);
            }
        }
    }
    
    @SubscribeEvent
    public void entityJoinedWorld(final EntityJoinWorldEvent event) {
        if (event.entity instanceof ITeamBase) {
            this.registerBase((ITeamBase)event.entity);
        }
        if (event.entity instanceof ITeamObject) {
            this.objects.add((ITeamObject)event.entity);
        }
    }
    
    @SubscribeEvent
    public void playerUseEntity(final EntityInteractEvent event) {
        if (!TeamsManager.enabled) {
            return;
        }
        if (event.entityPlayer.worldObj.isRemote) {
            return;
        }
        final ItemStack currentItem = event.entityPlayer.getCurrentEquippedItem();
        if (currentItem != null && currentItem.getItem() != null && currentItem.getItem() instanceof ItemOpStick) {
            if (event.target instanceof ITeamObject) {
                ((ItemOpStick)currentItem.getItem()).clickedObject(event.entityPlayer.worldObj, (EntityPlayerMP)event.entityPlayer, (ITeamObject)event.target);
            }
            if (event.target instanceof ITeamBase) {
                ((ItemOpStick)currentItem.getItem()).clickedBase(event.entityPlayer.worldObj, (EntityPlayerMP)event.entityPlayer, (ITeamBase)event.target);
            }
        }
        else if (this.currentRound != null) {
            if (event.target instanceof ITeamObject) {
                this.currentRound.gametype.objectClickedByPlayer((ITeamObject)event.target, (EntityPlayerMP)event.entityPlayer);
            }
            if (event.target instanceof ITeamBase) {
                this.currentRound.gametype.baseClickedByPlayer((ITeamBase)event.target, (EntityPlayerMP)event.entityPlayer);
            }
        }
    }
    
    @SubscribeEvent
    public void playerInteracted(final PlayerInteractEvent event) {
        if (!TeamsManager.enabled) {
            return;
        }
        if (event.action == PlayerInteractEvent.Action.LEFT_CLICK_BLOCK && !event.entityPlayer.capabilities.allowEdit && !event.entityPlayer.capabilities.isCreativeMode) {
            event.setCanceled(true);
            return;
        }
        if (event.entityPlayer.worldObj.isRemote) {
            return;
        }
        final TileEntity te = event.entityPlayer.worldObj.getTileEntity(event.x, event.y, event.z);
        if (te != null) {
            final ItemStack currentItem = event.entityPlayer.getCurrentEquippedItem();
            if (currentItem != null && currentItem.getItem() != null && currentItem.getItem() instanceof ItemOpStick) {
                if (te instanceof ITeamObject) {
                    ((ItemOpStick)currentItem.getItem()).clickedObject(event.entityPlayer.worldObj, (EntityPlayerMP)event.entityPlayer, (ITeamObject)te);
                }
                if (te instanceof ITeamBase) {
                    ((ItemOpStick)currentItem.getItem()).clickedBase(event.entityPlayer.worldObj, (EntityPlayerMP)event.entityPlayer, (ITeamBase)te);
                }
            }
            else if (this.currentRound != null) {
                if (te instanceof ITeamObject) {
                    this.currentRound.gametype.objectClickedByPlayer((ITeamObject)te, (EntityPlayerMP)event.entityPlayer);
                }
                if (te instanceof ITeamBase) {
                    this.currentRound.gametype.baseClickedByPlayer((ITeamBase)te, (EntityPlayerMP)event.entityPlayer);
                }
            }
        }
    }
    
    @SubscribeEvent
    public void playerDrops(final PlayerDropsEvent event) {
        final ArrayList<EntityItem> dropsToThrow = new ArrayList<EntityItem>();
        if (TeamsManager.weaponDrops == 2) {
            for (final EntityItem entity : event.drops) {
                final ItemStack stack = entity.getEntityItem();
                if (stack != null && stack.getItem() != null && stack.getItem() instanceof ItemGun) {
                    final EntityGunItem gunEntity = new EntityGunItem(entity);
                    stack.stackSize = 0;
                    boolean alreadyAdded = false;
                    for (final EntityItem check : dropsToThrow) {
                        if (((ItemGun)stack.getItem()).type == ((ItemGun)check.getEntityItem().getItem()).type) {
                            alreadyAdded = true;
                        }
                    }
                    if (alreadyAdded) {
                        continue;
                    }
                    event.entityPlayer.worldObj.spawnEntityInWorld((Entity)gunEntity);
                    dropsToThrow.add(gunEntity);
                }
            }
        }
        for (final EntityItem entity : dropsToThrow) {
            final EntityGunItem gunEntity2 = (EntityGunItem)entity;
            final GunType gunType = ((ItemGun)gunEntity2.getEntityItem().getItem()).type;
            for (final EntityItem ammoEntity : event.drops) {
                final ItemStack ammoItemstack = ammoEntity.getEntityItem();
                if (ammoItemstack != null && ammoItemstack.getItem() instanceof ItemShootable) {
                    final ShootableType bulletType = ((ItemShootable)ammoItemstack.getItem()).type;
                    if (!gunType.isAmmo(bulletType)) {
                        continue;
                    }
                    gunEntity2.ammoStacks.add(ammoItemstack.copy());
                    ammoItemstack.stackSize = 0;
                }
            }
        }
        for (final EntityItem entity : event.drops) {
            final ItemStack stack = entity.getEntityItem();
            if (stack != null && stack.getItem() != null && stack.stackSize > 0) {
                if (stack.getItem() instanceof ItemGun || stack.getItem() instanceof ItemPlane || stack.getItem() instanceof ItemVehicle || stack.getItem() instanceof ItemAAGun || stack.getItem() instanceof ItemBullet) {
                    if (TeamsManager.weaponDrops == 1) {
                        continue;
                    }
                    dropsToThrow.add(entity);
                }
                else {
                    if (!(stack.getItem() instanceof ItemTeamArmour) || TeamsManager.armourDrops) {
                        continue;
                    }
                    dropsToThrow.add(entity);
                }
            }
        }
        event.drops.removeAll(dropsToThrow);
    }
    
    @SubscribeEvent
    public void playerLoot(final EntityItemPickupEvent event) {
        if (event.entity instanceof EntityPlayer) {
            final ItemStack itemStack = event.item.getEntityItem();
            final PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer);
            if (TeamsManager.enabled && this.currentRound != null && data != null && (data.team == Team.spectators || !this.currentRound.gametype.playerCanLoot(itemStack, InfoType.getType(itemStack), event.entityPlayer, data.team))) {
                event.setCanceled(true);
            }
        }
    }
    
    @SubscribeEvent
    public void onPlayerRespawn(final PlayerEvent event) {
        if (event instanceof PlayerEvent.PlayerRespawnEvent) {
            this.respawnPlayer(event.player, false);
        }
        if (event instanceof PlayerEvent.PlayerLoggedOutEvent) {
            this.onPlayerLogout(event.player);
        }
        if (event instanceof PlayerEvent.PlayerLoggedInEvent) {
            this.onPlayerLogin(event.player);
        }
    }
    
    public void onPlayerLogin(final EntityPlayer player) {
        if (!TeamsManager.enabled || this.currentRound == null) {
            return;
        }
        if (player instanceof EntityPlayerMP) {
            final EntityPlayerMP playerMP = (EntityPlayerMP)player;
            this.sendTeamsMenuToPlayer(playerMP);
            this.currentRound.gametype.playerJoined(playerMP);
        }
    }
    
    public void onPlayerLogout(final EntityPlayer player) {
        for (final Team team : Team.teams) {
            team.removePlayer(player);
        }
    }
    
    public void respawnPlayer(final EntityPlayer player, final boolean firstSpawn) {
        if (player.worldObj.isRemote) {
            return;
        }
        if (!TeamsManager.enabled || this.currentRound == null) {
            return;
        }
        final EntityPlayerMP playerMP = (EntityPlayerMP)player;
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)playerMP);
        if (data == null || (data.builder && this.playerIsOp((EntityPlayer)playerMP))) {
            return;
        }
        if (firstSpawn) {
            final Vec3 spawnPoint = this.currentRound.gametype.getSpawnPoint(playerMP);
            if (spawnPoint != null) {
                player.setPositionAndUpdate(spawnPoint.xCoord, spawnPoint.yCoord, spawnPoint.zCoord);
            }
        }
        this.setPlayersNextSpawnpoint(playerMP);
        if (TeamsManager.forceAdventureMode) {
            player.setGameType(WorldSettings.GameType.ADVENTURE);
        }
        this.resetInventory(player);
        this.currentRound.gametype.playerRespawned((EntityPlayerMP)player);
    }
    
    private static void setPlayersNextSpawnpoint(final EntityPlayerMP player, final ChunkCoordinates coords) {
        player.setSpawnChunk(coords, true);
    }
    
    private void setPlayersNextSpawnpoint(final EntityPlayerMP player) {
        if (!TeamsManager.enabled || this.currentRound == null) {
            return;
        }
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)player);
        final Vec3 spawnPoint = this.currentRound.gametype.getSpawnPoint(player);
        if (spawnPoint != null) {
            setPlayersNextSpawnpoint(player, new ChunkCoordinates(MathHelper.floor_double(spawnPoint.xCoord), MathHelper.floor_double(spawnPoint.yCoord) + 1, MathHelper.floor_double(spawnPoint.zCoord)));
        }
        else {
            FlansMod.log("Could not find spawn point for " + player.getDisplayName() + " on team " + ((data.newTeam == null) ? "null" : data.newTeam.name));
        }
    }
    
    public void forceRespawn(final EntityPlayerMP player) {
        if (this.playerIsOp((EntityPlayer)player) && PlayerHandler.getPlayerData((EntityPlayer)player).builder) {
            return;
        }
        player.inventory.armorInventory = new ItemStack[4];
        player.inventory.mainInventory = new ItemStack[36];
        player.heal(9001.0f);
        if (TeamsManager.forceAdventureMode) {
            player.setGameType(WorldSettings.GameType.ADVENTURE);
        }
        this.respawnPlayer((EntityPlayer)player, true);
    }
    
    public void sendTeamsMenuToPlayer(final EntityPlayerMP player) {
        this.sendTeamsMenuToPlayer(player, false);
    }
    
    public void sendTeamsMenuToPlayer(final EntityPlayerMP player, final boolean info) {
        if (!TeamsManager.enabled || this.currentRound == null || this.currentRound.teams == null) {
            return;
        }
        final Team[] availableTeams = this.currentRound.gametype.getTeamsCanSpawnAs(this.currentRound, (EntityPlayer)player);
        final boolean playerIsOp = MinecraftServer.getServer().getConfigurationManager().canSendCommands(player.getGameProfile());
        final Team[] allAvailableTeams = new Team[availableTeams.length + (playerIsOp ? 2 : 1)];
        System.arraycopy(availableTeams, 0, allAvailableTeams, 0, availableTeams.length);
        allAvailableTeams[availableTeams.length] = Team.spectators;
        sendPacketToPlayer(new PacketTeamSelect(allAvailableTeams, info), player);
    }
    
    public void sendClassMenuToPlayer(final EntityPlayerMP player) {
        final Team team = PlayerHandler.getPlayerData((EntityPlayer)player).newTeam;
        if (team == null) {
            this.sendTeamsMenuToPlayer(player);
        }
        else if (team != Team.spectators && team.classes.size() > 0) {
            sendPacketToPlayer(new PacketTeamSelect(team.classes.toArray(new PlayerClass[team.classes.size()])), player);
        }
    }
    
    public boolean playerIsOp(final EntityPlayer player) {
        return MinecraftServer.getServer().getConfigurationManager().canSendCommands(player.getGameProfile());
    }
    
    public boolean autoBalance() {
        return (this.currentRound == null || this.currentRound.gametype.shouldAutobalance()) && TeamsManager.autoBalance;
    }
    
    public void playerSelectedTeam(final EntityPlayerMP player, String teamName) {
        if (!TeamsManager.enabled || this.currentRound == null) {
            return;
        }
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)player);
        data.builder = false;
        if (teamName.equals("null")) {
            if (this.playerIsOp((EntityPlayer)player)) {
                data.team = null;
                data.builder = true;
                return;
            }
            teamName = "spectators";
        }
        Team selectedTeam = Team.getTeam(teamName);
        if (selectedTeam == null) {
            selectedTeam = Team.spectators;
        }
        boolean isValid = selectedTeam == Team.spectators;
        final Team[] teamsCanSpawnAs;
        final Team[] validTeams = teamsCanSpawnAs = this.currentRound.gametype.getTeamsCanSpawnAs(this.currentRound, (EntityPlayer)player);
        for (final Team validTeam : teamsCanSpawnAs) {
            if (selectedTeam == validTeam) {
                isValid = true;
            }
        }
        if (!isValid) {
            player.addChatMessage((IChatComponent)new ChatComponentText("You may not join " + selectedTeam.name + " for it is invalid. Please try again"));
            FlansMod.log(player.getCommandSenderName() + " tried to spawn on an invalid team : " + selectedTeam.name);
            selectedTeam = Team.spectators;
        }
        if (selectedTeam == Team.spectators) {
            messageAll(player.getCommandSenderName() + " joined §" + selectedTeam.textColour + selectedTeam.name);
            if (data.team != null) {
                data.team.removePlayer((EntityPlayer)player);
            }
            final PlayerData playerData = data;
            final PlayerData playerData2 = data;
            final Team spectators = Team.spectators;
            playerData2.team = spectators;
            playerData.newTeam = spectators;
            player.inventory.armorInventory = new ItemStack[4];
            player.inventory.mainInventory = new ItemStack[36];
            data.team.addPlayer((EntityPlayer)player);
            player.heal(9001.0f);
            this.respawnPlayer((EntityPlayer)player, true);
        }
        else {
            final Team otherTeam = this.currentRound.getOtherTeam(selectedTeam);
            if (this.autoBalance() && selectedTeam.members.size() > otherTeam.members.size() + 1) {
                player.addChatMessage((IChatComponent)new ChatComponentText("You may not join " + selectedTeam.name + " due to imbalance. Please try again"));
                this.sendTeamsMenuToPlayer(player);
                return;
            }
            data.newTeam = selectedTeam;
            this.sendClassMenuToPlayer(player);
        }
        this.currentRound.gametype.playerChoseTeam(player, data.team, selectedTeam);
    }
    
    public void playerSelectedClass(final EntityPlayerMP player, final String className) {
        if (!TeamsManager.enabled || this.currentRound == null) {
            return;
        }
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)player);
        final PlayerClass playerClass = PlayerClass.getClass(className);
        if (!data.newTeam.classes.contains(playerClass)) {
            player.addChatMessage((IChatComponent)new ChatComponentText("You may not select " + playerClass.name + ". Please try again"));
            FlansMod.log(player.getCommandSenderName() + " tried to pick an invalid class : " + playerClass.name);
            return;
        }
        if (data.team == data.newTeam && data.playerClass != playerClass) {
            this.currentRound.gametype.playerChoseNewClass(player, playerClass);
            data.newPlayerClass = playerClass;
            player.addChatMessage((IChatComponent)new ChatComponentText("You will respawn with the " + playerClass.name + " class"));
        }
        else if (data.team != null && data.team != data.newTeam) {
            messageAll(player.getCommandSenderName() + " switched to §" + data.newTeam.textColour + data.newTeam.name);
            this.currentRound.gametype.playerDefected(player, data.team, data.newTeam);
            this.setPlayersNextSpawnpoint(player);
            player.attackEntityFrom(DamageSource.generic, 10000.0f);
            if (data.team != null) {
                data.team.removePlayer((EntityPlayer)player);
            }
            data.newTeam.addPlayer((EntityPlayer)player);
            data.team = data.newTeam;
            data.newPlayerClass = playerClass;
        }
        else if (data.team == null) {
            messageAll(player.getCommandSenderName() + " joined §" + data.newTeam.textColour + data.newTeam.name);
            this.currentRound.gametype.playerEnteredTheGame(player, data.newTeam, playerClass);
            data.newTeam.addPlayer((EntityPlayer)player);
            data.team = data.newTeam;
            data.newPlayerClass = playerClass;
            this.currentRound.gametype.playerChoseNewClass(player, playerClass);
            this.respawnPlayer((EntityPlayer)player, true);
        }
    }
    
    public void resetInventory(final EntityPlayer player) {
        final Team team = PlayerHandler.getPlayerData(player).team;
        final PlayerClass playerClass = PlayerHandler.getPlayerData(player).getPlayerClass();
        if (team == null) {
            return;
        }
        player.inventory.armorInventory = new ItemStack[4];
        player.inventory.mainInventory = new ItemStack[36];
        if (team.hat != null) {
            player.inventory.armorInventory[3] = team.hat.copy();
        }
        if (team.chest != null) {
            player.inventory.armorInventory[2] = team.chest.copy();
        }
        if (team.legs != null) {
            player.inventory.armorInventory[1] = team.legs.copy();
        }
        if (team.shoes != null) {
            player.inventory.armorInventory[0] = team.shoes.copy();
        }
        if (playerClass == null) {
            return;
        }
        if (playerClass.hat != null) {
            player.inventory.armorInventory[3] = playerClass.hat.copy();
        }
        if (playerClass.chest != null) {
            player.inventory.armorInventory[2] = playerClass.chest.copy();
        }
        if (playerClass.legs != null) {
            player.inventory.armorInventory[1] = playerClass.legs.copy();
        }
        if (playerClass.shoes != null) {
            player.inventory.armorInventory[0] = playerClass.shoes.copy();
        }
        for (final ItemStack stack : playerClass.startingItems) {
            player.inventory.addItemStackToInventory(stack.copy());
        }
        for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
            final ItemStack stack = player.inventory.getStackInSlot(i);
            if (stack != null && stack.getItem() instanceof ItemGun) {
                ((ItemGun)stack.getItem()).reload(stack, ((ItemGun)stack.getItem()).type, player.worldObj, player, true, false);
            }
        }
    }
    
    @SubscribeEvent
    public void chunkLoaded(final ChunkDataEvent event) {
        final Chunk chunk = event.getChunk();
        for (final List<Entity> list : chunk.entityLists) {
            for (final Entity entity : list) {
                if (entity instanceof ITeamBase) {
                    this.bases.add((ITeamBase)entity);
                    if (((ITeamBase)entity).getBaseID() > this.nextBaseID) {
                        FlansMod.log("Loaded base with ID higher than the supposed highest ID. Adjusted highest ID");
                        this.nextBaseID = ((ITeamBase)entity).getBaseID();
                    }
                }
                if (entity instanceof ITeamObject) {
                    this.objects.add((ITeamObject)entity);
                }
            }
        }
    }
    
    @SubscribeEvent
    public void worldData(final WorldEvent event) {
        if (event.world.isRemote) {
            return;
        }
        if (event instanceof WorldEvent.Load) {
            this.loadPerWorldData((Event)event, event.world);
            this.savePerWorldData((Event)event, event.world);
        }
        if (event instanceof WorldEvent.Save) {
            this.savePerWorldData((Event)event, event.world);
        }
    }
    
    private void loadPerWorldData(final Event event, final World world) {
        this.reset();
        final File file = new File(world.getSaveHandler().getWorldDirectory(), "teams_" + world.provider.getDimensionName() + ".dat");
        if (!checkFileExists(file)) {
            return;
        }
        try {
            final NBTTagCompound tags = CompressedStreamTools.read(new DataInputStream(new FileInputStream(file)));
            this.nextBaseID = tags.getInteger("NextBaseID");
            for (int i = 0; i < tags.getInteger("NumberOfMaps"); ++i) {
                final TeamsMap map = new TeamsMap(world, tags.getCompoundTag("Map_" + i));
                this.maps.put(map.shortName, map);
            }
            if (this.maps.size() == 0) {
                this.maps.put("default" + world.getWorldInfo().getDimension(), new TeamsMap(world, "default" + world.getWorldInfo().getDimension(), "Default " + world.getWorldInfo().getWorldName()));
            }
            for (int i = 0; i < tags.getInteger("RoundsSize"); ++i) {
                final TeamsRound round = new TeamsRound(tags.getCompoundTag("Round_" + i));
                this.rounds.add(round);
            }
            TeamsManager.enabled = tags.getBoolean("Enabled");
            TeamsManager.voting = tags.getBoolean("Voting");
            TeamsManager.votingTime = tags.getInteger("VotingTime");
            TeamsManager.scoreDisplayTime = tags.getInteger("ScoreTime");
            TeamsManager.bombsEnabled = tags.getBoolean("Bombs");
            TeamsManager.bulletsEnabled = tags.getBoolean("Bullets");
            TeamsManager.explosions = tags.getBoolean("Explosions");
            TeamsManager.raiding = tags.getBoolean("Raiding");
            TeamsManager.violence = tags.getBoolean("Violence");
            TeamsManager.forceAdventureMode = tags.getBoolean("ForceAdventure");
            TeamsManager.canBreakGuns = tags.getBoolean("CanBreakGuns");
            TeamsManager.canBreakGlass = tags.getBoolean("CanBreakGlass");
            TeamsManager.armourDrops = tags.getBoolean("ArmourDrops");
            TeamsManager.weaponDrops = tags.getInteger("WeaponDrops");
            TeamsManager.vehiclesNeedFuel = tags.getBoolean("NeedFuel");
            TeamsManager.mgLife = tags.getInteger("MGLife");
            TeamsManager.aaLife = tags.getInteger("AALife");
            TeamsManager.vehicleLife = tags.getInteger("VehicleLife");
            TeamsManager.seaLevel = tags.getInteger("SeaLevel");
            TeamsManager.mechaLove = tags.getInteger("MechaLove");
            TeamsManager.planeLife = tags.getInteger("PlaneLife");
            TeamsManager.driveablesBreakBlocks = false;
            if (TeamsManager.enabled && this.rounds.size() > 0) {
                this.start();
            }
        }
        catch (final Exception e) {
            FlansMod.log("Failed to load from teams.dat");
            e.printStackTrace();
        }
        for (final InfoType type : InfoType.infoTypes) {
            type.onWorldLoad(world);
        }
    }
    
    private void savePerWorldData(final Event event, final World world) {
        final File file = new File(world.getSaveHandler().getWorldDirectory(), "teams_" + world.provider.getDimensionName() + ".dat");
        checkFileExists(file);
        try {
            final NBTTagCompound tags = new NBTTagCompound();
            tags.setInteger("NextBaseID", this.nextBaseID);
            tags.setInteger("NumberOfMaps", this.maps.size());
            if (this.maps != null) {
                int i = 0;
                for (final TeamsMap map : this.maps.values()) {
                    final NBTTagCompound mapTags = new NBTTagCompound();
                    map.writeToNBT(mapTags);
                    tags.setTag("Map_" + i, (NBTBase)mapTags);
                    ++i;
                }
            }
            if (this.rounds != null) {
                tags.setInteger("RoundsSize", this.rounds.size());
                for (int i = 0; i < this.rounds.size(); ++i) {
                    final TeamsRound entry = this.rounds.get(i);
                    if (entry != null) {
                        final NBTTagCompound roundTags = new NBTTagCompound();
                        entry.writeToNBT(roundTags);
                        tags.setTag("Round_" + i, (NBTBase)roundTags);
                    }
                }
            }
            else {
                tags.setInteger("RoundsSize", 0);
            }
            if (this.currentRound != null) {
                tags.setInteger("CurrentRound", this.rounds.indexOf(this.currentRound));
            }
            for (final Gametype gametype : Gametype.gametypes.values()) {
                gametype.saveToNBT(tags);
            }
            tags.setBoolean("Enabled", TeamsManager.enabled);
            tags.setBoolean("Voting", TeamsManager.voting);
            tags.setInteger("VotingTime", TeamsManager.votingTime);
            tags.setInteger("ScoreTime", TeamsManager.scoreDisplayTime);
            tags.setBoolean("Bombs", TeamsManager.bombsEnabled);
            tags.setBoolean("Bullets", TeamsManager.bulletsEnabled);
            tags.setBoolean("Explosions", TeamsManager.explosions);
            tags.setBoolean("Raiding", TeamsManager.raiding);
            tags.setBoolean("Violence", TeamsManager.violence);
            tags.setBoolean("ForceAdventure", TeamsManager.forceAdventureMode);
            tags.setBoolean("CanBreakGuns", TeamsManager.canBreakGuns);
            tags.setBoolean("CanBreakGlass", TeamsManager.canBreakGlass);
            tags.setBoolean("ArmourDrops", TeamsManager.armourDrops);
            tags.setInteger("WeaponDrops", TeamsManager.weaponDrops);
            tags.setBoolean("NeedFuel", TeamsManager.vehiclesNeedFuel);
            tags.setInteger("MGLife", TeamsManager.mgLife);
            tags.setInteger("AALife", TeamsManager.aaLife);
            tags.setInteger("VehicleLife", TeamsManager.vehicleLife);
            tags.setFloat("SeaLevel", (float)TeamsManager.seaLevel);
            tags.setInteger("MechaLove", TeamsManager.mechaLove);
            tags.setInteger("PlaneLife", TeamsManager.planeLife);
            tags.setBoolean("BreakBlocks", false);
            CompressedStreamTools.write(tags, (DataOutput)new DataOutputStream(new FileOutputStream(file)));
        }
        catch (final Exception e) {
            FlansMod.log("Failed to save to teams.dat");
            e.printStackTrace();
        }
    }
    
    private static boolean checkFileExists(final File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                FlansMod.log("Created new file");
            }
            catch (final Exception e) {
                FlansMod.log("Failed to create file");
                FlansMod.log(file.getAbsolutePath());
                e.printStackTrace();
            }
            return false;
        }
        return true;
    }
    
    public void resetScores() {
        for (final Team team : Team.teams) {
            team.score = 0;
            team.members.clear();
        }
        for (final EntityPlayer player : getPlayers()) {
            if (PlayerHandler.getPlayerData(player) != null) {
                PlayerHandler.getPlayerData(player).resetScore();
            }
        }
    }
    
    public ITeamBase getBase(final int ID) {
        for (final ITeamBase base : this.bases) {
            if (base.getBaseID() == ID) {
                return base;
            }
        }
        return null;
    }
    
    public void registerBase(final ITeamBase base) {
        if (base.getBaseID() == 0) {
            base.setBaseID(this.nextBaseID++);
        }
        this.bases.add(base);
    }
    
    public void registerObject(final ITeamObject obj) {
        this.objects.add(obj);
    }
    
    public EntityPlayerMP getPlayer(final String username) {
        return MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(username);
    }
    
    public static void log(final String s) {
        FlansMod.log("Teams Info : " + s);
    }
    
    public static void messagePlayer(final EntityPlayerMP player, final String s) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(s));
    }
    
    public static void messageAll(final String s) {
        FlansMod.log("Teams Announcement : " + s);
        for (final Object player : MinecraftServer.getServer().getConfigurationManager().playerEntityList) {
            ((EntityPlayerMP)player).addChatComponentMessage((IChatComponent)new ChatComponentText(s));
        }
    }
    
    public static void sendPacketToPlayer(final PacketBase packet, final EntityPlayerMP player) {
        FlansMod.getPacketHandler().sendTo(packet, player);
    }
    
    public static List<EntityPlayer> getPlayers() {
        return MinecraftServer.getServer().getConfigurationManager().playerEntityList;
    }
    
    public Team getTeam(final int spawnerTeamID) {
        if (!TeamsManager.enabled || this.currentRound == null || spawnerTeamID == 0) {
            return null;
        }
        if (spawnerTeamID == 1) {
            return Team.spectators;
        }
        return this.currentRound.teams[spawnerTeamID - 2];
    }
    
    public TeamsMap getMapFromFullName(final String string) {
        for (final TeamsMap map : this.maps.values()) {
            if (map.name.equals(string)) {
                return map;
            }
        }
        return null;
    }
    
    static {
        TeamsManager.enabled = true;
        TeamsManager.voting = false;
        TeamsManager.explosions = true;
        TeamsManager.driveablesBreakBlocks = false;
        TeamsManager.raiding = true;
        TeamsManager.violence = false;
        TeamsManager.bleeding = false;
        TeamsManager.bombsEnabled = true;
        TeamsManager.shellsEnabled = true;
        TeamsManager.missilesEnabled = true;
        TeamsManager.bulletsEnabled = true;
        TeamsManager.forceAdventureMode = true;
        TeamsManager.canBreakGuns = true;
        TeamsManager.canBreakGlass = true;
        TeamsManager.armourDrops = true;
        TeamsManager.vehiclesNeedFuel = true;
        TeamsManager.overrideHunger = true;
        TeamsManager.weaponDrops = 1;
        TeamsManager.mgLife = 0;
        TeamsManager.planeLife = 0;
        TeamsManager.vehicleLife = 0;
        TeamsManager.mechaLove = 0;
        TeamsManager.aaLife = 0;
        TeamsManager.seaLevel = 63;
        TeamsManager.planeRate = 1;
        TeamsManager.vehicleRate = 1;
        TeamsManager.seatRate = 1;
        TeamsManager.scoreDisplayTime = 200;
        TeamsManager.votingTime = 200;
        TeamsManager.bulletSnapshotMin = 0;
        TeamsManager.bulletSnapshotDivisor = 50;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.network.PacketSelectOffHandGun;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.potion.PotionEffect;
import com.flansmod.common.teams.ItemTeamArmour;
import net.minecraft.potion.Potion;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.network.PacketBlockerino;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketPlaySound;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.guns.EntityGrenade;
import java.util.ArrayList;
import com.flansmod.common.guns.EntityMG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;

public class PlayerData
{
    public String username;
    public float prevRotationRoll;
    public float rotationRoll;
    public PlayerSnapshot[] snapshots;
    public int offHandGunSlot;
    @SideOnly(Side.CLIENT)
    public ItemStack offHandGunStack;
    public EntityMG mountingGun;
    public int isBlockingLeft;
    public int isBlockingRight;
    public int isBlockingTop;
    public int isBlockingBottom;
    public int minigunSpeed;
    public int nintendoSwitch;
    public int drawTime;
    public int s0;
    public int s1;
    public int s2;
    public int s3;
    public int s4;
    public int s5;
    public int s6;
    public int s7;
    public int s8;
    public int s9;
    public float shootTimeRight;
    public float shootTimeLeft;
    public float stabTimeLeft;
    public float stabTimeRight;
    public int shootClickDelay;
    public boolean isShootingRight;
    public boolean isShootingLeft;
    public int labigunTimer;
    public boolean reloadingRight;
    public boolean reloadingLeft;
    public ArrayList<EntityGrenade> remoteExplosives;
    public int loopedSoundDelay;
    public boolean shouldPlayCooldownSound;
    public boolean shouldPlayWarmupSound;
    public int meleeProgress;
    public int meleeLength;
    public float pouchMultiplier;
    public int burstRoundsRemainingLeft;
    public int burstRoundsRemainingRight;
    public boolean isAmmoEmpty;
    public boolean invisArmor;
    public Vector3f[] lastMeleePositions;
    public Vector3f[] lastMeleeLeftPositions;
    public Vector3f[] lastMeleeRightPositions;
    public Vector3f[] lastMeleeDownPositions;
    public int meleeProgressLeft;
    public int meleeLengthLeft;
    public int meleeLeftLength;
    public int meleeProgressRight;
    public int meleeLengthRight;
    public int meleeRightLength;
    public int meleeProgressDown;
    public int meleeLengthDown;
    public int meleeDownLength;
    public int score;
    public int kills;
    public int deaths;
    public int shekels;
    public int killStreak;
    public int killStreakTimer;
    public int died;
    public float blood;
    public int timer;
    public int timerSlow;
    public int minorBleed;
    public int Bleed;
    public int hemorrhaging;
    public int totalScore;
    public int zombieScore;
    public boolean out;
    public int vote;
    public Team team;
    public Team newTeam;
    public PlayerClass playerClass;
    public PlayerClass newPlayerClass;
    public boolean builder;
    @SideOnly(Side.CLIENT)
    public ResourceLocation skin;
    public int shieldTimer;
    public int rechargeTimer;
    public int SoundTimer;
    public int shieldHit;
    
    public PlayerData(final String name) {
        this.offHandGunSlot = 0;
        this.labigunTimer = 0;
        this.remoteExplosives = new ArrayList<EntityGrenade>();
        this.pouchMultiplier = 1.0f;
        this.burstRoundsRemainingLeft = 0;
        this.burstRoundsRemainingRight = 0;
        this.invisArmor = false;
        this.killStreak = 0;
        this.killStreakTimer = 0;
        this.died = 0;
        this.blood = 100.0f;
        this.timer = 0;
        this.timerSlow = 0;
        this.minorBleed = 0;
        this.Bleed = 0;
        this.hemorrhaging = 0;
        this.shieldTimer = 0;
        this.rechargeTimer = 0;
        this.SoundTimer = 0;
        this.shieldHit = 0;
        this.username = name;
        this.snapshots = new PlayerSnapshot[20];
    }
    
    public void tick(final EntityPlayer player) {
        if (this.killStreak > 0) {
            ++this.killStreakTimer;
        }
        if (this.killStreakTimer > 80) {
            this.killStreak = 0;
            this.killStreakTimer = 0;
        }
        if (this.died > 0) {
            int random = 0;
            random = new Random().nextInt(11);
            String sound = "";
            if (player.getDisplayName().contains("Wally") || player.getDisplayName().contains("Walter") || player.getDisplayName().contains("wally") || player.getDisplayName().contains("walter")) {
                sound = "walter";
            }
            else {
                sound = "death" + random;
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(player.posX, player.posY, player.posZ, sound, false, false), player.posX, player.posY, player.posZ, 10.0f, player.dimension);
            FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(player.posX, player.posY, player.posZ, sound, false, false), player.posX, player.posY, player.posZ, 25.0f, player.dimension);
            this.died = 0;
        }
        if (PlayerHandler.getPlayerData(player).killStreakTimer == 10) {
            if (PlayerHandler.getPlayerData(player).killStreak == 1) {
                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 3.0, player.dimension, "killSound", false);
            }
            else if (PlayerHandler.getPlayerData(player).killStreak > 1) {
                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5.0, player.dimension, "killStreak" + this.killStreak, false);
            }
        }
        if (this.shieldHit > 0) {
            --this.shieldHit;
        }
        if (player.worldObj.isRemote) {
            this.clientTick(player);
        }
        if (this.shootTimeRight > 0.0f) {
            --this.shootTimeRight;
        }
        if (this.shootTimeRight <= 0.0f) {
            this.reloadingRight = false;
        }
        if (this.stabTimeRight > 0.0f) {
            --this.stabTimeRight;
        }
        if (this.stabTimeRight <= 0.0f) {
            this.reloadingRight = false;
        }
        if (this.isBlockingLeft > 0) {
            --this.isBlockingLeft;
        }
        if (this.isBlockingRight > 0) {
            --this.isBlockingRight;
        }
        if (this.isBlockingTop > 0) {
            --this.isBlockingTop;
        }
        if (this.isBlockingBottom > 0) {
            --this.isBlockingBottom;
        }
        if (this.loopedSoundDelay > 0) {
            --this.loopedSoundDelay;
            if (this.loopedSoundDelay == 0 && !this.isShootingRight) {
                this.shouldPlayCooldownSound = true;
            }
        }
        if (this.minigunSpeed > -3) {
            --this.minigunSpeed;
        }
        FlansMod.getPacketHandler().sendToServer(new PacketBlockerino(this.isBlockingLeft, this.isBlockingRight, this.isBlockingTop, this.isBlockingBottom, this.minigunSpeed));
        if (this.shootTimeLeft > 0.0f) {
            --this.shootTimeLeft;
        }
        if (this.shootTimeLeft <= 0.0f) {
            this.reloadingLeft = false;
        }
        if (this.stabTimeLeft > 0.0f) {
            --this.stabTimeLeft;
        }
        if (this.stabTimeLeft <= 0.0f) {
            this.reloadingLeft = false;
        }
        if (this.nintendoSwitch > 0) {
            --this.nintendoSwitch;
        }
        if (this.drawTime > 0) {
            --this.drawTime;
        }
        if (this.s0 > 0) {
            --this.s0;
        }
        if (this.s1 > 0) {
            --this.s1;
        }
        if (this.s2 > 0) {
            --this.s2;
        }
        if (this.s3 > 0) {
            --this.s3;
        }
        if (this.s4 > 0) {
            --this.s4;
        }
        if (this.s5 > 0) {
            --this.s5;
        }
        if (this.s6 > 0) {
            --this.s6;
        }
        if (this.s7 > 0) {
            --this.s7;
        }
        if (this.s8 > 0) {
            --this.s8;
        }
        if (this.s9 > 0) {
            --this.s9;
        }
        if (this.shootClickDelay > 0) {
            --this.shootClickDelay;
        }
        for (int i = 0; i < 5; ++i) {
            final ItemStack stack = player.getEquipmentInSlot(i);
            if (stack != null) {
                if (!(player.ridingEntity instanceof EntitySeat) && !player.isPotionActive(Potion.invisibility.id) && !(stack.getItem() instanceof ItemTeamArmour)) {
                    player.setInvisible(false);
                }
            }
            else if (!(player.ridingEntity instanceof EntitySeat) && !player.isPotionActive(Potion.invisibility.id)) {
                player.setInvisible(false);
            }
        }
        if (this.timer < 60 && !(player.ridingEntity instanceof EntitySeat)) {
            ++this.timer;
        }
        if (this.timer >= 60) {
            this.timer = 0;
        }
        if (this.timerSlow < 120 && !(player.ridingEntity instanceof EntitySeat)) {
            ++this.timerSlow;
        }
        if (this.timerSlow >= 120) {
            this.timerSlow = 0;
        }
        if (this.blood > 50.0f && this.blood < 100.0f && this.timer == 59) {
            ++this.blood;
        }
        if (this.blood > 30.0f && this.blood <= 50.0f && this.timerSlow == 119) {
            ++this.blood;
        }
        if (this.timerSlow == 119 && this.minorBleed > 0) {
            --this.blood;
            --this.blood;
            --this.blood;
            --this.minorBleed;
        }
        if (this.timerSlow == 119 && this.Bleed > 0) {
            --this.blood;
            --this.blood;
            --this.Bleed;
        }
        if (this.timer == 59 && this.hemorrhaging > 0) {
            --this.blood;
            --this.blood;
            --this.Bleed;
        }
        if (this.blood > 100.0f) {
            this.blood = 100.0f;
        }
        if (this.minorBleed < 0) {
            this.minorBleed = 0;
        }
        if (this.Bleed < 0) {
            this.Bleed = 0;
        }
        if (this.hemorrhaging < 0) {
            this.hemorrhaging = 0;
        }
        if (this.minorBleed > 5) {
            this.Bleed = this.minorBleed - 5;
        }
        if (this.Bleed > 25) {
            this.hemorrhaging = (this.Bleed - 25) * 2;
        }
        if (this.blood <= 80.0f) {
            player.addPotionEffect(new PotionEffect(Potion.hunger.id, 200));
        }
        if (this.blood <= 60.0f) {
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 200));
        }
        if (this.blood <= 45.0f) {
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 400));
        }
        if (this.blood <= 40.0f) {
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 240));
        }
        if (this.blood <= 30.0f) {
            player.addPotionEffect(new PotionEffect(Potion.blindness.id, 240));
        }
        if (this.blood <= 0.0f) {
            player.addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
            this.minorBleed = 0;
            this.Bleed = 0;
            this.hemorrhaging = 0;
            this.blood = 100.0f;
        }
        if (this.pouchMultiplier != 1.0f && this.isShootingRight && !this.reloadingRight) {
            this.minigunSpeed += 2;
            System.out.println(this.minigunSpeed + "from growth");
        }
        if (this.labigunTimer > 0) {
            --this.labigunTimer;
        }
        System.arraycopy(this.snapshots, 0, this.snapshots, 1, this.snapshots.length - 2 + 1);
        this.snapshots[0] = new PlayerSnapshot(player);
    }
    
    public void clientTick(final EntityPlayer player) {
        if (player.getCurrentEquippedItem() == null || !(player.getCurrentEquippedItem().getItem() instanceof ItemGun) || ((ItemGun)player.getCurrentEquippedItem().getItem()).type.oneHanded || player.getCurrentEquippedItem() == this.offHandGunStack) {
            this.offHandGunStack = null;
        }
    }
    
    public PlayerClass getPlayerClass() {
        if (this.playerClass != this.newPlayerClass) {
            this.playerClass = this.newPlayerClass;
        }
        return this.playerClass;
    }
    
    public void resetScore() {
        final int n = 0;
        this.deaths = n;
        this.kills = n;
        this.zombieScore = n;
        this.score = n;
        final Team team = null;
        this.newTeam = team;
        this.team = team;
        final PlayerClass playerClass = null;
        this.newPlayerClass = playerClass;
        this.playerClass = playerClass;
    }
    
    public void playerKilled() {
        this.mountingGun = null;
        final boolean b = false;
        this.isShootingLeft = b;
        this.isShootingRight = b;
        this.snapshots = new PlayerSnapshot[20];
    }
    
    public void selectOffHandWeapon(final EntityPlayer player, final int slot) {
        if (this.isValidOffHandWeapon(player, slot)) {
            this.offHandGunSlot = slot;
        }
    }
    
    public boolean isValidOffHandWeapon(final EntityPlayer player, final int slot) {
        if (slot == 0) {
            return true;
        }
        if (slot - 1 == player.inventory.currentItem) {
            return false;
        }
        final ItemStack stackInSlot = player.inventory.getStackInSlot(slot - 1);
        if (stackInSlot == null) {
            return false;
        }
        if (stackInSlot.getItem() instanceof ItemGun) {
            final ItemGun item = (ItemGun)stackInSlot.getItem();
            if (item.type.oneHanded) {
                return true;
            }
        }
        return false;
    }
    
    public void cycleOffHandItem(final EntityPlayer player, final int dWheel) {
        if (dWheel < 0) {
            this.offHandGunSlot = (this.offHandGunSlot + 1) % 10;
            while (!this.isValidOffHandWeapon(player, this.offHandGunSlot)) {
                this.offHandGunSlot = (this.offHandGunSlot + 1) % 10;
            }
        }
        else if (dWheel > 0) {
            this.offHandGunSlot = (this.offHandGunSlot + 9) % 10;
            while (!this.isValidOffHandWeapon(player, this.offHandGunSlot)) {
                this.offHandGunSlot = (this.offHandGunSlot + 9) % 10;
            }
        }
        FlansModClient.currentScope = null;
        FlansMod.getPacketHandler().sendToServer(new PacketSelectOffHandGun(this.offHandGunSlot));
    }
    
    public void doMelee(final EntityPlayer player, final int meleeTime, final GunType type) {
        this.meleeLength = meleeTime;
        this.lastMeleePositions = new Vector3f[type.meleePath.size()];
        for (int k = 0; k < type.meleeDamagePoints.size(); ++k) {
            final Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
            final Vector3f nextPos = type.meleePath.get(0);
            final Vector3f nextAngles = type.meleePathAngles.get(0);
            final RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
            final Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
            Vector3f.add(nextPos, nextPosInPlayerCoords, nextPosInPlayerCoords);
            if (!FlansMod.proxy.isThePlayer(player)) {
                final Vector3f vector3f = nextPosInPlayerCoords;
                vector3f.y += 1.6f;
            }
            this.lastMeleePositions[k] = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
        }
    }
    
    public void doMeleeLeft(final EntityPlayer player, final int meleeLeftTime, final GunType type) {
        this.meleeLeftLength = meleeLeftTime;
        this.lastMeleeLeftPositions = new Vector3f[type.meleeLeftPath.size()];
        for (int k = 0; k < type.meleeLeftDamagePoints.size(); ++k) {
            final Vector3f meleeDamagePoint = type.meleeLeftDamagePoints.get(k);
            final Vector3f nextPos = type.meleeLeftPath.get(0);
            final Vector3f nextAngles = type.meleeLeftPathAngles.get(0);
            final RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
            final Vector3f nextPosInPlayerCoordsLeft = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
            Vector3f.add(nextPos, nextPosInPlayerCoordsLeft, nextPosInPlayerCoordsLeft);
            if (!FlansMod.proxy.isThePlayer(player)) {
                final Vector3f vector3f = nextPosInPlayerCoordsLeft;
                vector3f.y += 1.6f;
            }
            this.lastMeleeLeftPositions[k] = new Vector3f(player.posX + nextPosInPlayerCoordsLeft.x, player.posY + nextPosInPlayerCoordsLeft.y, player.posZ + nextPosInPlayerCoordsLeft.z);
        }
    }
    
    public void doMeleeRight(final EntityPlayer player, final int meleeRightTime, final GunType type) {
        this.meleeRightLength = meleeRightTime;
        this.lastMeleeRightPositions = new Vector3f[type.meleeRightPath.size()];
        for (int k = 0; k < type.meleeRightDamagePoints.size(); ++k) {
            final Vector3f meleeDamagePoint = type.meleeRightDamagePoints.get(k);
            final Vector3f nextPos = type.meleeRightPath.get(0);
            final Vector3f nextAngles = type.meleeRightPathAngles.get(0);
            final RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
            final Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
            Vector3f.add(nextPos, nextPosInPlayerCoords, nextPosInPlayerCoords);
            if (!FlansMod.proxy.isThePlayer(player)) {
                final Vector3f vector3f = nextPosInPlayerCoords;
                vector3f.y += 1.6f;
            }
            this.lastMeleeRightPositions[k] = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
        }
    }
    
    public void doMeleeDown(final EntityPlayer player, final int meleeDownTime, final GunType type) {
        this.meleeDownLength = meleeDownTime;
        this.lastMeleeDownPositions = new Vector3f[type.meleeDownPath.size()];
        for (int k = 0; k < type.meleeDownDamagePoints.size(); ++k) {
            final Vector3f meleeDamagePointDown = type.meleeDownDamagePoints.get(k);
            final Vector3f nextPosDown = type.meleeDownPath.get(0);
            final Vector3f nextAnglesDown = type.meleeDownPathAngles.get(0);
            final RotatedAxes nextAxesDown = new RotatedAxes(-nextAnglesDown.y, -nextAnglesDown.z, nextAnglesDown.x);
            final Vector3f nextPosInPlayerCoordsDown = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextAxesDown.findLocalVectorGlobally(meleeDamagePointDown));
            Vector3f.add(nextPosDown, nextPosInPlayerCoordsDown, nextPosInPlayerCoordsDown);
            if (!FlansMod.proxy.isThePlayer(player)) {
                final Vector3f vector3f = nextPosInPlayerCoordsDown;
                vector3f.y += 1.6f;
            }
            this.lastMeleeDownPositions[k] = new Vector3f(player.posX + nextPosInPlayerCoordsDown.x, player.posY + nextPosInPlayerCoordsDown.y, player.posZ + nextPosInPlayerCoordsDown.z);
        }
    }
}

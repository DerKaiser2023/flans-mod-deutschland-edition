// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EntityDamageSourceIndirect;
import com.flansmod.common.network.PacketFlashBang;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.block.material.Material;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.util.DamageSource;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.player.EntityPlayerMP;
import com.flansmod.common.teams.TeamsManager;
import net.minecraft.potion.PotionEffect;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketFlak;
import net.minecraft.client.Minecraft;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.teams.Team;
import net.minecraft.entity.EntityLivingBase;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityGrenade extends EntityShootable implements IEntityAdditionalSpawnData
{
    public GrenadeType type;
    public EntityLivingBase thrower;
    public Team teamOfThrower;
    public RotatedAxes axes;
    public Vector3f angularVelocity;
    public float prevRotationRoll;
    public int smokeTime;
    public boolean smoking;
    public boolean stuck;
    public int stuckToX;
    public int stuckToY;
    public int stuckToZ;
    public boolean detonated;
    public int numUsesRemaining;
    public boolean isThisStick;
    public Entity stickedEntity;
    public int motionTime;
    
    public EntityGrenade(final World w) {
        super(w);
        this.axes = new RotatedAxes();
        this.angularVelocity = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevRotationRoll = 0.0f;
        this.smokeTime = 0;
        this.smoking = false;
        this.stuck = false;
        this.detonated = false;
        this.numUsesRemaining = 0;
        this.isThisStick = false;
        this.motionTime = 0;
    }
    
    public EntityGrenade(final World w, final GrenadeType g, final EntityLivingBase t) {
        this(w);
        this.func_70107_b(t.field_70165_t, t.field_70163_u + t.func_70047_e(), t.field_70161_v);
        this.type = g;
        this.numUsesRemaining = this.type.numUses;
        this.thrower = t;
        if (this.thrower instanceof EntityPlayer && PlayerHandler.getPlayerData((EntityPlayer)this.thrower) != null) {
            this.teamOfThrower = PlayerHandler.getPlayerData((EntityPlayer)this.thrower).team;
        }
        this.func_70105_a(g.hitBoxSize, g.hitBoxSize);
        this.axes.setAngles(t.field_70177_z + 90.0f, g.spinWhenThrown ? t.field_70125_A : 0.0f, 0.0f);
        final float n = g.spinWhenThrown ? (t.field_70177_z + 90.0f) : 0.0f;
        this.field_70126_B = n;
        this.field_70177_z = n;
        final float field_70125_A = t.field_70125_A;
        this.field_70127_C = field_70125_A;
        this.field_70125_A = field_70125_A;
        final float speed = 0.5f * this.type.throwSpeed;
        this.field_70159_w = this.axes.getXAxis().x * speed;
        this.field_70181_x = this.axes.getXAxis().y * speed;
        this.field_70179_y = this.axes.getXAxis().z * speed;
        if (this.type.spinWhenThrown) {
            this.angularVelocity = new Vector3f(0.0f, 0.0f, 10.0f);
        }
        if (this.type.throwSound != null) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.type.throwSound, true);
        }
    }
    
    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.type == null) {
            FlansMod.log("EntityGrenade.onUpdate() Error: GrenadeType is null (" + this + ")");
            this.func_70106_y();
            return;
        }
        if (this.motionTime > 0) {
            --this.motionTime;
        }
        if (this.type.despawnTime > 0 && this.field_70173_aa > this.type.despawnTime) {
            this.detonated = true;
            this.func_70106_y();
            return;
        }
        if (this.field_70170_p.field_72995_K && this.type.trailParticles) {
            final double dX = (this.field_70165_t - this.field_70169_q) / 10.0;
            final double dY = (this.field_70163_u - this.field_70167_r) / 10.0;
            final double dZ = (this.field_70161_v - this.field_70166_s) / 10.0;
            for (int i = 0; i < 10; ++i) {
                final EntityFX particle = FlansModClient.getParticle(this.type.trailParticleType, this.field_70170_p, this.field_70169_q + dX * i, this.field_70167_r + dY * i, this.field_70166_s + dZ * i);
                if (particle != null && Minecraft.func_71410_x().field_71474_y.field_74347_j) {
                    particle.field_70155_l = 100.0;
                }
            }
        }
        if (this.smoking) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50, this.type.smokeParticleType), this.field_70165_t, this.field_70163_u, this.field_70161_v, 30.0f, this.field_71093_bK);
            final List list = this.field_70170_p.func_72872_a((Class)EntityLivingBase.class, this.field_70121_D.func_72314_b((double)this.type.smokeRadius, (double)this.type.smokeRadius, (double)this.type.smokeRadius));
            for (final Object obj : list) {
                final EntityLivingBase entity = (EntityLivingBase)obj;
                if (entity.func_70032_d((Entity)this) < this.type.smokeRadius) {
                    boolean smokeThem = true;
                    for (int j = 0; j < 5; ++j) {
                        final ItemStack stack = entity.func_71124_b(j);
                        if (stack != null && stack.func_77973_b() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.func_77973_b()).type.smokeProtection) {
                            smokeThem = false;
                        }
                    }
                    if (!smokeThem) {
                        continue;
                    }
                    for (final PotionEffect effect : this.type.smokeEffects) {
                        entity.func_70690_d(new PotionEffect(effect));
                    }
                }
            }
            --this.smokeTime;
            if (this.smokeTime == 0) {
                this.func_70106_y();
            }
        }
        if (!this.field_70170_p.field_72995_K) {
            if (this.field_70173_aa > this.type.fuse && this.type.fuse > 0) {
                this.detonate();
            }
            if (this.type.livingProximityTrigger > 0.0f || this.type.driveableProximityTrigger > 0.0f) {
                final float checkRadius = Math.max(this.type.livingProximityTrigger, this.type.driveableProximityTrigger);
                final List list2 = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b((double)checkRadius, (double)checkRadius, (double)checkRadius));
                for (final Object obj2 : list2) {
                    if (obj2 == this.thrower && this.field_70173_aa < 10) {
                        continue;
                    }
                    if (obj2 instanceof EntityLivingBase && this.func_70032_d((Entity)obj2) < this.type.livingProximityTrigger) {
                        if (TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj2 instanceof EntityPlayerMP && this.thrower instanceof EntityPlayer && !TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj2, (DamageSource)new EntityDamageSourceFlans(this.type.shortName, this, (EntityPlayer)this.thrower, this.type, false, false))) {
                            continue;
                        }
                        if (this.type.damageToTriggerer > 0.0f) {
                            ((EntityLivingBase)obj2).func_70097_a(this.getGrenadeDamage(), this.type.damageToTriggerer);
                        }
                        this.detonate();
                        break;
                    }
                    else {
                        if (obj2 instanceof EntityDriveable && this.func_70032_d((Entity)obj2) < this.type.driveableProximityTrigger) {
                            if (this.type.damageToTriggerer > 0.0f) {
                                ((EntityDriveable)obj2).func_70097_a(this.getGrenadeDamage(), this.type.damageToTriggerer);
                            }
                            this.detonate();
                            break;
                        }
                        continue;
                    }
                }
            }
        }
        if (this.stuck && this.field_70170_p.func_147437_c(this.stuckToX, this.stuckToY, this.stuckToZ)) {
            this.stuck = false;
        }
        if (!this.stuck && !this.type.stickToThrower) {
            this.field_70126_B = this.axes.getYaw();
            this.field_70127_C = this.axes.getPitch();
            this.prevRotationRoll = this.axes.getRoll();
            if (this.angularVelocity.lengthSquared() > 1.0E-8f) {
                this.axes.rotateLocal(this.angularVelocity.length(), this.angularVelocity.normalise(null));
            }
            final Vector3f posVec = new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v);
            Vector3f motVec = new Vector3f(this.field_70159_w, this.field_70181_x, this.field_70179_y);
            final Vector3f nextPosVec = Vector3f.add(posVec, motVec, null);
            final MovingObjectPosition hit = this.field_70170_p.func_72933_a(posVec.toVec3(), nextPosVec.toVec3());
            if (hit != null && hit.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK) {
                final Block block = this.field_70170_p.func_147439_a(hit.field_72311_b, hit.field_72312_c, hit.field_72309_d);
                final Material mat = block.func_149688_o();
                if (this.type.explodeOnImpact) {
                    this.detonate();
                }
                else if (this.type.breaksGlass && mat == Material.field_151592_s && TeamsManager.canBreakGlass) {
                    this.field_70170_p.func_147468_f(hit.field_72311_b, hit.field_72312_c, hit.field_72309_d);
                    FlansMod.proxy.playBlockBreakSound(hit.field_72311_b, hit.field_72312_c, hit.field_72309_d, block, this.field_71093_bK);
                }
                else if (!this.type.penetratesBlocks) {
                    final Vector3f hitVec = new Vector3f(hit.field_72307_f);
                    final Vector3f preHitMotVec = Vector3f.sub(hitVec, posVec, null);
                    final Vector3f postHitMotVec = Vector3f.sub(motVec, preHitMotVec, null);
                    final int sideHit = hit.field_72310_e;
                    switch (sideHit) {
                        case 0:
                        case 1: {
                            postHitMotVec.setY(-postHitMotVec.getY());
                            break;
                        }
                        case 4:
                        case 5: {
                            postHitMotVec.setX(-postHitMotVec.getX());
                            break;
                        }
                        case 2:
                        case 3: {
                            postHitMotVec.setZ(-postHitMotVec.getZ());
                            break;
                        }
                    }
                    final float lambda = (Math.abs(motVec.lengthSquared()) < 1.0E-8f) ? 1.0f : (postHitMotVec.length() / motVec.length());
                    postHitMotVec.scale(this.type.bounciness / 2.0f);
                    this.field_70165_t += preHitMotVec.x + postHitMotVec.x;
                    this.field_70163_u += preHitMotVec.y + postHitMotVec.y;
                    this.field_70161_v += preHitMotVec.z + postHitMotVec.z;
                    this.field_70159_w = postHitMotVec.x / lambda;
                    this.field_70181_x = postHitMotVec.y / lambda;
                    this.field_70179_y = postHitMotVec.z / lambda;
                    motVec = new Vector3f(this.field_70159_w, this.field_70181_x, this.field_70179_y);
                    final float randomSpinner = 90.0f;
                    Vector3f.add(this.angularVelocity, new Vector3f(this.field_70146_Z.nextGaussian() * randomSpinner, this.field_70146_Z.nextGaussian() * randomSpinner, this.field_70146_Z.nextGaussian() * randomSpinner), this.angularVelocity);
                    this.angularVelocity.scale(motVec.lengthSquared());
                    if (motVec.lengthSquared() > 0.01) {
                        this.func_85030_a(this.type.bounceSound, 1.0f, 1.2f / (this.field_70146_Z.nextFloat() * 0.2f + 0.9f));
                    }
                    if (this.type.sticky) {
                        this.field_70165_t = hitVec.x;
                        this.field_70163_u = hitVec.y;
                        this.field_70161_v = hitVec.z;
                        final double field_70159_w = 0.0;
                        this.field_70179_y = field_70159_w;
                        this.field_70181_x = field_70159_w;
                        this.field_70159_w = field_70159_w;
                        this.angularVelocity.set(0.0f, 0.0f, 0.0f);
                        final float yaw = this.axes.getYaw();
                        switch (hit.field_72310_e) {
                            case 0: {
                                this.axes.setAngles(yaw, 180.0f, 0.0f);
                                break;
                            }
                            case 1: {
                                this.axes.setAngles(yaw, 0.0f, 0.0f);
                                break;
                            }
                            case 2: {
                                this.axes.setAngles(270.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                            case 3: {
                                this.axes.setAngles(90.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                            case 4: {
                                this.axes.setAngles(180.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                            case 5: {
                                this.axes.setAngles(0.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                        }
                        this.stuck = true;
                        this.stuckToX = hit.field_72311_b;
                        this.stuckToY = hit.field_72312_c;
                        this.stuckToZ = hit.field_72309_d;
                    }
                }
            }
            else {
                this.field_70165_t += this.field_70159_w;
                this.field_70163_u += this.field_70181_x;
                this.field_70161_v += this.field_70179_y;
            }
            this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        }
        if (this.type.stickToThrower) {
            if (this.thrower == null || this.thrower.field_70128_L) {
                this.func_70106_y();
            }
            else {
                this.func_70107_b(this.thrower.field_70165_t, this.thrower.field_70163_u, this.thrower.field_70161_v);
            }
        }
        if (this.type.stickToEntity) {
            final List list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D);
            final float yaw2 = this.axes.getYaw();
            if (this.stickedEntity == null && !this.stuck) {
                for (final Object obj2 : list) {
                    if (obj2 instanceof Entity && obj2 != this.thrower && !(obj2 instanceof EntityGrenade)) {
                        this.stickedEntity = (Entity)obj2;
                        break;
                    }
                }
            }
            if (this.stickedEntity != null) {
                this.func_70107_b(this.stickedEntity.field_70165_t, this.stickedEntity.field_70163_u, this.stickedEntity.field_70161_v);
                if (this.stickedEntity.field_70128_L) {
                    this.func_70106_y();
                }
            }
        }
        if (this.type.stickToDriveable) {
            final List list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D);
            final float yaw2 = this.axes.getYaw();
            if (this.stickedEntity == null && !this.stuck) {
                for (final Object obj2 : list) {
                    if (obj2 instanceof Entity && obj2 != this.thrower && !(obj2 instanceof EntityGrenade) && obj2 instanceof EntityDriveable) {
                        this.stickedEntity = (Entity)obj2;
                        break;
                    }
                }
            }
            if (this.stickedEntity != null) {
                this.func_70107_b(this.stickedEntity.field_70165_t, this.stickedEntity.field_70163_u, this.stickedEntity.field_70161_v);
                if (this.stickedEntity.field_70128_L) {
                    this.func_70106_y();
                }
            }
        }
        if (this.type.stickToEntityAfter) {
            final List list = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D);
            final float yaw2 = this.axes.getYaw();
            if (this.stickedEntity == null) {
                for (final Object obj2 : list) {
                    if (obj2 instanceof Entity && !(obj2 instanceof EntityGrenade) && obj2 != this.thrower) {
                        if (this.type.allowStickSound) {
                            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.type.stickSoundRange, this.field_71093_bK, this.type.stickSound, true);
                        }
                        this.stickedEntity = (Entity)obj2;
                        break;
                    }
                }
            }
            if (this.stickedEntity != null) {
                this.func_70107_b(this.stickedEntity.field_70165_t, this.stickedEntity.field_70163_u, this.stickedEntity.field_70161_v);
                if (this.stickedEntity.field_70128_L) {
                    this.func_70106_y();
                }
            }
        }
        if ((this.type.damageVsLiving > 0.0f || this.type.damageVsPlayer > 0.0f) && !this.stuck) {
            final Vector3f motVec2 = new Vector3f(this.field_70159_w, this.field_70181_x, this.field_70179_y);
            final List list2 = this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D);
            for (final Object obj2 : list2) {
                if (obj2 != this.thrower || this.field_70173_aa >= 10) {
                    if (motVec2.lengthSquared() < 0.01) {
                        continue;
                    }
                    if (obj2 instanceof EntityPlayer) {
                        ((EntityPlayer)obj2).func_70097_a(this.getGrenadeDamage(), this.type.damageVsPlayer * motVec2.lengthSquared() * 3.0f);
                    }
                    else {
                        if (!(obj2 instanceof EntityLivingBase)) {
                            continue;
                        }
                        ((EntityLivingBase)obj2).func_70097_a(this.getGrenadeDamage(), this.type.damageVsLiving * motVec2.lengthSquared() * 3.0f);
                    }
                }
            }
        }
        this.field_70181_x -= 0.024525 * this.type.fallSpeed;
        if (this.field_70170_p.field_72995_K) {
            this.func_70066_B();
        }
    }
    
    public boolean func_70097_a(final DamageSource source, final float f) {
        if (this.type.detonateWhenShot) {
            this.detonate();
        }
        return this.type.detonateWhenShot;
    }
    
    public void detonate() {
        if (this.field_70173_aa < this.type.primeDelay) {
            return;
        }
        if (this.detonated) {
            return;
        }
        this.detonated = true;
        PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.type.detonateSound, true);
        if (!this.field_70170_p.field_72995_K && this.type.explosionRadius > 0.1f && !this.type.pumpkinRaid) {
            if (this.thrower instanceof EntityPlayer) {
                new FlansModExplosion(this.field_70170_p, this, (EntityPlayer)this.thrower, this.type, this.field_70165_t, this.field_70163_u, this.field_70161_v, this.type.explosionRadius, TeamsManager.explosions && this.type.explosionBreaksBlocks, this.type.explosionDamageVsLiving, this.type.explosionDamageVsPlayer, this.type.explosionDamageVsPlane, this.type.explosionDamageVsVehicle, this.type.smokeParticleCount, this.type.debrisParticleCount);
            }
            else {
                this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, this.type.explosionRadius, TeamsManager.explosions && this.type.explosionBreaksBlocks);
            }
        }
        if (!this.field_70170_p.field_72995_K && this.type.explosionRadius > 0.1f && this.type.pumpkinRaid) {
            this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, this.type.explosionRadius, true);
        }
        if (!this.field_70170_p.field_72995_K && this.type.fireRadius > 0.1f) {
            for (float i = -this.type.fireRadius; i < this.type.fireRadius; ++i) {
                for (float j = -this.type.fireRadius; j < this.type.fireRadius; ++j) {
                    for (float k = -this.type.fireRadius; k < this.type.fireRadius; ++k) {
                        final int x = MathHelper.func_76128_c(i + this.field_70165_t);
                        final int y = MathHelper.func_76128_c(j + this.field_70163_u);
                        final int z = MathHelper.func_76128_c(k + this.field_70161_v);
                        if (i * i + j * j + k * k <= this.type.fireRadius * this.type.fireRadius && this.field_70170_p.func_147439_a(x, y, z) == Blocks.field_150350_a && this.field_70146_Z.nextBoolean()) {
                            this.field_70170_p.func_147465_d(x, y, z, (Block)Blocks.field_150480_ab, 0, 3);
                        }
                    }
                }
            }
        }
        for (int l = 0; l < this.type.explodeParticles; ++l) {
            this.field_70170_p.func_72869_a(this.type.explodeParticleType, this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70146_Z.nextGaussian(), this.field_70146_Z.nextGaussian(), this.field_70146_Z.nextGaussian());
        }
        if (!this.field_70170_p.field_72995_K && this.type.dropItemOnDetonate != null) {
            String itemName = this.type.dropItemOnDetonate;
            int damage = 0;
            if (itemName.contains(".")) {
                damage = Integer.parseInt(itemName.split("\\.")[1]);
                itemName = itemName.split("\\.")[0];
            }
            final ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
            this.func_70099_a(dropStack, 1.0f);
        }
        if (this.type.smokeTime > 0) {
            this.smoking = true;
            this.smokeTime = this.type.smokeTime;
        }
        else if (!this.field_70170_p.field_72995_K) {
            this.func_70106_y();
        }
        if (this.type.smokerino) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 5, "smokeShell"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
        }
        if (this.type.flashBang && !this.field_70170_p.field_72995_K) {
            final List list = this.field_70170_p.func_72872_a((Class)EntityLivingBase.class, this.field_70121_D.func_72314_b((double)this.type.smokeRadius, (double)this.type.smokeRadius, (double)this.type.smokeRadius));
            for (final Object obj : list) {
                final EntityLivingBase entity = (EntityLivingBase)obj;
                if (entity.func_70032_d((Entity)this) < this.type.flashRange && this.type.flashDamageEnable) {
                    if (this.type.flashEffects) {
                        entity.func_70690_d(new PotionEffect(this.type.flashEffectsID, this.type.flashEffectsDuration, this.type.flashEffectsLevel));
                    }
                    entity.func_70097_a(this.getGrenadeDamage(), this.type.flashDamage);
                }
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50, this.type.smokeParticleType), this.field_70165_t, this.field_70163_u, this.field_70161_v, 30.0f, this.field_71093_bK);
            if (this.type.flashSoundEnable) {
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.type.flashSoundRange, this.field_71093_bK, this.type.flashSound, true);
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlashBang(this.type.flashTime), this.field_70165_t, this.field_70163_u, this.field_70161_v, (float)this.type.flashRange, this.field_71093_bK);
            this.func_70106_y();
        }
    }
    
    public void func_70056_a(final double x, final double y, final double z, final float yaw, final float pitch, final int i) {
    }
    
    private DamageSource getGrenadeDamage() {
        if (this.thrower instanceof EntityPlayer) {
            return new EntityDamageSourceFlans(this.type.shortName, this, (EntityPlayer)this.thrower, this.type, false, false).func_76349_b();
        }
        return new EntityDamageSourceIndirect(this.type.shortName, (Entity)this, (Entity)this.thrower).func_76349_b();
    }
    
    protected void func_70088_a() {
    }
    
    protected void func_70037_a(final NBTTagCompound tags) {
        this.type = GrenadeType.getGrenade(tags.func_74779_i("Type"));
        if (this.type == null) {
            FlansMod.log("EntityGrenade.readEntityFromNBT() Error: GrenadeType is null (" + this + ")");
            this.func_70106_y();
            return;
        }
        this.thrower = (EntityLivingBase)this.field_70170_p.func_72924_a(tags.func_74779_i("Thrower"));
        this.field_70177_z = tags.func_74760_g("RotationYaw");
        this.field_70125_A = tags.func_74760_g("RotationPitch");
        this.axes.setAngles(this.field_70177_z, this.field_70125_A, 0.0f);
    }
    
    protected void func_70014_b(final NBTTagCompound tags) {
        if (this.type == null) {
            FlansMod.log("EntityGrenade.writeEntityToNBT() Error: GrenadeType is null (" + this + ")");
            this.func_70106_y();
            return;
        }
        tags.func_74778_a("Type", this.type.shortName);
        if (this.thrower != null) {
            tags.func_74778_a("Thrower", this.thrower.func_70005_c_());
        }
        tags.func_74776_a("RotationYaw", this.axes.getYaw());
        tags.func_74776_a("RotationPitch", this.axes.getPitch());
    }
    
    public void writeSpawnData(final ByteBuf data) {
        ByteBufUtils.writeUTF8String(data, this.type.shortName);
        data.writeInt((this.thrower == null) ? 0 : this.thrower.func_145782_y());
        data.writeFloat(this.axes.getYaw());
        data.writeFloat(this.axes.getPitch());
    }
    
    public void readSpawnData(final ByteBuf data) {
        this.type = GrenadeType.getGrenade(ByteBufUtils.readUTF8String(data));
        this.thrower = (EntityLivingBase)this.field_70170_p.func_73045_a(data.readInt());
        this.func_70101_b(data.readFloat(), data.readFloat());
        this.field_70126_B = this.field_70177_z;
        this.field_70127_C = this.field_70125_A;
        this.axes.setAngles(this.field_70177_z, this.field_70125_A, 0.0f);
        if (this.type.spinWhenThrown) {
            this.angularVelocity = new Vector3f(0.0f, 0.0f, 10.0f);
        }
    }
    
    public boolean func_70027_ad() {
        return false;
    }
    
    public boolean func_70067_L() {
        return !this.field_70128_L && this.type.isDeployableBag;
    }
    
    public boolean func_130002_c(final EntityPlayer player) {
        if (this.type.isDeployableBag && !this.field_70170_p.field_72995_K) {
            boolean used = false;
            if (this.type.healAmount > 0.0f && player.func_110143_aJ() < player.func_110138_aP()) {
                player.func_70691_i(this.type.healAmount);
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.field_70165_t, player.field_70163_u, player.field_70161_v, 5, "heart"), new NetworkRegistry.TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0));
                used = true;
            }
            for (final PotionEffect effect : this.type.potionEffects) {
                player.func_70690_d(new PotionEffect(effect));
                used = true;
            }
            if (this.type.numClips > 0 && player.func_71045_bC() != null && player.func_71045_bC().func_77973_b() instanceof ItemGun) {
                final GunType gun = ((ItemGun)player.func_71045_bC().func_77973_b()).type;
                if (gun.ammo.size() > 0) {
                    final ShootableType bulletToGive = gun.ammo.get(0);
                    final int numToGive = Math.min(bulletToGive.maxStackSize, this.type.numClips * gun.getNumAmmoItemsInGun(player.func_71045_bC()));
                    if (player.field_71071_by.func_70441_a(new ItemStack(bulletToGive.item, numToGive))) {
                        used = true;
                    }
                }
            }
            if (used) {
                --this.numUsesRemaining;
                if (this.numUsesRemaining <= 0) {
                    this.func_70106_y();
                }
            }
        }
        return true;
    }
}

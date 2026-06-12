// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.entity.item.EntityTNTPrimed;
import java.util.Map;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.ForgeEventFactory;
import java.util.ArrayList;
import com.flansmod.common.network.PacketParticle;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.util.DamageSource;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.teams.ItemTeamArmour;
import net.minecraft.util.AxisAlignedBB;
import java.util.Collection;
import net.minecraft.world.ChunkPosition;
import net.minecraft.util.MathHelper;
import java.util.HashSet;
import java.util.Iterator;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketExplosion;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;
import com.flansmod.common.types.InfoType;
import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import java.util.HashMap;
import java.util.Random;
import net.minecraft.world.Explosion;

public class FlansModExplosion extends Explosion
{
    private static final int boomRadius = 16;
    private static final Random explosionRNG;
    private HashMap<EntityPlayer, Vec3> playerLocations;
    private World worldObj;
    public InfoType type;
    public EntityPlayer player;
    private float radius;
    private final float damageVsLiving;
    private final float damageVsPlayer;
    private final float damageVsPlane;
    private final float damageVsVehicle;
    public boolean breakBlocks;
    
    public FlansModExplosion(final World w, final Entity e, final EntityPlayer p, final InfoType t, final double x, final double y, final double z, final float r, final boolean breakBlocks, final float damageLiving, final float damagePlayer, final float damagePlane, final float damageVehicle, final int smokeCount, final int debrisCount) {
        super(w, e, x, y, z, r);
        this.playerLocations = new HashMap<EntityPlayer, Vec3>();
        this.radius = r;
        this.worldObj = w;
        this.type = t;
        this.player = p;
        this.field_77286_a = false;
        this.field_82755_b = breakBlocks;
        this.breakBlocks = breakBlocks;
        this.damageVsPlayer = damagePlayer;
        this.damageVsLiving = damageLiving;
        this.damageVsPlane = damagePlane;
        this.damageVsVehicle = damageVehicle;
        this.func_77278_a();
        this.func_77279_a(true);
        this.spawnParticle(smokeCount, debrisCount);
        if (!this.worldObj.field_72995_K) {
            for (final Object playerEntity : this.worldObj.field_73010_i) {
                if (playerEntity instanceof EntityPlayerMP) {
                    final EntityPlayerMP entityplayer = (EntityPlayerMP)playerEntity;
                    if (entityplayer.func_70092_e(x, y, z) >= 4096.0) {
                        continue;
                    }
                    FlansMod.getPacketHandler().sendTo(new PacketExplosion(x, y, z, r), entityplayer);
                }
            }
        }
    }
    
    public void func_77278_a() {
        final float f = this.field_77280_f;
        final HashSet hashset = new HashSet();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i == 0 || i == 15 || j == 0 || j == 15 || k == 0 || k == 15) {
                        double d3 = i / 15.0f * 2.0f - 1.0f;
                        double d4 = j / 15.0f * 2.0f - 1.0f;
                        double d5 = k / 15.0f * 2.0f - 1.0f;
                        final double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                        d3 /= d6;
                        d4 /= d6;
                        d5 /= d6;
                        float f2 = this.field_77280_f * (0.7f + this.worldObj.field_73012_v.nextFloat() * 0.6f);
                        double d7 = this.field_77284_b;
                        double d8 = this.field_77285_c;
                        double d9 = this.field_77282_d;
                        for (float f3 = 0.3f; f2 > 0.0f; f2 -= f3 * 0.75f) {
                            final int l = MathHelper.func_76128_c(d7);
                            final int i2 = MathHelper.func_76128_c(d8);
                            final int j2 = MathHelper.func_76128_c(d9);
                            final Block block = this.worldObj.func_147439_a(l, i2, j2);
                            final float f4 = (this.field_77283_e != null) ? this.field_77283_e.func_145772_a((Explosion)this, this.worldObj, l, i2, j2, block) : block.getExplosionResistance(this.field_77283_e, this.worldObj, l, i2, j2, this.field_77284_b, this.field_77285_c, this.field_77282_d);
                            f2 -= (f4 + 0.3f) * f3;
                            if (f2 > 0.0f && (this.field_77283_e == null || this.field_77283_e.func_145774_a((Explosion)this, this.worldObj, l, i2, j2, block, f2))) {
                                hashset.add(new ChunkPosition(l, i2, j2));
                            }
                            d7 += d3 * f3;
                            d8 += d4 * f3;
                            d9 += d5 * f3;
                        }
                    }
                }
            }
        }
        this.field_77281_g.addAll(hashset);
        this.field_77280_f *= 2.0f;
        int i = MathHelper.func_76128_c(this.field_77284_b - this.field_77280_f - 1.0);
        int j = MathHelper.func_76128_c(this.field_77284_b + this.field_77280_f + 1.0);
        int k = MathHelper.func_76128_c(this.field_77285_c - this.field_77280_f - 1.0);
        final int l2 = MathHelper.func_76128_c(this.field_77285_c + this.field_77280_f + 1.0);
        final int i3 = MathHelper.func_76128_c(this.field_77282_d - this.field_77280_f - 1.0);
        final int j3 = MathHelper.func_76128_c(this.field_77282_d + this.field_77280_f + 1.0);
        final List list = this.worldObj.func_72839_b(this.field_77283_e, AxisAlignedBB.func_72330_a((double)i, (double)k, (double)i3, (double)j, (double)l2, (double)j3));
        final Vec3 vec3 = Vec3.func_72443_a(this.field_77284_b, this.field_77285_c, this.field_77282_d);
        for (final Object aList : list) {
            final Entity entity = (Entity)aList;
            final double d10 = entity.func_70011_f(this.field_77284_b, this.field_77285_c, this.field_77282_d) / this.field_77280_f;
            if (d10 <= 1.0) {
                double d7 = entity.field_70165_t - this.field_77284_b;
                double d8 = entity.field_70163_u + entity.func_70047_e() - this.field_77285_c;
                double d9 = entity.field_70161_v - this.field_77282_d;
                final double d11 = MathHelper.func_76133_a(d7 * d7 + d8 * d8 + d9 * d9);
                if (d11 == 0.0) {
                    continue;
                }
                d7 /= d11;
                d8 /= d11;
                d9 /= d11;
                final double d12 = this.getBlockDensity(vec3, entity.field_70121_D);
                final double d13 = (1.0 - d10) * d12;
                EntityDriveable entityDriveable = null;
                float damage = (float)((d13 * d13 + d13) / 2.0 * 8.0 * this.field_77280_f + 1.0);
                if (entity instanceof EntityPlayer) {
                    final EntityPlayer Victim = (EntityPlayer)entity;
                    for (int n = 0; n < 5; ++n) {
                        final ItemStack stackerino = ((EntityPlayer)entity).func_71124_b(n);
                        if (stackerino != null && stackerino.func_77973_b() instanceof ItemTeamArmour) {
                            final float helmet = ((ItemTeamArmour)stackerino.func_77973_b()).type.headArmor;
                            final float body = ((ItemTeamArmour)stackerino.func_77973_b()).type.bodyArmor;
                            float headRatio = 0.0f;
                            float bodyRatio = 0.0f;
                            if (helmet > 1.0f && helmet <= 50.0f) {
                                headRatio = helmet / 50.0f;
                            }
                            else if (helmet > 50.0f) {
                                headRatio = 1.0f;
                            }
                            if (body > 1.0f && body <= 50.0f) {
                                bodyRatio = body / 50.0f;
                            }
                            else if (body > 50.0f) {
                                bodyRatio = 1.0f;
                            }
                            damage *= this.damageVsPlayer * (float)(1.0f - 0.45f * bodyRatio - 0.35 * headRatio);
                        }
                        else {
                            damage *= this.damageVsPlayer;
                        }
                    }
                }
                else if (entity instanceof EntityLivingBase) {
                    damage *= this.damageVsLiving;
                }
                else if (entity instanceof EntityPlane) {
                    final EntityDriveable vehicle = (EntityDriveable)entity;
                    damage *= this.damageVsPlane * vehicle.getDriveableType().explosionResistance;
                }
                else if (entity instanceof EntityVehicle) {
                    final EntityDriveable vehicle = (EntityDriveable)entity;
                    damage *= this.damageVsVehicle * vehicle.getDriveableType().explosionResistance;
                }
                else if (entity instanceof EntityWheel) {
                    entityDriveable = ((EntityWheel)entity).vehicle;
                }
                else if (entity instanceof EntitySeat) {
                    entityDriveable = ((EntitySeat)entity).driveable;
                }
                if (entityDriveable instanceof EntityPlane) {
                    final EntityDriveable vehicle = entityDriveable;
                    damage *= this.damageVsPlane * vehicle.getDriveableType().explosionResistance;
                }
                if (entityDriveable instanceof EntityVehicle) {
                    final EntityDriveable vehicle = entityDriveable;
                    damage *= this.damageVsVehicle * vehicle.getDriveableType().explosionResistance;
                }
                if (damage > 0.5f) {
                    final boolean b = entity.func_70097_a((DamageSource)((this.player == null || this.type == null) ? DamageSource.func_94539_a((Explosion)this) : new EntityDamageSourceFlans(this.type.shortName, entity, this.player, this.type, false, false)), damage);
                    if (b) {
                        EntityBullet.hitCrossHair = true;
                    }
                    float multiplier = 0.0f;
                    if (entityDriveable != null && entityDriveable.getDriveableType() != null) {
                        multiplier = entityDriveable.getDriveableType().explosionPush;
                    }
                    if (entity instanceof EntityBullet) {
                        multiplier = 0.0f;
                    }
                    final double d14 = EnchantmentProtection.func_92092_a(entity, d13);
                    final Entity entity2 = entity;
                    entity2.field_70159_w += multiplier * d7 * d14;
                    final Entity entity3 = entity;
                    entity3.field_70181_x += multiplier * d8 * d14;
                    final Entity entity4 = entity;
                    entity4.field_70179_y += multiplier * d9 * d14;
                }
                if (!(entity instanceof EntityPlayer)) {
                    continue;
                }
                this.playerLocations.put((EntityPlayer)entity, Vec3.func_72443_a(d7 * d13, d8 * d13, d9 * d13));
            }
        }
        this.field_77280_f = f;
    }
    
    public void spawnParticle(final int numSmoke, final int numDebris) {
        final float mod = this.radius * 0.1f;
        for (int smoke = 0; smoke < numSmoke; ++smoke) {
            final float smokeRand = (float)Math.random();
            if (smokeRand < 0.25) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_77284_b, this.field_77285_c, this.field_77282_d, (float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
            else if (smokeRand > 0.25 && smokeRand < 0.5) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_77284_b, this.field_77285_c, this.field_77282_d, (float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
            else if (smokeRand > 0.5 && smokeRand < 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_77284_b, this.field_77285_c, this.field_77282_d, -(float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
            else if (smokeRand > 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_77284_b, this.field_77285_c, this.field_77282_d, -(float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
        }
        for (int debris = 0; debris < numDebris; ++debris) {
            final float smokeRand = (float)Math.random();
            if (smokeRand < 0.25) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.field_77284_b, this.field_77285_c, this.field_77282_d, (float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
            else if (smokeRand > 0.25 && smokeRand < 0.5) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.field_77284_b, this.field_77285_c, this.field_77282_d, (float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
            else if (smokeRand > 0.5 && smokeRand < 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.field_77284_b, this.field_77285_c, this.field_77282_d, -(float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
            else if (smokeRand > 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.field_77284_b, this.field_77285_c, this.field_77282_d, -(float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.field_77284_b, this.field_77285_c, this.field_77282_d, 150.0f, this.worldObj.field_73011_w.field_76574_g);
            }
        }
    }
    
    public float getBlockDensity(final Vec3 p_72842_1_, final AxisAlignedBB p_72842_2_) {
        final double d0 = 1.0 / ((p_72842_2_.field_72336_d - p_72842_2_.field_72340_a) * 2.0 + 1.0);
        final double d2 = 1.0 / ((p_72842_2_.field_72337_e - p_72842_2_.field_72338_b) * 2.0 + 1.0);
        final double d3 = 1.0 / ((p_72842_2_.field_72334_f - p_72842_2_.field_72339_c) * 2.0 + 1.0);
        if (d0 >= 0.0 && d2 >= 0.0 && d3 >= 0.0) {
            int i = 0;
            int j = 0;
            for (float f = 0.0f; f <= 1.0f; f += (float)d0) {
                for (float f2 = 0.0f; f2 <= 1.0f; f2 += (float)d2) {
                    for (float f3 = 0.0f; f3 <= 1.0f; f3 += (float)d3) {
                        final double d4 = p_72842_2_.field_72340_a + (p_72842_2_.field_72336_d - p_72842_2_.field_72340_a) * f;
                        final double d5 = p_72842_2_.field_72338_b + (p_72842_2_.field_72337_e - p_72842_2_.field_72338_b) * f2;
                        final double d6 = p_72842_2_.field_72339_c + (p_72842_2_.field_72334_f - p_72842_2_.field_72339_c) * f3;
                        if (this.worldObj.func_147447_a(Vec3.func_72443_a(d4, d5, d6), p_72842_1_, false, true, false) == null) {
                            ++i;
                        }
                        ++j;
                    }
                }
            }
            return i / (float)j;
        }
        return 0.0f;
    }
    
    public void func_77279_a(final boolean par1) {
        this.worldObj.func_72908_a(this.field_77284_b, this.field_77285_c, this.field_77282_d, "random.explode", 4.0f, (1.0f + (this.worldObj.field_73012_v.nextFloat() - this.worldObj.field_73012_v.nextFloat()) * 0.2f) * 0.7f);
        if (!this.worldObj.field_72995_K && this.breakBlocks) {
            this.worldObj.func_72876_a((Entity)null, this.field_77284_b, this.field_77285_c, this.field_77282_d, this.radius, true);
        }
        else {
            ForgeEventFactory.onExplosionDetonate(this.worldObj, (Explosion)this, (List)new ArrayList(), (double)this.radius);
        }
        if (!this.worldObj.field_72995_K && this.field_77286_a) {
            for (final ChunkPosition chunkposition : this.field_77281_g) {
                final int i = chunkposition.field_151329_a;
                final int j = chunkposition.field_151327_b;
                final int k = chunkposition.field_151328_c;
                final Block block = this.worldObj.func_147439_a(i, j, k);
                final Block blockBelow = this.worldObj.func_147439_a(i, j - 1, k);
                if (block == null && blockBelow.func_149662_c() && FlansModExplosion.explosionRNG.nextInt(3) == 0) {
                    this.worldObj.func_147449_b(i, j, k, (Block)Blocks.field_150480_ab);
                }
            }
        }
    }
    
    public Map func_77277_b() {
        return this.playerLocations;
    }
    
    public EntityLivingBase func_94613_c() {
        return (this.field_77283_e == null) ? null : ((this.field_77283_e instanceof EntityTNTPrimed) ? ((EntityTNTPrimed)this.field_77283_e).func_94083_c() : ((this.field_77283_e instanceof EntityLivingBase) ? this.field_77283_e : null));
    }
    
    public static void clientExplosion(final World worldObj, float explosionSize, double explosionX, final double explosionY, double explosionZ) {
        final List affectedBlockPositions = new ArrayList();
        final Entity exploder = null;
        final Explosion explosion = new Explosion(worldObj, exploder, explosionX, explosionY, explosionZ, explosionSize);
        if (explosionSize < 2.0f) {
            explosionX += FlansModExplosion.explosionRNG.nextFloat() - 0.5f;
            explosionZ += FlansModExplosion.explosionRNG.nextFloat() - 0.5f;
        }
        final boolean isSmoking = true;
        final float f = explosionSize;
        final HashSet hashset = new HashSet();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i == 0 || i == 15 || j == 0 || j == 15 || k == 0 || k == 15) {
                        double d0 = i / 15.0f * 2.0f - 1.0f;
                        double d2 = j / 15.0f * 2.0f - 1.0f;
                        double d3 = k / 15.0f * 2.0f - 1.0f;
                        final double d4 = Math.sqrt(d0 * d0 + d2 * d2 + d3 * d3);
                        d0 /= d4;
                        d2 /= d4;
                        d3 /= d4;
                        float f2 = explosionSize * (0.7f + worldObj.field_73012_v.nextFloat() * 0.6f);
                        double d5 = explosionX;
                        double d6 = explosionY;
                        double d7 = explosionZ;
                        for (float f3 = 0.3f; f2 > 0.0f; f2 -= f3 * 0.75f) {
                            final int j2 = MathHelper.func_76128_c(d5);
                            final int k2 = MathHelper.func_76128_c(d6);
                            final int l1 = MathHelper.func_76128_c(d7);
                            final Block block = worldObj.func_147439_a(j2, k2, l1);
                            final float f4 = 0.0f;
                            f2 -= (f4 + 0.3f) * f3;
                            if (f2 > 0.0f) {
                                hashset.add(new ChunkPosition(j2, k2, l1));
                            }
                            d5 += d0 * f3;
                            d6 += d2 * f3;
                            d7 += d3 * f3;
                        }
                    }
                }
            }
        }
        affectedBlockPositions.addAll(hashset);
        explosionSize *= 2.0f;
        int i = MathHelper.func_76128_c(explosionX - explosionSize - 1.0);
        int j = MathHelper.func_76128_c(explosionX + explosionSize + 1.0);
        int k = MathHelper.func_76128_c(explosionY - explosionSize - 1.0);
        final int i2 = MathHelper.func_76128_c(explosionY + explosionSize + 1.0);
        final int m = MathHelper.func_76128_c(explosionZ - explosionSize - 1.0);
        final int j3 = MathHelper.func_76128_c(explosionZ + explosionSize + 1.0);
        final List list = worldObj.func_72839_b(exploder, AxisAlignedBB.func_72330_a((double)i, (double)k, (double)m, (double)j, (double)i2, (double)j3));
        final Vec3 vec3 = Vec3.func_72443_a(explosionX, explosionY, explosionZ);
        for (int i3 = 0; i3 < list.size(); ++i3) {
            final Entity entity = list.get(i3);
            final double d8 = entity.func_70011_f(explosionX, explosionY, explosionZ) / explosionSize;
            if (d8 <= 1.0) {
                double d5 = entity.field_70165_t - explosionX;
                double d6 = entity.field_70163_u + entity.func_70047_e() - explosionY;
                double d7 = entity.field_70161_v - explosionZ;
                final double d9 = MathHelper.func_76133_a(d5 * d5 + d6 * d6 + d7 * d7);
                if (d9 != 0.0) {
                    d5 /= d9;
                    d6 /= d9;
                    d7 /= d9;
                    final double d10 = worldObj.func_72842_a(vec3, entity.field_70121_D);
                    final double d11 = (1.0 - d8) * d10;
                    entity.func_70097_a(DamageSource.func_94539_a(explosion), (float)(int)((d11 * d11 + d11) / 2.0 * 8.0 * explosionSize + 1.0));
                    final double d12 = EnchantmentProtection.func_92092_a(entity, d11);
                    final Entity entity2 = entity;
                    entity2.field_70159_w += d5 * d12;
                    final Entity entity3 = entity;
                    entity3.field_70181_x += d6 * d12;
                    final Entity entity4 = entity;
                    entity4.field_70179_y += d7 * d12;
                }
            }
        }
        explosionSize = f;
        if (explosionSize >= 2.0f && isSmoking) {
            worldObj.func_72869_a("hugeexplosion", explosionX, explosionY, explosionZ, 1.0, 0.0, 0.0);
        }
        else {
            worldObj.func_72869_a("largeexplode", explosionX, explosionY, explosionZ, 1.0, 0.0, 0.0);
        }
        final Iterator iterator = affectedBlockPositions.iterator();
        int cnt = 0;
        while (iterator.hasNext()) {
            ++cnt;
            final ChunkPosition chunkposition = iterator.next();
            final int i4 = chunkposition.field_151329_a;
            final int j4 = chunkposition.field_151327_b;
            final int k3 = chunkposition.field_151328_c;
            Block block2 = worldObj.func_147439_a(i4, j4, k3);
            final double d13 = i4 + worldObj.field_73012_v.nextFloat();
            final double d14 = j4 + worldObj.field_73012_v.nextFloat();
            final double d15 = k3 + worldObj.field_73012_v.nextFloat();
            double d16 = d13 - explosionX;
            double d17 = d14 - explosionY;
            double d18 = d15 - explosionZ;
            final double d19 = MathHelper.func_76133_a(d16 * d16 + d17 * d17 + d18 * d18);
            d16 /= d19;
            d17 /= d19;
            d18 /= d19;
            double d20 = 0.5 / (d19 / explosionSize + 0.1);
            d20 *= worldObj.field_73012_v.nextFloat() * worldObj.field_73012_v.nextFloat() + 0.3f;
            d16 *= d20;
            d17 *= d20;
            d18 *= d20;
            if ((explosionSize <= 1.0f && cnt % 4 == 0) || explosionSize > 1.0f) {
                FlansMod.proxy.spawnParticle("explode", (d13 + explosionX * 1.0) / 2.0, (d14 + explosionY * 1.0) / 2.0, (d15 + explosionZ * 1.0) / 2.0, d16, d17, d18);
            }
            block2 = Blocks.field_150350_a;
            if (explosionSize <= 2.0f) {
                if (cnt % 8 == 0) {
                    block2 = getNearBlock(worldObj, i4, j4, k3);
                }
            }
            else {
                block2 = getNearBlock(worldObj, i4, j4, k3);
            }
            if (block2 != Blocks.field_150350_a) {
                float m2 = explosionSize;
                if (m2 <= 1.0f) {
                    m2 *= 2.0f;
                }
                else {
                    m2 *= 0.5f;
                }
                final String pname = "blockdust_" + Block.func_149682_b(block2) + "_" + worldObj.func_72805_g(i4, j4, k3);
                FlansMod.proxy.spawnParticle(pname, (d13 + explosionX * 1.0) / 2.0, (d14 + explosionY * 1.0) / 2.0, (d15 + explosionZ * 1.0) / 2.0, d16 * m2, d17 * m2, d18 * m2);
            }
        }
    }
    
    public static Block getNearBlock(final World w, final int x, final int y, final int z) {
        final int[][] offset = { { 0, -1, 0 }, { 1, 0, 0 }, { -1, 0, 0 }, { 0, 0, 1 }, { 0, 0, -1 } };
        for (int i = 0; i < offset.length; ++i) {
            if (y > 1 || offset[i][1] == 0) {
                final Block block = w.func_147439_a(x + offset[i][0], y + offset[i][1], z + offset[i][2]);
                if (block != Blocks.field_150350_a) {
                    return block;
                }
            }
        }
        return Blocks.field_150350_a;
    }
    
    static {
        explosionRNG = new Random();
    }
}

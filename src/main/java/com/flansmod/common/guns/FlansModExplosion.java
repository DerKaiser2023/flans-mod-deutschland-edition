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
        this.isFlaming = false;
        this.isSmoking = breakBlocks;
        this.breakBlocks = breakBlocks;
        this.damageVsPlayer = damagePlayer;
        this.damageVsLiving = damageLiving;
        this.damageVsPlane = damagePlane;
        this.damageVsVehicle = damageVehicle;
        this.doExplosionA();
        this.doExplosionB(true);
        this.spawnParticle(smokeCount, debrisCount);
        if (!this.worldObj.isRemote) {
            for (final Object playerEntity : this.worldObj.playerEntities) {
                if (playerEntity instanceof EntityPlayerMP) {
                    final EntityPlayerMP entityplayer = (EntityPlayerMP)playerEntity;
                    if (entityplayer.getDistanceSq(x, y, z) >= 4096.0) {
                        continue;
                    }
                    FlansMod.getPacketHandler().sendTo(new PacketExplosion(x, y, z, r), entityplayer);
                }
            }
        }
    }
    
    public void doExplosionA() {
        final float f = this.explosionSize;
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
                        float f2 = this.explosionSize * (0.7f + this.worldObj.rand.nextFloat() * 0.6f);
                        double d7 = this.explosionX;
                        double d8 = this.explosionY;
                        double d9 = this.explosionZ;
                        for (float f3 = 0.3f; f2 > 0.0f; f2 -= f3 * 0.75f) {
                            final int l = MathHelper.floor_double(d7);
                            final int i2 = MathHelper.floor_double(d8);
                            final int j2 = MathHelper.floor_double(d9);
                            final Block block = this.worldObj.getBlock(l, i2, j2);
                            final float f4 = (this.exploder != null) ? this.exploder.getExplosionResistance((Explosion)this, this.worldObj, l, i2, j2, block) : block.getExplosionResistance(this.exploder, this.worldObj, l, i2, j2, this.explosionX, this.explosionY, this.explosionZ);
                            f2 -= (f4 + 0.3f) * f3;
                            if (f2 > 0.0f && (this.exploder == null || this.exploder.func_145774_a((Explosion)this, this.worldObj, l, i2, j2, block, f2))) {
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
        this.affectedBlockPositions.addAll(hashset);
        this.explosionSize *= 2.0f;
        int i = MathHelper.floor_double(this.explosionX - this.explosionSize - 1.0);
        int j = MathHelper.floor_double(this.explosionX + this.explosionSize + 1.0);
        int k = MathHelper.floor_double(this.explosionY - this.explosionSize - 1.0);
        final int l2 = MathHelper.floor_double(this.explosionY + this.explosionSize + 1.0);
        final int i3 = MathHelper.floor_double(this.explosionZ - this.explosionSize - 1.0);
        final int j3 = MathHelper.floor_double(this.explosionZ + this.explosionSize + 1.0);
        final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this.exploder, AxisAlignedBB.getBoundingBox((double)i, (double)k, (double)i3, (double)j, (double)l2, (double)j3));
        final Vec3 vec3 = Vec3.createVectorHelper(this.explosionX, this.explosionY, this.explosionZ);
        for (final Object aList : list) {
            final Entity entity = (Entity)aList;
            final double d10 = entity.getDistance(this.explosionX, this.explosionY, this.explosionZ) / this.explosionSize;
            if (d10 <= 1.0) {
                double d7 = entity.posX - this.explosionX;
                double d8 = entity.posY + entity.getEyeHeight() - this.explosionY;
                double d9 = entity.posZ - this.explosionZ;
                final double d11 = MathHelper.sqrt_double(d7 * d7 + d8 * d8 + d9 * d9);
                if (d11 == 0.0) {
                    continue;
                }
                d7 /= d11;
                d8 /= d11;
                d9 /= d11;
                final double d12 = this.getBlockDensity(vec3, entity.boundingBox);
                final double d13 = (1.0 - d10) * d12;
                EntityDriveable entityDriveable = null;
                float damage = (float)((d13 * d13 + d13) / 2.0 * 8.0 * this.explosionSize + 1.0);
                if (entity instanceof EntityPlayer) {
                    final EntityPlayer Victim = (EntityPlayer)entity;
                    for (int n = 0; n < 5; ++n) {
                        final ItemStack stackerino = ((EntityPlayer)entity).getEquipmentInSlot(n);
                        if (stackerino != null && stackerino.getItem() instanceof ItemTeamArmour) {
                            final float helmet = ((ItemTeamArmour)stackerino.getItem()).type.headArmor;
                            final float body = ((ItemTeamArmour)stackerino.getItem()).type.bodyArmor;
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
                    final boolean b = entity.attackEntityFrom((DamageSource)((this.player == null || this.type == null) ? DamageSource.setExplosionSource((Explosion)this) : new EntityDamageSourceFlans(this.type.shortName, entity, this.player, this.type, false, false)), damage);
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
                    entity2.motionX += multiplier * d7 * d14;
                    final Entity entity3 = entity;
                    entity3.motionY += multiplier * d8 * d14;
                    final Entity entity4 = entity;
                    entity4.motionZ += multiplier * d9 * d14;
                }
                if (!(entity instanceof EntityPlayer)) {
                    continue;
                }
                this.playerLocations.put((EntityPlayer)entity, Vec3.createVectorHelper(d7 * d13, d8 * d13, d9 * d13));
            }
        }
        this.explosionSize = f;
    }
    
    public void spawnParticle(final int numSmoke, final int numDebris) {
        final float mod = this.radius * 0.1f;
        for (int smoke = 0; smoke < numSmoke; ++smoke) {
            final float smokeRand = (float)Math.random();
            if (smokeRand < 0.25) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.explosionX, this.explosionY, this.explosionZ, (float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
            else if (smokeRand > 0.25 && smokeRand < 0.5) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.explosionX, this.explosionY, this.explosionZ, (float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
            else if (smokeRand > 0.5 && smokeRand < 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.explosionX, this.explosionY, this.explosionZ, -(float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
            else if (smokeRand > 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.explosionX, this.explosionY, this.explosionZ, -(float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
        }
        for (int debris = 0; debris < numDebris; ++debris) {
            final float smokeRand = (float)Math.random();
            if (smokeRand < 0.25) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.explosionX, this.explosionY, this.explosionZ, (float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
            else if (smokeRand > 0.25 && smokeRand < 0.5) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.explosionX, this.explosionY, this.explosionZ, (float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
            else if (smokeRand > 0.5 && smokeRand < 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.explosionX, this.explosionY, this.explosionZ, -(float)Math.random() * mod, (float)Math.random() * mod, (float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
            else if (smokeRand > 0.75) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.debris1", this.explosionX, this.explosionY, this.explosionZ, -(float)Math.random() * mod, (float)Math.random() * mod, -(float)Math.random() * mod), this.explosionX, this.explosionY, this.explosionZ, 150.0f, this.worldObj.provider.dimensionId);
            }
        }
    }
    
    public float getBlockDensity(final Vec3 p_72842_1_, final AxisAlignedBB p_72842_2_) {
        final double d0 = 1.0 / ((p_72842_2_.maxX - p_72842_2_.minX) * 2.0 + 1.0);
        final double d2 = 1.0 / ((p_72842_2_.maxY - p_72842_2_.minY) * 2.0 + 1.0);
        final double d3 = 1.0 / ((p_72842_2_.maxZ - p_72842_2_.minZ) * 2.0 + 1.0);
        if (d0 >= 0.0 && d2 >= 0.0 && d3 >= 0.0) {
            int i = 0;
            int j = 0;
            for (float f = 0.0f; f <= 1.0f; f += (float)d0) {
                for (float f2 = 0.0f; f2 <= 1.0f; f2 += (float)d2) {
                    for (float f3 = 0.0f; f3 <= 1.0f; f3 += (float)d3) {
                        final double d4 = p_72842_2_.minX + (p_72842_2_.maxX - p_72842_2_.minX) * f;
                        final double d5 = p_72842_2_.minY + (p_72842_2_.maxY - p_72842_2_.minY) * f2;
                        final double d6 = p_72842_2_.minZ + (p_72842_2_.maxZ - p_72842_2_.minZ) * f3;
                        if (this.worldObj.rayTraceBlocks(Vec3.createVectorHelper(d4, d5, d6), p_72842_1_, false, true, false) == null) {
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
    
    public void doExplosionB(final boolean par1) {
        this.worldObj.playSoundEffect(this.explosionX, this.explosionY, this.explosionZ, "random.explode", 4.0f, (1.0f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2f) * 0.7f);
        if (!this.worldObj.isRemote && this.breakBlocks) {
            this.worldObj.createExplosion((Entity)null, this.explosionX, this.explosionY, this.explosionZ, this.radius, true);
        }
        else {
            ForgeEventFactory.onExplosionDetonate(this.worldObj, (Explosion)this, (List)new ArrayList(), (double)this.radius);
        }
        if (!this.worldObj.isRemote && this.isFlaming) {
            for (final ChunkPosition chunkposition : (List<ChunkPosition>) this.affectedBlockPositions) {
                final int i = chunkposition.chunkPosX;
                final int j = chunkposition.chunkPosY;
                final int k = chunkposition.chunkPosZ;
                final Block block = this.worldObj.getBlock(i, j, k);
                final Block blockBelow = this.worldObj.getBlock(i, j - 1, k);
                if (block == null && blockBelow.isOpaqueCube() && FlansModExplosion.explosionRNG.nextInt(3) == 0) {
                    this.worldObj.setBlock(i, j, k, (Block)Blocks.fire);
                }
            }
        }
    }
    
    public Map func_77277_b() {
        return this.playerLocations;
    }
    
    public EntityLivingBase getExplosivePlacedBy() {
        return (this.exploder == null) ? null : ((this.exploder instanceof EntityTNTPrimed) ? ((EntityTNTPrimed)this.exploder).getTntPlacedBy() : ((this.exploder instanceof EntityLivingBase) ? (EntityLivingBase) this.exploder : null));
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
                        float f2 = explosionSize * (0.7f + worldObj.rand.nextFloat() * 0.6f);
                        double d5 = explosionX;
                        double d6 = explosionY;
                        double d7 = explosionZ;
                        for (float f3 = 0.3f; f2 > 0.0f; f2 -= f3 * 0.75f) {
                            final int j2 = MathHelper.floor_double(d5);
                            final int k2 = MathHelper.floor_double(d6);
                            final int l1 = MathHelper.floor_double(d7);
                            final Block block = worldObj.getBlock(j2, k2, l1);
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
        int i = MathHelper.floor_double(explosionX - explosionSize - 1.0);
        int j = MathHelper.floor_double(explosionX + explosionSize + 1.0);
        int k = MathHelper.floor_double(explosionY - explosionSize - 1.0);
        final int i2 = MathHelper.floor_double(explosionY + explosionSize + 1.0);
        final int m = MathHelper.floor_double(explosionZ - explosionSize - 1.0);
        final int j3 = MathHelper.floor_double(explosionZ + explosionSize + 1.0);
        final List list = worldObj.getEntitiesWithinAABBExcludingEntity(exploder, AxisAlignedBB.getBoundingBox((double)i, (double)k, (double)m, (double)j, (double)i2, (double)j3));
        final Vec3 vec3 = Vec3.createVectorHelper(explosionX, explosionY, explosionZ);
        for (int i3 = 0; i3 < list.size(); ++i3) {
            final Entity entity = (Entity) list.get(i3);
            final double d8 = entity.getDistance(explosionX, explosionY, explosionZ) / explosionSize;
            if (d8 <= 1.0) {
                double d5 = entity.posX - explosionX;
                double d6 = entity.posY + entity.getEyeHeight() - explosionY;
                double d7 = entity.posZ - explosionZ;
                final double d9 = MathHelper.sqrt_double(d5 * d5 + d6 * d6 + d7 * d7);
                if (d9 != 0.0) {
                    d5 /= d9;
                    d6 /= d9;
                    d7 /= d9;
                    final double d10 = worldObj.getBlockDensity(vec3, entity.boundingBox);
                    final double d11 = (1.0 - d8) * d10;
                    entity.attackEntityFrom(DamageSource.setExplosionSource(explosion), (float)(int)((d11 * d11 + d11) / 2.0 * 8.0 * explosionSize + 1.0));
                    final double d12 = EnchantmentProtection.func_92092_a(entity, d11);
                    final Entity entity2 = entity;
                    entity2.motionX += d5 * d12;
                    final Entity entity3 = entity;
                    entity3.motionY += d6 * d12;
                    final Entity entity4 = entity;
                    entity4.motionZ += d7 * d12;
                }
            }
        }
        explosionSize = f;
        if (explosionSize >= 2.0f && isSmoking) {
            worldObj.spawnParticle("hugeexplosion", explosionX, explosionY, explosionZ, 1.0, 0.0, 0.0);
        }
        else {
            worldObj.spawnParticle("largeexplode", explosionX, explosionY, explosionZ, 1.0, 0.0, 0.0);
        }
        final Iterator iterator = affectedBlockPositions.iterator();
        int cnt = 0;
        while (iterator.hasNext()) {
            ++cnt;
            final ChunkPosition chunkposition = (ChunkPosition) iterator.next();
            final int i4 = chunkposition.chunkPosX;
            final int j4 = chunkposition.chunkPosY;
            final int k3 = chunkposition.chunkPosZ;
            Block block2 = worldObj.getBlock(i4, j4, k3);
            final double d13 = i4 + worldObj.rand.nextFloat();
            final double d14 = j4 + worldObj.rand.nextFloat();
            final double d15 = k3 + worldObj.rand.nextFloat();
            double d16 = d13 - explosionX;
            double d17 = d14 - explosionY;
            double d18 = d15 - explosionZ;
            final double d19 = MathHelper.sqrt_double(d16 * d16 + d17 * d17 + d18 * d18);
            d16 /= d19;
            d17 /= d19;
            d18 /= d19;
            double d20 = 0.5 / (d19 / explosionSize + 0.1);
            d20 *= worldObj.rand.nextFloat() * worldObj.rand.nextFloat() + 0.3f;
            d16 *= d20;
            d17 *= d20;
            d18 *= d20;
            if ((explosionSize <= 1.0f && cnt % 4 == 0) || explosionSize > 1.0f) {
                FlansMod.proxy.spawnParticle("explode", (d13 + explosionX * 1.0) / 2.0, (d14 + explosionY * 1.0) / 2.0, (d15 + explosionZ * 1.0) / 2.0, d16, d17, d18);
            }
            block2 = Blocks.air;
            if (explosionSize <= 2.0f) {
                if (cnt % 8 == 0) {
                    block2 = getNearBlock(worldObj, i4, j4, k3);
                }
            }
            else {
                block2 = getNearBlock(worldObj, i4, j4, k3);
            }
            if (block2 != Blocks.air) {
                float m2 = explosionSize;
                if (m2 <= 1.0f) {
                    m2 *= 2.0f;
                }
                else {
                    m2 *= 0.5f;
                }
                final String pname = "blockdust_" + Block.getIdFromBlock(block2) + "_" + worldObj.getBlockMetadata(i4, j4, k3);
                FlansMod.proxy.spawnParticle(pname, (d13 + explosionX * 1.0) / 2.0, (d14 + explosionY * 1.0) / 2.0, (d15 + explosionZ * 1.0) / 2.0, d16 * m2, d17 * m2, d18 * m2);
            }
        }
    }
    
    public static Block getNearBlock(final World w, final int x, final int y, final int z) {
        final int[][] offset = { { 0, -1, 0 }, { 1, 0, 0 }, { -1, 0, 0 }, { 0, 0, 1 }, { 0, 0, -1 } };
        for (int i = 0; i < offset.length; ++i) {
            if (y > 1 || offset[i][1] == 0) {
                final Block block = w.getBlock(x + offset[i][0], y + offset[i][1], z + offset[i][2]);
                if (block != Blocks.air) {
                    return block;
                }
            }
        }
        return Blocks.air;
    }
    
    static {
        explosionRNG = new Random();
    }
}

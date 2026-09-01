// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import com.flansmod.common.PlayerData;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.util.MathHelper;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.FlansMod;
import java.util.ArrayList;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerSnapshot
{
    public EntityPlayer player;
    public Vector3f pos;
    public ArrayList<PlayerHitbox> hitboxes;
    public long time;
    public int shieldTimer;
    
    public PlayerSnapshot(final EntityPlayer p) {
        this.shieldTimer = 0;
        this.player = p;
        this.pos = new Vector3f(p.posX, p.posY, p.posZ);
        if (FlansMod.proxy.isThePlayer(p)) {
            this.pos = new Vector3f(p.posX, p.posY - 1.600000023841858, p.posZ);
        }
        this.hitboxes = new ArrayList<PlayerHitbox>();
        final RotatedAxes bodyAxes = new RotatedAxes(p.renderYawOffset, 0.0f, 0.0f);
        final RotatedAxes headAxes = new RotatedAxes(p.rotationYawHead - p.renderYawOffset, 0.0f, -p.rotationPitch);
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-0.25f, 0.7f, -0.2f), new Vector3f(0.5f, 0.7f, 0.2f), EnumHitboxType.BACK));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-0.25f, 0.7f, 0.0f), new Vector3f(0.5f, 0.7f, 0.2f), EnumHitboxType.BODY));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-0.25f, 0.0f, -0.15f), new Vector3f(0.5f, 0.7f, 0.3f), EnumHitboxType.LEGS));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0f, 1.4f, 0.0f), new Vector3f(-0.25f, 0.0f, -0.3f), new Vector3f(0.5f, 0.25f, 0.45f), EnumHitboxType.NAPE));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0f, 1.4f, 0.0f), new Vector3f(-0.2f, 0.0f, 0.15f), new Vector3f(0.4f, 0.25f, 0.1f), EnumHitboxType.FACE));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0f, 1.4f, 0.0f), new Vector3f(-0.25f, 0.25f, -0.3f), new Vector3f(0.5f, 0.25f, 0.6f), EnumHitboxType.CRANIUM));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-2.25f, 0.0f, -2.15f), new Vector3f(4.5f, 6.0f, 4.3f), EnumHitboxType.NEARBY));
        final float yHead = (p.rotationYawHead - p.renderYawOffset) / 57.295776f;
        final float xHead = p.rotationPitch / 57.295776f;
        float zRight = 0.0f;
        float zLeft = 0.0f;
        final float yRight = -0.1f + yHead - 1.5707964f;
        final float yLeft = 0.1f + yHead + 0.4f - 1.5707964f;
        float xRight = -1.5707964f + xHead;
        float xLeft = -1.5707964f + xHead;
        zRight += MathHelper.cos(p.ticksExisted * 0.09f) * 0.05f + 0.05f;
        zLeft -= MathHelper.cos(p.ticksExisted * 0.09f) * 0.05f + 0.05f;
        xRight += MathHelper.sin(p.ticksExisted * 0.067f) * 0.05f;
        xLeft -= MathHelper.sin(p.ticksExisted * 0.067f) * 0.05f;
        final RotatedAxes leftArmAxes = new RotatedAxes().rotateGlobalPitchInRads(xLeft).rotateGlobalYawInRads(3.1415927f + yLeft).rotateGlobalRollInRads(-zLeft);
        final RotatedAxes rightArmAxes = new RotatedAxes().rotateGlobalPitchInRads(xRight).rotateGlobalYawInRads(3.1415927f + yRight).rotateGlobalRollInRads(-zRight);
        final float originZRight = MathHelper.sin(-p.renderYawOffset * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        final float originXRight = -MathHelper.cos(-p.renderYawOffset * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        final float originZLeft = -MathHelper.sin(-p.renderYawOffset * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        final float originXLeft = MathHelper.cos(-p.renderYawOffset * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(leftArmAxes), new Vector3f(originXLeft, 1.3f, originZLeft), new Vector3f(-0.125f, -0.6f, -0.125f), new Vector3f(0.25f, 0.7f, 0.25f), EnumHitboxType.LEFTARM));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3f, originZRight), new Vector3f(-0.125f, -0.6f, -0.125f), new Vector3f(0.25f, 0.7f, 0.25f), EnumHitboxType.RIGHTARM));
        final ItemStack playerRightHandStack = this.player.getCurrentEquippedItem();
        if (playerRightHandStack != null && playerRightHandStack.getItem() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)playerRightHandStack.getItem()).type;
            final ItemGun allahu = (ItemGun)playerRightHandStack.getItem();
            if ((gunType.shield && !gunType.canBlock) || (allahu.blocking && gunType.canBlock)) {
                this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3f, originZRight), new Vector3f(gunType.shieldOrigin.y, -1.05f + gunType.shieldOrigin.x, -0.0625f + gunType.shieldOrigin.z), new Vector3f(gunType.shieldDimensions.y, gunType.shieldDimensions.x, gunType.shieldDimensions.z), EnumHitboxType.RIGHTITEM));
            }
            final PlayerData data = PlayerHandler.getPlayerData(this.player);
            if (gunType.oneHanded && data.offHandGunSlot != 0) {
                ItemStack leftHandStack = null;
                if (this.player.worldObj.isRemote && !FlansMod.proxy.isThePlayer(this.player)) {
                    leftHandStack = data.offHandGunStack;
                }
                else {
                    leftHandStack = this.player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                }
                if (leftHandStack != null && leftHandStack.getItem() instanceof ItemGun) {
                    final GunType leftGunType = ((ItemGun)leftHandStack.getItem()).type;
                    if (leftGunType.shield) {
                        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(leftArmAxes), new Vector3f(originXLeft, 1.3f, originZLeft), new Vector3f(leftGunType.shieldOrigin.y, -1.05f + leftGunType.shieldOrigin.x, -0.0625f + leftGunType.shieldOrigin.z), new Vector3f(leftGunType.shieldDimensions.y, leftGunType.shieldDimensions.x, leftGunType.shieldDimensions.z), EnumHitboxType.LEFTITEM));
                    }
                }
            }
        }
    }
    
    public ArrayList<BulletHit> raytrace(final Vector3f origin, final Vector3f motion) {
        final Vector3f localOrigin = Vector3f.sub(origin, this.pos, null);
        final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
        for (final PlayerHitbox hitbox : this.hitboxes) {
            final PlayerBulletHit hit = hitbox.raytrace(localOrigin, motion);
            if (hit != null && hit.intersectTime >= 0.0f && hit.intersectTime <= 1.0f) {
                hits.add(hit);
                this.shieldTimer = 10;
            }
        }
        return hits;
    }
    
    @SideOnly(Side.CLIENT)
    public void renderSnapshot() {
        for (final PlayerHitbox hitbox : this.hitboxes) {
            hitbox.renderHitbox(this.player.worldObj, this.pos);
        }
    }
}

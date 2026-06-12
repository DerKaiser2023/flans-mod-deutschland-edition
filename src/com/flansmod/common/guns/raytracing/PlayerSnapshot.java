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
        this.pos = new Vector3f(p.field_70165_t, p.field_70163_u, p.field_70161_v);
        if (FlansMod.proxy.isThePlayer(p)) {
            this.pos = new Vector3f(p.field_70165_t, p.field_70163_u - 1.600000023841858, p.field_70161_v);
        }
        this.hitboxes = new ArrayList<PlayerHitbox>();
        final RotatedAxes bodyAxes = new RotatedAxes(p.field_70761_aq, 0.0f, 0.0f);
        final RotatedAxes headAxes = new RotatedAxes(p.field_70759_as - p.field_70761_aq, 0.0f, -p.field_70125_A);
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-0.25f, 0.7f, -0.2f), new Vector3f(0.5f, 0.7f, 0.2f), EnumHitboxType.BACK));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-0.25f, 0.7f, 0.0f), new Vector3f(0.5f, 0.7f, 0.2f), EnumHitboxType.BODY));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-0.25f, 0.0f, -0.15f), new Vector3f(0.5f, 0.7f, 0.3f), EnumHitboxType.LEGS));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0f, 1.4f, 0.0f), new Vector3f(-0.25f, 0.0f, -0.3f), new Vector3f(0.5f, 0.25f, 0.45f), EnumHitboxType.NAPE));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0f, 1.4f, 0.0f), new Vector3f(-0.2f, 0.0f, 0.15f), new Vector3f(0.4f, 0.25f, 0.1f), EnumHitboxType.FACE));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(headAxes), new Vector3f(0.0f, 1.4f, 0.0f), new Vector3f(-0.25f, 0.25f, -0.3f), new Vector3f(0.5f, 0.25f, 0.6f), EnumHitboxType.CRANIUM));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes, new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(-2.25f, 0.0f, -2.15f), new Vector3f(4.5f, 6.0f, 4.3f), EnumHitboxType.NEARBY));
        final float yHead = (p.field_70759_as - p.field_70761_aq) / 57.295776f;
        final float xHead = p.field_70125_A / 57.295776f;
        float zRight = 0.0f;
        float zLeft = 0.0f;
        final float yRight = -0.1f + yHead - 1.5707964f;
        final float yLeft = 0.1f + yHead + 0.4f - 1.5707964f;
        float xRight = -1.5707964f + xHead;
        float xLeft = -1.5707964f + xHead;
        zRight += MathHelper.func_76134_b(p.field_70173_aa * 0.09f) * 0.05f + 0.05f;
        zLeft -= MathHelper.func_76134_b(p.field_70173_aa * 0.09f) * 0.05f + 0.05f;
        xRight += MathHelper.func_76126_a(p.field_70173_aa * 0.067f) * 0.05f;
        xLeft -= MathHelper.func_76126_a(p.field_70173_aa * 0.067f) * 0.05f;
        final RotatedAxes leftArmAxes = new RotatedAxes().rotateGlobalPitchInRads(xLeft).rotateGlobalYawInRads(3.1415927f + yLeft).rotateGlobalRollInRads(-zLeft);
        final RotatedAxes rightArmAxes = new RotatedAxes().rotateGlobalPitchInRads(xRight).rotateGlobalYawInRads(3.1415927f + yRight).rotateGlobalRollInRads(-zRight);
        final float originZRight = MathHelper.func_76126_a(-p.field_70761_aq * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        final float originXRight = -MathHelper.func_76134_b(-p.field_70761_aq * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        final float originZLeft = -MathHelper.func_76126_a(-p.field_70761_aq * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        final float originXLeft = MathHelper.func_76134_b(-p.field_70761_aq * 3.1415927f / 180.0f) * 5.0f / 16.0f;
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(leftArmAxes), new Vector3f(originXLeft, 1.3f, originZLeft), new Vector3f(-0.125f, -0.6f, -0.125f), new Vector3f(0.25f, 0.7f, 0.25f), EnumHitboxType.LEFTARM));
        this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3f, originZRight), new Vector3f(-0.125f, -0.6f, -0.125f), new Vector3f(0.25f, 0.7f, 0.25f), EnumHitboxType.RIGHTARM));
        final ItemStack playerRightHandStack = this.player.func_71045_bC();
        if (playerRightHandStack != null && playerRightHandStack.func_77973_b() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)playerRightHandStack.func_77973_b()).type;
            final ItemGun allahu = (ItemGun)playerRightHandStack.func_77973_b();
            if ((gunType.shield && !gunType.canBlock) || (allahu.blocking && gunType.canBlock)) {
                this.hitboxes.add(new PlayerHitbox(this.player, bodyAxes.findLocalAxesGlobally(rightArmAxes), new Vector3f(originXRight, 1.3f, originZRight), new Vector3f(gunType.shieldOrigin.y, -1.05f + gunType.shieldOrigin.x, -0.0625f + gunType.shieldOrigin.z), new Vector3f(gunType.shieldDimensions.y, gunType.shieldDimensions.x, gunType.shieldDimensions.z), EnumHitboxType.RIGHTITEM));
            }
            final PlayerData data = PlayerHandler.getPlayerData(this.player);
            if (gunType.oneHanded && data.offHandGunSlot != 0) {
                ItemStack leftHandStack = null;
                if (this.player.field_70170_p.field_72995_K && !FlansMod.proxy.isThePlayer(this.player)) {
                    leftHandStack = data.offHandGunStack;
                }
                else {
                    leftHandStack = this.player.field_71071_by.func_70301_a(data.offHandGunSlot - 1);
                }
                if (leftHandStack != null && leftHandStack.func_77973_b() instanceof ItemGun) {
                    final GunType leftGunType = ((ItemGun)leftHandStack.func_77973_b()).type;
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
            hitbox.renderHitbox(this.player.field_70170_p, this.pos);
        }
    }
}

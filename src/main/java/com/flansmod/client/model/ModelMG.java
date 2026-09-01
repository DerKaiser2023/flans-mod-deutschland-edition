// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.guns.EntityMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMG extends ModelBase
{
    public ModelRendererTurbo[] bipodModel;
    public ModelRendererTurbo[] gunModel;
    public ModelRendererTurbo[] ammoModel;
    public ModelRendererTurbo[] ammoBoxModel;
    
    public ModelMG() {
        this.ammoBoxModel = new ModelRendererTurbo[0];
    }
    
    public void renderBipod(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final EntityMG mg) {
        for (final ModelRendererTurbo bipodPart : this.bipodModel) {
            bipodPart.render(f5);
        }
        if (mg.reloadTimer > 0 || mg.ammo == null) {
            return;
        }
        for (final ModelRendererTurbo ammoBoxPart : this.ammoBoxModel) {
            ammoBoxPart.render(f5);
        }
    }
    
    public void renderGun(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final float f6, final EntityMG mg) {
        for (final ModelRendererTurbo gunPart : this.gunModel) {
            gunPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180.0f * 3.1415927f;
            gunPart.render(f5);
        }
        if (mg.reloadTimer > 0 || mg.ammo == null) {
            return;
        }
        for (final ModelRendererTurbo ammoPart : this.ammoModel) {
            ammoPart.rotateAngleX = -(mg.prevRotationPitch + (mg.rotationPitch - mg.prevRotationPitch) * f6) / 180.0f * 3.1415927f;
            ammoPart.render(f5);
        }
    }
    
    public void flipAll() {
        for (final ModelRendererTurbo aBipodModel : this.bipodModel) {
            aBipodModel.doMirror(false, true, true);
            aBipodModel.setRotationPoint(aBipodModel.rotationPointX, -aBipodModel.rotationPointY, -aBipodModel.rotationPointZ);
        }
        for (final ModelRendererTurbo aGunModel : this.gunModel) {
            aGunModel.doMirror(false, true, true);
            aGunModel.setRotationPoint(aGunModel.rotationPointX, -aGunModel.rotationPointY, -aGunModel.rotationPointZ);
        }
        for (final ModelRendererTurbo anAmmoModel : this.ammoModel) {
            anAmmoModel.doMirror(false, true, true);
            anAmmoModel.setRotationPoint(anAmmoModel.rotationPointX, -anAmmoModel.rotationPointY, -anAmmoModel.rotationPointZ);
        }
        for (final ModelRendererTurbo anAmmoBoxModel : this.ammoBoxModel) {
            anAmmoBoxModel.doMirror(false, true, true);
            anAmmoBoxModel.setRotationPoint(anAmmoBoxModel.rotationPointX, -anAmmoBoxModel.rotationPointY, -anAmmoBoxModel.rotationPointZ);
        }
    }
}

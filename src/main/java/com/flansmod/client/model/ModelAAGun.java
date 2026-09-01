// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelAAGun extends ModelBase
{
    public boolean oldModel;
    public ModelRendererTurbo[] baseModel;
    public ModelRendererTurbo[] seatModel;
    public ModelRendererTurbo[] gunModel;
    public ModelRendererTurbo[][] barrelModel;
    public ModelRendererTurbo[][] ammoModel;
    public ModelRendererTurbo[] gunsightModel;
    public int barrelX;
    public int barrelY;
    public int barrelZ;
    
    public ModelAAGun() {
        this.oldModel = false;
        this.baseModel = new ModelRendererTurbo[0];
        this.seatModel = new ModelRendererTurbo[0];
        this.gunModel = new ModelRendererTurbo[0];
        this.barrelModel = new ModelRendererTurbo[0][0];
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.gunsightModel = new ModelRendererTurbo[0];
    }
    
    public void renderBase(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final EntityAAGun aa) {
        for (final ModelRendererTurbo aBaseModel : this.baseModel) {
            aBaseModel.render(f5);
        }
    }
    
    public void renderGun(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final EntityAAGun aa) {
        for (final ModelRendererTurbo aSeatModel : this.seatModel) {
            aSeatModel.render(f5);
        }
        for (final ModelRendererTurbo aGunModel : this.gunModel) {
            aGunModel.setPosition((float)this.barrelX, (float)this.barrelY, (float)this.barrelZ);
            aGunModel.rotateAngleZ = -aa.gunPitch / 180.0f * 3.1415927f;
            aGunModel.render(f5);
        }
        for (final ModelRendererTurbo aGunsightModel : this.gunsightModel) {
            aGunsightModel.rotateAngleZ = -aa.gunPitch / 180.0f * 3.1415927f;
            aGunsightModel.render(f5);
        }
        for (int i = 0; i < this.barrelModel.length; ++i) {
            for (int j = 0; j < this.barrelModel[i].length; ++j) {
                this.barrelModel[i][j].setPosition(-aa.barrelRecoil[i] * (float)Math.cos(-aa.gunPitch * 3.1415927f / 180.0f) + this.barrelX, -aa.barrelRecoil[i] * (float)Math.sin(-aa.gunPitch * 3.1415927f / 180.0f) + this.barrelY, (float)this.barrelZ);
                this.barrelModel[i][j].rotateAngleZ = -aa.gunPitch / 180.0f * 3.1415927f;
                this.barrelModel[i][j].render(f5);
            }
        }
        for (int i = 0; i < this.ammoModel.length; ++i) {
            if (aa.ammo[i] != null) {
                for (int j = 0; j < this.ammoModel[i].length; ++j) {
                    this.ammoModel[i][j].setPosition((float)this.barrelX, (float)this.barrelY, (float)this.barrelZ);
                    this.ammoModel[i][j].rotateAngleZ = -aa.gunPitch / 180.0f * 3.1415927f;
                    this.ammoModel[i][j].render(f5);
                }
            }
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
    
    public void flipAll() {
        for (final ModelRendererTurbo aBaseModel : this.baseModel) {
            aBaseModel.doMirror(false, true, true);
            aBaseModel.setRotationPoint(aBaseModel.rotationPointX, -aBaseModel.rotationPointY, -aBaseModel.rotationPointZ);
        }
        for (final ModelRendererTurbo aSeatModel : this.seatModel) {
            aSeatModel.doMirror(false, true, true);
            aSeatModel.setRotationPoint(aSeatModel.rotationPointX, -aSeatModel.rotationPointY, -aSeatModel.rotationPointZ);
        }
        for (final ModelRendererTurbo aGunModel : this.gunModel) {
            aGunModel.doMirror(false, true, true);
            aGunModel.setRotationPoint(aGunModel.rotationPointX, -aGunModel.rotationPointY, -aGunModel.rotationPointZ);
        }
        for (final ModelRendererTurbo aGunsightModel : this.gunsightModel) {
            aGunsightModel.doMirror(false, true, true);
            aGunsightModel.setRotationPoint(aGunsightModel.rotationPointX, -aGunsightModel.rotationPointY, -aGunsightModel.rotationPointZ);
        }
        for (final ModelRendererTurbo[] aBarrelModel : this.barrelModel) {
            for (int j = 0; j < aBarrelModel.length; ++j) {
                aBarrelModel[j].doMirror(false, true, true);
                aBarrelModel[j].setRotationPoint(aBarrelModel[j].rotationPointX, -aBarrelModel[j].rotationPointY, -aBarrelModel[j].rotationPointZ);
            }
        }
        for (final ModelRendererTurbo[] anAmmoModel : this.ammoModel) {
            for (int j = 0; j < anAmmoModel.length; ++j) {
                anAmmoModel[j].doMirror(false, true, true);
                anAmmoModel[j].setRotationPoint(anAmmoModel[j].rotationPointX, -anAmmoModel[j].rotationPointY, -anAmmoModel[j].rotationPointZ);
            }
        }
    }
}

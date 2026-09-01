// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelAttachment extends ModelBase
{
    public ModelRendererTurbo[] attachmentModel;
    public ModelRendererTurbo[] ammoModel;
    public EnumAnimationType secondaryAnimType;
    public float tiltGunTime;
    public float unloadClipTime;
    public float loadClipTime;
    public float untiltGunTime;
    public float numBulletsInReloadAnimation;
    public float endLoadedAmmoDistance;
    public float renderOffset;
    public float recoilDistance;
    public float recoilAngle;
    public Vector3f attachmentFlashOffset;
    
    public ModelAttachment() {
        this.attachmentModel = new ModelRendererTurbo[0];
        this.ammoModel = new ModelRendererTurbo[0];
        this.secondaryAnimType = EnumAnimationType.NONE;
        this.tiltGunTime = 0.15f;
        this.unloadClipTime = 0.35f;
        this.loadClipTime = 0.35f;
        this.untiltGunTime = 0.15f;
        this.numBulletsInReloadAnimation = 1.0f;
        this.endLoadedAmmoDistance = 1.0f;
        this.renderOffset = 0.0f;
        this.recoilDistance = 0.125f;
        this.recoilAngle = -8.0f;
        this.attachmentFlashOffset = new Vector3f(0.0f, 0.0f, 0.0f);
    }
    
    public void renderAttachment(final float f) {
        for (final ModelRendererTurbo model : this.attachmentModel) {
            if (model != null) {
                model.func_78785_a(f);
            }
        }
    }
    
    public void renderAttachmentAmmo(final float f) {
        for (final ModelRendererTurbo model : this.ammoModel) {
            if (model != null) {
                model.func_78785_a(f);
            }
        }
    }
    
    public void flipAll() {
        for (final ModelRendererTurbo anAttachmentModel : this.attachmentModel) {
            anAttachmentModel.doMirror(false, true, true);
            anAttachmentModel.func_78793_a(anAttachmentModel.field_78800_c, -anAttachmentModel.field_78797_d, -anAttachmentModel.field_78798_e);
        }
        for (final ModelRendererTurbo anAmmoModel : this.ammoModel) {
            anAmmoModel.doMirror(false, true, true);
            anAmmoModel.func_78793_a(anAmmoModel.field_78800_c, -anAmmoModel.field_78797_d, -anAmmoModel.field_78798_e);
        }
    }
}

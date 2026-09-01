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
            bipodPart.func_78785_a(f5);
        }
        if (mg.reloadTimer > 0 || mg.ammo == null) {
            return;
        }
        for (final ModelRendererTurbo ammoBoxPart : this.ammoBoxModel) {
            ammoBoxPart.func_78785_a(f5);
        }
    }
    
    public void renderGun(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final float f6, final EntityMG mg) {
        for (final ModelRendererTurbo gunPart : this.gunModel) {
            gunPart.field_78795_f = -(mg.field_70127_C + (mg.field_70125_A - mg.field_70127_C) * f6) / 180.0f * 3.1415927f;
            gunPart.func_78785_a(f5);
        }
        if (mg.reloadTimer > 0 || mg.ammo == null) {
            return;
        }
        for (final ModelRendererTurbo ammoPart : this.ammoModel) {
            ammoPart.field_78795_f = -(mg.field_70127_C + (mg.field_70125_A - mg.field_70127_C) * f6) / 180.0f * 3.1415927f;
            ammoPart.func_78785_a(f5);
        }
    }
    
    public void flipAll() {
        for (final ModelRendererTurbo aBipodModel : this.bipodModel) {
            aBipodModel.doMirror(false, true, true);
            aBipodModel.func_78793_a(aBipodModel.field_78800_c, -aBipodModel.field_78797_d, -aBipodModel.field_78798_e);
        }
        for (final ModelRendererTurbo aGunModel : this.gunModel) {
            aGunModel.doMirror(false, true, true);
            aGunModel.func_78793_a(aGunModel.field_78800_c, -aGunModel.field_78797_d, -aGunModel.field_78798_e);
        }
        for (final ModelRendererTurbo anAmmoModel : this.ammoModel) {
            anAmmoModel.doMirror(false, true, true);
            anAmmoModel.func_78793_a(anAmmoModel.field_78800_c, -anAmmoModel.field_78797_d, -anAmmoModel.field_78798_e);
        }
        for (final ModelRendererTurbo anAmmoBoxModel : this.ammoBoxModel) {
            anAmmoBoxModel.doMirror(false, true, true);
            anAmmoBoxModel.func_78793_a(anAmmoBoxModel.field_78800_c, -anAmmoBoxModel.field_78797_d, -anAmmoBoxModel.field_78798_e);
        }
    }
}

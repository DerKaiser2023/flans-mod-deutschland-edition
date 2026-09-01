// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import java.util.Iterator;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.client.tmt.ModelRendererTurbo;
import java.util.HashMap;
import net.minecraft.client.model.ModelBase;

public class ModelDriveable extends ModelBase
{
    public static final float pi = 3.1415927f;
    public static final float tau = 6.2831855f;
    public HashMap<String, ModelRendererTurbo[][]> gunModels;
    public ModelRendererTurbo[] bodyModel;
    public ModelRendererTurbo[] bodyDoorOpenModel;
    public ModelRendererTurbo[] bodyDoorCloseModel;
    public boolean oldRotateOrder;
    
    public ModelDriveable() {
        this.gunModels = new HashMap<String, ModelRendererTurbo[][]>();
        this.bodyModel = new ModelRendererTurbo[0];
        this.bodyDoorOpenModel = new ModelRendererTurbo[0];
        this.bodyDoorCloseModel = new ModelRendererTurbo[0];
        this.oldRotateOrder = false;
    }
    
    public void render(final EntityDriveable driveable, final float f1) {
    }
    
    public void render(final DriveableType type) {
        this.renderPart(this.bodyModel);
        this.renderPart(this.bodyDoorCloseModel);
        for (final ModelRendererTurbo[][] array : this.gunModels.values()) {
            final ModelRendererTurbo[][] gun = array;
            for (final ModelRendererTurbo[] gunPart : array) {
                this.renderPart(gunPart);
            }
        }
    }
    
    public void renderPart(final ModelRendererTurbo[] part) {
        for (final ModelRendererTurbo bit : part) {
            bit.render(0.0625f, this.oldRotateOrder);
        }
    }
    
    public void registerGunModel(final String name, final ModelRendererTurbo[][] gunModel) {
        this.gunModels.put(name, gunModel);
    }
    
    protected void flip(final ModelRendererTurbo[] model) {
        for (final ModelRendererTurbo part : model) {
            part.doMirror(false, true, true);
            part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
        }
    }
    
    public void flipAll() {
        this.flip(this.bodyModel);
        this.flip(this.bodyDoorOpenModel);
        this.flip(this.bodyDoorCloseModel);
        for (final ModelRendererTurbo[][] array : this.gunModels.values()) {
            final ModelRendererTurbo[][] modsOfMods = array;
            for (final ModelRendererTurbo[] mods : array) {
                this.flip(mods);
            }
        }
    }
    
    protected void translate(final ModelRendererTurbo[] model, final float x, final float y, final float z) {
        for (final ModelRendererTurbo modelRendererTurbo : model) {
            final ModelRendererTurbo mod = modelRendererTurbo;
            modelRendererTurbo.rotationPointX += x;
            final ModelRendererTurbo modelRendererTurbo2 = mod;
            modelRendererTurbo2.rotationPointY += y;
            final ModelRendererTurbo modelRendererTurbo3 = mod;
            modelRendererTurbo3.rotationPointZ += z;
        }
    }
    
    public void translateAll(final float x, final float y, final float z) {
        this.translate(this.bodyModel, x, y, z);
        this.translate(this.bodyDoorOpenModel, x, y, z);
        this.translate(this.bodyDoorCloseModel, x, y, z);
        for (final ModelRendererTurbo[][] array : this.gunModels.values()) {
            final ModelRendererTurbo[][] modsOfMods = array;
            for (final ModelRendererTurbo[] mods : array) {
                this.translate(mods, x, y, z);
            }
        }
    }
    
    public void translateAll(final int x, final int y, final int z) {
        this.translateAll((float)x, (float)y, (float)z);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelGun extends ModelBase
{
    public ModelRendererTurbo[] gunModel;
    public ModelRendererTurbo[] backpackModel;
    public ModelRendererTurbo[] defaultBarrelModel;
    public ModelRendererTurbo[] defaultScopeModel;
    public ModelRendererTurbo[] defaultStockModel;
    public ModelRendererTurbo[] defaultGripModel;
    public ModelRendererTurbo[] defaultGadgetModel;
    public ModelRendererTurbo[] ammoModel;
    public ModelRendererTurbo[] fullammoModel;
    public ModelRendererTurbo[] revolverBarrelModel;
    public ModelRendererTurbo[] revolver2BarrelModel;
    public ModelRendererTurbo[] breakActionModel;
    public ModelRendererTurbo[] altbreakActionModel;
    public ModelRendererTurbo[] slideModel;
    public ModelRendererTurbo[] altslideModel;
    public ModelRendererTurbo[] pumpModel;
    public ModelRendererTurbo[] chargeModel;
    public ModelRendererTurbo[] altpumpModel;
    public ModelRendererTurbo[] minigunBarrelModel;
    public ModelRendererTurbo[] leverActionModel;
    public ModelRendererTurbo[] hammerModel;
    public ModelRendererTurbo[] althammerModel;
    public Vector3f minigunBarrelOrigin;
    public Vector3f barrelAttachPoint;
    public Vector3f scopeAttachPoint;
    public Vector3f stockAttachPoint;
    public Vector3f gripAttachPoint;
    public Vector3f gadgetAttachPoint;
    public Vector3f slideAttachPoint;
    public Vector3f pumpAttachPoint;
    public Vector3f accessoryAttachPoint;
    public Vector3f defaultBarrelFlashPoint;
    public Vector3f muzzleFlashPoint;
    public boolean hasFlash;
    public boolean hasArms;
    public Vector3f leftArmPos;
    public Vector3f leftArmRot;
    public Vector3f leftArmScale;
    public Vector3f rightArmPos;
    public Vector3f rightArmRot;
    public Vector3f rightArmScale;
    public Vector3f rightArmReloadPos;
    public Vector3f rightArmReloadRot;
    public Vector3f leftArmReloadPos;
    public Vector3f leftArmReloadRot;
    public Vector3f rightArmChargePos;
    public Vector3f rightArmChargeRot;
    public Vector3f leftArmChargePos;
    public Vector3f leftArmChargeRot;
    public Vector3f stagedrightArmReloadPos;
    public Vector3f stagedrightArmReloadRot;
    public Vector3f stagedleftArmReloadPos;
    public Vector3f stagedleftArmReloadRot;
    public boolean rightHandAmmo;
    public boolean leftHandAmmo;
    public float gunSlideDistance;
    public float altgunSlideDistance;
    public float RecoilSlideDistance;
    public float RotateSlideDistance;
    public float ShakeDistance;
    public float recoilAmount;
    public Vector3f casingAnimDistance;
    public Vector3f casingAnimSpread;
    public int casingAnimTime;
    public Vector3f casingRotateVector;
    public Vector3f casingAttachPoint;
    public int casingDelay;
    public float caseScale;
    public float flashScale;
    public float chargeHandleDistance;
    public int chargeDelay;
    public int chargeDelayAfterReload;
    public int chargeTime;
    public ModelRendererTurbo[] bulletCounterModel;
    public ModelRendererTurbo[][] advBulletCounterModel;
    public boolean countOnRightHandSide;
    public boolean isBulletCounterActive;
    public boolean isAdvBulletCounterActive;
    public EnumAnimationType animationType;
    public EnumMeleeAnimation meleeAnimation;
    public float tiltGunTime;
    public float unloadClipTime;
    public float loadClipTime;
    public float untiltGunTime;
    public boolean scopeIsOnSlide;
    public boolean scopeIsOnBreakAction;
    public float numBulletsInReloadAnimation;
    public int pumpDelay;
    public int pumpDelayAfterReload;
    public int pumpTime;
    public int hammerDelay;
    public float pumpHandleDistance;
    public float endLoadedAmmoDistance;
    public float breakActionAmmoDistance;
    public boolean gripIsOnPump;
    public boolean gadgetIsOnPump;
    public Vector3f barrelBreakPoint;
    public Vector3f altbarrelBreakPoint;
    public float revolverFlipAngle;
    public float revolver2FlipAngle;
    public Vector3f revolverFlipPoint;
    public Vector3f revolver2FlipPoint;
    public float breakAngle;
    public float altbreakAngle;
    public boolean spinningCocking;
    public Vector3f spinPoint;
    public Vector3f hammerSpinPoint;
    public Vector3f althammerSpinPoint;
    public float hammerAngle;
    public float althammerAngle;
    public boolean isSingleAction;
    public boolean slideLockOnEmpty;
    public boolean lefthandPump;
    public boolean righthandPump;
    public boolean rightHandCharge;
    public boolean leftHandCharge;
    public boolean rightHandBolt;
    public boolean leftHandBolt;
    public float pumpModifier;
    public Vector3f chargeModifier;
    public float gunOffset;
    public float crouchZoom;
    public boolean fancyStance;
    public Vector3f stanceTranslate;
    public Vector3f stanceRotate;
    public float rotateGunVertical;
    public float rotateGunHorizontal;
    public float tiltGun;
    public Vector3f translateGun;
    public float rotateClipVertical;
    public float stagedrotateClipVertical;
    public float rotateClipHorizontal;
    public float stagedrotateClipHorizontal;
    public float tiltClip;
    public float stagedtiltClip;
    public Vector3f translateClip;
    public Vector3f stagedtranslateClip;
    public boolean stagedReload;
    public Vector3f thirdPersonOffset;
    public Vector3f itemFrameOffset;
    private static float lightmapLastX;
    private static float lightmapLastY;
    private static boolean optifineBreak;
    
    public ModelGun() {
        this.gunModel = new ModelRendererTurbo[0];
        this.backpackModel = new ModelRendererTurbo[0];
        this.defaultBarrelModel = new ModelRendererTurbo[0];
        this.defaultScopeModel = new ModelRendererTurbo[0];
        this.defaultStockModel = new ModelRendererTurbo[0];
        this.defaultGripModel = new ModelRendererTurbo[0];
        this.defaultGadgetModel = new ModelRendererTurbo[0];
        this.ammoModel = new ModelRendererTurbo[0];
        this.fullammoModel = new ModelRendererTurbo[0];
        this.revolverBarrelModel = new ModelRendererTurbo[0];
        this.revolver2BarrelModel = new ModelRendererTurbo[0];
        this.breakActionModel = new ModelRendererTurbo[0];
        this.altbreakActionModel = new ModelRendererTurbo[0];
        this.slideModel = new ModelRendererTurbo[0];
        this.altslideModel = new ModelRendererTurbo[0];
        this.pumpModel = new ModelRendererTurbo[0];
        this.chargeModel = new ModelRendererTurbo[0];
        this.altpumpModel = new ModelRendererTurbo[0];
        this.minigunBarrelModel = new ModelRendererTurbo[0];
        this.leverActionModel = new ModelRendererTurbo[0];
        this.hammerModel = new ModelRendererTurbo[0];
        this.althammerModel = new ModelRendererTurbo[0];
        this.minigunBarrelOrigin = new Vector3f();
        this.barrelAttachPoint = new Vector3f();
        this.scopeAttachPoint = new Vector3f();
        this.stockAttachPoint = new Vector3f();
        this.gripAttachPoint = new Vector3f();
        this.gadgetAttachPoint = new Vector3f();
        this.slideAttachPoint = new Vector3f();
        this.pumpAttachPoint = new Vector3f();
        this.accessoryAttachPoint = new Vector3f();
        this.defaultBarrelFlashPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.muzzleFlashPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.hasFlash = false;
        this.hasArms = false;
        this.leftArmPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.leftArmRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.leftArmScale = new Vector3f(1.0f, 1.0f, 1.0f);
        this.rightArmPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.rightArmRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.rightArmScale = new Vector3f(1.0f, 1.0f, 1.0f);
        this.rightArmReloadPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.rightArmReloadRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.leftArmReloadPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.leftArmReloadRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.rightArmChargePos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.rightArmChargeRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.leftArmChargePos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.leftArmChargeRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stagedrightArmReloadPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stagedrightArmReloadRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stagedleftArmReloadPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stagedleftArmReloadRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.rightHandAmmo = false;
        this.leftHandAmmo = false;
        this.gunSlideDistance = 0.25f;
        this.altgunSlideDistance = 0.25f;
        this.RecoilSlideDistance = 0.125f;
        this.RotateSlideDistance = -3.0f;
        this.ShakeDistance = 0.0f;
        this.recoilAmount = 0.33f;
        this.casingAnimDistance = new Vector3f(0.0f, 0.0f, 16.0f);
        this.casingAnimSpread = new Vector3f(2.0f, 4.0f, 4.0f);
        this.casingAnimTime = 20;
        this.casingRotateVector = new Vector3f(0.1f, 1.0f, 0.1f);
        this.casingAttachPoint = new Vector3f();
        this.casingDelay = 0;
        this.caseScale = 1.0f;
        this.flashScale = 1.0f;
        this.chargeHandleDistance = 0.0f;
        this.chargeDelay = 0;
        this.chargeDelayAfterReload = 0;
        this.chargeTime = 1;
        this.bulletCounterModel = new ModelRendererTurbo[0];
        this.advBulletCounterModel = new ModelRendererTurbo[0][0];
        this.countOnRightHandSide = false;
        this.isAdvBulletCounterActive = false;
        this.animationType = EnumAnimationType.NONE;
        this.meleeAnimation = EnumMeleeAnimation.DEFAULT;
        this.tiltGunTime = 0.15f;
        this.unloadClipTime = 0.35f;
        this.loadClipTime = 0.35f;
        this.untiltGunTime = 0.15f;
        this.scopeIsOnSlide = false;
        this.scopeIsOnBreakAction = false;
        this.numBulletsInReloadAnimation = 1.0f;
        this.pumpDelay = 0;
        this.pumpDelayAfterReload = 0;
        this.pumpTime = 1;
        this.hammerDelay = 0;
        this.pumpHandleDistance = 0.25f;
        this.endLoadedAmmoDistance = 1.0f;
        this.breakActionAmmoDistance = 1.0f;
        this.gripIsOnPump = false;
        this.gadgetIsOnPump = false;
        this.barrelBreakPoint = new Vector3f();
        this.altbarrelBreakPoint = new Vector3f();
        this.revolverFlipAngle = 15.0f;
        this.revolver2FlipAngle = 15.0f;
        this.revolverFlipPoint = new Vector3f();
        this.revolver2FlipPoint = new Vector3f();
        this.breakAngle = 45.0f;
        this.altbreakAngle = 45.0f;
        this.spinningCocking = false;
        this.spinPoint = new Vector3f();
        this.hammerSpinPoint = new Vector3f();
        this.althammerSpinPoint = new Vector3f();
        this.hammerAngle = 75.0f;
        this.althammerAngle = 75.0f;
        this.isSingleAction = false;
        this.slideLockOnEmpty = false;
        this.lefthandPump = false;
        this.righthandPump = false;
        this.rightHandCharge = false;
        this.leftHandCharge = false;
        this.rightHandBolt = false;
        this.leftHandBolt = false;
        this.pumpModifier = 4.0f;
        this.chargeModifier = new Vector3f(8.0f, 4.0f, 4.0f);
        this.gunOffset = 0.0f;
        this.crouchZoom = 0.0f;
        this.fancyStance = false;
        this.stanceTranslate = new Vector3f();
        this.stanceRotate = new Vector3f();
        this.rotateGunVertical = 0.0f;
        this.rotateGunHorizontal = 0.0f;
        this.tiltGun = 0.0f;
        this.translateGun = new Vector3f(0.0f, 0.0f, 0.0f);
        this.rotateClipVertical = 0.0f;
        this.stagedrotateClipVertical = 0.0f;
        this.rotateClipHorizontal = 0.0f;
        this.stagedrotateClipHorizontal = 0.0f;
        this.tiltClip = 0.0f;
        this.stagedtiltClip = 0.0f;
        this.translateClip = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stagedtranslateClip = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stagedReload = false;
        this.thirdPersonOffset = new Vector3f();
        this.itemFrameOffset = new Vector3f();
    }
    
    public static void glowOn() {
        glowOn(15);
    }
    
    public static void glowOn(final int glow) {
        GL11.glPushAttrib(64);
        GL11.glEnable(3042);
        GL11.glBlendFunc(1, 1);
        try {
            ModelGun.lightmapLastX = OpenGlHelper.lastBrightnessX;
            ModelGun.lightmapLastY = OpenGlHelper.lastBrightnessY;
        }
        catch (final NoSuchFieldError e) {
            ModelGun.optifineBreak = true;
        }
        final float glowRatioX = Math.min(glow / 15.0f * 240.0f + ModelGun.lightmapLastX, 240.0f);
        final float glowRatioY = Math.min(glow / 15.0f * 240.0f + ModelGun.lightmapLastY, 240.0f);
        if (!ModelGun.optifineBreak) {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, glowRatioX, glowRatioY);
        }
    }
    
    public static void glowOff() {
        GL11.glEnable(2896);
        if (!ModelGun.optifineBreak) {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, ModelGun.lightmapLastX, ModelGun.lightmapLastY);
        }
        GL11.glPopAttrib();
    }
    
    public void renderGun(final float f) {
        this.render(this.gunModel, f);
    }
    
    public void renderSlide(final float f) {
        this.render(this.slideModel, f);
    }
    
    public void renderaltSlide(final float f) {
        this.render(this.altslideModel, f);
    }
    
    public void renderPump(final float f) {
        this.render(this.pumpModel, f);
    }
    
    public void renderaltPump(final float f) {
        this.render(this.altpumpModel, f);
    }
    
    public void renderCharge(final float f) {
        this.render(this.chargeModel, f);
    }
    
    public void renderDefaultScope(final float f) {
        this.render(this.defaultScopeModel, f);
    }
    
    public void renderDefaultBarrel(final float f) {
        this.render(this.defaultBarrelModel, f);
    }
    
    public void renderDefaultStock(final float f) {
        this.render(this.defaultStockModel, f);
    }
    
    public void renderDefaultGrip(final float f) {
        this.render(this.defaultGripModel, f);
    }
    
    public void renderDefaultGadget(final float f) {
        this.render(this.defaultGadgetModel, f);
    }
    
    public void renderAmmo(final float f) {
        this.render(this.ammoModel, f);
    }
    
    public void renderfullAmmo(final float f) {
        this.render(this.fullammoModel, f);
    }
    
    public void renderMinigunBarrel(final float f) {
        this.render(this.minigunBarrelModel, f);
    }
    
    public void renderRevolverBarrel(final float f) {
        this.render(this.revolverBarrelModel, f);
    }
    
    public void renderRevolver2Barrel(final float f) {
        this.render(this.revolver2BarrelModel, f);
    }
    
    public void renderBreakAction(final float f) {
        this.render(this.breakActionModel, f);
    }
    
    public void renderaltBreakAction(final float f) {
        this.render(this.altbreakActionModel, f);
    }
    
    public void renderHammer(final float f) {
        this.render(this.hammerModel, f);
    }
    
    public void renderaltHammer(final float f) {
        this.render(this.althammerModel, f);
    }
    
    public void renderBulletCounter(final float f, final int k) {
        for (int i = 0; i < this.bulletCounterModel.length; ++i) {
            if (i == k) {
                glowOn();
                this.bulletCounterModel[i].render(f);
                glowOff();
            }
        }
    }
    
    public void renderAdvBulletCounter(final float f, final int k, final boolean rhs) {
        final char[] count = String.valueOf(k).toCharArray();
        final int[] digits = new int[count.length];
        for (int i = 0; i < count.length; ++i) {
            if (!rhs) {
                digits[i] = count[i] - '0';
            }
            else {
                digits[digits.length - 1 - i] = count[i] - '0';
            }
        }
        for (int i = 0; i < digits.length; ++i) {
            for (int j = 0; j < this.advBulletCounterModel[i].length; ++j) {
                if (digits[i] == j) {
                    glowOn();
                    this.advBulletCounterModel[i][j].render(f);
                    glowOff();
                }
            }
        }
    }
    
    protected void render(final ModelRendererTurbo[] models, final float f) {
        for (final ModelRendererTurbo model : models) {
            if (model != null) {
                model.render(f);
            }
        }
    }
    
    public void flipAll() {
        this.flip(this.gunModel);
        this.flip(this.defaultBarrelModel);
        this.flip(this.defaultScopeModel);
        this.flip(this.defaultStockModel);
        this.flip(this.defaultGripModel);
        this.flip(this.defaultGadgetModel);
        this.flip(this.ammoModel);
        this.flip(this.fullammoModel);
        this.flip(this.slideModel);
        this.flip(this.altslideModel);
        this.flip(this.pumpModel);
        this.flip(this.altpumpModel);
        this.flip(this.chargeModel);
        this.flip(this.minigunBarrelModel);
        this.flip(this.revolverBarrelModel);
        this.flip(this.revolver2BarrelModel);
        this.flip(this.breakActionModel);
        this.flip(this.altbreakActionModel);
        this.flip(this.hammerModel);
        this.flip(this.althammerModel);
        this.flip(this.bulletCounterModel);
        for (final ModelRendererTurbo[] mod : this.advBulletCounterModel) {
            this.flip(mod);
        }
    }
    
    protected void flip(final ModelRendererTurbo[] model) {
        for (final ModelRendererTurbo part : model) {
            part.doMirror(false, true, true);
            part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
        }
    }
    
    public void translateAll(final float x, final float y, final float z) {
        this.translate(this.gunModel, x, y, z);
        this.translate(this.defaultBarrelModel, x, y, z);
        this.translate(this.defaultScopeModel, x, y, z);
        this.translate(this.defaultStockModel, x, y, z);
        this.translate(this.defaultGripModel, x, y, z);
        this.translate(this.defaultGadgetModel, x, y, z);
        this.translate(this.ammoModel, x, y, z);
        this.translate(this.fullammoModel, x, y, z);
        this.translate(this.slideModel, x, y, z);
        this.translate(this.altslideModel, x, y, z);
        this.translate(this.pumpModel, x, y, z);
        this.translate(this.altpumpModel, x, y, z);
        this.translate(this.chargeModel, x, y, z);
        this.translate(this.minigunBarrelModel, x, y, z);
        this.translate(this.revolverBarrelModel, x, y, z);
        this.translate(this.revolver2BarrelModel, x, y, z);
        this.translate(this.breakActionModel, x, y, z);
        this.translate(this.altbreakActionModel, x, y, z);
        this.translate(this.hammerModel, x, y, z);
        this.translate(this.althammerModel, x, y, z);
        this.translate(this.bulletCounterModel, x, y, z);
        for (final ModelRendererTurbo[] mod : this.advBulletCounterModel) {
            this.translate(mod, x, y, z);
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
    
    static {
        ModelGun.optifineBreak = false;
    }
}

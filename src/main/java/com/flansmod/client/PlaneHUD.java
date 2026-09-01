// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.client.renderer.Tessellator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.MathHelper;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraft.client.gui.Gui;

public class PlaneHUD extends Gui
{
    static double roll;
    static double pitch;
    static double yaw;
    static double w;
    static double h;
    static double y;
    static int kirmizi;
    static int yesil;
    static int mavi;
    static int renk;
    
    @SubscribeEvent
    public void asd(final RenderGameOverlayEvent.Post event) {
        if (event.isCancelable()) {
            event.setCanceled(true);
        }
        if (event.type == RenderGameOverlayEvent.ElementType.HELMET && Minecraft.func_71410_x().field_71474_y.field_74320_O == 0) {
            final EntityPlayer p = (EntityPlayer)Minecraft.func_71410_x().field_71439_g;
            if (p.field_70154_o != null && p.field_70154_o instanceof EntitySeat) {
                final EntitySeat seat = (EntitySeat)p.field_70154_o;
                if (seat.driveable instanceof EntityPlane) {
                    final EntityPlane plane = (EntityPlane)seat.driveable;
                    final double croll = plane.axes.getRoll();
                    final double proll = plane.prevAxes.getRoll();
                    final double cpitch = plane.axes.getPitch();
                    final double ppitch = plane.prevAxes.getPitch();
                    final double cyaw = plane.axes.getYaw();
                    final double pyaw = plane.prevAxes.getYaw();
                    PlaneHUD.roll = proll + (croll - proll) * event.partialTicks;
                    PlaneHUD.pitch = -(ppitch + (cpitch - ppitch) * event.partialTicks);
                    PlaneHUD.yaw = -(pyaw + (cyaw - pyaw) * event.partialTicks);
                    PlaneHUD.w = event.resolution.func_78327_c();
                    PlaneHUD.h = event.resolution.func_78324_d();
                    PlaneHUD.y = plane.field_70163_u;
                    final float dx = (float)(plane.field_70165_t - plane.field_70142_S);
                    final float dy = (float)(plane.field_70163_u - plane.field_70137_T);
                    final float dz = (float)(plane.field_70161_v - plane.field_70136_U);
                    final Vector3f forwards = (Vector3f)plane.axes.getXAxis().normalise();
                    final float speed = forwards.x * (float)plane.field_70159_w * (forwards.x * (float)plane.field_70159_w) + forwards.y * (float)plane.field_70181_x * (forwards.y * (float)plane.field_70181_x) + forwards.z * (float)plane.field_70179_y * (forwards.z * (float)plane.field_70179_y);
                    final float advancedSpeed = (float)Math.sqrt(speed);
                    final float cringedUniversalBuff = 1.0f;
                    final float hiz;
                    final float Mach = hiz = (float)(plane.control.V * 2.23694);
                    final double cizgiicinyatay = MathHelper.func_76128_c(PlaneHUD.yaw);
                    final double cizgiicindikey = MathHelper.func_76128_c(PlaneHUD.pitch);
                    final FontRenderer fr = Minecraft.func_71410_x().field_71466_p;
                    final double oran = PlaneHUD.h / 353.0;
                    GL11.glPushMatrix();
                    GL11.glEnable(3042);
                    GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
                    Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                    GL11.glTranslated(PlaneHUD.w / 2.0, PlaneHUD.h / 2.0, 0.0);
                    GL11.glScaled(oran * 0.8, oran * 0.8, 1.0);
                    double playerpitch = p.field_70127_C + (p.field_70125_A - p.field_70127_C) * event.partialTicks;
                    double playeryaw = p.field_70126_B + (p.field_70177_z - p.field_70126_B) * event.partialTicks;
                    playerpitch = -playerpitch;
                    playeryaw = -playeryaw + 90.0;
                    final double planepitch = PlaneHUD.pitch;
                    final double planeyaw = PlaneHUD.yaw + 180.0;
                    double angleclosesttozero;
                    double yawdifference = angleclosesttozero = planeyaw - playeryaw;
                    if (Math.abs(planeyaw + 360.0 - playeryaw) < angleclosesttozero) {
                        angleclosesttozero = planeyaw + 360.0 - playeryaw;
                    }
                    if (Math.abs(planeyaw - 360.0 - playeryaw) < angleclosesttozero) {
                        angleclosesttozero = planeyaw - 360.0 - playeryaw;
                    }
                    if (Math.abs(planeyaw - playeryaw + 360.0) < angleclosesttozero) {
                        angleclosesttozero = planeyaw - playeryaw + 360.0;
                    }
                    if (Math.abs(planeyaw - playeryaw - 360.0) < angleclosesttozero) {
                        angleclosesttozero = planeyaw - playeryaw - 360.0;
                    }
                    yawdifference = angleclosesttozero;
                    final double actualplayerpitch = (90.0 - playerpitch) * 2.0 * (1.0 - (Math.cos(Math.toRadians(yawdifference)) / 2.0 + 0.5) + 1.0 - (Math.cos(Math.toRadians(PlaneHUD.roll)) / 2.0 + 0.5)) + playerpitch;
                    final double actualplanepitch = (90.0 - planepitch) * 2.0 * (1.0 - (Math.cos(Math.toRadians(PlaneHUD.roll)) / 2.0 + 0.5)) + planepitch;
                    final double pitchdifference = actualplanepitch - actualplayerpitch;
                    final double pitchfactor = Math.cos(Math.toRadians(PlaneHUD.roll)) * pitchdifference;
                    final double yawfactor = Math.sin(Math.toRadians(PlaneHUD.roll)) * yawdifference;
                    final double sum = pitchfactor + yawfactor;
                    GL11.glTranslated(0.0, -sum * 3.0 + 120.0, 0.0);
                    final double aralik = 20.0;
                    final double yaricap = 60.0;
                    GL11.glPopMatrix();
                    if (seat.seatInfo.hasHUD) {
                        PlaneHUD.kirmizi = seat.seatInfo.hudColorR;
                        PlaneHUD.yesil = seat.seatInfo.hudColorG;
                        PlaneHUD.mavi = seat.seatInfo.hudColorB;
                        PlaneHUD.renk = (PlaneHUD.kirmizi << 16) + (PlaneHUD.yesil << 8) + PlaneHUD.mavi;
                        GL11.glPushMatrix();
                        GL11.glEnable(3042);
                        GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 1.0, PlaneHUD.yesil / 255.0 * 1.0, PlaneHUD.mavi / 255.0 * 1.0, 0.8);
                        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                        GL11.glTranslated(PlaneHUD.w / 2.0, PlaneHUD.h / 2.0, 0.0);
                        GL11.glScaled(oran * 0.8, oran * 0.8, 1.0);
                        nisangah(0);
                        yukseklik(0);
                        GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 0.85, PlaneHUD.yesil / 255.0 * 0.85, PlaneHUD.mavi / 255.0 * 0.85, 0.8);
                        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                        while (PlaneHUD.yaw < 0.0) {
                            PlaneHUD.yaw += 360.0;
                        }
                        while (PlaneHUD.yaw > 0.0) {
                            PlaneHUD.yaw -= 360.0;
                        }
                        GL11.glPushMatrix();
                        GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 0.85, PlaneHUD.yesil / 255.0 * 0.85, PlaneHUD.mavi / 255.0 * 0.85, 0.8);
                        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                        GL11.glTranslated(0.0, -135.0, 0.0);
                        GL11.glRotated(60.0, 0.0, 0.0, 1.0);
                        dortgen(15.0, 2.0, -1, 0);
                        GL11.glRotated(60.0, 0.0, 0.0, 1.0);
                        dortgen(15.0, 2.0, -1, 0);
                        GL11.glPopMatrix();
                        for (double i = -15.0; i <= 20.0; i += 5.0) {
                            GL11.glPushMatrix();
                            GL11.glTranslated(0.0, -133.0, 0.0);
                            final double fark = i + PlaneHUD.yaw % 5.0;
                            GL11.glTranslated(fark * 6.0, 0.0, 0.0);
                            GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 0.85, PlaneHUD.yesil / 255.0 * 0.85, PlaneHUD.mavi / 255.0 * 0.85, 0.8);
                            Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                            final int pi = MathHelper.func_76128_c(PlaneHUD.yaw - PlaneHUD.yaw % 5.0 - i);
                            dortgen(1.0, 10.0, 0, 1);
                            int yatay;
                            for (yatay = MathHelper.func_76128_c(PlaneHUD.yaw - PlaneHUD.yaw % 5.0 - i); yatay < 360; yatay += 360) {}
                            while (yatay > 360) {
                                yatay -= 360;
                            }
                            String s = yatay + "";
                            boolean yon = false;
                            if (s.equals("0") || s.equals("360")) {
                                s = "E";
                                yon = true;
                            }
                            if (s.equals("-90") || s.equals("270")) {
                                s = "S";
                                yon = true;
                            }
                            if (s.equals("-180") || s.equals("180")) {
                                s = "W";
                                yon = true;
                            }
                            if (s.equals("90") || s.equals("-270")) {
                                s = "N";
                                yon = true;
                            }
                            if (yon) {
                                GL11.glTranslated(0.0, -12.0, 0.0);
                                GL11.glScaled(2.0, 2.0, 0.0);
                            }
                            GL11.glTranslated(-fr.func_78256_a(s) / 2.0, 12.0, 0.0);
                            fr.func_78276_b(s, 0, 0, PlaneHUD.renk);
                            GL11.glPopMatrix();
                        }
                        GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 0.85, PlaneHUD.yesil / 255.0 * 0.85, PlaneHUD.mavi / 255.0 * 0.85, 0.8);
                        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                        GL11.glPushMatrix();
                        GL11.glRotated(-PlaneHUD.roll, 0.0, 0.0, 1.0);
                        GL11.glPushMatrix();
                        GL11.glTranslated(0.0, -15.0, 0.0);
                        dortgen(1.0, 20.0, 0, -1);
                        GL11.glPopMatrix();
                        GL11.glTranslated(-15.0, 0.0, 0.0);
                        dortgen(20.0, 1.0, -1, 0);
                        GL11.glTranslated(30.0, 0.0, 0.0);
                        dortgen(20.0, 1.0, 1, 0);
                        GL11.glPopMatrix();
                        for (int j = -90; j < 120; j += 30) {
                            GL11.glPushMatrix();
                            GL11.glRotated((double)j, 0.0, 0.0, 1.0);
                            GL11.glTranslated(0.0, 40.0, 0.0);
                            dortgen(1.0, 10.0, 0, 1);
                            GL11.glPopMatrix();
                        }
                        GL11.glPushMatrix();
                        GL11.glTranslated(65.0, 0.0, 0.0);
                        GL11.glTranslated(30.0, 0.0, 0.0);
                        dortgen(42.5, 1.0, 1, 0);
                        GL11.glTranslated(42.5, -1.0, 0.0);
                        dortgen(1.0, 12.0, 1, 0);
                        GL11.glPushMatrix();
                        GL11.glTranslated((double)(1 + fr.func_78256_a(String.format("%.2f", PlaneHUD.y)) + 2), 0.0, 0.0);
                        dortgen(1.0, 12.0, 1, 0);
                        GL11.glPopMatrix();
                        GL11.glTranslated(0.0, -6.5, 0.0);
                        dortgen(2 + fr.func_78256_a(String.format("%.2f", PlaneHUD.y)) + 2, 1.0, 1, 0);
                        GL11.glTranslated(0.0, 12.5, 0.0);
                        dortgen(2 + fr.func_78256_a(String.format("%.2f", PlaneHUD.y)) + 2, 1.0, 1, 0);
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        GL11.glTranslated(fr.func_78256_a(String.format("%.2f", PlaneHUD.y)) / 2.0, 0.0, 0.0);
                        yazi(String.format("%.2f", PlaneHUD.y), PlaneHUD.renk, 140.0, 0.0, 1.0);
                        GL11.glPopMatrix();
                        for (double i = -80.0; i <= 80.0; i += 10.0) {
                            GL11.glPushMatrix();
                            GL11.glTranslated(30.0, 0.0, 0.0);
                            GL11.glTranslated(70.0, 0.0, 0.0);
                            final double fark = i + PlaneHUD.y % 10.0;
                            if (-50.0 < fark && fark < 50.0) {
                                GL11.glTranslated(0.0, fark * 2.0, 0.0);
                                GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 0.85, PlaneHUD.yesil / 255.0 * 0.85, PlaneHUD.mavi / 255.0 * 0.85, 0.8);
                                Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                                dortgen(10.0, 1.0, 0, 0);
                                final String s2 = MathHelper.func_76128_c(PlaneHUD.y - PlaneHUD.y % 10.0 - i) + "";
                                GL11.glTranslated((double)(fr.func_78256_a(s2) + 2), 0.0, 0.0);
                                yazi(s2, PlaneHUD.renk, 0.0, 0.0, 1.0);
                            }
                            GL11.glPopMatrix();
                        }
                        GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 0.85, PlaneHUD.yesil / 255.0 * 0.85, PlaneHUD.mavi / 255.0 * 0.85, 0.8);
                        Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                        GL11.glPushMatrix();
                        GL11.glTranslated(-30.0, 0.0, 0.0);
                        GL11.glTranslated(-65.0, 0.0, 0.0);
                        dortgen(42.5, 1.0, -1, 0);
                        GL11.glTranslated(-42.5, -1.0, 0.0);
                        dortgen(1.0, 12.0, -1, 0);
                        GL11.glPushMatrix();
                        final double genislik = fr.func_78256_a(String.format("%.2f", hiz));
                        GL11.glTranslated(-genislik - 4.0, 0.0, 0.0);
                        dortgen(1.0, 12.0, -1, 0);
                        GL11.glPopMatrix();
                        GL11.glTranslated(0.0, -6.5, 0.0);
                        dortgen(genislik + 5.0, 1.0, -1, 0);
                        GL11.glTranslated(0.0, 12.5, 0.0);
                        dortgen(genislik + 5.0, 1.0, -1, 0);
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        GL11.glTranslated(-genislik / 2.0, 0.0, 0.0);
                        yazi(String.format("%.2f", hiz), PlaneHUD.renk, -140.0, 0.0, 1.0);
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        GL11.glTranslated(-fr.func_78256_a((int)(plane.throttle * 100.0 / 1.0) + "%") / 2.0, 0.0, 0.0);
                        yazi((int)(plane.throttle * 100.0 / 1.0) + "%", PlaneHUD.renk, -140.0, 12.0, 1.0);
                        GL11.glPopMatrix();
                        for (double k = -50.0; k < 50.0; k += 10.0) {
                            GL11.glPushMatrix();
                            GL11.glTranslated(-30.0, 0.0, 0.0);
                            final double fark2 = k + hiz % 10.0f;
                            GL11.glTranslated(-70.0, fark2 * 2.0, 0.0);
                            if (hiz - k >= 0.0 && -50.0 < fark2 && fark2 < 50.0) {
                                GL11.glColor4d(PlaneHUD.kirmizi / 255.0 * 0.85, PlaneHUD.yesil / 255.0 * 0.85, PlaneHUD.mavi / 255.0 * 0.85, 0.8);
                                Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                                dortgen(10.0, 1.0, 0, 0);
                                final String shiz = MathHelper.func_76128_c(hiz - hiz % 10.0f - k) + "";
                                fr.func_78276_b(shiz, -10 - fr.func_78256_a(shiz) + 4, -4, PlaneHUD.renk);
                            }
                            GL11.glPopMatrix();
                        }
                        GL11.glPopMatrix();
                    }
                }
            }
        }
    }
    
    public static void dortgen(final double x, final double y, final int xhiza, final int yhiza) {
        final Tessellator t = Tessellator.field_78398_a;
        t.func_78382_b();
        final double solx = -x / 2.0 + xhiza * x / 2.0;
        final double sagx = x / 2.0 + xhiza * x / 2.0;
        final double usty = -y / 2.0 + yhiza * y / 2.0;
        final double alty = y / 2.0 + yhiza * y / 2.0;
        t.func_78377_a(solx, alty, 0.0);
        t.func_78377_a(sagx, alty, 0.0);
        t.func_78377_a(sagx, usty, 0.0);
        t.func_78377_a(solx, usty, 0.0);
        t.func_78381_a();
    }
    
    public static void yuvarlak(int i, final double yaricap) {
        final Tessellator t = Tessellator.field_78398_a;
        t.func_78371_b(9);
        while (i > 0) {
            final double c = Math.cos(Math.toRadians(i));
            final double s = Math.sin(Math.toRadians(i));
            t.func_78374_a(c * yaricap, s * yaricap, 0.0, (c + 1.0) / 2.0, (s + 1.0) / 2.0);
            --i;
        }
        t.func_78381_a();
    }
    
    public static void yazi(final String s, final int renk, final double x, final double y, final double b) {
        final FontRenderer fr = Minecraft.func_71410_x().field_71466_p;
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, 0.0);
        GL11.glScaled(b, b, 1.0);
        fr.func_78276_b(s, -fr.func_78256_a(s) / 2, -fr.field_78288_b / 2, renk);
        GL11.glPopMatrix();
    }
    
    public static void nisangah(final int tur) {
        switch (tur) {
            case 0: {
                final double nisangahgenislik = 6.0;
                GL11.glPushMatrix();
                GL11.glTranslated(0.0, -nisangahgenislik, 0.0);
                dortgen(1.5, 6.0, 0, 0);
                GL11.glTranslated(0.0, nisangahgenislik * 2.0, 0.0);
                dortgen(1.5, 6.0, 0, 0);
                GL11.glTranslated(nisangahgenislik, -nisangahgenislik, 0.0);
                dortgen(6.0, 1.5, 0, 0);
                GL11.glTranslated(-nisangahgenislik * 2.0, 0.0, 0.0);
                dortgen(6.0, 1.5, 0, 0);
                GL11.glPopMatrix();
                break;
            }
            case 1: {
                final double nisangahgenislik = 8.0;
                GL11.glPushMatrix();
                GL11.glTranslated(-nisangahgenislik, 0.0, 0.0);
                dortgen(1.5, 8.0, 0, 0);
                GL11.glTranslated(nisangahgenislik * 2.0, 0.0, 0.0);
                dortgen(1.5, 8.0, 0, 0);
                GL11.glTranslated(-nisangahgenislik, nisangahgenislik, 0.0);
                dortgen(8.0, 1.5, 0, 0);
                GL11.glTranslated(0.0, -nisangahgenislik * 2.0, 0.0);
                dortgen(8.0, 1.5, 0, 0);
                GL11.glPopMatrix();
                break;
            }
        }
    }
    
    public static void yukseklik(final int tur) {
        switch (tur) {
            case 0: {
                for (double i = -15.0; i < 25.0; i += 5.0) {
                    GL11.glPushMatrix();
                    GL11.glRotated(PlaneHUD.roll, 0.0, 0.0, 1.0);
                    final double fark = i + PlaneHUD.pitch % 5.0;
                    GL11.glTranslated(0.0, fark * 5.0, 0.0);
                    GL11.glColor4d(PlaneHUD.kirmizi / 255.0, PlaneHUD.yesil / 255.0, PlaneHUD.mavi / 255.0, 0.8);
                    Minecraft.func_71410_x().func_110434_K().func_110577_a(new ResourceLocation("flansmod:gui/renk.png"));
                    final boolean kisa = false;
                    boolean sifir = false;
                    final int pi = MathHelper.func_76128_c(PlaneHUD.pitch - PlaneHUD.pitch % 5.0 - i);
                    final FontRenderer fr = Minecraft.func_71410_x().field_71466_p;
                    if (pi == 0) {
                        sifir = true;
                        GL11.glPushMatrix();
                        GL11.glTranslated(13.0, 0.0, 0.0);
                        dortgen(80.0, 1.5, 1, 0);
                        GL11.glPopMatrix();
                        GL11.glPushMatrix();
                        GL11.glTranslated(-13.0, 0.0, 0.0);
                        dortgen(80.0, 1.5, -1, 0);
                        GL11.glPopMatrix();
                    }
                    else if (pi % 10 == 0) {
                        dortgen(80.0, 1.0, 0, 0);
                        yazi(pi + "", PlaneHUD.renk, fr.func_78256_a(pi + "") + 40, 0.0, 1.0);
                    }
                    GL11.glPopMatrix();
                }
                break;
            }
        }
    }
}

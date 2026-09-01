// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraftforge.common.config.Property;
import net.minecraft.entity.EntityLivingBase;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.particle.EntityBlockDustFX;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.block.Block;
import net.minecraft.client.particle.EntityHeartFX;
import net.minecraft.client.particle.EntitySnowShovelFX;
import net.minecraft.client.particle.EntityDropParticleFX;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.init.Items;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.client.particle.EntityFishWakeFX;
import net.minecraft.client.particle.EntitySplashFX;
import net.minecraft.client.particle.EntityFootStepFX;
import net.minecraft.client.particle.EntityLavaFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.EntityExplodeFX;
import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityPortalFX;
import net.minecraft.client.particle.EntityNoteFX;
import net.minecraft.client.particle.EntitySpellParticleFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.client.particle.EntityCritFX;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntitySuspendFX;
import net.minecraft.client.particle.EntityBubbleFX;
import net.minecraft.client.particle.EntityFireworkSparkFX;
import net.minecraft.client.particle.EntityLargeExplodeFX;
import net.minecraft.client.particle.EntityHugeExplodeFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import java.io.File;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.teams.ItemTeamArmour;
import net.minecraft.item.Item;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.client.entity.EntityClientPlayerMP;
import java.util.Iterator;
import java.util.List;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.item.EnumAction;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.client.renderer.entity.RenderManager;
import com.flansmod.client.gui.GuiTeamScores;
import net.minecraft.client.gui.GuiScreen;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.api.IControllable;
import com.flansmod.common.guns.EntityBullet;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.flansmod.common.types.InfoType;
import net.minecraft.client.entity.AbstractClientPlayer;
import com.flansmod.common.teams.Team;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.client.Minecraft;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.network.PacketTeamInfo;
import net.minecraft.client.shader.ShaderGroup;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.FlansMod;

public class FlansModClient extends FlansMod
{
    public static boolean doneTutorial;
    public static boolean controlModeMouse;
    public static int controlModeSwitchTimer;
    public static float shootTimeLeft;
    public static float shootTimeRight;
    public static int stabTimeLeft;
    public static int stabTimeRight;
    public static float playerRecoilPitch;
    public static float playerRecoilYaw;
    public static float antiRecoilPitch;
    public static float antiRecoilYaw;
    public static int shotState;
    public static int lastBulletReload;
    public static int vehicleEngineRevs;
    public static int scopeTime;
    public static IScope currentScope;
    public static float zoomProgress;
    public static float lastZoomProgress;
    public static float stanceProgress;
    public static float lastStanceProgress;
    public static float lastZoomLevel;
    public static float lastFOVZoomLevel;
    public static float cringe;
    public static float pupperino;
    public ShaderGroup trueFacts;
    public static float originalMouseSensitivity;
    public static float originalFOV;
    public static int originalThirdPerson;
    public static boolean inPlane;
    public static PacketTeamInfo teamInfo;
    public static PacketBlood blood;
    public static int teamsScoreGUILock;
    public static AimType aimType;
    public static FlanMouseButton fireButton;
    public static FlanMouseButton aimButton;
    public static float fov;
    public static Minecraft minecraft;
    public static float peepee;
    public static float previousPeepee;
    public static float previousFOV;
    public static float poopoo;
    public static float originalPitch;
    public static float originalYaw;
    public static float sustainedRecoilPitch;
    public static float unsustainedRecoil;
    public static float sustainedRecoilYaw;
    public static float animator;
    public static float netRecoil;
    public static boolean hitMarker;
    public static boolean hitMarkerHeadshot;
    public static float hitMarkerPenAmount;
    public static boolean hitMarkerExplosion;
    public static int shieldHit;
    public static float recoilElevator;
    public static float sustainedElevator;
    public static float firstShotRecoil;
    public static int lamperino;
    public static boolean starStruck;
    public static int screenShake;
    
    public void load() {
        FlansMod.log("Loading Flan's mod client side.");
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    @SubscribeEvent
    public void renderOffHandGun(final RenderPlayerEvent.Specials.Post event) {
        final RenderPlayer renderer = event.renderer;
        final EntityPlayer player = event.entityPlayer;
        final float dt = event.partialRenderTick;
        final PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
        ItemStack gunStack = null;
        if (player instanceof EntityOtherPlayerMP) {
            gunStack = data.offHandGunStack;
        }
        else {
            final ItemStack currentStack = player.func_71045_bC();
            if (currentStack == null || !(currentStack.func_77973_b() instanceof ItemGun) || !((ItemGun)currentStack.func_77973_b()).type.oneHanded || data.offHandGunSlot == 0) {
                return;
            }
            gunStack = player.field_71071_by.func_70301_a(data.offHandGunSlot - 1);
        }
        if (gunStack == null || !(gunStack.func_77973_b() instanceof ItemGun)) {
            return;
        }
        final GunType gunType = ((ItemGun)gunStack.func_77973_b()).type;
        GL11.glPushMatrix();
        renderer.field_77109_a.field_78113_g.func_78794_c(0.0625f);
        GL11.glTranslatef(-0.0625f, 0.4375f, 0.0625f);
        final float f2 = 1.0f;
        GL11.glTranslatef(0.0f, 0.1875f, -0.3125f);
        GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        final int k = gunStack.func_77973_b().func_82790_a(gunStack, 0);
        final float f3 = (k >> 16 & 0xFF) / 255.0f;
        final float f4 = (k >> 8 & 0xFF) / 255.0f;
        final float f5 = (k & 0xFF) / 255.0f;
        GL11.glColor4f(f3, f4, f5, 1.0f);
        ClientProxy.gunRenderer.renderOffHandGun(player, gunStack);
        GL11.glPopMatrix();
    }
    
    private static float interpolateRotation(final float x, final float y, final float dT) {
        float f3;
        for (f3 = y - x; f3 < -180.0f; f3 += 360.0f) {}
        while (f3 >= 180.0f) {
            f3 -= 360.0f;
        }
        return x + dT * f3;
    }
    
    @SubscribeEvent
    public void renderLiving(final RenderPlayerEvent.Pre event) {
        final PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);
        if (data != null && data.snapshots[0] != null) {
            data.snapshots[0].renderSnapshot();
        }
        RendererLivingEntity.NAME_TAG_RANGE = 64.0f;
        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 32.0f;
        if (event.entity instanceof EntityPlayer && FlansModClient.teamInfo != null) {
            final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
            if (PacketTeamInfo.gametype != null) {
                final String s = "No Gametype";
                final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
                if (!"No Gametype".equals(PacketTeamInfo.gametype)) {
                    final PacketTeamInfo teamInfo3 = FlansModClient.teamInfo;
                    final PacketTeamInfo.PlayerScoreData rendering = PacketTeamInfo.getPlayerScoreData(event.entity.func_70005_c_());
                    final PacketTeamInfo teamInfo4 = FlansModClient.teamInfo;
                    final PacketTeamInfo.PlayerScoreData thePlayer = PacketTeamInfo.getPlayerScoreData(FlansModClient.minecraft.field_71439_g.func_70005_c_());
                    final Team renderingTeam = (rendering == null) ? Team.spectators : rendering.team.team;
                    final Team thePlayerTeam = (thePlayer == null) ? Team.spectators : thePlayer.team.team;
                    if (data != null && data.skin == null) {
                        data.skin = ((AbstractClientPlayer)event.entityPlayer).func_110306_p();
                    }
                    else if (data != null) {
                        final ResourceLocation skin = (rendering == null || rendering.playerClass == null) ? null : FlansModResourceHandler.getTexture(rendering.playerClass);
                        ((AbstractClientPlayer)event.entityPlayer).func_152121_a(MinecraftProfileTexture.Type.SKIN, (skin == null) ? data.skin : skin);
                    }
                    if (thePlayerTeam == Team.spectators) {
                        return;
                    }
                    if (renderingTeam == Team.spectators) {
                        event.setCanceled(true);
                        return;
                    }
                    if (renderingTeam != thePlayerTeam) {
                        RendererLivingEntity.NAME_TAG_RANGE = 0.0f;
                        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0.0f;
                        return;
                    }
                    final PacketTeamInfo teamInfo5 = FlansModClient.teamInfo;
                    if (!PacketTeamInfo.sortedByTeam) {
                        RendererLivingEntity.NAME_TAG_RANGE = 0.0f;
                        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0.0f;
                    }
                }
            }
        }
    }
    
    public static float shootTime(final boolean left) {
        return left ? FlansModClient.shootTimeLeft : FlansModClient.shootTimeRight;
    }
    
    public static int stabTime(final boolean left) {
        return left ? FlansModClient.stabTimeLeft : FlansModClient.stabTimeRight;
    }
    
    public static void tick() {
        if (FlansModClient.minecraft.field_71439_g == null || FlansModClient.minecraft.field_71441_e == null) {
            return;
        }
        if (PlayerHandler.getPlayerData((EntityPlayer)FlansModClient.minecraft.field_71439_g) != null && PlayerHandler.getPlayerData((EntityPlayer)FlansModClient.minecraft.field_71439_g).shieldHit > 0) {
            FlansModClient.shieldHit = PlayerHandler.getPlayerData((EntityPlayer)FlansModClient.minecraft.field_71439_g).shieldHit;
        }
        else {
            FlansModClient.shieldHit = 0;
        }
        if (FlansModClient.lamperino > 0) {
            --FlansModClient.lamperino;
        }
        if (FlansModClient.lamperino > 50) {
            FlansModClient.lamperino = 50;
        }
        if (FlansModClient.lamperino <= 0) {
            FlansModClient.starStruck = false;
        }
        if (FlansModClient.lamperino > 1) {
            FlansModClient.starStruck = true;
            FlansModClient.minecraft.field_71474_y.field_74333_Y = 0.4f + FlansModClient.lamperino / 18.0f;
        }
        final List<Entity> foxes = FlansModClient.minecraft.field_71439_g.field_70170_p.func_72839_b((Entity)FlansModClient.minecraft.field_71439_g, AxisAlignedBB.func_72330_a(FlansModClient.minecraft.field_71439_g.field_70165_t - 200.0, FlansModClient.minecraft.field_71439_g.field_70163_u - 500.0, FlansModClient.minecraft.field_71439_g.field_70161_v - 200.0, FlansModClient.minecraft.field_71439_g.field_70165_t + 200.0, FlansModClient.minecraft.field_71439_g.field_70163_u + 500.0, FlansModClient.minecraft.field_71439_g.field_70161_v + 200.0));
        for (final Entity stuff : foxes) {
            if (!(stuff instanceof EntityBullet)) {
                continue;
            }
            final EntityBullet missile = (EntityBullet)stuff;
            if (!missile.type.starShell) {
                continue;
            }
            if (FlansModClient.lamperino >= 100 || !missile.type.starShell) {
                continue;
            }
            FlansModClient.lamperino += 2;
        }
        if (FlansModClient.minecraft.field_71439_g.func_70115_ae() && FlansModClient.minecraft.field_71439_g.field_70154_o instanceof IControllable && FlansModClient.minecraft.field_71462_r == null) {
            FlansModClient.minecraft.func_147108_a((GuiScreen)new GuiDriveableController((IControllable)FlansModClient.minecraft.field_71439_g.field_70154_o));
        }
        if (FlansModClient.teamInfo != null) {
            final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
            if (PacketTeamInfo.timeLeft > 0) {
                final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
                --PacketTeamInfo.timeLeft;
            }
        }
        if (FlansModClient.teamsScoreGUILock > 0) {
            --FlansModClient.teamsScoreGUILock;
            if (FlansModClient.minecraft.field_71462_r == null) {
                FlansModClient.minecraft.func_147108_a((GuiScreen)new GuiTeamScores());
            }
        }
        if (FlansModClient.shootTimeLeft > 0.0f) {
            --FlansModClient.shootTimeLeft;
        }
        if (FlansModClient.shootTimeRight > 0.0f) {
            --FlansModClient.shootTimeRight;
        }
        if (FlansModClient.stabTimeLeft > 0) {
            --FlansModClient.stabTimeLeft;
        }
        if (FlansModClient.stabTimeRight > 0) {
            --FlansModClient.stabTimeRight;
        }
        if (FlansModClient.scopeTime > 0) {
            --FlansModClient.scopeTime;
        }
        if (FlansModClient.playerRecoilPitch > 0.0f || FlansModClient.playerRecoilPitch < 0.0f) {
            FlansModClient.playerRecoilPitch *= 0.95f;
            if (FlansModClient.peepee >= 20.0f) {
                FlansModClient.playerRecoilPitch *= 0.65f + 0.35f * ((FlansModClient.peepee - 20.0f) / 80.0f);
                FlansModClient.peepee -= 3.0f;
            }
            else {
                FlansModClient.playerRecoilPitch *= 0.65f;
                FlansModClient.peepee *= (float)0.88;
            }
        }
        if (FlansModClient.playerRecoilYaw > 0.0f || FlansModClient.playerRecoilYaw < 0.0f) {
            FlansModClient.playerRecoilYaw *= 0.95f;
        }
        if (FlansModClient.peepee > 105.0f) {
            FlansModClient.peepee = 100.0f;
        }
        if (FlansModClient.screenShake == 0) {
            FlansModClient.previousFOV = FlansModClient.minecraft.field_71474_y.field_74334_X;
        }
        else {
            FlansModClient.minecraft.field_71474_y.field_74334_X = FlansModClient.previousFOV + 0.1f * FlansModClient.screenShake * (1.0f + FlansModClient.peepee / 70.0f);
        }
        if (FlansModClient.screenShake > 0) {
            FlansModClient.screenShake = 0;
        }
        if (FlansModClient.screenShake < -100) {
            FlansModClient.screenShake += 5;
        }
        else if (FlansModClient.screenShake < -90) {
            FlansModClient.screenShake += (int)4.5;
        }
        else if (FlansModClient.screenShake < -80) {
            FlansModClient.screenShake += 4;
        }
        else if (FlansModClient.screenShake < -70) {
            FlansModClient.screenShake += (int)3.5;
        }
        else if (FlansModClient.screenShake < -60) {
            FlansModClient.screenShake += 3;
        }
        else if (FlansModClient.screenShake < -50) {
            FlansModClient.screenShake += (int)2.5;
        }
        else if (FlansModClient.screenShake < -40) {
            FlansModClient.screenShake += 2;
        }
        else if (FlansModClient.screenShake < -30) {
            FlansModClient.screenShake += (int)1.5;
        }
        else if (FlansModClient.screenShake < -15) {
            ++FlansModClient.screenShake;
        }
        else if (FlansModClient.screenShake < 0) {
            FlansModClient.screenShake += (int)0.5f;
        }
        if (FlansModClient.peepee > 0.1f) {
            if (FlansModClient.antiRecoilPitch < 69.0f) {
                FlansModClient.antiRecoilPitch += FlansModClient.playerRecoilPitch;
            }
            if (FlansModClient.antiRecoilYaw < 69.0f) {
                FlansModClient.antiRecoilYaw += FlansModClient.playerRecoilYaw;
            }
        }
        if (FlansModClient.playerRecoilPitch > 0.0f) {
            final EntityClientPlayerMP field_71439_g = FlansModClient.minecraft.field_71439_g;
            field_71439_g.field_70125_A -= FlansModClient.playerRecoilPitch;
            FlansModClient.netRecoil -= FlansModClient.playerRecoilPitch;
            final EntityClientPlayerMP field_71439_g2 = FlansModClient.minecraft.field_71439_g;
            field_71439_g2.field_70177_z -= FlansModClient.playerRecoilYaw;
        }
        if (FlansModClient.antiRecoilPitch > 0.01 && FlansModClient.peepee < 20.0f) {
            final EntityClientPlayerMP field_71439_g3 = FlansModClient.minecraft.field_71439_g;
            field_71439_g3.field_70125_A += (FlansModClient.peepee + 10.0f) / 30.0f * (FlansModClient.antiRecoilPitch * 0.3f);
            FlansModClient.netRecoil += FlansModClient.antiRecoilPitch * 0.2f;
            FlansModClient.antiRecoilPitch *= 0.8f;
        }
        else if (FlansModClient.peepee >= 20.0f) {
            final float peepeeRatio = (FlansModClient.peepee - 20.0f) / 80.0f;
            float recoilRatio = 0.9f * FlansModClient.playerRecoilPitch / FlansModClient.sustainedRecoilPitch;
            if (recoilRatio > 1.0f) {
                recoilRatio = 0.95f;
            }
            FlansModClient.antiRecoilPitch -= 0.3f * FlansModClient.antiRecoilPitch - peepeeRatio * (0.3f * FlansModClient.antiRecoilPitch) + FlansModClient.playerRecoilPitch * recoilRatio * peepeeRatio;
            final EntityClientPlayerMP field_71439_g4 = FlansModClient.minecraft.field_71439_g;
            field_71439_g4.field_70125_A += (float)(FlansModClient.playerRecoilPitch * recoilRatio * peepeeRatio + 0.3 * FlansModClient.antiRecoilPitch - peepeeRatio * (0.3 * FlansModClient.antiRecoilPitch));
            FlansModClient.netRecoil += (float)(FlansModClient.playerRecoilPitch * recoilRatio * peepeeRatio + 0.3 * FlansModClient.antiRecoilPitch - peepeeRatio * (0.3 * FlansModClient.antiRecoilPitch));
        }
        if (FlansModClient.peepee < 0.01) {
            FlansModClient.netRecoil *= (float)0.8;
        }
        if (FlansModClient.antiRecoilYaw > 0.0f) {
            if (FlansModClient.peepee < 7.0f) {
                final EntityClientPlayerMP field_71439_g5 = FlansModClient.minecraft.field_71439_g;
                field_71439_g5.field_70177_z += FlansModClient.antiRecoilYaw * 0.1f;
                FlansModClient.antiRecoilYaw *= 0.9f;
                if (FlansModClient.antiRecoilPitch < 2.0f) {
                    FlansModClient.antiRecoilPitch = 0.0f;
                }
            }
            else if (FlansModClient.peepee < 20.0f && FlansModClient.peepee >= 7.0f) {
                final EntityClientPlayerMP field_71439_g6 = FlansModClient.minecraft.field_71439_g;
                field_71439_g6.field_70177_z += FlansModClient.antiRecoilYaw * 0.05f;
                FlansModClient.antiRecoilYaw *= 0.95f;
            }
            else if (FlansModClient.peepee < 40.0f && FlansModClient.peepee >= 20.0f) {
                final EntityClientPlayerMP field_71439_g7 = FlansModClient.minecraft.field_71439_g;
                field_71439_g7.field_70177_z += FlansModClient.antiRecoilYaw * 0.03f;
                FlansModClient.antiRecoilYaw *= 0.97f;
            }
            else if (FlansModClient.peepee < 60.0f && FlansModClient.peepee >= 40.0f) {
                final EntityClientPlayerMP field_71439_g8 = FlansModClient.minecraft.field_71439_g;
                field_71439_g8.field_70177_z += FlansModClient.antiRecoilYaw * 0.01f;
                FlansModClient.antiRecoilYaw *= 0.99f;
            }
            else if (FlansModClient.peepee < 80.0f && FlansModClient.peepee >= 60.0f) {
                final EntityClientPlayerMP field_71439_g9 = FlansModClient.minecraft.field_71439_g;
                field_71439_g9.field_70177_z += FlansModClient.antiRecoilYaw * 0.005f;
                FlansModClient.antiRecoilYaw *= 0.995f;
            }
            else {
                final EntityClientPlayerMP field_71439_g10 = FlansModClient.minecraft.field_71439_g;
                field_71439_g10.field_70177_z += FlansModClient.playerRecoilYaw * 0.1f;
                FlansModClient.antiRecoilYaw -= FlansModClient.playerRecoilYaw * 0.1f;
            }
        }
        if (FlansModClient.currentScope == null) {
            FlansModClient.minecraft.field_71474_y.field_74336_f = true;
        }
        FlansModClient.minecraft.field_71474_y.field_74362_aa = 0;
        RenderManager.field_85095_o = false;
        if (FlansModClient.minecraft.field_71439_g != null) {
            if (FlansModClient.minecraft.field_71439_g.func_70115_ae()) {
                final ShaderGroup test = Minecraft.func_71410_x().field_71460_t.func_147706_e();
                if (FlansModClient.minecraft.field_71439_g.field_70154_o != null && FlansModClient.minecraft.field_71439_g.field_70154_o instanceof EntitySeat) {
                    final EntitySeat seat = (EntitySeat)FlansModClient.minecraft.field_71439_g.field_70154_o;
                    final EntityDriveable entityCringe = seat.driveable;
                    if (entityCringe != null && entityCringe.artilleryMode) {
                        FlansModClient.minecraft.field_71474_y.field_74320_O = 1;
                    }
                    if (entityCringe != null && entityCringe.thermalScoping) {
                        if (!Minecraft.func_71410_x().field_71460_t.func_147702_a()) {
                            Minecraft.func_71410_x().field_71460_t.func_147705_c();
                            Minecraft.func_71410_x().field_71460_t.func_147705_c();
                            Minecraft.func_71410_x().field_71460_t.func_147705_c();
                            Minecraft.func_71410_x().field_71460_t.func_147705_c();
                            Minecraft.func_71410_x().field_71460_t.func_147705_c();
                            Minecraft.func_71410_x().field_71460_t.func_147705_c();
                        }
                        FlansModClient.minecraft.field_71474_y.field_74320_O = 0;
                        FlansModClient.minecraft.field_71474_y.field_74333_Y = 0.55f;
                    }
                    else {
                        Minecraft.func_71410_x().field_71460_t.func_147703_b();
                        if (!FlansModClient.starStruck) {
                            FlansModClient.minecraft.field_71474_y.field_74333_Y = 0.4f;
                        }
                    }
                    if (seat.seatInfo.passengerZoom != 1.0f || (entityCringe != null && entityCringe.aiming)) {
                        FlansModClient.minecraft.field_71474_y.field_74320_O = 0;
                    }
                }
            }
            else {
                Minecraft.func_71410_x().field_71460_t.func_147703_b();
                if (!FlansModClient.starStruck) {
                    FlansModClient.minecraft.field_71474_y.field_74333_Y = 0.4f;
                }
            }
        }
        for (final GunAnimations g : FlansModClient.gunAnimationsRight.values()) {
            g.update();
        }
        for (final GunAnimations g : FlansModClient.gunAnimationsLeft.values()) {
            g.update();
        }
        for (final Object obj : FlansModClient.minecraft.field_71441_e.field_73010_i) {
            final EntityPlayer player = (EntityPlayer)obj;
            final ItemStack currentItem = player.func_71045_bC();
            if (currentItem != null && currentItem.func_77973_b() instanceof ItemGun) {
                if (player == FlansModClient.minecraft.field_71439_g && FlansModClient.minecraft.field_71474_y.field_74320_O == 0) {
                    player.func_71041_bz();
                }
                else {
                    if (currentItem.func_77975_n() != EnumAction.bow && currentItem.func_77975_n() != EnumAction.block) {
                        continue;
                    }
                    player.func_71008_a(currentItem, 100);
                }
            }
        }
        Item itemInHand = null;
        final ItemStack itemstackInHand = FlansModClient.minecraft.field_71439_g.field_71071_by.func_70448_g();
        if (itemstackInHand != null) {
            itemInHand = itemstackInHand.func_77973_b();
        }
        if (FlansModClient.currentScope != null && (itemInHand == null || !(itemInHand instanceof ItemGun) || ((ItemGun)itemInHand).type.getCurrentScope(itemstackInHand) != FlansModClient.currentScope)) {
            FlansModClient.currentScope = null;
            FlansModClient.minecraft.field_71474_y.field_74341_c = FlansModClient.originalMouseSensitivity;
            FlansModClient.minecraft.field_71474_y.field_74320_O = FlansModClient.originalThirdPerson;
            if (FlansModClient.minecraft.field_71439_g.field_71071_by.field_70460_b[3] == null) {
                FlansModClient.minecraft.field_71474_y.field_74334_X = FlansModClient.originalFOV;
            }
        }
        FlansModClient.lastZoomProgress = FlansModClient.zoomProgress;
        if (FlansModClient.currentScope == null && FlansModClient.zoomProgress - FlansModClient.lastZoomProgress <= 0.01f) {
            FlansModClient.zoomProgress *= 0.66f;
        }
        else {
            FlansModClient.zoomProgress = 1.0f - (1.0f - FlansModClient.zoomProgress) * 0.66f;
            FlansModClient.minecraft.field_71474_y.field_74336_f = false;
        }
        FlansModClient.lastStanceProgress = FlansModClient.stanceProgress;
        if (!FlansModClient.inPlane) {
            FlansModClient.stanceProgress *= 0.66f;
        }
        else {
            FlansModClient.stanceProgress = 1.0f - (1.0f - FlansModClient.stanceProgress) * 0.66f;
        }
        Label_2642: {
            if (FlansModClient.minecraft.field_71439_g.field_70154_o instanceof IControllable) {
                FlansModClient.inPlane = true;
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.field_71460_t, (Object)((IControllable)FlansModClient.minecraft.field_71439_g.field_70154_o).getPlayerRoll(), new String[] { "camRoll", "R", "field_78495_O" });
                }
                catch (final Exception e) {
                    FlansMod.log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
                if (!(FlansModClient.minecraft.field_71439_g.field_70154_o instanceof IControllable)) {
                    break Label_2642;
                }
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.field_71460_t, (Object)((IControllable)FlansModClient.minecraft.field_71439_g.field_70154_o).getCameraDistance(), new String[] { "thirdPersonDistance", "E", "field_78490_B" });
                    break Label_2642;
                }
                catch (final Exception e) {
                    FlansMod.log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
            }
            if (FlansModClient.inPlane) {
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.field_71460_t, (Object)0.0f, new String[] { "camRoll", "R", "field_78495_O" });
                }
                catch (final Exception e) {
                    FlansMod.log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
                try {
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.field_71460_t, (Object)4.0f, new String[] { "thirdPersonDistance", "E", "field_78490_B" });
                }
                catch (final Exception e) {
                    FlansMod.log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
                FlansModClient.inPlane = false;
            }
        }
        if (FlansModClient.controlModeSwitchTimer > 0) {
            --FlansModClient.controlModeSwitchTimer;
        }
    }
    
    public static void renderTick(final float smoothing) {
        if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) > 1.0E-4f) {
            final float actualZoomProgress = FlansModClient.lastZoomProgress + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * smoothing;
            final float botchedZoomProgress = (FlansModClient.zoomProgress > 0.8f) ? 1.0f : 0.0f;
            double zoomLevel = botchedZoomProgress * FlansModClient.lastZoomLevel + (1.0f - botchedZoomProgress);
            final float FOVZoomLevel = actualZoomProgress * FlansModClient.lastFOVZoomLevel + (1.0f - actualZoomProgress);
            if (Math.abs(zoomLevel - 1.0) < 0.009999999776482582) {
                zoomLevel = 1.0;
            }
            ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FlansModClient.minecraft.field_71460_t, (Object)zoomLevel, new String[] { "cameraZoom", "af", "field_78503_V" });
        }
        if (FlansModClient.minecraft.field_71439_g != null && FlansModClient.cringe < 1.01) {
            final ItemStack stack = FlansModClient.minecraft.field_71439_g.field_71071_by.field_70460_b[3];
            if (stack != null && stack.func_77973_b() instanceof ItemTeamArmour) {
                final ArmourType cringe = ((ItemTeamArmour)stack.func_77973_b()).type;
                if (cringe.faceArmor / cringe.headArmor <= 0.1 || cringe.faceArmor == 1.0f || cringe.faceArmor == 0.0f) {
                    if (FlansModClient.minecraft.field_71474_y.field_74334_X > 100.0f) {
                        FlansModClient.minecraft.field_71474_y.field_74334_X = 110.0f;
                        FlansModClient.pupperino = 110.0f;
                    }
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.1 && cringe.faceArmor / cringe.headArmor <= 0.3) {
                    if (FlansModClient.minecraft.field_71474_y.field_74334_X > 95.0f) {
                        FlansModClient.minecraft.field_71474_y.field_74334_X = 95.0f;
                        FlansModClient.pupperino = 95.0f;
                    }
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.3 && cringe.faceArmor / cringe.headArmor <= 0.6) {
                    if (FlansModClient.minecraft.field_71474_y.field_74334_X > 80.0f) {
                        FlansModClient.minecraft.field_71474_y.field_74334_X = 80.0f;
                        FlansModClient.pupperino = 80.0f;
                    }
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.6 && cringe.faceArmor / cringe.headArmor <= 0.8) {
                    FlansModClient.minecraft.field_71474_y.field_74334_X = 65.0f;
                    FlansModClient.pupperino = 65.0f;
                }
                else if (cringe.faceArmor / cringe.headArmor > 0.8 && cringe.faceArmor / cringe.headArmor <= 100.0f) {
                    FlansModClient.minecraft.field_71474_y.field_74334_X = 55.0f;
                    FlansModClient.pupperino = 55.0f;
                }
                else {
                    FlansModClient.pupperino = 70.0f;
                }
            }
        }
    }
    
    @SubscribeEvent
    public void chatMessage(final ClientChatReceivedEvent event) {
        if (event.message.func_150260_c().equals("#flansmod")) {
            event.setCanceled(true);
        }
    }
    
    private static boolean checkFileExists(final File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (final Exception e) {
                FlansMod.log("Failed to create file");
                FlansMod.log(file.getAbsolutePath());
            }
            return false;
        }
        return true;
    }
    
    public static boolean flipControlMode() {
        if (FlansModClient.controlModeSwitchTimer > 0) {
            return false;
        }
        FlansModClient.controlModeMouse = !FlansModClient.controlModeMouse;
        if (FlansModClient.minecraft.field_71439_g.func_70115_ae()) {
            FMLClientHandler.instance().getClient().func_147108_a((GuiScreen)(FlansModClient.controlModeMouse ? new GuiDriveableController((IControllable)FMLClientHandler.instance().getClient().field_71439_g.field_70154_o) : null));
        }
        FlansModClient.controlModeSwitchTimer = 40;
        return true;
    }
    
    public static void reloadModels(final boolean reloadSkins) {
        for (final InfoType type : InfoType.infoTypes) {
            type.reloadModel();
        }
        if (reloadSkins) {
            FlansModClient.proxy.forceReload();
        }
    }
    
    public static Team getTeam(final int spawnerTeamID) {
        if (FlansModClient.teamInfo == null) {
            return null;
        }
        return FlansModClient.teamInfo.getTeam(spawnerTeamID);
    }
    
    public static boolean isCurrentMap(final String map) {
        if (FlansModClient.teamInfo != null) {
            final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
            if (PacketTeamInfo.mapShortName != null) {
                final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
                if (PacketTeamInfo.mapShortName.equals(map)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public static EntityFX getParticle(final String s, final World w, final double x, final double y, final double z) {
        final Minecraft mc = Minecraft.func_71410_x();
        EntityFX fx = null;
        if (s.equals("hugeexplosion")) {
            fx = (EntityFX)new EntityHugeExplodeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("largeexplode")) {
            fx = (EntityFX)new EntityLargeExplodeFX(mc.field_71446_o, w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("fireworksSpark")) {
            fx = (EntityFX)new EntityFireworkSparkFX(w, x, y, z, 0.0, 0.0, 0.0, mc.field_71452_i);
        }
        else if (s.equals("bubble")) {
            fx = (EntityFX)new EntityBubbleFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("suspended")) {
            fx = (EntityFX)new EntitySuspendFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("faggot")) {
            fx = new EntityAfterburn(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("arabe")) {
            fx = new EntitySmokeBurst(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("protoFlame")) {
            fx = new EntityFMFlame(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("nuclear")) {
            fx = new EntityFMNuke(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("shippuDeath")) {
            fx = new EntityshipDeath(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("tankkuDeath")) {
            fx = new EntitytankDeath(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("waterSmoke")) {
            fx = new EntityWaterSmoke(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("waterSmokeMini")) {
            fx = new EntityWaterSmokeMini(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smokeShell")) {
            fx = new EntitySmokeShell(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smokeShellMustard")) {
            fx = new EntitySmokeShellMustard(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smokeShellChlorine")) {
            fx = new EntitySmokeShellChlorine(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("smallSmoke")) {
            fx = new EntitySmallSmoke(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("shipSmoke")) {
            fx = new EntityShipSmoke(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("casing")) {
            fx = new EntityShellCasing(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("blood")) {
            fx = new Entityblood(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("overkill")) {
            fx = new EntityOverKill(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("depthsuspend")) {
            fx = (EntityFX)new EntityAuraFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("townaura")) {
            fx = (EntityFX)new EntityAuraFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("crit")) {
            fx = (EntityFX)new EntityCritFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("magicCrit")) {
            fx = (EntityFX)new EntityCritFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.func_70538_b(fx.func_70534_d() * 0.3f, fx.func_70542_f() * 0.8f, fx.func_70535_g());
            fx.func_94053_h();
        }
        else if (s.equals("smoke")) {
            fx = (EntityFX)new EntitySmokeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("mobSpell")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.func_70538_b(0.0f, 0.0f, 0.0f);
        }
        else if (s.equals("mobSpellAmbient")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.func_82338_g(0.15f);
            fx.func_70538_b(0.0f, 0.0f, 0.0f);
        }
        else if (s.equals("spell")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("instantSpell")) {
            fx = (EntityFX)new EntitySpellParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
            ((EntitySpellParticleFX)fx).func_70589_b(144);
        }
        else if (s.equals("witchMagic")) {
            fx = (EntityFX)new EntitySmokeFX(w, x, y, z, 0.0, 0.0, 0.0);
            ((EntitySpellParticleFX)fx).func_70589_b(144);
            final float f = w.field_73012_v.nextFloat() * 0.5f + 0.35f;
            fx.func_70538_b(1.0f * f, 0.0f * f, 1.0f * f);
        }
        else if (s.equals("note")) {
            fx = (EntityFX)new EntityNoteFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("portal")) {
            fx = (EntityFX)new EntityPortalFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("enchantmenttable")) {
            fx = (EntityFX)new EntityEnchantmentTableParticleFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("explode")) {
            fx = (EntityFX)new EntityExplodeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("flame")) {
            fx = (EntityFX)new EntityFlameFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("lava")) {
            fx = (EntityFX)new EntityLavaFX(w, x, y, z);
        }
        else if (s.equals("footstep")) {
            fx = (EntityFX)new EntityFootStepFX(mc.field_71446_o, w, x, y, z);
        }
        else if (s.equals("splash")) {
            fx = (EntityFX)new EntitySplashFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("wake")) {
            fx = (EntityFX)new EntityFishWakeFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("largesmoke")) {
            fx = (EntityFX)new EntitySmokeFX(w, x, y, z, 0.0, 0.0, 0.0, 2.5f);
        }
        else if (s.equals("cloud")) {
            fx = (EntityFX)new EntityCloudFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("reddust")) {
            fx = (EntityFX)new EntityReddustFX(w, x, y, z, 0.0f, 0.0f, 0.0f);
        }
        else if (s.equals("snowballpoof")) {
            fx = (EntityFX)new EntityBreakingFX(w, x, y, z, Items.field_151126_ay);
        }
        else if (s.equals("dripWater")) {
            fx = (EntityFX)new EntityDropParticleFX(w, x, y, z, Material.field_151586_h);
        }
        else if (s.equals("dripLava")) {
            fx = (EntityFX)new EntityDropParticleFX(w, x, y, z, Material.field_151587_i);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("slime")) {
            fx = (EntityFX)new EntityBreakingFX(w, x, y, z, Items.field_151123_aH);
        }
        else if (s.equals("heart")) {
            fx = (EntityFX)new EntityHeartFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("angryVillager")) {
            fx = (EntityFX)new EntityHeartFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.func_70536_a(81);
            fx.func_70538_b(1.0f, 1.0f, 1.0f);
        }
        else if (s.equals("happyVillager")) {
            fx = (EntityFX)new EntityAuraFX(w, x, y, z, 0.0, 0.0, 0.0);
            fx.func_70536_a(82);
            fx.func_70538_b(1.0f, 1.0f, 1.0f);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.equals("snowshovel")) {
            fx = (EntityFX)new EntitySnowShovelFX(w, x, y, z, 0.0, 0.0, 0.0);
        }
        else if (s.startsWith("iconcrack_")) {
            final String[] astring = s.split("_", 3);
            final int j = Integer.parseInt(astring[1]);
            if (astring.length > 2) {
                final int k = Integer.parseInt(astring[2]);
                fx = (EntityFX)new EntityBreakingFX(w, x, y, z, 0.0, 0.0, 0.0, Item.func_150899_d(j), k);
            }
            else {
                fx = (EntityFX)new EntityBreakingFX(w, x, y, z, 0.0, 0.0, 0.0, Item.func_150899_d(j), 0);
            }
        }
        else if (s.startsWith("blockcrack_")) {
            final String[] astring = s.split("_", 3);
            final Block block = Block.func_149729_e(Integer.parseInt(astring[1]));
            final int k = Integer.parseInt(astring[2]);
            fx = (EntityFX)new EntityDiggingFX(w, x, y, z, 0.0, 0.0, 0.0, block, k).func_90019_g(k);
        }
        else if (s.startsWith("blockdust_")) {
            final String[] astring = s.split("_", 3);
            final Block block = Block.func_149729_e(Integer.parseInt(astring[1]));
            final int k = Integer.parseInt(astring[2]);
            fx = (EntityFX)new EntityBlockDustFX(w, x, y, z, 0.0, 0.0, 0.0, block, k).func_90019_g(k);
        }
        if (mc.field_71474_y.field_74347_j && fx != null) {
            fx.field_70155_l = 200.0;
        }
        if (fx != null) {
            mc.field_71452_i.func_78873_a(fx);
        }
        return fx;
    }
    
    public static GunAnimations getGunAnimations(final EntityLivingBase living, final boolean offHand) {
        GunAnimations animations = null;
        if (offHand) {
            if (FlansModClient.gunAnimationsLeft.containsKey(living)) {
                animations = FlansModClient.gunAnimationsLeft.get(living);
            }
            else {
                animations = new GunAnimations();
                FlansModClient.gunAnimationsLeft.put(living, animations);
            }
        }
        else if (FlansModClient.gunAnimationsRight.containsKey(living)) {
            animations = FlansModClient.gunAnimationsRight.get(living);
        }
        else {
            animations = new GunAnimations();
            FlansModClient.gunAnimationsRight.put(living, animations);
        }
        return animations;
    }
    
    public static void setAimType(final AimType aimInputType) {
        final Property cw = FlansMod.configFile.get("Settings", "Aim Type", "toggle", "The type of aiming that you want to use 'toggle' or 'hold'");
        cw.set(aimInputType.toString());
        FlansMod.configFile.save();
        FlansModClient.aimType = aimInputType;
    }
    
    public static void setAimButton(final FlanMouseButton buttonInput) {
        final Property cw = FlansMod.configFile.get("Settings", "Aim Button", "left", "The mouse button used to aim a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        FlansModClient.aimButton = buttonInput;
    }
    
    public static void setFireButton(final FlanMouseButton buttonInput) {
        final Property cw = FlansMod.configFile.get("Settings", "Fire Button", "right", "The mouse button used to fire a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        FlansModClient.fireButton = buttonInput;
    }
    
    static {
        FlansModClient.originalPitch = 0.0f;
        FlansModClient.animator = 0.0f;
        FlansModClient.netRecoil = 0.0f;
        FlansModClient.hitMarker = false;
        FlansModClient.hitMarkerHeadshot = false;
        FlansModClient.hitMarkerPenAmount = 1.0f;
        FlansModClient.hitMarkerExplosion = false;
        FlansModClient.recoilElevator = 0.0f;
        FlansModClient.sustainedElevator = 0.0f;
        FlansModClient.firstShotRecoil = 0.0f;
        FlansModClient.lamperino = 0;
        FlansModClient.starStruck = false;
        FlansModClient.doneTutorial = false;
        FlansModClient.controlModeMouse = true;
        FlansModClient.controlModeSwitchTimer = 20;
        FlansModClient.shotState = -1;
        FlansModClient.lastBulletReload = 0;
        FlansModClient.vehicleEngineRevs = 14539;
        FlansModClient.currentScope = null;
        FlansModClient.zoomProgress = 0.0f;
        FlansModClient.lastZoomProgress = 0.0f;
        FlansModClient.stanceProgress = 0.0f;
        FlansModClient.lastStanceProgress = 0.0f;
        FlansModClient.lastZoomLevel = 1.0f;
        FlansModClient.lastFOVZoomLevel = 1.0f;
        FlansModClient.cringe = 1.0f;
        FlansModClient.pupperino = 69.0f;
        FlansModClient.originalMouseSensitivity = 0.5f;
        FlansModClient.originalFOV = 70.0f;
        FlansModClient.originalThirdPerson = 0;
        FlansModClient.inPlane = false;
        FlansModClient.teamsScoreGUILock = 0;
        FlansModClient.minecraft = FMLClientHandler.instance().getClient();
    }
}

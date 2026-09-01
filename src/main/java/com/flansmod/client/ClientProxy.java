// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.client.particle.EntityBlockDustFX;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
import org.lwjgl.input.Mouse;
import com.flansmod.common.network.PacketRepairDriveable;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.network.PacketCraftDriveable;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.network.PacketGiveItem;
import com.flansmod.common.network.PacketBuyArmour;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketBuyWeapon;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.boxes.GunBoxType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.gui.GuiScreen;
import com.flansmod.client.gui.GuiDriveableMenu;
import com.flansmod.client.gui.GuiPaintjobTable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.client.gui.GuiArmourBox;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.client.gui.GuiMechaInventory;
import com.flansmod.client.gui.GuiDriveableFuel;
import com.flansmod.client.gui.GuiDriveableInventory;
import com.flansmod.client.gui.GuiGunBox;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.client.gui.GuiGunModTable;
import com.flansmod.client.gui.GuiDriveableRepair;
import com.flansmod.client.gui.GuiDriveableCrafting;
import net.minecraft.world.World;
import com.flansmod.common.driveables.EnumPlaneMode;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import com.flansmod.common.teams.TileEntitySpawner;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.client.debug.RenderDebugAABB;
import com.flansmod.client.debug.EntityDebugAABB;
import com.flansmod.client.debug.RenderDebugVector;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.debug.RenderDebugDot;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.model.RenderParachute;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.client.model.RenderMG;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.client.model.RenderNull;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.client.model.RenderFlagpole;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.client.model.RenderAAGun;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.guns.EntityGrenade;
import net.minecraft.client.renderer.entity.Render;
import cpw.mods.fml.client.registry.RenderingRegistry;
import com.flansmod.client.model.RenderBullet;
import com.flansmod.common.guns.EntityBullet;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.client.FMLClientHandler;
import java.io.InputStream;
import cpw.mods.fml.common.MetadataCollection;
import java.util.Map;
import cpw.mods.fml.common.FMLModContainer;
import cpw.mods.fml.common.discovery.ModCandidate;
import cpw.mods.fml.common.discovery.ContainerType;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.reflect.Method;
import net.minecraft.client.Minecraft;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.guns.GrenadeType;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import com.flansmod.common.guns.GunType;
import java.io.File;
import java.util.List;
import com.flansmod.client.model.RenderMecha;
import com.flansmod.client.model.RenderVehicle;
import com.flansmod.client.model.RenderPlane;
import com.flansmod.client.model.RenderGrenade;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.CommonProxy;

public class ClientProxy extends CommonProxy
{
    public static String modelDir;
    public static RenderGun gunRenderer;
    public static RenderGrenade grenadeRenderer;
    public static RenderPlane planeRenderer;
    public static RenderVehicle vehicleRenderer;
    public static RenderMecha mechaRenderer;
    public static String facts;
    public List<File> contentPacks;
    
    @Override
    public void load() {
        new FlansModClient().load();
        ClientProxy.gunRenderer = new RenderGun();
        ClientProxy.grenadeRenderer = new RenderGrenade();
        ClientProxy.planeRenderer = new RenderPlane();
        ClientProxy.vehicleRenderer = new RenderVehicle();
        ClientProxy.mechaRenderer = new RenderMecha();
        for (final GunType gunType : GunType.guns.values()) {
            MinecraftForgeClient.registerItemRenderer(gunType.item, (IItemRenderer)ClientProxy.gunRenderer);
        }
        for (final GrenadeType grenadeType : GrenadeType.grenades) {
            MinecraftForgeClient.registerItemRenderer(grenadeType.item, (IItemRenderer)ClientProxy.grenadeRenderer);
        }
        for (final PlaneType planeType : PlaneType.types) {
            MinecraftForgeClient.registerItemRenderer(planeType.item, (IItemRenderer)ClientProxy.planeRenderer);
        }
        for (final VehicleType vehicleType : VehicleType.types) {
            MinecraftForgeClient.registerItemRenderer(vehicleType.item, (IItemRenderer)ClientProxy.vehicleRenderer);
        }
        for (final MechaType mechaType : MechaType.types) {
            MinecraftForgeClient.registerItemRenderer(mechaType.item, (IItemRenderer)ClientProxy.mechaRenderer);
        }
        FMLCommonHandler.instance().bus().register((Object)new KeyInputHandler());
        new TickHandlerClient();
        MinecraftForge.EVENT_BUS.register((Object)new PlaneHUD());
        FlansMod.log(ClientProxy.facts = "u");
    }
    
    @Override
    public void forceReload() {
        Minecraft.getMinecraft().refreshResources();
    }
    
    @Override
    public List<File> getContentList(final Method method, final ClassLoader classloader) {
        this.contentPacks = new ArrayList<File>();
        for (final File file : FlansMod.flanDir.listFiles()) {
            Label_0285: {
                if (!file.isDirectory()) {
                    if (!ClientProxy.zipJar.matcher(file.getName()).matches()) {
                        break Label_0285;
                    }
                }
                try {
                    method.invoke(classloader, file.toURI().toURL());
                    final HashMap<String, Object> map = new HashMap<String, Object>();
                    map.put("modid", "FlansMod");
                    map.put("name", "Flan's Mod : " + file.getName());
                    map.put("version", "1");
                    final FMLModContainer container = new FMLModContainer("com.flansmod.common.FlansMod", new ModCandidate(file, file, file.isDirectory() ? ContainerType.DIR : ContainerType.JAR), (Map)map);
                    container.bindMetadata(MetadataCollection.from((InputStream)null, ""));
                    FMLClientHandler.instance().addModAsResource((ModContainer)container);
                }
                catch (final Exception e) {
                    FlansMod.log("Failed to load images for content pack : " + file.getName());
                    e.printStackTrace();
                }
                FlansMod.log("Loaded content pack : " + file.getName());
                this.contentPacks.add(file);
            }
        }
        FlansMod.log("Loaded textures and models.");
        return this.contentPacks;
    }
    
    @Override
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityBullet.class, (Render)new RenderBullet());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityGrenade.class, (Render)new RenderGrenade());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityPlane.class, (Render)new RenderPlane());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityVehicle.class, (Render)new RenderVehicle());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityAAGun.class, (Render)new RenderAAGun());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityFlagpole.class, (Render)new RenderFlagpole());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityFlag.class, (Render)new RenderFlag());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntitySeat.class, (Render)new RenderNull());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityWheel.class, (Render)new RenderNull());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMG.class, (Render)new RenderMG());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityParachute.class, (Render)new RenderParachute());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDebugDot.class, (Render)new RenderDebugDot());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDebugVector.class, (Render)new RenderDebugVector());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDebugAABB.class, (Render)new RenderDebugAABB());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMecha.class, (Render)new RenderMecha());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntitySpawner.class, (TileEntitySpecialRenderer)new TileEntitySpawnerRenderer());
    }
    
    @Override
    public void doTutorialStuff(final EntityPlayer player, final EntityDriveable entityType) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.inventoryKey.getKeyCode()) + " to open the menu"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Hold " + Keyboard.getKeyName(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()) + " to get out"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.eject.getKeyCode()) + " to eject and ban passengers"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.openBorders.getKeyCode()) + " to allow passengers again"));
        if (entityType instanceof EntityPlane) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Hold " + Keyboard.getKeyName(KeyInputHandler.nintendoSwitch.getKeyCode()) + " to switch seats"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.controlSwitchKey.getKeyCode()) + " for mouse control mode"));
            if (PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasGear) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.gearKey.getKeyCode()) + " to switch the gear"));
            }
            if (PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasDoor) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.doorKey.getKeyCode()) + " to switch the doors"));
            }
            if (PlaneType.getPlane(((EntityPlane)entityType).driveableType).hasAfterBurner) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.trimKey.getKeyCode()) + " to toggle afterburner"));
            }
            if (PlaneType.getPlane(((EntityPlane)entityType).driveableType).mode == EnumPlaneMode.VTOL) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.modeKey.getKeyCode()) + " to switch VTOL mode"));
            }
            else if (PlaneType.getPlane(((EntityPlane)entityType).driveableType).mode != EnumPlaneMode.VTOL && PlaneType.getPlane(((EntityPlane)entityType).driveableType).mode == EnumPlaneMode.PLANE) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.modeKey.getKeyCode()) + " to toggle landing flaps"));
            }
            if (PlaneType.getPlane(((EntityPlane)entityType).driveableType).carrierLandable || PlaneType.getPlane(((EntityPlane)entityType).driveableType).helipadLandable) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.gunKey.getKeyCode()) + " to dock on helipad / floatplane hangar"));
            }
            if (entityType.getDriveableType().hasMagicArtilleryMode) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.artilleryMode.getKeyCode()) + " to toggle magic ammo vision"));
            }
        }
        if (entityType instanceof EntityVehicle) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Hold " + Keyboard.getKeyName(KeyInputHandler.nintendoSwitch.getKeyCode()) + " to switch seats"));
            if (((EntityVehicle)entityType).getVehicleType().tank) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.leftRollKey.getKeyCode()) + " to lock a tank turret / cannon"));
            }
            if (((EntityVehicle)entityType).getVehicleType().tank) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.rightRollKey.getKeyCode()) + " to unlock a tank turret / cannon"));
            }
            if (((EntityVehicle)entityType).getVehicleType().thermalSight) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.thermal.getKeyCode()) + " to toggle thermal sights"));
            }
            if (entityType.getDriveableType().hasMagicArtilleryMode) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.artilleryMode.getKeyCode()) + " to toggle magic ammo vision"));
            }
            if (entityType.getDriveableType().hasRadar) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.artilleryMode.getKeyCode()) + " to toggle active / passive radar"));
            }
            if (entityType.getDriveableType().hasScope) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Press " + Keyboard.getKeyName(KeyInputHandler.downKey.getKeyCode()) + " to toggle gun optic"));
            }
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Hold the spacebar to brake"));
        }
    }
    
    @Override
    public void changeControlMode(final EntityPlayer player) {
        if (FlansModClient.flipControlMode()) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Mouse Control mode is now set to " + FlansModClient.controlModeMouse));
        }
    }
    
    @Override
    public boolean mouseControlEnabled() {
        return FlansModClient.controlModeMouse;
    }
    
    @Override
    public Object getClientGui(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        if (((ID >= 6 && ID <= 10) || ID == 12) && player.ridingEntity == null) {
            return null;
        }
        switch (ID) {
            case 0: {
                return new GuiDriveableCrafting(player.inventory, world, x, y, z);
            }
            case 1: {
                return new GuiDriveableRepair(player);
            }
            case 2: {
                return new GuiGunModTable(player.inventory, world);
            }
            case 5: {
                return new GuiGunBox(player.inventory, ((BlockGunBox)world.getBlock(x, y, z)).type, world);
            }
            case 6: {
                return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 0);
            }
            case 7: {
                return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 1);
            }
            case 8: {
                return new GuiDriveableFuel(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable);
            }
            case 9: {
                return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 2);
            }
            case 10: {
                return new GuiMechaInventory(player.inventory, world, (EntityMecha)((EntitySeat)player.ridingEntity).driveable);
            }
            case 11: {
                return new GuiArmourBox(player.inventory, ((BlockArmourBox)world.getBlock(x, y, z)).type);
            }
            case 12: {
                return new GuiDriveableInventory(player.inventory, world, ((EntitySeat)player.ridingEntity).driveable, 3);
            }
            case 13: {
                return new GuiPaintjobTable(player.inventory, world, (TileEntityPaintjobTable)world.getTileEntity(x, y, z));
            }
            default: {
                return null;
            }
        }
    }
    
    @Override
    public void openDriveableMenu(final EntityPlayer player, final World world, final EntityDriveable driveable) {
        FMLClientHandler.instance().getClient().displayGuiScreen((GuiScreen)new GuiDriveableMenu(player.inventory, world, driveable));
    }
    
    private static String getModelName(final String in) {
        final String[] split = in.split("\\.");
        if (split.length == 1) {
            return "Model" + in;
        }
        if (split.length > 1) {
            String out = "Model" + split[split.length - 1];
            for (int i = split.length - 2; i >= 0; --i) {
                out = split[i] + "." + out;
            }
            return out;
        }
        return in;
    }
    
    @Override
    public <T> T loadModel(final String s, final String shortName, final Class<T> typeClass) {
        if (s == null || shortName == null) {
            return null;
        }
        try {
            return typeClass.cast(Class.forName(ClientProxy.modelDir + getModelName(s)).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
        }
        catch (final Exception e) {
            FlansMod.log("Failed to load model : " + shortName + " (" + s + ")");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
            return null;
        }
    }
    
    @Override
    public void loadSound(final String contentPack, final String type, final String sound) {
        FlansModResourceHandler.getSound(sound);
    }
    
    @Override
    public boolean isThePlayer(final EntityPlayer player) {
        return player == FMLClientHandler.instance().getClient().thePlayer;
    }
    
    @Override
    public EntityPlayer getThePlayer() {
        return (EntityPlayer)FMLClientHandler.instance().getClient().thePlayer;
    }
    
    @Override
    public boolean isOnSameTeamClientPlayer(final EntityLivingBase entity) {
        return FMLClientHandler.instance().getClient().thePlayer.isOnSameTeam(entity);
    }
    
    @Override
    public void buyGun(final GunBoxType type, final InfoType gun) {
        FlansMod.getPacketHandler().sendToServer(new PacketBuyWeapon(type, gun));
        FlansModClient.shootTimeLeft = (FlansModClient.shootTimeRight = 10.0f);
        FlansModClient.stabTimeLeft = (FlansModClient.stabTimeRight = 10);
    }
    
    @Override
    public void buyArmour(final String shortName, final int piece, final ArmourBoxType box) {
        FlansMod.getPacketHandler().sendToServer(new PacketBuyArmour(box.shortName, shortName, piece));
        FlansModClient.shootTimeLeft = (FlansModClient.shootTimeRight = 10.0f);
        FlansModClient.stabTimeLeft = (FlansModClient.stabTimeRight = 10);
    }
    
    @Override
    public void addItem(final EntityPlayer player, final int id) {
        super.addItem(player, id);
        if (player.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToServer(new PacketGiveItem(57));
        }
    }
    
    @Override
    public void craftDriveable(final EntityPlayer player, final DriveableType type) {
        super.craftDriveable(player, type);
        if (player.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToServer(new PacketCraftDriveable(type.shortName));
        }
    }
    
    @Override
    public void repairDriveable(final EntityPlayer driver, final EntityDriveable driving, final DriveablePart part) {
        super.repairDriveable(driver, driving, part);
        if (driver.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToServer(new PacketRepairDriveable(part.type));
        }
    }
    
    @Override
    public boolean isScreenOpen() {
        return Minecraft.getMinecraft().currentScreen != null;
    }
    
    @Override
    public boolean isKeyDown(final int key) {
        switch (key) {
            case 0: {
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindForward.getKeyCode());
            }
            case 1: {
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindBack.getKeyCode());
            }
            case 2: {
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindLeft.getKeyCode());
            }
            case 3: {
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindRight.getKeyCode());
            }
            case 4: {
                return this.keyDown(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode());
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public boolean keyDown(final int keyCode) {
        final boolean state = (keyCode < 0) ? Mouse.isButtonDown(keyCode + 100) : Keyboard.isKeyDown(keyCode);
        return state;
    }
    
    @Override
    public void spawnParticle(final String s, final double x, final double y, final double z, final double mx, final double my, final double mz) {
        try {
            doSpawnParticle(s, x, y, z, mx, my, mz);
        }
        catch (final Throwable throwable) {
            throwable.printStackTrace();
        }
    }
    
    private static EntityFX doSpawnParticle(final String p_72726_1_, final double p_72726_2_, final double p_72726_4_, final double p_72726_6_, final double p_72726_8_, final double p_72726_10_, final double p_72726_12_) {
        final Minecraft mc = Minecraft.getMinecraft();
        final World theWorld = (World)mc.theWorld;
        if (mc.renderViewEntity == null || mc.effectRenderer == null) {
            return null;
        }
        int i = mc.gameSettings.particleSetting;
        if (i == 1 && theWorld.rand.nextInt(3) == 0) {
            i = 2;
        }
        final double d6 = mc.renderViewEntity.posX - p_72726_2_;
        final double d7 = mc.renderViewEntity.posY - p_72726_4_;
        final double d8 = mc.renderViewEntity.posZ - p_72726_6_;
        EntityFX entityfx = null;
        if (p_72726_1_.equals("hugeexplosion")) {
            mc.effectRenderer.addEffect(entityfx = (EntityFX)new EntityHugeExplodeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_));
        }
        else if (p_72726_1_.equals("largeexplode")) {
            mc.effectRenderer.addEffect(entityfx = (EntityFX)new EntityLargeExplodeFX(mc.renderEngine, theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_));
        }
        else if (p_72726_1_.equals("fireworksSpark")) {
            mc.effectRenderer.addEffect(entityfx = (EntityFX)new EntityFireworkSparkFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, mc.effectRenderer));
        }
        if (entityfx != null) {
            return entityfx;
        }
        final double d9 = 160.0;
        if (d6 * d6 + d7 * d7 + d8 * d8 > d9 * d9) {
            return null;
        }
        if (i > 1) {
            return null;
        }
        if (p_72726_1_.equals("flansmod.flare")) {
            entityfx = new EntityFlare(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.smokeShell")) {
            entityfx = new EntitySmokeShell(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.smokeShellMustard")) {
            entityfx = new EntitySmokeShellMustard(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.smokeShellChlorine")) {
            entityfx = new EntitySmokeShellChlorine(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.gunSmoke")) {
            entityfx = new EntitySmallSmoke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.shipSmoke")) {
            entityfx = new EntityShipSmoke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.blood")) {
            entityfx = new Entityblood(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.overkill")) {
            entityfx = new EntityOverKill(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.FMNuke")) {
            entityfx = new EntityFMNuke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.shipDeath")) {
            entityfx = new EntityshipDeath(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.tankDeath")) {
            entityfx = new EntitytankDeath(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.WaterSmoke")) {
            entityfx = new EntityWaterSmoke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.WaterSmokeMini")) {
            entityfx = new EntityWaterSmokeMini(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.smoker")) {
            entityfx = new EntitySmokeGrenade(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.flasher")) {
            entityfx = new EntityAPSGrenade(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.flash")) {
            entityfx = new EntityFlash(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.smokeburst")) {
            entityfx = new EntitySmokeBurst(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.bigsmoke")) {
            entityfx = (EntityFX)new EntityBigSmoke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.debris1")) {
            entityfx = new EntityDebris1(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.fmflame")) {
            entityfx = new EntityFMFlame(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.fmtracer")) {
            entityfx = new EntityFMTracer(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.fmtracergreen")) {
            entityfx = new EntityFMTracerGreen(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.fmtracerred")) {
            entityfx = new EntityFMTracerRed(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.afterburn")) {
            entityfx = new EntityAfterburn(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.fmsmoke")) {
            entityfx = new EntityFMSmoke(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("flansmod.rocketexhaust")) {
            entityfx = new EntityRocketexhaust(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        if (p_72726_1_.equals("bubble")) {
            entityfx = (EntityFX)new EntityBubbleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("suspended")) {
            entityfx = (EntityFX)new EntitySuspendFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("depthsuspend")) {
            entityfx = (EntityFX)new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("townaura")) {
            entityfx = (EntityFX)new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("crit")) {
            entityfx = (EntityFX)new EntityCritFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("magicCrit")) {
            entityfx = (EntityFX)new EntityCritFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
            entityfx.setRBGColorF(entityfx.getRedColorF() * 0.3f, entityfx.getGreenColorF() * 0.8f, entityfx.getBlueColorF());
            entityfx.nextTextureIndexX();
        }
        else if (p_72726_1_.equals("smoke")) {
            entityfx = (EntityFX)new EntitySmokeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("mobSpell")) {
            entityfx = (EntityFX)new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, 0.0, 0.0, 0.0);
            entityfx.setRBGColorF((float)p_72726_8_, (float)p_72726_10_, (float)p_72726_12_);
        }
        else if (p_72726_1_.equals("mobSpellAmbient")) {
            entityfx = (EntityFX)new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, 0.0, 0.0, 0.0);
            entityfx.setAlphaF(0.15f);
            entityfx.setRBGColorF((float)p_72726_8_, (float)p_72726_10_, (float)p_72726_12_);
        }
        else if (p_72726_1_.equals("spell")) {
            entityfx = (EntityFX)new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("instantSpell")) {
            entityfx = (EntityFX)new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
            ((EntitySpellParticleFX)entityfx).setBaseSpellTextureIndex(144);
        }
        else if (p_72726_1_.equals("witchMagic")) {
            entityfx = (EntityFX)new EntitySpellParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
            ((EntitySpellParticleFX)entityfx).setBaseSpellTextureIndex(144);
            final float f = theWorld.rand.nextFloat() * 0.5f + 0.35f;
            entityfx.setRBGColorF(1.0f * f, 0.0f * f, 1.0f * f);
        }
        else if (p_72726_1_.equals("note")) {
            entityfx = (EntityFX)new EntityNoteFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("portal")) {
            entityfx = (EntityFX)new EntityPortalFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("enchantmenttable")) {
            entityfx = (EntityFX)new EntityEnchantmentTableParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("explode")) {
            entityfx = (EntityFX)new EntityExplodeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("flame")) {
            entityfx = (EntityFX)new EntityFlameFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("lava")) {
            entityfx = (EntityFX)new EntityLavaFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_);
        }
        else if (p_72726_1_.equals("footstep")) {
            entityfx = (EntityFX)new EntityFootStepFX(mc.renderEngine, theWorld, p_72726_2_, p_72726_4_, p_72726_6_);
        }
        else if (p_72726_1_.equals("splash")) {
            entityfx = (EntityFX)new EntitySplashFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("wake")) {
            entityfx = (EntityFX)new EntityFishWakeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("largesmoke")) {
            entityfx = (EntityFX)new EntitySmokeFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, 2.5f);
        }
        else if (p_72726_1_.equals("cloud")) {
            entityfx = (EntityFX)new EntityCloudFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("reddust")) {
            entityfx = (EntityFX)new EntityReddustFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, (float)p_72726_8_, (float)p_72726_10_, (float)p_72726_12_);
        }
        else if (p_72726_1_.equals("snowballpoof")) {
            entityfx = (EntityFX)new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Items.snowball);
        }
        else if (p_72726_1_.equals("dripWater")) {
            entityfx = (EntityFX)new EntityDropParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Material.water);
        }
        else if (p_72726_1_.equals("dripLava")) {
            entityfx = (EntityFX)new EntityDropParticleFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Material.lava);
        }
        else if (p_72726_1_.equals("snowshovel")) {
            entityfx = (EntityFX)new EntitySnowShovelFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("slime")) {
            entityfx = (EntityFX)new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, Items.slime_ball);
        }
        else if (p_72726_1_.equals("heart")) {
            entityfx = (EntityFX)new EntityHeartFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
        }
        else if (p_72726_1_.equals("angryVillager")) {
            entityfx = (EntityFX)new EntityHeartFX(theWorld, p_72726_2_, p_72726_4_ + 0.5, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
            entityfx.setParticleTextureIndex(81);
            entityfx.setRBGColorF(1.0f, 1.0f, 1.0f);
        }
        else if (p_72726_1_.equals("happyVillager")) {
            entityfx = (EntityFX)new EntityAuraFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_);
            entityfx.setParticleTextureIndex(82);
            entityfx.setRBGColorF(1.0f, 1.0f, 1.0f);
        }
        else if (p_72726_1_.startsWith("iconcrack_")) {
            final String[] astring = p_72726_1_.split("_", 3);
            final int j = Integer.parseInt(astring[1]);
            if (astring.length > 2) {
                final int k = Integer.parseInt(astring[2]);
                entityfx = (EntityFX)new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, Item.getItemById(j), k);
            }
            else {
                entityfx = (EntityFX)new EntityBreakingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, Item.getItemById(j), 0);
            }
        }
        else if (p_72726_1_.startsWith("blockcrack_")) {
            final String[] astring = p_72726_1_.split("_", 3);
            final Block block = Block.getBlockById(Integer.parseInt(astring[1]));
            final int k = Integer.parseInt(astring[2]);
            entityfx = (EntityFX)new EntityDiggingFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, block, k).applyRenderColor(k);
        }
        else if (p_72726_1_.startsWith("blockdust_")) {
            final String[] astring = p_72726_1_.split("_", 3);
            final Block block = Block.getBlockById(Integer.parseInt(astring[1]));
            final int k = Integer.parseInt(astring[2]);
            entityfx = (EntityFX)new EntityBlockDustFX(theWorld, p_72726_2_, p_72726_4_, p_72726_6_, p_72726_8_, p_72726_10_, p_72726_12_, block, k).applyRenderColor(k);
        }
        if (entityfx != null) {
            mc.effectRenderer.addEffect(entityfx);
        }
        return entityfx;
    }
    
    @Override
    public float getMouseSensitivity() {
        return Minecraft.getMinecraft().gameSettings.mouseSensitivity;
    }
    
    static {
        ClientProxy.modelDir = "com.flansmod.client.model.";
    }
}

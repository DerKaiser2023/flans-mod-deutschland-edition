// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import net.minecraftforge.common.config.ConfigCategory;
import com.flansmod.client.FlanMouseButton;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.AimType;
import java.lang.reflect.Method;
import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.driveables.mechas.MechaItemType;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.BulletType;
import cpw.mods.fml.relauncher.Side;
import java.net.URL;
import java.net.URLClassLoader;
import net.minecraft.server.MinecraftServer;
import java.util.zip.ZipEntry;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import java.util.zip.ZipFile;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.flansmod.common.types.TypeFile;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import com.flansmod.common.types.EnumType;
import java.util.List;
import com.flansmod.common.teams.ArmourType;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import com.flansmod.common.teams.CommandShekel;
import net.minecraft.command.ICommand;
import com.flansmod.common.teams.CommandTeams;
import net.minecraft.command.CommandHandler;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import java.util.Iterator;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import com.flansmod.common.eventhandlers.PlayerLoginEventListener;
import com.flansmod.common.eventhandlers.PlayerDeathEventListener;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.ForgeChunkManager;
import com.flansmod.common.teams.ChunkLoadingHandler;
import com.flansmod.common.guns.EntityAAGun;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.EntityTeamItem;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.types.InfoType;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.teams.TileEntitySpawner;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.flansmod.client.model.GunAnimations;
import net.minecraft.entity.EntityLivingBase;
import java.util.HashMap;
import com.flansmod.common.teams.BlockArmourBox;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.driveables.mechas.ItemMecha;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.guns.ItemAttachment;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.boxes.BlockGunBox;
import java.util.ArrayList;
import com.flansmod.common.teams.ItemTeamsShekel;
import com.flansmod.common.teams.ItemFlagpole;
import com.flansmod.common.teams.ItemOpStick;
import com.flansmod.common.teams.BlockSpawner;
import com.flansmod.common.paintjob.BlockPaintjobTable;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.network.PacketHandler;
import com.flansmod.common.teams.Team;
import net.minecraft.entity.Entity;
import java.io.File;
import cpw.mods.fml.common.SidedProxy;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;

@Mod(modid = "flansmod", name = "Flan's Mod LabJac Edition", version = "LabJac Mod Mark 25843 - February 2021", acceptableRemoteVersions = "1.7.10")
public class FlansMod
{
    public static boolean DEBUG;
    public static Configuration configFile;
    public static final String MODID = "flansmod";
    public static final String VERSION = "LabJac Mod Mark 25843 - February 2021";
    @Mod.Instance("flansmod")
    public static FlansMod INSTANCE;
    public static int generalConfigInteger;
    public static String generalConfigString;
    public static boolean printDebugLog;
    public static boolean printStackTrace;
    public static int noticeSpawnKillTime;
    public static boolean gunCarryLimitEnable;
    public static int gunCarryLimit;
    public static int armorDurability;
    public static boolean armsEnable;
    public static boolean casingEnable;
    public static boolean crosshairEnable;
    public static boolean hitCrossHairEnable;
    public static boolean hdHitCrosshair;
    public static boolean bulletGuiEnable;
    public static float[] hitCrossHairColor;
    public static boolean addGunpowderRecipe;
    public static boolean addAllPaintjobsToCreative;
    public static int teamsConfigInteger;
    public static String teamsConfigString;
    public static boolean teamsConfigBoolean;
    @SidedProxy(clientSide = "com.flansmod.client.ClientProxy", serverSide = "com.flansmod.common.CommonProxy")
    public static CommonProxy proxy;
    public static int ticker;
    public static long lastTime;
    public static File flanDir;
    public static final float soundRange = 50.0f;
    public static float driveableUpdateRange;
    public static final int numPlayerSnapshots = 20;
    public static boolean kickNonMatchingHashes;
    public static boolean showDistanceInKillMessage;
    public static Entity lastRidden;
    public static Entity lastMount;
    public static int armourSpawnRate;
    public static Team spectators;
    public static final PacketHandler packetHandler;
    public static final PlayerHandler playerHandler;
    public static final TeamsManager teamsManager;
    public static final CommonTickHandler tickHandler;
    public static FlansHooks hooks;
    public static boolean isInFlash;
    public static int flashTime;
    public static BlockFlansWorkbench workbench;
    public static BlockPaintjobTable paintjobTable;
    public static BlockSpawner spawner;
    public static ItemOpStick opStick;
    public static ItemFlagpole flag;
    public static ItemTeamsShekel Shekel;
    public static ArrayList<BlockGunBox> gunBoxBlocks;
    public static ArrayList<ItemBullet> bulletItems;
    public static ArrayList<ItemGun> gunItems;
    public static ArrayList<ItemAttachment> attachmentItems;
    public static ArrayList<ItemPart> partItems;
    public static ArrayList<ItemPlane> planeItems;
    public static ArrayList<ItemVehicle> vehicleItems;
    public static ArrayList<ItemMechaAddon> mechaToolItems;
    public static ArrayList<ItemMecha> mechaItems;
    public static ArrayList<ItemAAGun> aaGunItems;
    public static ArrayList<ItemGrenade> grenadeItems;
    public static ArrayList<ItemTool> toolItems;
    public static ArrayList<ItemTeamArmour> armourItems;
    public static ArrayList<BlockArmourBox> armourBoxBlocks;
    public static CreativeTabFlan tabFlanGuns;
    public static CreativeTabFlan tabFlanDriveables;
    public static CreativeTabFlan tabFlanParts;
    public static CreativeTabFlan tabFlanTeams;
    public static CreativeTabFlan tabFlanMechas;
    public static HashMap<EntityLivingBase, GunAnimations> gunAnimationsRight;
    public static HashMap<EntityLivingBase, GunAnimations> gunAnimationsLeft;
    public static boolean debugMode;
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        log("Preinitialising Flan's mod.");
        FlansMod.configFile = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig(event.getSide());
        FlansMod.flanDir = new File(event.getModConfigurationDirectory().getParentFile(), "/Flan/");
        if (!FlansMod.flanDir.exists()) {
            log("Flan folder not found. Creating empty folder.");
            log("You should get some content packs and put them in the Flan folder.");
            FlansMod.flanDir.mkdirs();
            FlansMod.flanDir.mkdir();
        }
        GameRegistry.registerBlock((Block)(FlansMod.workbench = (BlockFlansWorkbench)new BlockFlansWorkbench(1, 0).func_149663_c("flansWorkbench").func_149658_d("flansWorkbench")), (Class)ItemBlockManyNames.class, "flansWorkbench");
        GameRegistry.addRecipe(new ItemStack((Block)FlansMod.workbench, 1, 0), new Object[] { "BBB", "III", "III", 'B', Items.field_151054_z, 'I', Items.field_151042_j });
        GameRegistry.addRecipe(new ItemStack((Block)FlansMod.workbench, 1, 1), new Object[] { "ICI", "III", 'C', Items.field_151066_bu, 'I', Items.field_151042_j });
        GameRegistry.registerItem((Item)(FlansMod.opStick = new ItemOpStick()), "opStick", "flansmod");
        FlansMod.flag = (ItemFlagpole)new ItemFlagpole().func_77655_b("flagpole");
        FlansMod.Shekel = (ItemTeamsShekel)new ItemTeamsShekel().func_77655_b("Shekel");
        GameRegistry.registerItem((Item)FlansMod.flag, "flagpole", "flansmod");
        GameRegistry.registerBlock((Block)(FlansMod.spawner = (BlockSpawner)new BlockSpawner(Material.field_151573_f).func_149663_c("teamsSpawner").func_149722_s().func_149752_b(1000000.0f)), (Class)ItemBlockManyNames.class, "teamsSpawner");
        GameRegistry.registerTileEntity((Class)TileEntitySpawner.class, "teamsSpawner");
        GameRegistry.registerBlock((Block)(FlansMod.paintjobTable = new BlockPaintjobTable()), "paintjobTable");
        GameRegistry.registerTileEntity((Class)TileEntityPaintjobTable.class, "flansmod");
        FlansMod.proxy.registerRenderers();
        this.readContentPacks(event);
        if (FlansMod.gunItems.size() >= 1) {
            MinecraftForge.EVENT_BUS.register((Object)FlansMod.gunItems.get(0));
        }
        FlansMod.proxy.load();
        FlansMod.proxy.forceReload();
        log("Preinitializing complete.");
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        log("Initialising Flan's Mod.");
        final int id = EntityRegistry.findGlobalUniqueEntityId();
        FlansMod.packetHandler.initialise();
        NetworkRegistry.INSTANCE.registerGuiHandler((Object)this, (IGuiHandler)new CommonGuiHandler());
        for (final InfoType type : InfoType.infoTypes) {
            type.addRecipe();
        }
        if (FlansMod.addGunpowderRecipe) {
            final ItemStack charcoal = new ItemStack(Items.field_151044_h, 1, 1);
            GameRegistry.addShapelessRecipe(new ItemStack(Items.field_151016_H), new Object[] { charcoal, charcoal, charcoal, new ItemStack(Items.field_151114_aO) });
        }
        log("Loaded recipes.");
        EntityRegistry.registerGlobalEntityID((Class)EntityFlagpole.class, "Flagpole", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityFlagpole.class, "Flagpole", 93, (Object)this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityFlag.class, "Flag", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityFlag.class, "Flag", 94, (Object)this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityTeamItem.class, "TeamsItem", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityTeamItem.class, "TeamsItem", 97, (Object)this, 100, 10000, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityGunItem.class, "GunItem", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityGunItem.class, "GunItem", 98, (Object)this, 100, 20, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityPlane.class, "Plane", 90, (Object)this, 200, 3, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityVehicle.class, "Vehicle", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityVehicle.class, "Vehicle", 95, (Object)this, 400, 10, true);
        EntityRegistry.registerGlobalEntityID((Class)EntitySeat.class, "Seat", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntitySeat.class, "Seat", 99, (Object)this, 250, 10, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityWheel.class, "Wheel", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityWheel.class, "Wheel", 103, (Object)this, 200, 20, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityParachute.class, "Parachute", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityParachute.class, "Parachute", 101, (Object)this, 40, 20, false);
        EntityRegistry.registerGlobalEntityID((Class)EntityMecha.class, "Mecha", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityMecha.class, "Mecha", 102, (Object)this, 250, 20, false);
        EntityRegistry.registerGlobalEntityID((Class)EntityBullet.class, "Bullet", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityBullet.class, "Bullet", 96, (Object)this, 200, 20, false);
        EntityRegistry.registerGlobalEntityID((Class)EntityGrenade.class, "Grenade", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityGrenade.class, "Grenade", 100, (Object)this, 40, 100, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityMG.class, "MG", 91, (Object)this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID((Class)EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity((Class)EntityAAGun.class, "AAGun", 92, (Object)this, 40, 500, false);
        ForgeChunkManager.setForcedChunkLoadingCallback((Object)this, (ForgeChunkManager.LoadingCallback)new ChunkLoadingHandler());
        FMLCommonHandler.instance().bus().register((Object)FlansMod.INSTANCE);
        new PlayerDeathEventListener();
        new PlayerLoginEventListener();
        new ServerTickEvent();
        log("Loading complete.");
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        FlansMod.packetHandler.postInitialise();
        FlansMod.hooks.hook();
    }
    
    @SubscribeEvent
    public void playerDrops(final PlayerDropsEvent event) {
        for (int i = event.drops.size() - 1; i >= 0; --i) {
            final EntityItem ent = event.drops.get(i);
            final InfoType type = InfoType.getType(ent.func_92059_d());
            if (type != null && !type.canDrop) {
                event.drops.remove(i);
            }
        }
    }
    
    @SubscribeEvent
    public void playerDrops(final ItemTossEvent event) {
        final InfoType type = InfoType.getType(event.entityItem.func_92059_d());
        if (type != null && !type.canDrop) {
            event.setCanceled(true);
        }
    }
    
    @Mod.EventHandler
    public void registerCommand(final FMLServerStartedEvent e) {
        final CommandHandler handler = (CommandHandler)FMLCommonHandler.instance().getSidedDelegate().getServer().func_71187_D();
        handler.func_71560_a((ICommand)new CommandTeams());
        handler.func_71560_a((ICommand)new CommandShekel());
    }
    
    @SubscribeEvent
    public void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if (eventArgs.modID.equals("flansmod")) {
            syncConfig();
        }
    }
    
    @SubscribeEvent
    public void onLivingSpecialSpawn(final LivingSpawnEvent.CheckSpawn event) {
        final int chance = event.world.field_73012_v.nextInt(101);
        if (chance < FlansMod.armourSpawnRate && (event.entityLiving instanceof EntityZombie || event.entityLiving instanceof EntitySkeleton)) {
            if (event.world.field_73012_v.nextBoolean() && ArmourType.armours.size() > 0) {
                final ArmourType armour = ArmourType.armours.get(event.world.field_73012_v.nextInt(ArmourType.armours.size()));
                if (armour != null && armour.type != 2) {
                    event.entityLiving.func_70062_b(armour.type + 1, new ItemStack(armour.item));
                }
            }
            else if (Team.teams.size() > 0) {
                final Team team = Team.teams.get(event.world.field_73012_v.nextInt(Team.teams.size()));
                if (team.hat != null) {
                    event.entityLiving.func_70062_b(1, team.hat.func_77946_l());
                }
                if (team.chest != null) {
                    event.entityLiving.func_70062_b(2, team.chest.func_77946_l());
                }
                if (team.shoes != null) {
                    event.entityLiving.func_70062_b(4, team.shoes.func_77946_l());
                }
            }
        }
    }
    
    private static void getTypeFiles(final List<File> contentPacks) {
        for (final File contentPack : contentPacks) {
            if (contentPack.isDirectory()) {
                for (final EnumType typeToCheckFor : EnumType.values()) {
                    final File typesDir = new File(contentPack, "/" + typeToCheckFor.folderName + "/");
                    if (typesDir.exists()) {
                        for (final File file : typesDir.listFiles()) {
                            try (final BufferedReader reader = new BufferedReader(new FileReader(file))) {
                                final String[] splitName = file.getName().split("/");
                                final TypeFile typeFile = new TypeFile(typeToCheckFor, splitName[splitName.length - 1].split("\\.")[0], contentPack.getName());
                                while (true) {
                                    String line = null;
                                    try {
                                        line = reader.readLine();
                                    }
                                    catch (final Exception e) {
                                        break;
                                    }
                                    if (line == null) {
                                        break;
                                    }
                                    typeFile.lines.add(line);
                                }
                                reader.close();
                            }
                            catch (final FileNotFoundException e2) {
                                e2.printStackTrace();
                            }
                            catch (final IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                }
            }
            else {
                try (final ZipFile zip = new ZipFile(contentPack);
                     final ZipInputStream zipStream = new ZipInputStream(new FileInputStream(contentPack));
                     final BufferedReader reader2 = new BufferedReader(new InputStreamReader(zipStream))) {
                    ZipEntry zipEntry = zipStream.getNextEntry();
                    do {
                        zipEntry = zipStream.getNextEntry();
                        if (zipEntry == null) {
                            continue;
                        }
                        TypeFile typeFile2 = null;
                        for (final EnumType type : EnumType.values()) {
                            if (zipEntry.getName().startsWith(type.folderName + "/") && zipEntry.getName().split(type.folderName + "/").length > 1 && zipEntry.getName().split(type.folderName + "/")[1].length() > 0) {
                                final String[] splitName2 = zipEntry.getName().split("/");
                                typeFile2 = new TypeFile(type, splitName2[splitName2.length - 1].split("\\.")[0], contentPack.getName());
                            }
                        }
                        if (typeFile2 == null) {
                            continue;
                        }
                        while (true) {
                            String line2 = null;
                            try {
                                line2 = reader2.readLine();
                            }
                            catch (final Exception e4) {
                                break;
                            }
                            if (line2 == null) {
                                break;
                            }
                            typeFile2.lines.add(line2);
                        }
                    } while (zipEntry != null);
                    reader2.close();
                    zip.close();
                    zipStream.close();
                }
                catch (final IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }
    
    private void readContentPacks(final FMLPreInitializationEvent event) {
        final ClassLoader classloader = MinecraftServer.class.getClassLoader();
        Method method = null;
        try {
            method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            method.setAccessible(true);
        }
        catch (final Exception e) {
            log("Failed to get class loader. All content loading will now fail.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
        final List<File> contentPacks = FlansMod.proxy.getContentList(method, classloader);
        if (!event.getSide().equals((Object)Side.CLIENT)) {}
        getTypeFiles(contentPacks);
        for (final EnumType type : EnumType.values()) {
            final Class<? extends InfoType> typeClass = type.getTypeClass();
            for (final TypeFile typeFile : TypeFile.files.get(type)) {
                try {
                    final InfoType infoType = (InfoType)typeClass.getConstructor(TypeFile.class).newInstance(typeFile);
                    infoType.read(typeFile);
                    switch (type) {
                        case bullet: {
                            FlansMod.bulletItems.add((ItemBullet)new ItemBullet((BulletType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case attachment: {
                            FlansMod.attachmentItems.add((ItemAttachment)new ItemAttachment((AttachmentType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case gun: {
                            FlansMod.gunItems.add((ItemGun)new ItemGun((GunType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case grenade: {
                            FlansMod.grenadeItems.add((ItemGrenade)new ItemGrenade((GrenadeType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case part: {
                            FlansMod.partItems.add((ItemPart)new ItemPart((PartType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case plane: {
                            FlansMod.planeItems.add((ItemPlane)new ItemPlane((PlaneType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case vehicle: {
                            FlansMod.vehicleItems.add((ItemVehicle)new ItemVehicle((VehicleType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case aa: {
                            FlansMod.aaGunItems.add((ItemAAGun)new ItemAAGun((AAGunType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case mechaItem: {
                            FlansMod.mechaToolItems.add((ItemMechaAddon)new ItemMechaAddon((MechaItemType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case mecha: {
                            FlansMod.mechaItems.add((ItemMecha)new ItemMecha((MechaType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case tool: {
                            FlansMod.toolItems.add((ItemTool)new ItemTool((ToolType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case box: {
                            FlansMod.gunBoxBlocks.add((BlockGunBox)new BlockGunBox((GunBoxType)infoType).func_149663_c(infoType.shortName));
                            continue;
                        }
                        case armour: {
                            FlansMod.armourItems.add((ItemTeamArmour)new ItemTeamArmour((ArmourType)infoType).func_77655_b(infoType.shortName));
                            continue;
                        }
                        case armourBox: {
                            FlansMod.armourBoxBlocks.add((BlockArmourBox)new BlockArmourBox((ArmourBoxType)infoType).func_149663_c(infoType.shortName));
                            continue;
                        }
                        case playerClass: {
                            continue;
                        }
                        case team: {
                            continue;
                        }
                        default: {
                            log("Unrecognised type for " + infoType.shortName);
                            continue;
                        }
                    }
                }
                catch (final Exception e2) {
                    log("Failed to add " + type.name() + " : " + typeFile.name);
                    if (!FlansMod.printStackTrace) {
                        continue;
                    }
                    e2.printStackTrace();
                }
            }
            log("Loaded " + type.name() + ".");
        }
        Team.spectators = FlansMod.spectators;
    }
    
    public static PacketHandler getPacketHandler() {
        final FlansMod instance = FlansMod.INSTANCE;
        return FlansMod.packetHandler;
    }
    
    public static void syncConfig() {
        FlansMod.printDebugLog = FlansMod.configFile.getBoolean("Print Debug Log", "general", FlansMod.printDebugLog, "");
        FlansMod.printStackTrace = FlansMod.configFile.getBoolean("Print Stack Trace", "general", FlansMod.printStackTrace, "");
        FlansMod.addGunpowderRecipe = FlansMod.configFile.getBoolean("Gunpowder Recipe", "general", FlansMod.addGunpowderRecipe, "Whether or not to add the extra gunpowder recipe (3 charcoal + 1 lightstone)");
        FlansMod.addAllPaintjobsToCreative = FlansMod.configFile.getBoolean("Add All Paintjobs To Creative", "general", FlansMod.addAllPaintjobsToCreative, "Whether to list all available paintjobs in the Creative menu");
        FlansMod.armourSpawnRate = FlansMod.configFile.getInt("ArmourSpawnRate", "general", 20, 0, 100, "The rate of Zombie or Skeleton to spawn equipped with armor. [0=0%, 100=100%]");
        FlansMod.kickNonMatchingHashes = FlansMod.configFile.getBoolean("KickNonMatchingHashes", "Gameplay Settings (synced)", FlansMod.kickNonMatchingHashes, "Wether to kick clients connected to a dedicated server with non-identical packs.");
        FlansMod.showDistanceInKillMessage = FlansMod.configFile.getBoolean("ShowDistanceInKillMessage", "Gameplay Settings (synced)", FlansMod.showDistanceInKillMessage, "List distance between killer and killed in kill message.");
        FlansMod.noticeSpawnKillTime = FlansMod.configFile.getInt("NoticeSpawnKillTime", "general", 10, 0, 600, "Min(default=10)");
        FlansMod.gunCarryLimitEnable = FlansMod.configFile.getBoolean("gunCarryLimitEnable", "general", FlansMod.gunCarryLimitEnable, "Enable a soft limit to hotbar weapons, applies slowness++ when >= limit");
        FlansMod.gunCarryLimit = FlansMod.configFile.getInt("gunCarryLimit", "general", 3, 2, 9, "Set the soft carry limit for guns(2-9)");
        FlansMod.armsEnable = FlansMod.configFile.getBoolean("Enable Arms", "general", FlansMod.armsEnable, "Enable arms rendering default=true");
        FlansMod.casingEnable = FlansMod.configFile.getBoolean("Enable casings", "general", FlansMod.casingEnable, "Enable bullet casing ejections default=true");
        FlansMod.crosshairEnable = FlansMod.configFile.getBoolean("Enable crosshairs", "general", FlansMod.crosshairEnable, "Enable default crosshair default=false");
        FlansMod.bulletGuiEnable = FlansMod.configFile.getBoolean("Enable bullet HUD", "general", FlansMod.bulletGuiEnable, "Enable bullet gui default=true");
        FlansMod.hitCrossHairEnable = FlansMod.configFile.getBoolean("Enable hitmarkers", "general", FlansMod.hitCrossHairEnable, "");
        FlansMod.hdHitCrosshair = FlansMod.configFile.getBoolean("Enable HD hit marker", "general", FlansMod.hdHitCrosshair, "");
        FlansMod.driveableUpdateRange = FlansMod.configFile.getFloat("Driveable update range", "Gameplay Settings (synced)", FlansMod.driveableUpdateRange, 0.0f, 1000.0f, "Range in blocks for vehicles and planes to be updated.");
        for (int i = 0; i < FlansMod.hitCrossHairColor.length; ++i) {
            final String[] COLOR = { "Alpha", "Red", "Green", "Blue" };
            FlansMod.hitCrossHairColor[i] = FlansMod.configFile.getFloat("HitCrossHairColor" + COLOR[i], "general", FlansMod.hitCrossHairColor[i], 0.0f, 1.0f, "Hit cross hair color " + COLOR[i] + "(default=1.0)");
        }
        if (FlansMod.configFile.hasChanged()) {
            FlansMod.configFile.save();
        }
    }
    
    public static void syncConfig(final Side side) {
        FlansMod.printDebugLog = FlansMod.configFile.getBoolean("Print Debug Log", "general", FlansMod.printDebugLog, "");
        FlansMod.printStackTrace = FlansMod.configFile.getBoolean("Print Stack Trace", "general", FlansMod.printStackTrace, "");
        FlansMod.addGunpowderRecipe = FlansMod.configFile.getBoolean("Gunpowder Recipe", "general", FlansMod.addGunpowderRecipe, "Whether or not to add the extra gunpowder recipe (3 charcoal + 1 lightstone)");
        FlansMod.addAllPaintjobsToCreative = FlansMod.configFile.getBoolean("Add All Paintjobs To Creative", "general", FlansMod.addAllPaintjobsToCreative, "Whether to list all available paintjobs in the Creative menu");
        FlansMod.armourSpawnRate = FlansMod.configFile.getInt("ArmourSpawnRate", "general", 20, 0, 100, "The rate of Zombie or Skeleton to spawn equipped with armor. [0=0%, 100=100%]");
        FlansMod.kickNonMatchingHashes = FlansMod.configFile.getBoolean("KickNonMatchingHashes", "Gameplay Settings (synced)", FlansMod.kickNonMatchingHashes, "Wether to kick clients connected to a dedicated server with non-identical packs.");
        FlansMod.showDistanceInKillMessage = FlansMod.configFile.getBoolean("ShowDistanceInKillMessage", "Gameplay Settings (synced)", FlansMod.showDistanceInKillMessage, "List distance between killer and killed in kill message.");
        FlansMod.noticeSpawnKillTime = FlansMod.configFile.getInt("NoticeSpawnKillTime", "general", 10, 0, 600, "Min(default=10)");
        FlansMod.gunCarryLimitEnable = FlansMod.configFile.getBoolean("gunCarryLimitEnable", "general", FlansMod.gunCarryLimitEnable, "Enable a soft limit to hotbar weapons, applies slowness++ when >= limit");
        FlansMod.gunCarryLimit = FlansMod.configFile.getInt("gunCarryLimit", "general", 3, 2, 9, "Set the soft carry limit for guns(2-9)");
        FlansMod.driveableUpdateRange = FlansMod.configFile.getFloat("Driveable update range", "Gameplay Settings (synced)", FlansMod.driveableUpdateRange, 0.0f, 1000.0f, "Range in blocks for vehicles and planes to be updated.");
        FlansMod.armsEnable = FlansMod.configFile.getBoolean("Enable Arms", "general", FlansMod.armsEnable, "Enable arms rendering default=true");
        FlansMod.casingEnable = FlansMod.configFile.getBoolean("Enable casings", "general", FlansMod.casingEnable, "Enable bullet casing ejections default=true");
        FlansMod.crosshairEnable = FlansMod.configFile.getBoolean("Enable crosshairs", "general", FlansMod.crosshairEnable, "Enable default crosshair default=false");
        FlansMod.bulletGuiEnable = FlansMod.configFile.getBoolean("Enable bullet HUD", "general", FlansMod.bulletGuiEnable, "Enable bullet gui default=true");
        FlansMod.hitCrossHairEnable = FlansMod.configFile.getBoolean("Enable hitmarkers", "general", FlansMod.hitCrossHairEnable, "");
        FlansMod.hdHitCrosshair = FlansMod.configFile.getBoolean("Enable HD hit marker", "general", FlansMod.hdHitCrosshair, "");
        for (int i = 0; i < FlansMod.hitCrossHairColor.length; ++i) {
            final String[] COLOR = { "Alpha", "Red", "Green", "Blue" };
            FlansMod.hitCrossHairColor[i] = FlansMod.configFile.getFloat("HitCrossHairColor" + COLOR[i], "general", FlansMod.hitCrossHairColor[i], 0.0f, 1.0f, "Hit cross hair color " + COLOR[i] + "(default=1.0)");
        }
        if (side.isClient()) {
            final String aimTypeInput = FlansMod.configFile.getString("Aim Type", "Settings", "toggle", "The type of aiming that you want to use 'toggle' or 'hold'");
            final AimType aimType = AimType.fromString(aimTypeInput);
            if (aimType != null) {
                FlansModClient.aimType = aimType;
            }
            else {
                log(String.format("The aim type '%s' does not exist.", aimTypeInput));
                FlansModClient.aimType = AimType.TOGGLE;
            }
            final String aimButtonInput = FlansMod.configFile.getString("Aim Button", "Settings", "left", "The mouse button used to aim a gun 'left' or 'right'");
            final FlanMouseButton aimButtonType = FlanMouseButton.fromString(aimButtonInput);
            if (aimButtonType != null) {
                FlansModClient.aimButton = aimButtonType;
            }
            else {
                log(String.format("The aim button type '%s' does not exist.", aimTypeInput));
                FlansModClient.aimButton = FlanMouseButton.LEFT;
            }
            final String shootButtonInput = FlansMod.configFile.getString("Fire Button", "Settings", "right", "The mouse button used to fire a gun 'left' or 'right'");
            final FlanMouseButton shootButtonType = FlanMouseButton.fromString(shootButtonInput);
            if (shootButtonType != null) {
                FlansModClient.fireButton = shootButtonType;
            }
            else {
                log(String.format("The fire button type '%s' does not exist.", aimTypeInput));
                FlansModClient.fireButton = FlanMouseButton.RIGHT;
            }
        }
        if (FlansMod.configFile.hasChanged()) {
            FlansMod.configFile.save();
        }
    }
    
    public static void updateBltssConfig(final int min, final int divisor) {
        final ConfigCategory category = FlansMod.configFile.getCategory("general");
        if (category == null) {
            return;
        }
        if (category.containsKey("BltSS_Min")) {
            category.get("BltSS_Min").set(min);
        }
        if (category.containsKey("BltSS_Divisor")) {
            category.get("BltSS_Divisor").set(divisor);
        }
        FlansMod.configFile.save();
    }
    
    public static void log(final String string) {
        if (FlansMod.printDebugLog) {
            System.out.println("[Flan's Mod] " + string);
        }
    }
    
    public static void log(final String format, final Object... args) {
        log(String.format(format, args));
    }
    
    static {
        FlansMod.DEBUG = false;
        FlansMod.generalConfigInteger = 32;
        FlansMod.generalConfigString = "Hello!";
        FlansMod.printDebugLog = true;
        FlansMod.printStackTrace = false;
        FlansMod.noticeSpawnKillTime = 10;
        FlansMod.gunCarryLimitEnable = false;
        FlansMod.gunCarryLimit = 3;
        FlansMod.armorDurability = 1;
        FlansMod.armsEnable = true;
        FlansMod.casingEnable = true;
        FlansMod.crosshairEnable = false;
        FlansMod.hitCrossHairEnable = true;
        FlansMod.hdHitCrosshair = false;
        FlansMod.bulletGuiEnable = true;
        FlansMod.hitCrossHairColor = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        FlansMod.addGunpowderRecipe = true;
        FlansMod.addAllPaintjobsToCreative = true;
        FlansMod.teamsConfigInteger = 32;
        FlansMod.teamsConfigString = "Hello!";
        FlansMod.teamsConfigBoolean = false;
        FlansMod.ticker = 0;
        FlansMod.driveableUpdateRange = 450.0f;
        FlansMod.kickNonMatchingHashes = true;
        FlansMod.showDistanceInKillMessage = true;
        FlansMod.armourSpawnRate = 20;
        FlansMod.spectators = new Team("spectators", "Spectators", 4210752, '7');
        packetHandler = new PacketHandler();
        playerHandler = new PlayerHandler();
        teamsManager = new TeamsManager();
        tickHandler = new CommonTickHandler();
        FlansMod.hooks = new FlansHooks();
        FlansMod.isInFlash = false;
        FlansMod.flashTime = 10;
        FlansMod.gunBoxBlocks = new ArrayList<BlockGunBox>();
        FlansMod.bulletItems = new ArrayList<ItemBullet>();
        FlansMod.gunItems = new ArrayList<ItemGun>();
        FlansMod.attachmentItems = new ArrayList<ItemAttachment>();
        FlansMod.partItems = new ArrayList<ItemPart>();
        FlansMod.planeItems = new ArrayList<ItemPlane>();
        FlansMod.vehicleItems = new ArrayList<ItemVehicle>();
        FlansMod.mechaToolItems = new ArrayList<ItemMechaAddon>();
        FlansMod.mechaItems = new ArrayList<ItemMecha>();
        FlansMod.aaGunItems = new ArrayList<ItemAAGun>();
        FlansMod.grenadeItems = new ArrayList<ItemGrenade>();
        FlansMod.toolItems = new ArrayList<ItemTool>();
        FlansMod.armourItems = new ArrayList<ItemTeamArmour>();
        FlansMod.armourBoxBlocks = new ArrayList<BlockArmourBox>();
        FlansMod.tabFlanGuns = new CreativeTabFlan(0);
        FlansMod.tabFlanDriveables = new CreativeTabFlan(1);
        FlansMod.tabFlanParts = new CreativeTabFlan(2);
        FlansMod.tabFlanTeams = new CreativeTabFlan(3);
        FlansMod.tabFlanMechas = new CreativeTabFlan(4);
        FlansMod.gunAnimationsRight = new HashMap<EntityLivingBase, GunAnimations>();
        FlansMod.gunAnimationsLeft = new HashMap<EntityLivingBase, GunAnimations>();
        FlansMod.debugMode = true;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.collect.Multimap;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.flansmod.common.paintjob.Paintjob;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import com.flansmod.common.network.PacketGunRecoil;
import com.flansmod.common.network.PacketFlak;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import net.minecraft.util.DamageSource;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import net.minecraft.util.Vec3;
import com.flansmod.common.teams.Team;
import com.flansmod.common.guns.raytracing.BulletHit;
import java.util.ArrayList;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.network.PacketSelectOffHandGun;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.PlayerData;
import com.flansmod.common.network.PacketGunState;
import com.flansmod.client.AimType;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.network.PacketGunFire;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketGunSpread;
import com.flansmod.client.FlansModClient;
import cpw.mods.fml.client.FMLClientHandler;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import java.util.Iterator;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.settings.GameSettings;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.client.Minecraft;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.types.InfoType;
import net.minecraft.util.IIcon;
import java.util.Random;
import com.flansmod.common.paintjob.IPaintableItem;
import net.minecraft.item.Item;

public class ItemGun extends Item implements IPaintableItem
{
    public static Random rand;
    public GunType type;
    public static boolean rightMouseHeld;
    private static boolean lastRightMouseHeld;
    private static boolean leftMouseHeld;
    private static boolean lastLeftMouseHeld;
    public static boolean DHeld;
    private static boolean lastDHeld;
    public static boolean AHeld;
    private static boolean lastAHeld;
    public static boolean WHeld;
    private static boolean lastWHeld;
    public boolean blocking;
    public boolean leftBlock;
    public boolean rightBlock;
    public boolean topBlock;
    public boolean bottomBlock;
    public static boolean crouching;
    public static boolean sprinting;
    public static boolean cringedBlockingCheckerClient;
    public static boolean mounted;
    public static boolean shooting;
    public int soundDelay;
    public int lockOnSoundDelay;
    public static boolean sliceCrossHair;
    public int impactX;
    public int impactY;
    public int impactZ;
    public int fullHands;
    public float bulletDamageInfo;
    public float pouchMultiplier;
    public boolean madeAmmo;
    public IIcon[] icons;
    public IIcon defaultIcon;
    private int poopenfarden;
    boolean canClick;
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    public PaintableType GetPaintableType() {
        return this.type;
    }
    
    public ItemGun(final GunType gun) {
        this.blocking = false;
        this.leftBlock = true;
        this.rightBlock = false;
        this.topBlock = false;
        this.bottomBlock = false;
        this.impactX = 0;
        this.impactY = 0;
        this.impactZ = 0;
        this.fullHands = 0;
        this.bulletDamageInfo = 0.0f;
        this.pouchMultiplier = 1.0f;
        this.madeAmmo = false;
        this.poopenfarden = 1;
        this.canClick = true;
        this.maxStackSize = 1;
        this.type = gun;
        ((ItemGun)(this.type.item = this)).setHasSubtypes(true);
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanGuns);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public boolean getShareTag() {
        return true;
    }
    
    public ItemStack getBulletItemStack(final ItemStack gun, final int id) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
            return null;
        }
        String s;
        if (this.type.getSecondaryFire(gun)) {
            s = "secondaryAmmo";
        }
        else {
            s = "ammo";
        }
        if (!gun.stackTagCompound.hasKey(s)) {
            final NBTTagList ammoTagsList = new NBTTagList();
            for (int i = 0; i < this.type.getNumAmmoItemsInGun(gun); ++i) {
                ammoTagsList.appendTag((NBTBase)new NBTTagCompound());
            }
            gun.stackTagCompound.setTag(s, (NBTBase)ammoTagsList);
            return null;
        }
        final NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, 10);
        final NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
        try {
            return ItemStack.loadItemStackFromNBT(ammoTags);
        }
        catch (final Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void setBulletItemStack(final ItemStack gun, final ItemStack bullet, final int id) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        String s;
        if (this.type.getSecondaryFire(gun)) {
            s = "secondaryAmmo";
        }
        else {
            s = "ammo";
        }
        if (!gun.stackTagCompound.hasKey(s)) {
            final NBTTagList ammoTagsList = new NBTTagList();
            for (int i = 0; i < this.type.getNumAmmoItemsInGun(gun); ++i) {
                ammoTagsList.appendTag((NBTBase)new NBTTagCompound());
            }
            gun.stackTagCompound.setTag(s, (NBTBase)ammoTagsList);
        }
        final NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, 10);
        NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
        ammoTags = ((bullet == null) ? new NBTTagCompound() : bullet.writeToNBT(new NBTTagCompound()));
        final NBTTagList newTagList = new NBTTagList();
        for (int j = 0; j < ammoTagsList.tagCount(); ++j) {
            newTagList.appendTag((NBTBase)((j == id) ? ammoTags : ammoTagsList.getCompoundTagAt(j)));
        }
        gun.stackTagCompound.setTag(s, (NBTBase)newTagList);
    }
    
    public void addInformation(final ItemStack stack, final EntityPlayer player, final List lines, final boolean advancedTooltips) {
        final KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;
        if (!this.type.getPaintjob(stack.getMetadata()).displayName.equals("default")) {
            lines.add("§b§o" + this.type.getPaintjob(stack.getMetadata()).displayName);
        }
        if (this.type.swordArmorPen > 10.0f) {
            lines.add("§2+Body Armor Penetration: " + this.type.swordArmorPen);
        }
        if (this.type.shieldDamageAbsorption > 0.1f) {
            lines.add("§2+Shield Protection: " + this.type.shieldDamageAbsorption);
        }
        if (!this.type.packName.isEmpty()) {
            lines.add("§o" + this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        if (!GameSettings.isKeyDown(shift)) {
            for (int i = 0; i < this.type.getNumAmmoItemsInGun(stack); ++i) {
                final ItemStack bulletStack = this.getBulletItemStack(stack, i);
                if (bulletStack != null && bulletStack.getItem() instanceof ItemBullet) {
                    final BulletType bulletType = ((ItemBullet)bulletStack.getItem()).type;
                    final String line = bulletType.name + " " + (bulletStack.getMaxDurability() - bulletStack.getMetadata()) + "/" + bulletStack.getMaxDurability();
                    lines.add(line);
                }
            }
            lines.add("Hold §b§o" + GameSettings.getKeyDisplayString(shift.getKeyCode()) + "§r§7 for details");
        }
        else {
            lines.add("");
            final AttachmentType barrel = this.type.getBarrel(stack);
            if (barrel != null && barrel.silencer) {
                lines.add("§e[Suppressed]");
            }
            if (this.type.getSecondaryFire(stack)) {
                lines.add("§e[Underbarrel]");
            }
            if (this.bulletDamageInfo != 0.0f) {
                lines.add("§9Damage§7: " + this.bulletDamageInfo);
            }
            lines.add("§9Recoil§7: " + roundFloat(this.type.getRecoilPitch(stack), 2));
            lines.add("§9Accuracy§7: " + roundFloat(this.type.getSpread(stack, false, false), 2));
            lines.add("§9Reload Time§7: " + roundFloat(this.type.getReloadTime(stack) / 20.0f, 2) + "s");
            lines.add("§9Rounds per Minute§7: " + roundFloat(1200.0f / this.type.shootDelay, 2));
            lines.add("§9Mode§7: §f" + this.type.getFireMode(stack).toString().toLowerCase());
            lines.add("");
            lines.add("§eAttachments");
            boolean empty = true;
            for (final AttachmentType attachment : this.type.getCurrentAttachments(stack)) {
                final String line2 = attachment.name;
                lines.add(line2);
                if (line2 != null) {
                    empty = false;
                }
            }
            if (empty) {
                lines.add("None");
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void onUpdateClient(final ItemStack itemstack, final World world, final Entity entity, final int i, final boolean flag) {
        Label_2136: {
            if (entity instanceof EntityPlayer && ((EntityPlayer)entity).inventory.getCurrentItem() == itemstack) {
                final Minecraft mc = Minecraft.getMinecraft();
                final EntityPlayer player = (EntityPlayer)entity;
                final PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);
                if (this.soundDelay <= 0 && this.type.idleSound != null) {
                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, this.type.idleSoundRange, entity.dimension, this.type.idleSound, false);
                    this.soundDelay = this.type.idleSoundLength;
                }
                ItemGun.crouching = player.isSneaking();
                ItemGun.mounted = player.isRiding();
                if (this.type.deployable) {
                    return;
                }
                final GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
                if (FMLClientHandler.instance().getClient().currentScreen != null) {
                    if (FlansModClient.currentScope != null) {
                        FlansModClient.currentScope = null;
                        gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                        gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
                        gameSettings.fovSetting = FlansModClient.originalFOV;
                        FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, this.type.getDefaultSpread(itemstack)));
                    }
                }
                else if (!TeamsManager.violence) {
                    if (mc.objectMouseOver != null) {
                        if (mc.objectMouseOver.entityHit instanceof EntityFlagpole || mc.objectMouseOver.entityHit instanceof EntityFlag || mc.objectMouseOver.entityHit instanceof EntityGunItem) {
                            break Label_2136;
                        }
                        if (mc.objectMouseOver.entityHit instanceof EntityGrenade && ((EntityGrenade)mc.objectMouseOver.entityHit).type.isDeployableBag) {
                            break Label_2136;
                        }
                    }
                    ItemGun.lastRightMouseHeld = ItemGun.rightMouseHeld;
                    ItemGun.lastLeftMouseHeld = ItemGun.leftMouseHeld;
                    ItemGun.rightMouseHeld = Mouse.isButtonDown(FlansModClient.fireButton.getButton());
                    ItemGun.leftMouseHeld = Mouse.isButtonDown(FlansModClient.aimButton.getButton());
                    ItemGun.lastAHeld = ItemGun.AHeld;
                    ItemGun.lastWHeld = ItemGun.WHeld;
                    ItemGun.lastDHeld = ItemGun.DHeld;
                    ItemGun.AHeld = GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindLeft);
                    ItemGun.WHeld = GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindForward);
                    ItemGun.DHeld = GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindRight);
                    boolean offHandFull = false;
                    if (this.type.oneHanded && FlansModClient.vehicleEngineRevs == PlayerHandler.enginePower) {
                        if (data.offHandGunSlot == player.inventory.currentItem + 1) {
                            data.offHandGunSlot = 0;
                        }
                        final int dWheel = Mouse.getDWheel();
                        if (Keyboard.isKeyDown(mc.gameSettings.keyBindSneak.getKeyCode()) && dWheel != 0) {
                            data.cycleOffHandItem(player, dWheel);
                        }
                        if (data.offHandGunSlot == 0) {
                            this.fullHands = 0;
                        }
                        if (data.offHandGunSlot != 0) {
                            offHandFull = true;
                            this.fullHands = 1;
                            final ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                            if (offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun) {
                                final GunType offHandGunType = ((ItemGun)offHandGunStack.getItem()).type;
                                if (offHandGunType.usableByPlayers) {
                                    if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0) {
                                        if (this.clientSideShoot(player, offHandGunStack, offHandGunType, true)) {
                                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, (ItemStack)null);
                                        }
                                    }
                                    else {
                                        if (ItemGun.leftMouseHeld && !ItemGun.lastLeftMouseHeld && !this.type.shootMelee) {
                                            FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, true, player.rotationYaw, player.rotationPitch));
                                            if (this.clientSideShoot(player, offHandGunStack, offHandGunType, true)) {
                                                player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, (ItemStack)null);
                                                if ((ItemGun.rightMouseHeld && !ItemGun.lastRightMouseHeld && !this.type.shootMelee) || !ItemGun.leftMouseHeld || ItemGun.lastLeftMouseHeld || !this.type.shootMelee || data.isBlockingLeft <= 0) {}
                                            }
                                        }
                                        if ((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && !ItemGun.leftMouseHeld && ItemGun.lastLeftMouseHeld) {
                                            FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, false, player.rotationYaw, player.rotationPitch));
                                        }
                                        if ((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && ItemGun.leftMouseHeld && this.clientSideShoot(player, offHandGunStack, offHandGunType, true)) {
                                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, (ItemStack)null);
                                        }
                                    }
                                }
                            }
                            else {
                                data.offHandGunSlot = 0;
                            }
                        }
                    }
                    if (this.type.usableByPlayers && FlansModClient.vehicleEngineRevs == PlayerHandler.enginePower && this.poopenfarden == 1) {
                        if (this.type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0) {
                            if (this.clientSideShoot(player, itemstack, this.type, false)) {
                                player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                            }
                        }
                        else {
                            if ((ItemGun.rightMouseHeld && !ItemGun.lastRightMouseHeld && !this.type.shootMelee) || (ItemGun.leftMouseHeld && !ItemGun.lastLeftMouseHeld && this.type.shootMelee && data.isBlockingLeft <= 0)) {
                                if (this.type.shootMelee && this.type.meleeLeft && ItemGun.AHeld && data.stabTimeLeft <= 0.0f && data.isBlockingLeft <= 0) {
                                    if (player.worldObj.isRemote) {
                                        final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                                        animations.doMeleeLeft(this.type.meleeLeftTime);
                                    }
                                }
                                else if (this.type.shootMelee && this.type.meleeRight && ItemGun.DHeld && data.stabTimeLeft <= 0.0f && data.isBlockingLeft <= 0) {
                                    if (player.worldObj.isRemote) {
                                        final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                                        animations.doMeleeRight(this.type.meleeRightTime);
                                    }
                                }
                                else if (this.type.shootMelee && this.type.meleeDown && ItemGun.WHeld && data.stabTimeLeft <= 0.0f && data.isBlockingLeft <= 0) {
                                    if (player.worldObj.isRemote) {
                                        final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                                        animations.doMeleeDown(this.type.meleeDownTime);
                                    }
                                }
                                else if (this.type.shootMelee && data.stabTimeLeft <= 0.0f && data.isBlockingLeft <= 0 && player.worldObj.isRemote) {
                                    final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                                    animations.doMelee(this.type.meleeTime);
                                }
                                FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, true, player.rotationYaw, player.rotationPitch));
                                if (this.clientSideShoot(player, itemstack, this.type, false)) {
                                    player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                                }
                            }
                            if ((this.type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || this.type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && !ItemGun.rightMouseHeld && ItemGun.lastRightMouseHeld) {
                                FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, false, player.rotationYaw, player.rotationPitch));
                            }
                            if ((this.type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || this.type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && ItemGun.rightMouseHeld && this.clientSideShoot(player, itemstack, this.type, false)) {
                                player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                            }
                        }
                    }
                    final IScope currentScope = this.type.getCurrentScope(itemstack);
                    if (FlansModClient.aimType == AimType.TOGGLE) {
                        if (!offHandFull && (this.type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || this.type.secondaryFunction == EnumSecondaryFunction.ZOOM) && Mouse.isButtonDown(FlansModClient.aimButton.getButton()) && !this.type.shootMelee && FlansModClient.scopeTime <= 0 && FMLClientHandler.instance().getClient().currentScreen == null) {
                            if (FlansModClient.currentScope == null) {
                                FlansModClient.currentScope = currentScope;
                                FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
                                FlansModClient.lastFOVZoomLevel = currentScope.getFOVFactor();
                                final float f = FlansModClient.originalMouseSensitivity = gameSettings.mouseSensitivity;
                                gameSettings.mouseSensitivity = f / (float)Math.sqrt(currentScope.getZoomFactor());
                                FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
                                gameSettings.thirdPersonView = 0;
                                if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 1.0E-4f) {
                                    FlansModClient.originalFOV = gameSettings.fovSetting;
                                }
                                this.sendSpreadToServer(itemstack, player.isSneaking(), player.isSprinting());
                                FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));
                            }
                            else {
                                FlansModClient.currentScope = null;
                                gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                                gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
                                if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 1.0E-4f) {
                                    gameSettings.fovSetting = FlansModClient.originalFOV;
                                }
                                FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, this.type.getDefaultSpread(itemstack)));
                                FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));
                            }
                            FlansModClient.scopeTime = 10;
                        }
                    }
                    else if (!offHandFull && (this.type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || this.type.secondaryFunction == EnumSecondaryFunction.ZOOM) && Mouse.isButtonDown(FlansModClient.aimButton.getButton()) && FMLClientHandler.instance().getClient().currentScreen == null) {
                        if (FlansModClient.currentScope == null) {
                            FlansModClient.currentScope = currentScope;
                            FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
                            FlansModClient.lastFOVZoomLevel = currentScope.getFOVFactor();
                            final float f = FlansModClient.originalMouseSensitivity = gameSettings.mouseSensitivity;
                            gameSettings.mouseSensitivity = f / (float)Math.sqrt(currentScope.getZoomFactor());
                            FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
                            gameSettings.thirdPersonView = 0;
                            if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 1.0E-4f) {
                                FlansModClient.originalFOV = gameSettings.fovSetting;
                            }
                            this.sendSpreadToServer(itemstack, player.isSneaking(), player.isSprinting());
                            FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));
                        }
                        FlansModClient.scopeTime = 10;
                    }
                    else if (!Mouse.isButtonDown(FlansModClient.aimButton.getButton()) && FlansModClient.currentScope != null) {
                        FlansModClient.currentScope = null;
                        gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                        gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
                        gameSettings.fovSetting = FlansModClient.originalFOV;
                        FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, this.type.getDefaultSpread(itemstack)));
                        FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));
                    }
                }
            }
        }
        if (this.soundDelay > 0) {
            --this.soundDelay;
        }
    }
    
    public void sendSpreadToServer(final ItemStack stack, final boolean sneaking, final boolean sprinting) {
        final float f = (this.type.numBullets == 1) ? 0.2f : 0.8f;
        FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(stack, this.type.getSpread(stack, sneaking, sprinting) * f));
    }
    
    public boolean clientSideShoot(final EntityPlayer player, final ItemStack stack, final GunType gunType, final boolean left) {
        final PlayerData data = PlayerHandler.getPlayerData(player);
        if (this.type.meleeSound != null) {
            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeSound, true);
        }
        if (this.type.secondaryFunctionWhenShoot != null) {
            if (this.type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && this.type.meleeLeft && ItemGun.AHeld && !this.type.shootMelee) {
                if (player.worldObj.isRemote && data.isBlockingLeft <= 0) {
                    final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                    animations.doMeleeLeft(this.type.meleeLeftTime);
                }
                if (player instanceof EntityPlayer && !this.type.shootMelee) {
                    final PlayerData whenshootdata = PlayerHandler.getPlayerData(player);
                    data.doMeleeLeft(player, this.type.meleeLeftTime, this.type);
                }
            }
            else if (this.type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && this.type.meleeRight && ItemGun.DHeld && !this.type.shootMelee) {
                if (player.worldObj.isRemote && data.isBlockingLeft <= 0) {
                    final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                    animations.doMeleeRight(this.type.meleeRightTime);
                }
                if (player instanceof EntityPlayer && !this.type.shootMelee) {
                    final PlayerData whenshootdata = PlayerHandler.getPlayerData(player);
                    data.doMeleeRight(player, this.type.meleeRightTime, this.type);
                }
            }
            else if (this.type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && this.type.meleeDown && ItemGun.WHeld && !this.type.shootMelee) {
                if (player.worldObj.isRemote && data.isBlockingLeft <= 0) {
                    final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                    animations.doMeleeDown(this.type.meleeDownTime);
                }
                if (player instanceof EntityPlayer && !this.type.shootMelee) {
                    final PlayerData whenshootdata = PlayerHandler.getPlayerData(player);
                    data.doMeleeDown(player, this.type.meleeDownTime, this.type);
                }
            }
            else if (this.type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && !this.type.shootMelee) {
                if (player.worldObj.isRemote && data.isBlockingLeft <= 0) {
                    final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)player, false);
                    animations.doMelee(this.type.meleeTime);
                }
                if (player instanceof EntityPlayer && !this.type.shootMelee) {
                    final PlayerData whenshootdata = PlayerHandler.getPlayerData(player);
                    data.doMelee(player, this.type.meleeTime, this.type);
                }
            }
        }
        if ((FlansModClient.shootTime(left) <= 0.0f && ItemGun.sprinting && FlansModClient.zoomProgress > 0.5f) || (FlansModClient.shootTime(left) <= 0.0f && !ItemGun.sprinting)) {
            boolean onLastBullet = false;
            boolean hasAmmo = false;
            for (int i = 0; i < gunType.getNumAmmoItemsInGun(stack); ++i) {
                final ItemStack bulletStack = this.getBulletItemStack(stack, i);
                if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getMetadata() < bulletStack.getMaxDurability()) {
                    if (bulletStack.getMaxDurability() - bulletStack.getMetadata() == 1 && gunType.model.slideLockOnEmpty) {
                        onLastBullet = true;
                    }
                    hasAmmo = true;
                    break;
                }
            }
            if (hasAmmo) {
                final AttachmentType barrel = gunType.getBarrel(stack);
                final AttachmentType grip = gunType.getGrip(stack);
                final boolean silenced = barrel != null && barrel.silencer && !gunType.getSecondaryFire(stack);
                GunAnimations animations2 = null;
                if (left) {
                    if (FlansModClient.gunAnimationsLeft.containsKey(player)) {
                        animations2 = FlansModClient.gunAnimationsLeft.get(player);
                    }
                    else {
                        animations2 = new GunAnimations();
                        FlansModClient.gunAnimationsLeft.put((EntityLivingBase)player, animations2);
                    }
                }
                else if (FlansModClient.gunAnimationsRight.containsKey(player)) {
                    animations2 = FlansModClient.gunAnimationsRight.get(player);
                }
                else {
                    animations2 = new GunAnimations();
                    FlansModClient.gunAnimationsRight.put((EntityLivingBase)player, animations2);
                }
                final int pumpDelay = (gunType.model == null) ? 0 : gunType.model.pumpDelay;
                final int pumpTime = (gunType.model == null) ? 1 : gunType.model.pumpTime;
                final int hammerDelay = (gunType.model == null) ? 0 : gunType.model.hammerDelay;
                final int casingDelay = (gunType.model == null) ? 0 : gunType.model.casingDelay;
                final float hammerAngle = (gunType.model == null) ? 0.0f : gunType.model.hammerAngle;
                final float althammerAngle = (gunType.model == null) ? 0.0f : gunType.model.althammerAngle;
                animations2.onGunEmpty(onLastBullet);
                animations2.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay);
                if (FlansModClient.screenShake > -100) {
                    FlansModClient.screenShake -= 5;
                }
                if (left) {
                    if (!this.type.shootMelee) {
                        FlansModClient.shootTimeLeft = gunType.getShootDelay(stack);
                    }
                    if (this.type.shootMelee) {
                        FlansModClient.shootTimeLeft = gunType.getShootDelay(stack);
                    }
                }
                else {
                    if (!this.type.shootMelee) {
                        FlansModClient.shootTimeRight = gunType.getShootDelay(stack);
                    }
                    if (this.type.shootMelee) {
                        FlansModClient.shootTimeRight = gunType.getShootDelay(stack);
                    }
                }
            }
            if (gunType.getFireMode(stack) == EnumFireMode.BURST) {
                if (left) {
                    if (data.burstRoundsRemainingLeft > 0) {
                        final PlayerData playerData = data;
                        --playerData.burstRoundsRemainingLeft;
                    }
                    else {
                        data.burstRoundsRemainingLeft = gunType.numBurstRounds;
                    }
                }
                else if (data.burstRoundsRemainingRight > 0) {
                    final PlayerData playerData2 = data;
                    --playerData2.burstRoundsRemainingRight;
                }
                else {
                    data.burstRoundsRemainingRight = gunType.numBurstRounds;
                }
            }
        }
        return false;
    }
    
    public void onUpdateServer(final ItemStack itemstack, final World world, final Entity entity, final int i, final boolean flag) {
        if (itemstack.getTagCompound() == null) {
            final GunType gunType = this.type;
            final NBTTagCompound tags = new NBTTagCompound();
            tags.setString("Paint", gunType.defaultPaintjob.iconName);
            final NBTTagList ammoTagsList = new NBTTagList();
            for (int j = 0; j < gunType.getNumAmmoItemsInGun(itemstack); ++j) {
                ammoTagsList.appendTag((NBTBase)new NBTTagCompound());
            }
            tags.setTag("ammo", (NBTBase)ammoTagsList);
            itemstack.stackTagCompound = tags;
        }
        if (entity instanceof EntityPlayerMP) {
            final EntityPlayerMP player = (EntityPlayerMP)entity;
            final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)player);
            if (data == null) {
                return;
            }
            if (player.inventory.getCurrentItem() != itemstack) {
                if (player.inventory.getCurrentItem() == null || player.inventory.getCurrentItem().getItem() == null || !(player.inventory.getCurrentItem().getItem() instanceof ItemGun)) {
                    final PlayerData playerData = data;
                    final PlayerData playerData2 = data;
                    final boolean b = false;
                    playerData2.isShootingLeft = b;
                    playerData.isShootingRight = b;
                    data.offHandGunSlot = 0;
                    new PacketSelectOffHandGun(0).handleServerSide(player);
                }
                return;
            }
            if (this.type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0) {
                player.inventory.setInventorySlotContents(player.inventory.currentItem, this.tryToShoot(itemstack, this.type, world, player, false));
            }
            if (data.isShootingRight) {
                if (this.type.getFireMode(itemstack) == EnumFireMode.FULLAUTO && !this.type.labigunDelay) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, this.tryToShoot(itemstack, this.type, world, player, false));
                }
                if (this.type.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1f && !data.reloadingRight) {
                    data.loopedSoundDelay = (data.shouldPlayWarmupSound ? this.type.warmupSoundLength : this.type.loopedSoundLength);
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 50.0, player.dimension, data.shouldPlayWarmupSound ? this.type.warmupSound : this.type.loopedSound, false);
                    data.shouldPlayWarmupSound = false;
                }
                if ((this.type.getFireMode(itemstack) == EnumFireMode.MINIGUN || this.type.labigunDelay) && (data.minigunSpeed == 0 || data.minigunSpeed == -1 || data.minigunSpeed == -2)) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, this.tryToShoot(itemstack, this.type, world, player, false));
                }
            }
            else if (this.type.useLoopingSounds && data.shouldPlayCooldownSound) {
                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 50.0, player.dimension, this.type.cooldownSound, false);
                data.shouldPlayCooldownSound = false;
            }
            if (this.type.oneHanded && data.offHandGunSlot != 0) {
                final ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                if (offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun) {
                    final GunType offHandGunType = ((ItemGun)offHandGunStack.getItem()).type;
                    if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0) {
                        player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, this.tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                    }
                    if (data.isShootingLeft) {
                        if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO && !this.type.labigunDelay) {
                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, this.tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                        }
                        if (offHandGunType.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1f && !data.reloadingLeft) {
                            data.loopedSoundDelay = (data.shouldPlayWarmupSound ? offHandGunType.warmupSoundLength : offHandGunType.loopedSoundLength);
                            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 50.0, player.dimension, data.shouldPlayWarmupSound ? offHandGunType.warmupSound : offHandGunType.loopedSound, false);
                            data.shouldPlayWarmupSound = false;
                        }
                        if ((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN || this.type.labigunDelay) && data.minigunSpeed > offHandGunType.minigunStartSpeed) {
                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, this.tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                        }
                    }
                    else if (offHandGunType.useLoopingSounds && data.shouldPlayCooldownSound) {
                        PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 50.0, player.dimension, offHandGunType.cooldownSound, false);
                        data.shouldPlayCooldownSound = false;
                    }
                }
            }
        }
    }
    
    public void onUpdate(final ItemStack itemstack, final World world, final Entity pEnt, final int i, final boolean flag) {
        if (world.isRemote) {
            this.onUpdateClient(itemstack, world, pEnt, i, flag);
        }
        else {
            this.onUpdateServer(itemstack, world, pEnt, i, flag);
        }
        if (pEnt instanceof EntityPlayer) {
            final EntityPlayer player = (EntityPlayer)pEnt;
            final PlayerData data = PlayerHandler.getPlayerData(player);
            if (data == null) {
                return;
            }
            for (int n = 0; n < 5; ++n) {
                final ItemStack stacko = player.getEquipmentInSlot(n);
                if (stacko != null && stacko.getItem() instanceof ItemTeamArmour) {
                    if (((ItemTeamArmour)stacko.getItem()).type.hasPouch && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1.0f) {
                        this.pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
                    }
                    else if (((ItemTeamArmour)stacko.getItem()).type.hasGunPouch && this.type.RepeatingGun && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1.0f) {
                        this.pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
                    }
                    else if (((ItemTeamArmour)stacko.getItem()).type.hasOldGunPouch && this.type.OldGun && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1.0f) {
                        this.pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
                    }
                    else if (((ItemTeamArmour)stacko.getItem()).type.hasHeavyPouch && this.type.Heavy && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1.0f) {
                        this.pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
                    }
                    else if (((ItemTeamArmour)stacko.getItem()).type.hasBowPouch && this.type.Bow && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1.0f) {
                        this.pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
                    }
                }
                if (stacko == null) {
                    this.pouchMultiplier = 1.0f;
                }
            }
            if (this.pouchMultiplier != 1.0f && !this.type.canSetPosition) {
                final int impactX = 0;
                this.impactZ = impactX;
                this.impactY = impactX;
                this.impactX = impactX;
            }
            if (this.lockOnSoundDelay > 0) {
                --this.lockOnSoundDelay;
            }
            Entity closestEntity = null;
            if (this.type.lockOnToLivings || this.type.lockOnToMechas || this.type.lockOnToPlanes || this.type.lockOnToPlayers || this.type.lockOnToVehicles) {
                for (final Object obj : player.worldObj.loadedEntityList) {
                    final Entity entity = (Entity)obj;
                    final Vec3 playerVec = player.getLookVec();
                    final double dXYZ = Math.sqrt((entity.posX - player.posX) * (entity.posX - player.posX) + (entity.posY - player.posY) * (entity.posY - player.posY) + (entity.posZ - player.posZ) * (entity.posZ - player.posZ));
                    final Vector3f relPosVec = new Vector3f(entity.posX - player.posX, entity.posY - player.posY, entity.posZ - player.posZ);
                    final Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
                    final float angle = Math.abs(Vector3f.angle(playerVec3f, relPosVec));
                    if (angle < Math.toRadians(this.type.canLockOnAngle) && dXYZ < this.type.maxRangeLockOn) {
                        final String etype = entity.getEntityData().getString("EntityType");
                        if (((!this.type.lockOnToMechas || !(entity instanceof EntityMecha)) && (!this.type.lockOnToVehicles || !(entity instanceof EntityVehicle)) && (!this.type.lockOnToVehicles || !etype.equals("Vehicle")) && (!this.type.lockOnToPlanes || !(entity instanceof EntityPlane)) && (!this.type.lockOnToPlanes || !etype.equals("Plane")) && (!this.type.lockOnToPlayers || !(entity instanceof EntityPlayer)) && (!this.type.lockOnToLivings || !(entity instanceof EntityLivingBase))) || data.reloadingRight) {
                            continue;
                        }
                        closestEntity = entity;
                    }
                }
                if (closestEntity != null) {
                    closestEntity.getEntityData().setBoolean("LockOn", true);
                }
                if (closestEntity != null && this.lockOnSoundDelay <= 0 && !player.worldObj.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                    final ItemGun itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 10.0, player.dimension, itemGun.type.lockOnSound, false);
                    this.lockOnSoundDelay = this.type.lockOnSoundTime;
                    if (closestEntity instanceof EntityDriveable && ((EntityDriveable)closestEntity).getDriveableType().hasFlare) {
                        final EntityDriveable entityDriveable = (EntityDriveable)closestEntity;
                        PacketPlaySound.sendSoundPacket(closestEntity.posX, closestEntity.posY, closestEntity.posZ, entityDriveable.getDriveableType().lockedOnSoundRange, closestEntity.dimension, entityDriveable.getDriveableType().lockingOnSound, false);
                    }
                }
            }
            if (data.meleeDownLength > 0 && this.type.meleeDownPath.size() > 0 && player.inventory.getCurrentItem() == itemstack && this.type.meleeDown && data.meleeProgressDown != data.meleeDownLength) {
                for (int k = 0; k < this.type.meleeDamagePoints.size(); ++k) {
                    final Vector3f meleeDamagePoint = this.type.meleeDownDamagePoints.get(k);
                    final Vector3f nextPos = this.type.meleeDownPath.get((data.meleeProgressDown + 1) % this.type.meleeDownPath.size());
                    final Vector3f nextAngles = this.type.meleeDownPathAngles.get((data.meleeProgressDown + 1) % this.type.meleeDownPathAngles.size());
                    final RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);
                    final Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
                    Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
                    Vector3f.add(new Vector3f(0.0f, 0.0f, 0.0f), nextPosInGunCoords, nextPosInGunCoords);
                    final Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextPosInGunCoords);
                    if (!FlansMod.proxy.isThePlayer(player)) {
                        final Vector3f vector3f = nextPosInPlayerCoords;
                        vector3f.y += 1.6f;
                    }
                    final Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
                    final Vector3f dPos = (data.lastMeleeDownPositions[k] == null) ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleeDownPositions[k], null);
                    if (player.worldObj.isRemote && FlansMod.DEBUG) {
                        player.worldObj.spawnEntityInWorld((Entity)new EntityDebugVector(player.worldObj, data.lastMeleeDownPositions[k], dPos, 200, 1.0f, 0.0f, 0.0f));
                    }
                    final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
                    for (int j = 0; j < world.loadedEntityList.size(); ++j) {
                        final Object obj2 = world.loadedEntityList.get(j);
                        if (obj2 instanceof EntityPlayer) {
                            final EntityPlayer otherPlayer = (EntityPlayer)obj2;
                            final PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
                            boolean shouldDoNormalHitDetect = false;
                            if (otherPlayer != player) {
                                if (otherData != null) {
                                    if (otherPlayer.isDead) {
                                        continue;
                                    }
                                    if (otherData.team == Team.spectators) {
                                        continue;
                                    }
                                    int snapshotToTry = (player instanceof EntityPlayerMP) ? (((EntityPlayerMP)player).ping / 50) : 0;
                                    if (snapshotToTry >= otherData.snapshots.length) {
                                        snapshotToTry = otherData.snapshots.length - 1;
                                    }
                                    PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
                                    if (snapshot == null) {
                                        snapshot = otherData.snapshots[0];
                                    }
                                    if (snapshot == null) {
                                        shouldDoNormalHitDetect = true;
                                    }
                                    else {
                                        final ArrayList<BulletHit> playerHits = snapshot.raytrace((data.lastMeleeDownPositions[k] == null) ? nextPosInWorldCoords : data.lastMeleeDownPositions[k], dPos);
                                        hits.addAll(playerHits);
                                    }
                                }
                                if (otherData == null || shouldDoNormalHitDetect) {
                                    final MovingObjectPosition mop = (data.lastMeleeDownPositions[k] == null) ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0.0, 0.0, 0.0)) : player.boundingBox.calculateIntercept(data.lastMeleeDownPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        final Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeDownPositions[k].x, mop.hitVec.yCoord - data.lastMeleeDownPositions[k].y, mop.hitVec.zCoord - data.lastMeleeDownPositions[k].z);
                                        float hitLambda = 1.0f;
                                        if (dPos.x != 0.0f) {
                                            hitLambda = hitPoint.x / dPos.x;
                                        }
                                        else if (dPos.y != 0.0f) {
                                            hitLambda = hitPoint.y / dPos.y;
                                        }
                                        else if (dPos.z != 0.0f) {
                                            hitLambda = hitPoint.z / dPos.z;
                                        }
                                        if (hitLambda < 0.0f) {
                                            hitLambda = -hitLambda;
                                        }
                                        hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
                                    }
                                }
                            }
                        }
                        else {
                            final Entity entity2 = (Entity)obj2;
                            if (entity2 != player && !entity2.isDead && (entity2 instanceof EntityLivingBase || entity2 instanceof EntityAAGun)) {
                                final MovingObjectPosition mop2 = entity2.boundingBox.calculateIntercept(data.lastMeleeDownPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                if (mop2 != null) {
                                    final Vector3f hitPoint2 = new Vector3f(mop2.hitVec.xCoord - data.lastMeleeDownPositions[k].x, mop2.hitVec.yCoord - data.lastMeleeDownPositions[k].y, mop2.hitVec.zCoord - data.lastMeleeDownPositions[k].z);
                                    float hitLambda2 = 1.0f;
                                    if (dPos.x != 0.0f) {
                                        hitLambda2 = hitPoint2.x / dPos.x;
                                    }
                                    else if (dPos.y != 0.0f) {
                                        hitLambda2 = hitPoint2.y / dPos.y;
                                    }
                                    else if (dPos.z != 0.0f) {
                                        hitLambda2 = hitPoint2.z / dPos.z;
                                    }
                                    if (hitLambda2 < 0.0f) {
                                        hitLambda2 = -hitLambda2;
                                    }
                                    hits.add(new EntityHit(entity2, hitLambda2));
                                }
                            }
                        }
                    }
                    if (!hits.isEmpty()) {
                        Collections.sort(hits);
                        final float swingDistance = dPos.length();
                        for (final BulletHit bulletHit : hits) {
                            if (bulletHit instanceof PlayerBulletHit) {
                                final PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
                                float damageMultiplier = 1.0f;
                                switch (playerHit.hitbox.type) {
                                    case LEFTITEM:
                                    case RIGHTITEM: {
                                        PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                        final PlayerData playerData = data;
                                        final PlayerData playerData2 = data;
                                        final int n3 = 0;
                                        playerData2.meleeDownLength = n3;
                                        playerData.meleeProgressDown = n3;
                                        return;
                                    }
                                    case NAPE: {
                                        damageMultiplier = 2.0f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData3 = data;
                                                final PlayerData playerData4 = data;
                                                final int n4 = 0;
                                                playerData4.meleeLeftLength = n4;
                                                playerData3.meleeProgressLeft = n4;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case RIGHTARM:
                                    case LEFTARM: {
                                        damageMultiplier = 0.6f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.armArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData5 = data;
                                                final PlayerData playerData6 = data;
                                                final int n5 = 0;
                                                playerData6.meleeLeftLength = n5;
                                                playerData5.meleeProgressLeft = n5;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case BODY: {
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData7 = data;
                                                final PlayerData playerData8 = data;
                                                final int n6 = 0;
                                                playerData8.meleeLeftLength = n6;
                                                playerData7.meleeProgressLeft = n6;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (playerHit.hitbox.player.attackEntityFrom(this.getMeleeDamage(player), swingDistance * this.type.meleeDamage)) {
                                    final EntityPlayer player2 = playerHit.hitbox.player;
                                    ++player2.arrowHitTimer;
                                    playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                    ItemGun.sliceCrossHair = true;
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleeDownPositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleeDownPositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleeDownPositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                            else {
                                if (!(bulletHit instanceof EntityHit)) {
                                    continue;
                                }
                                final EntityHit entityHit = (EntityHit)bulletHit;
                                if (entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * this.type.meleeDamage) && entityHit.entity instanceof EntityLivingBase) {
                                    final EntityLivingBase entityLivingBase;
                                    final EntityLivingBase living = entityLivingBase = (EntityLivingBase)entityHit.entity;
                                    ++entityLivingBase.arrowHitTimer;
                                    living.hurtResistantTime = living.maxHurtResistantTime / 2;
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleeDownPositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleeDownPositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleeDownPositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                        }
                    }
                    data.lastMeleeDownPositions[k] = nextPosInWorldCoords;
                }
                final PlayerData playerData9 = data;
                ++playerData9.meleeProgressDown;
                if (data.meleeProgressDown == data.meleeDownLength) {
                    final PlayerData playerData10 = data;
                    final PlayerData playerData11 = data;
                    final int n7 = 0;
                    playerData11.meleeDownLength = n7;
                    playerData10.meleeProgressDown = n7;
                }
            }
            else if (data.meleeLeftLength > 0 && this.type.meleeLeftPath.size() > 0 && player.inventory.getCurrentItem() == itemstack && this.type.meleeLeft && data.meleeProgressLeft != data.meleeLeftLength) {
                for (int k = 0; k < this.type.meleeDamagePoints.size(); ++k) {
                    final Vector3f meleeDamagePoint = this.type.meleeLeftDamagePoints.get(k);
                    final Vector3f nextPos = this.type.meleeLeftPath.get((data.meleeProgressLeft + 1) % this.type.meleeLeftPath.size());
                    final Vector3f nextAngles = this.type.meleeLeftPathAngles.get((data.meleeProgressLeft + 1) % this.type.meleeLeftPathAngles.size());
                    final RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);
                    final Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
                    Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
                    Vector3f.add(new Vector3f(0.0f, 0.0f, 0.0f), nextPosInGunCoords, nextPosInGunCoords);
                    final Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextPosInGunCoords);
                    if (!FlansMod.proxy.isThePlayer(player)) {
                        final Vector3f vector3f2 = nextPosInPlayerCoords;
                        vector3f2.y += 1.6f;
                    }
                    final Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
                    final Vector3f dPos = (data.lastMeleeLeftPositions[k] == null) ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleeLeftPositions[k], null);
                    if (player.worldObj.isRemote && FlansMod.DEBUG) {
                        player.worldObj.spawnEntityInWorld((Entity)new EntityDebugVector(player.worldObj, data.lastMeleeLeftPositions[k], dPos, 200, 1.0f, 0.0f, 0.0f));
                    }
                    final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
                    for (int j = 0; j < world.loadedEntityList.size(); ++j) {
                        final Object obj2 = world.loadedEntityList.get(j);
                        if (obj2 instanceof EntityPlayer) {
                            final EntityPlayer otherPlayer = (EntityPlayer)obj2;
                            final PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
                            boolean shouldDoNormalHitDetect = false;
                            if (otherPlayer != player) {
                                if (otherData != null) {
                                    if (otherPlayer.isDead) {
                                        continue;
                                    }
                                    if (otherData.team == Team.spectators) {
                                        continue;
                                    }
                                    int snapshotToTry = (player instanceof EntityPlayerMP) ? (((EntityPlayerMP)player).ping / 50) : 0;
                                    if (snapshotToTry >= otherData.snapshots.length) {
                                        snapshotToTry = otherData.snapshots.length - 1;
                                    }
                                    PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
                                    if (snapshot == null) {
                                        snapshot = otherData.snapshots[0];
                                    }
                                    if (snapshot == null) {
                                        shouldDoNormalHitDetect = true;
                                    }
                                    else {
                                        final ArrayList<BulletHit> playerHits = snapshot.raytrace((data.lastMeleeLeftPositions[k] == null) ? nextPosInWorldCoords : data.lastMeleeLeftPositions[k], dPos);
                                        hits.addAll(playerHits);
                                    }
                                }
                                if (otherData == null || shouldDoNormalHitDetect) {
                                    final MovingObjectPosition mop = (data.lastMeleeLeftPositions[k] == null) ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0.0, 0.0, 0.0)) : player.boundingBox.calculateIntercept(data.lastMeleeLeftPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        final Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeLeftPositions[k].x, mop.hitVec.yCoord - data.lastMeleeLeftPositions[k].y, mop.hitVec.zCoord - data.lastMeleeLeftPositions[k].z);
                                        float hitLambda = 1.0f;
                                        if (dPos.x != 0.0f) {
                                            hitLambda = hitPoint.x / dPos.x;
                                        }
                                        else if (dPos.y != 0.0f) {
                                            hitLambda = hitPoint.y / dPos.y;
                                        }
                                        else if (dPos.z != 0.0f) {
                                            hitLambda = hitPoint.z / dPos.z;
                                        }
                                        if (hitLambda < 0.0f) {
                                            hitLambda = -hitLambda;
                                        }
                                        hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
                                    }
                                }
                            }
                        }
                        else {
                            final Entity entity2 = (Entity)obj2;
                            if (entity2 != player && !entity2.isDead && (entity2 instanceof EntityLivingBase || entity2 instanceof EntityAAGun)) {
                                final MovingObjectPosition mop2 = entity2.boundingBox.calculateIntercept(data.lastMeleeLeftPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                if (mop2 != null) {
                                    final Vector3f hitPoint2 = new Vector3f(mop2.hitVec.xCoord - data.lastMeleeLeftPositions[k].x, mop2.hitVec.yCoord - data.lastMeleeLeftPositions[k].y, mop2.hitVec.zCoord - data.lastMeleeLeftPositions[k].z);
                                    float hitLambda2 = 1.0f;
                                    if (dPos.x != 0.0f) {
                                        hitLambda2 = hitPoint2.x / dPos.x;
                                    }
                                    else if (dPos.y != 0.0f) {
                                        hitLambda2 = hitPoint2.y / dPos.y;
                                    }
                                    else if (dPos.z != 0.0f) {
                                        hitLambda2 = hitPoint2.z / dPos.z;
                                    }
                                    if (hitLambda2 < 0.0f) {
                                        hitLambda2 = -hitLambda2;
                                    }
                                    hits.add(new EntityHit(entity2, hitLambda2));
                                }
                            }
                        }
                    }
                    if (!hits.isEmpty()) {
                        Collections.sort(hits);
                        final float swingDistance = dPos.length();
                        for (final BulletHit bulletHit : hits) {
                            if (bulletHit instanceof PlayerBulletHit) {
                                final PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
                                float damageMultiplier = 1.0f;
                                switch (playerHit.hitbox.type) {
                                    case LEFTITEM:
                                    case RIGHTITEM: {
                                        PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                        final PlayerData playerData12 = data;
                                        final PlayerData playerData13 = data;
                                        final int n8 = 0;
                                        playerData13.meleeLeftLength = n8;
                                        playerData12.meleeProgressLeft = n8;
                                        return;
                                    }
                                    case NAPE: {
                                        damageMultiplier = 2.0f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData14 = data;
                                                final PlayerData playerData15 = data;
                                                final int n9 = 0;
                                                playerData15.meleeLeftLength = n9;
                                                playerData14.meleeProgressLeft = n9;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case RIGHTARM:
                                    case LEFTARM: {
                                        damageMultiplier = 0.6f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.armArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData16 = data;
                                                final PlayerData playerData17 = data;
                                                final int n10 = 0;
                                                playerData17.meleeLeftLength = n10;
                                                playerData16.meleeProgressLeft = n10;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case BODY: {
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData18 = data;
                                                final PlayerData playerData19 = data;
                                                final int n11 = 0;
                                                playerData19.meleeLeftLength = n11;
                                                playerData18.meleeProgressLeft = n11;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (playerHit.hitbox.player.attackEntityFrom(this.getMeleeDamage(player), swingDistance * this.type.meleeDamage)) {
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                    final EntityPlayer player3 = playerHit.hitbox.player;
                                    ++player3.arrowHitTimer;
                                    playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
                                    ItemGun.sliceCrossHair = true;
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleeLeftPositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleeLeftPositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleeLeftPositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                            else {
                                if (!(bulletHit instanceof EntityHit)) {
                                    continue;
                                }
                                final EntityHit entityHit = (EntityHit)bulletHit;
                                if (entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * this.type.meleeDamage) && entityHit.entity instanceof EntityLivingBase) {
                                    final EntityLivingBase living = (EntityLivingBase)entityHit.entity;
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                    final EntityLivingBase entityLivingBase2 = living;
                                    ++entityLivingBase2.arrowHitTimer;
                                    living.hurtResistantTime = living.maxHurtResistantTime / 2;
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleeLeftPositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleeLeftPositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleeLeftPositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                        }
                    }
                    data.lastMeleeLeftPositions[k] = nextPosInWorldCoords;
                }
                final PlayerData playerData20 = data;
                ++playerData20.meleeProgressLeft;
                if (data.meleeProgressLeft == data.meleeLeftLength) {
                    final PlayerData playerData21 = data;
                    final PlayerData playerData22 = data;
                    final int n12 = 0;
                    playerData22.meleeLeftLength = n12;
                    playerData21.meleeProgressLeft = n12;
                }
            }
            else if (data.meleeRightLength > 0 && this.type.meleeRightPath.size() > 0 && player.inventory.getCurrentItem() == itemstack && this.type.meleeRight && data.meleeProgressRight != data.meleeRightLength) {
                for (int k = 0; k < this.type.meleeRightDamagePoints.size(); ++k) {
                    final Vector3f meleeDamagePoint = this.type.meleeRightDamagePoints.get(k);
                    final Vector3f nextPos = this.type.meleeRightPath.get((data.meleeProgressRight + 1) % this.type.meleeRightPath.size());
                    final Vector3f nextAngles = this.type.meleeRightPathAngles.get((data.meleeProgressRight + 1) % this.type.meleeRightPathAngles.size());
                    final RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);
                    final Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
                    Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
                    Vector3f.add(new Vector3f(0.0f, 0.0f, 0.0f), nextPosInGunCoords, nextPosInGunCoords);
                    final Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextPosInGunCoords);
                    if (!FlansMod.proxy.isThePlayer(player)) {
                        final Vector3f vector3f3 = nextPosInPlayerCoords;
                        vector3f3.y += 1.6f;
                    }
                    final Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
                    final Vector3f dPos = (data.lastMeleeRightPositions[k] == null) ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleeRightPositions[k], null);
                    if (player.worldObj.isRemote && FlansMod.DEBUG) {
                        player.worldObj.spawnEntityInWorld((Entity)new EntityDebugVector(player.worldObj, data.lastMeleeRightPositions[k], dPos, 200, 1.0f, 0.0f, 0.0f));
                    }
                    final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
                    for (int j = 0; j < world.loadedEntityList.size(); ++j) {
                        final Object obj2 = world.loadedEntityList.get(j);
                        if (obj2 instanceof EntityPlayer) {
                            final EntityPlayer otherPlayer = (EntityPlayer)obj2;
                            final PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
                            boolean shouldDoNormalHitDetect = false;
                            if (otherPlayer != player) {
                                if (otherData != null) {
                                    if (otherPlayer.isDead) {
                                        continue;
                                    }
                                    if (otherData.team == Team.spectators) {
                                        continue;
                                    }
                                    int snapshotToTry = (player instanceof EntityPlayerMP) ? (((EntityPlayerMP)player).ping / 50) : 0;
                                    if (snapshotToTry >= otherData.snapshots.length) {
                                        snapshotToTry = otherData.snapshots.length - 1;
                                    }
                                    PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
                                    if (snapshot == null) {
                                        snapshot = otherData.snapshots[0];
                                    }
                                    if (snapshot == null) {
                                        shouldDoNormalHitDetect = true;
                                    }
                                    else {
                                        final ArrayList<BulletHit> playerHits = snapshot.raytrace((data.lastMeleeRightPositions[k] == null) ? nextPosInWorldCoords : data.lastMeleeRightPositions[k], dPos);
                                        hits.addAll(playerHits);
                                    }
                                }
                                if (otherData == null || shouldDoNormalHitDetect) {
                                    final MovingObjectPosition mop = (data.lastMeleeRightPositions[k] == null) ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0.0, 0.0, 0.0)) : player.boundingBox.calculateIntercept(data.lastMeleeRightPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        final Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeRightPositions[k].x, mop.hitVec.yCoord - data.lastMeleeRightPositions[k].y, mop.hitVec.zCoord - data.lastMeleeRightPositions[k].z);
                                        float hitLambda = 1.0f;
                                        if (dPos.x != 0.0f) {
                                            hitLambda = hitPoint.x / dPos.x;
                                        }
                                        else if (dPos.y != 0.0f) {
                                            hitLambda = hitPoint.y / dPos.y;
                                        }
                                        else if (dPos.z != 0.0f) {
                                            hitLambda = hitPoint.z / dPos.z;
                                        }
                                        if (hitLambda < 0.0f) {
                                            hitLambda = -hitLambda;
                                        }
                                        hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
                                    }
                                }
                            }
                        }
                        else {
                            final Entity entity2 = (Entity)obj2;
                            if (entity2 != player && !entity2.isDead && (entity2 instanceof EntityLivingBase || entity2 instanceof EntityAAGun)) {
                                final MovingObjectPosition mop2 = entity2.boundingBox.calculateIntercept(data.lastMeleeRightPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                if (mop2 != null) {
                                    final Vector3f hitPoint2 = new Vector3f(mop2.hitVec.xCoord - data.lastMeleeRightPositions[k].x, mop2.hitVec.yCoord - data.lastMeleeRightPositions[k].y, mop2.hitVec.zCoord - data.lastMeleeRightPositions[k].z);
                                    float hitLambda2 = 1.0f;
                                    if (dPos.x != 0.0f) {
                                        hitLambda2 = hitPoint2.x / dPos.x;
                                    }
                                    else if (dPos.y != 0.0f) {
                                        hitLambda2 = hitPoint2.y / dPos.y;
                                    }
                                    else if (dPos.z != 0.0f) {
                                        hitLambda2 = hitPoint2.z / dPos.z;
                                    }
                                    if (hitLambda2 < 0.0f) {
                                        hitLambda2 = -hitLambda2;
                                    }
                                    hits.add(new EntityHit(entity2, hitLambda2));
                                }
                            }
                        }
                    }
                    if (!hits.isEmpty()) {
                        Collections.sort(hits);
                        final float swingDistance = dPos.length();
                        for (final BulletHit bulletHit : hits) {
                            if (bulletHit instanceof PlayerBulletHit) {
                                final PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
                                float damageMultiplier = 1.0f;
                                switch (playerHit.hitbox.type) {
                                    case LEFTITEM:
                                    case RIGHTITEM: {
                                        PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                        final PlayerData playerData23 = data;
                                        final PlayerData playerData24 = data;
                                        final int n13 = 0;
                                        playerData24.meleeRightLength = n13;
                                        playerData23.meleeProgressRight = n13;
                                        return;
                                    }
                                    case NAPE: {
                                        damageMultiplier = 2.0f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData25 = data;
                                                final PlayerData playerData26 = data;
                                                final int n14 = 0;
                                                playerData26.meleeLeftLength = n14;
                                                playerData25.meleeProgressLeft = n14;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case RIGHTARM:
                                    case LEFTARM: {
                                        damageMultiplier = 0.6f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.armArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData27 = data;
                                                final PlayerData playerData28 = data;
                                                final int n15 = 0;
                                                playerData28.meleeLeftLength = n15;
                                                playerData27.meleeProgressLeft = n15;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case BODY: {
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData29 = data;
                                                final PlayerData playerData30 = data;
                                                final int n16 = 0;
                                                playerData30.meleeLeftLength = n16;
                                                playerData29.meleeProgressLeft = n16;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (playerHit.hitbox.player.attackEntityFrom(this.getMeleeDamage(player), swingDistance * this.type.meleeDamage)) {
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                    final EntityPlayer player4 = playerHit.hitbox.player;
                                    ++player4.arrowHitTimer;
                                    playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
                                    ItemGun.sliceCrossHair = true;
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleeRightPositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleeRightPositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleeRightPositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                            else {
                                if (!(bulletHit instanceof EntityHit)) {
                                    continue;
                                }
                                final EntityHit entityHit = (EntityHit)bulletHit;
                                if (entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * this.type.meleeDamage) && entityHit.entity instanceof EntityLivingBase) {
                                    final EntityLivingBase living = (EntityLivingBase)entityHit.entity;
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                    final EntityLivingBase entityLivingBase3 = living;
                                    ++entityLivingBase3.arrowHitTimer;
                                    living.hurtResistantTime = living.maxHurtResistantTime / 2;
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleeRightPositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleeRightPositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleeRightPositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                        }
                    }
                    data.lastMeleeRightPositions[k] = nextPosInWorldCoords;
                }
                final PlayerData playerData31 = data;
                ++playerData31.meleeProgressRight;
                if (data.meleeProgressRight == data.meleeRightLength) {
                    final PlayerData playerData32 = data;
                    final PlayerData playerData33 = data;
                    final int n17 = 0;
                    playerData33.meleeRightLength = n17;
                    playerData32.meleeProgressRight = n17;
                }
            }
            else if (data.meleeLength > 0 && this.type.meleePath.size() > 0 && player.inventory.getCurrentItem() == itemstack) {
                for (int k = 0; k < this.type.meleeDamagePoints.size(); ++k) {
                    final Vector3f meleeDamagePoint = this.type.meleeDamagePoints.get(k);
                    final Vector3f nextPos = this.type.meleePath.get((data.meleeProgress + 1) % this.type.meleePath.size());
                    final Vector3f nextAngles = this.type.meleePathAngles.get((data.meleeProgress + 1) % this.type.meleePathAngles.size());
                    final RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);
                    final Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
                    Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
                    Vector3f.add(new Vector3f(0.0f, 0.0f, 0.0f), nextPosInGunCoords, nextPosInGunCoords);
                    final Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90.0f, player.rotationPitch, 0.0f).findLocalVectorGlobally(nextPosInGunCoords);
                    if (!FlansMod.proxy.isThePlayer(player)) {
                        final Vector3f vector3f4 = nextPosInPlayerCoords;
                        vector3f4.y += 1.6f;
                    }
                    final Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
                    final Vector3f dPos = (data.lastMeleePositions[k] == null) ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleePositions[k], null);
                    if (player.worldObj.isRemote && FlansMod.DEBUG) {
                        player.worldObj.spawnEntityInWorld((Entity)new EntityDebugVector(player.worldObj, data.lastMeleePositions[k], dPos, 200, 1.0f, 0.0f, 0.0f));
                    }
                    final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
                    for (int j = 0; j < world.loadedEntityList.size(); ++j) {
                        final Object obj2 = world.loadedEntityList.get(j);
                        if (obj2 instanceof EntityPlayer) {
                            final EntityPlayer otherPlayer = (EntityPlayer)obj2;
                            final PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
                            boolean shouldDoNormalHitDetect = false;
                            if (otherPlayer != player) {
                                if (otherData != null) {
                                    if (otherPlayer.isDead) {
                                        continue;
                                    }
                                    if (otherData.team == Team.spectators) {
                                        continue;
                                    }
                                    int snapshotToTry = (player instanceof EntityPlayerMP) ? (((EntityPlayerMP)player).ping / 50) : 0;
                                    if (snapshotToTry >= otherData.snapshots.length) {
                                        snapshotToTry = otherData.snapshots.length - 1;
                                    }
                                    PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
                                    if (snapshot == null) {
                                        snapshot = otherData.snapshots[0];
                                    }
                                    if (snapshot == null) {
                                        shouldDoNormalHitDetect = true;
                                    }
                                    else {
                                        final ArrayList<BulletHit> playerHits = snapshot.raytrace((data.lastMeleePositions[k] == null) ? nextPosInWorldCoords : data.lastMeleePositions[k], dPos);
                                        hits.addAll(playerHits);
                                    }
                                }
                                if (otherData == null || shouldDoNormalHitDetect) {
                                    final MovingObjectPosition mop = (data.lastMeleePositions[k] == null) ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0.0, 0.0, 0.0)) : player.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        final Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
                                        float hitLambda = 1.0f;
                                        if (dPos.x != 0.0f) {
                                            hitLambda = hitPoint.x / dPos.x;
                                        }
                                        else if (dPos.y != 0.0f) {
                                            hitLambda = hitPoint.y / dPos.y;
                                        }
                                        else if (dPos.z != 0.0f) {
                                            hitLambda = hitPoint.z / dPos.z;
                                        }
                                        if (hitLambda < 0.0f) {
                                            hitLambda = -hitLambda;
                                        }
                                        hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
                                    }
                                }
                            }
                        }
                        else {
                            final Entity entity2 = (Entity)obj2;
                            if (entity2 != player && !entity2.isDead && (entity2 instanceof EntityLivingBase || entity2 instanceof EntityAAGun)) {
                                final MovingObjectPosition mop2 = entity2.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                if (mop2 != null) {
                                    final Vector3f hitPoint2 = new Vector3f(mop2.hitVec.xCoord - data.lastMeleePositions[k].x, mop2.hitVec.yCoord - data.lastMeleePositions[k].y, mop2.hitVec.zCoord - data.lastMeleePositions[k].z);
                                    float hitLambda2 = 1.0f;
                                    if (dPos.x != 0.0f) {
                                        hitLambda2 = hitPoint2.x / dPos.x;
                                    }
                                    else if (dPos.y != 0.0f) {
                                        hitLambda2 = hitPoint2.y / dPos.y;
                                    }
                                    else if (dPos.z != 0.0f) {
                                        hitLambda2 = hitPoint2.z / dPos.z;
                                    }
                                    if (hitLambda2 < 0.0f) {
                                        hitLambda2 = -hitLambda2;
                                    }
                                    hits.add(new EntityHit(entity2, hitLambda2));
                                }
                            }
                        }
                    }
                    if (!hits.isEmpty()) {
                        Collections.sort(hits);
                        final float swingDistance = dPos.length();
                        for (final BulletHit bulletHit : hits) {
                            if (bulletHit instanceof PlayerBulletHit) {
                                final PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
                                float damageMultiplier = 1.0f;
                                switch (playerHit.hitbox.type) {
                                    case LEFTITEM:
                                    case RIGHTITEM: {
                                        PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                        final PlayerData playerData34 = data;
                                        final PlayerData playerData35 = data;
                                        final int n18 = 0;
                                        playerData35.meleeLength = n18;
                                        playerData34.meleeProgress = n18;
                                        return;
                                    }
                                    case NAPE: {
                                        damageMultiplier = 2.0f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData36 = data;
                                                final PlayerData playerData37 = data;
                                                final int n19 = 0;
                                                playerData37.meleeLeftLength = n19;
                                                playerData36.meleeProgressLeft = n19;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case RIGHTARM:
                                    case LEFTARM: {
                                        damageMultiplier = 0.6f;
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.armArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData38 = data;
                                                final PlayerData playerData39 = data;
                                                final int n20 = 0;
                                                playerData39.meleeLeftLength = n20;
                                                playerData38.meleeProgressLeft = n20;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                    case BODY: {
                                        for (int n2 = 0; n2 < 5; ++n2) {
                                            final ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n2);
                                            if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.bodyArmor > this.type.swordArmorPen) {
                                                PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.ShieldHitSound, true);
                                                final PlayerData playerData40 = data;
                                                final PlayerData playerData41 = data;
                                                final int n21 = 0;
                                                playerData41.meleeLeftLength = n21;
                                                playerData40.meleeProgressLeft = n21;
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                }
                                if (playerHit.hitbox.player.attackEntityFrom(this.getMeleeDamage(player), swingDistance * this.type.meleeDamage)) {
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                    final EntityPlayer player5 = playerHit.hitbox.player;
                                    ++player5.arrowHitTimer;
                                    playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
                                    ItemGun.sliceCrossHair = true;
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                            else {
                                if (!(bulletHit instanceof EntityHit)) {
                                    continue;
                                }
                                final EntityHit entityHit = (EntityHit)bulletHit;
                                if (entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * this.type.meleeDamage) && entityHit.entity instanceof EntityLivingBase) {
                                    final EntityLivingBase living = (EntityLivingBase)entityHit.entity;
                                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, this.type.meleeSoundRange, player.dimension, this.type.meleeHitSound, true);
                                    final EntityLivingBase entityLivingBase4 = living;
                                    ++entityLivingBase4.arrowHitTimer;
                                    living.hurtResistantTime = living.maxHurtResistantTime / 2;
                                }
                                if (!FlansMod.DEBUG) {
                                    continue;
                                }
                                world.spawnEntityInWorld((Entity)new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                            }
                        }
                    }
                    data.lastMeleePositions[k] = nextPosInWorldCoords;
                }
                final PlayerData playerData42 = data;
                ++playerData42.meleeProgress;
                if (data.meleeProgress == data.meleeLength) {
                    final PlayerData playerData43 = data;
                    final PlayerData playerData44 = data;
                    final int n22 = 0;
                    playerData44.meleeLength = n22;
                    playerData43.meleeProgress = n22;
                }
            }
        }
    }
    
    public DamageSource getMeleeDamage(final EntityPlayer attacker) {
        return (DamageSource)new EntityDamageSourceFlans(this.type.shortName, (Entity)attacker, attacker, this.type, false, true);
    }
    
    public void onMouseHeld(final ItemStack stack, final World world, final EntityPlayerMP player, final boolean left, final boolean isShooting) {
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)player);
        if (data != null && data.shootClickDelay == 0) {
            if (player.ridingEntity instanceof EntitySeat && !((EntitySeat)player.ridingEntity).seatInfo.canSmallArms) {
                return;
            }
            if (left && data.offHandGunSlot != 0) {
                final ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                final GunType gunType = ((ItemGun)offHandGunStack.getItem()).type;
                data.isShootingLeft = isShooting;
                if (gunType.getFireMode(offHandGunStack) == EnumFireMode.SEMIAUTO && isShooting) {
                    data.isShootingLeft = false;
                    player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, this.tryToShoot(offHandGunStack, gunType, world, player, true));
                }
                if (gunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingLeft == 0) {
                    data.isShootingLeft = false;
                    data.burstRoundsRemainingLeft = gunType.numBurstRounds;
                    player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, this.tryToShoot(offHandGunStack, gunType, world, player, true));
                }
            }
            else {
                data.isShootingRight = isShooting;
                if (this.type.getFireMode(stack) == EnumFireMode.SEMIAUTO && isShooting) {
                    data.isShootingRight = false;
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, this.tryToShoot(stack, this.type, world, player, false));
                }
                if (this.type.getFireMode(stack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingRight == 0) {
                    data.isShootingRight = false;
                    data.burstRoundsRemainingRight = this.type.numBurstRounds;
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, this.tryToShoot(stack, this.type, world, player, false));
                }
            }
            if (this.type.useLoopingSounds && isShooting) {
                data.shouldPlayWarmupSound = true;
            }
            if (this.type.labigunDelay) {
                data.isShootingRight = true;
                System.out.println("it should be fuckign working");
            }
        }
    }
    
    public ItemStack tryToShoot(final ItemStack gunStack, final GunType gunType, final World world, final EntityPlayerMP entityplayer, final boolean left) {
        if (this.type.deployable) {
            return gunStack;
        }
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityplayer);
        if ((left && !this.type.shootMelee && data.shootTimeLeft <= 0.0f) || (!left && !this.type.shootMelee && data.shootTimeRight <= 0.0f) || (this.type.getSecondaryFire(gunStack) && data.stabTimeLeft <= 0.0f) || (left && this.type.shootMelee && data.stabTimeLeft <= 0.0f) || (!left && this.type.shootMelee && data.stabTimeRight <= 0.0f) || (!left && this.type.sidearm && data.stabTimeRight <= 0.0f) || (!left && this.type.sidearm && data.stabTimeRight <= 0.0f)) {
            int bulletID = 0;
            ItemStack bulletStack = null;
            while (bulletID < gunType.getNumAmmoItemsInGun(gunStack)) {
                final ItemStack checkingStack = this.getBulletItemStack(gunStack, bulletID);
                if (checkingStack != null && checkingStack.getItem() != null && checkingStack.getMetadata() < checkingStack.getMaxDurability()) {
                    bulletStack = checkingStack;
                    break;
                }
                ++bulletID;
            }
            if (bulletStack == null) {
                if (this.reload(gunStack, gunType, world, (EntityPlayer)entityplayer, false, left)) {
                    if (!this.type.shootMelee) {
                        final PlayerData playerData = data;
                        final PlayerData playerData2 = data;
                        final float n = (float)((int)(gunType.getReloadTime(gunStack) * this.pouchMultiplier) + 1);
                        playerData2.shootTimeLeft = n;
                        playerData.shootTimeRight = n;
                        if (this.type.sidearm || this.type.getSecondaryFire(gunStack)) {
                            final PlayerData playerData3 = data;
                            final PlayerData playerData4 = data;
                            final float n2 = (float)((int)(gunType.getReloadTime(gunStack) * this.pouchMultiplier) + 1);
                            playerData4.stabTimeLeft = n2;
                            playerData3.stabTimeRight = n2;
                        }
                    }
                    if (left) {
                        data.reloadingLeft = true;
                        data.burstRoundsRemainingLeft = 0;
                    }
                    else {
                        data.reloadingRight = true;
                        data.burstRoundsRemainingRight = 0;
                    }
                    FlansMod.getPacketHandler().sendTo(new PacketReload(left), entityplayer);
                    String soundToPlay = null;
                    final AttachmentType grip = gunType.getGrip(gunStack);
                    if (gunType.getSecondaryFire(gunStack) && grip != null && grip.secondaryReloadSound != null) {
                        soundToPlay = grip.secondaryReloadSound;
                    }
                    else if (gunType.reloadSoundOnEmpty != null) {
                        soundToPlay = gunType.reloadSoundOnEmpty;
                    }
                    else if (gunType.reloadSound != null) {
                        soundToPlay = gunType.reloadSound;
                    }
                    if (entityplayer.worldObj.isRemote && grip != null && grip.bayonet) {
                        final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)entityplayer, false);
                        animations.doBayonet(17);
                    }
                    if (soundToPlay != null) {
                        PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, this.type.reloadSoundRange, entityplayer.dimension, soundToPlay, false);
                    }
                }
                else if (gunType.clickSoundOnEmpty != null && this.canClick) {
                    PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, this.type.reloadSoundRange, entityplayer.dimension, gunType.clickSoundOnEmpty, false);
                }
            }
            else if (bulletStack.getItem() instanceof ItemShootable) {
                this.shoot(gunStack, gunType, world, bulletStack, (EntityPlayer)entityplayer, left);
                this.canClick = true;
                bulletStack.setMetadata(bulletStack.getMetadata() + 1);
                this.setBulletItemStack(gunStack, bulletStack, bulletID);
                if (gunType.getFireMode(gunStack) == EnumFireMode.BURST) {
                    if (left && data.burstRoundsRemainingLeft > 0) {
                        final PlayerData playerData5 = data;
                        --playerData5.burstRoundsRemainingLeft;
                    }
                    if (!left && data.burstRoundsRemainingRight > 0) {
                        final PlayerData playerData6 = data;
                        --playerData6.burstRoundsRemainingRight;
                    }
                }
                if (gunType.consumeGunUponUse && bulletStack.getMetadata() == bulletStack.getMaxDurability()) {
                    return null;
                }
            }
        }
        return gunStack;
    }
    
    public boolean reload(final ItemStack gunStack, final GunType gunType, final World world, final EntityPlayer player, final boolean forceReload, final boolean left) {
        return this.reload(gunStack, gunType, world, (Entity)player, (IInventory)player.inventory, player.capabilities.isCreativeMode, forceReload);
    }
    
    public boolean reload(final ItemStack gunStack, final GunType gunType, final World world, final Entity entity, final IInventory inventory, final boolean creative, final boolean forceReload) {
        if (gunType.deployable) {
            return false;
        }
        if (forceReload && !gunType.canForceReload) {
            return false;
        }
        boolean reloadedSomething = false;
        for (int i = 0; i < gunType.getNumAmmoItemsInGun(gunStack); ++i) {
            final ItemStack bulletStack = this.getBulletItemStack(gunStack, i);
            if (bulletStack == null || bulletStack.getMetadata() == bulletStack.getMaxDurability() || forceReload) {
                if (this.type.shootMelee) {
                    final ShootableType bulletToGive = this.type.ammo.get(0);
                    final int numToGive = Math.min(bulletToGive.maxStackSize, 1);
                    if (((InventoryPlayer)inventory).addItemStackToInventory(new ItemStack(bulletToGive.item, numToGive))) {}
                }
                int bestSlot = -1;
                int bulletsInBestSlot = 0;
                for (int j = 0; j < inventory.getSizeInventory(); ++j) {
                    final ItemStack item = inventory.getStackInSlot(j);
                    if (item != null && item.getItem() instanceof ItemShootable && gunType.isAmmo(((ItemShootable)item.getItem()).type, gunStack)) {
                        final int bulletsInThisSlot = item.getMaxDurability() - item.getMetadata();
                        if (bulletsInThisSlot > bulletsInBestSlot) {
                            bestSlot = j;
                            bulletsInBestSlot = bulletsInThisSlot;
                        }
                    }
                }
                if (bestSlot != -1) {
                    ItemStack newBulletStack = inventory.getStackInSlot(bestSlot);
                    final ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
                    if (bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload != null && !creative && bulletStack.getMetadata() == bulletStack.getMaxDurability()) {
                        dropItem(world, entity, ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload);
                    }
                    if (bulletStack != null && bulletStack.getMetadata() < bulletStack.getMaxDurability() && !InventoryHelper.addItemStackToInventory(inventory, bulletStack, creative)) {
                        entity.entityDropItem(bulletStack, 0.5f);
                    }
                    this.bulletDamageInfo = newBulletType.damageVsLiving;
                    final ItemStack stackToLoad = newBulletStack.copy();
                    stackToLoad.stackSize = 1;
                    this.setBulletItemStack(gunStack, stackToLoad, i);
                    if (!creative) {
                        final ItemStack itemStack = newBulletStack;
                        --itemStack.stackSize;
                    }
                    if (newBulletStack.stackSize <= 0) {
                        newBulletStack = null;
                    }
                    inventory.setInventorySlotContents(bestSlot, newBulletStack);
                    reloadedSomething = true;
                }
            }
        }
        return reloadedSomething;
    }
    
    public static void dropItem(final World world, final Entity entity, String itemName) {
        if (itemName != null) {
            int damage = 0;
            if (itemName.contains(".")) {
                damage = Integer.parseInt(itemName.split("\\.")[1]);
                itemName = itemName.split("\\.")[0];
            }
            final ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
            entity.entityDropItem(dropStack, 0.5f);
        }
    }
    
    private void shoot(final ItemStack stack, final GunType gunType, final World world, final ItemStack bulletStack, final EntityPlayer entityPlayer, final boolean left) {
        final ShootableType bullet = ((ItemShootable)bulletStack.getItem()).type;
        boolean lastBullet = false;
        this.bulletDamageInfo = bullet.damageVsLiving;
        final ItemStack[] bulletStacks = new ItemStack[this.type.getNumAmmoItemsInGun(stack)];
        for (int i = 0; i < this.type.getNumAmmoItemsInGun(stack); ++i) {
            bulletStacks[i] = ((ItemGun)stack.getItem()).getBulletItemStack(stack, i);
            if (bulletStacks[i] != null && bulletStacks[i].getItem() instanceof ItemBullet && bulletStacks[i].getMaxDurability() - bulletStacks[i].getMetadata() == 1) {
                lastBullet = true;
            }
        }
        if (this.soundDelay <= 0 && gunType.shootSound != null) {
            final AttachmentType barrel = gunType.getBarrel(stack);
            final AttachmentType grip = gunType.getGrip(stack);
            final boolean silenced = barrel != null && barrel.silencer && !gunType.getSecondaryFire(stack);
            String soundToPlay = null;
            if (gunType.getSecondaryFire(stack) && grip != null && grip.secondaryShootSound != null) {
                soundToPlay = grip.secondaryShootSound;
            }
            else if (lastBullet && gunType.lastShootSound != null) {
                soundToPlay = gunType.lastShootSound;
            }
            else if (silenced && gunType.suppressedShootSound != null) {
                soundToPlay = gunType.suppressedShootSound;
            }
            else if (gunType.shootSound != null) {
                soundToPlay = gunType.shootSound;
            }
            if (soundToPlay != null) {
                PacketPlaySound.sendSoundPacket(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, this.type.gunSoundRange, entityPlayer.dimension, soundToPlay, gunType.distortSound, silenced);
                FlansMod.packetHandler.sendToDonut(new PacketPlaySound(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, soundToPlay), entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, 0.5f, (float)this.type.gunSoundRange, entityPlayer.dimension);
                this.soundDelay = gunType.shootSoundLength;
            }
            if (this.type.distantShootSound != null) {
                FlansMod.packetHandler.sendToDonut(new PacketPlaySound(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, this.type.distantShootSound), entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, (float)this.type.gunSoundRange, (float)this.type.distantSoundRange, entityPlayer.dimension);
            }
        }
        if (!world.isRemote && bulletStack.getItem() instanceof ItemShootable) {
            final ItemShootable itemShootable = (ItemShootable)bulletStack.getItem();
            final ShootableType shootableType = itemShootable.type;
            int numBullets = -1;
            float spread = -1.0f;
            if (shootableType instanceof BulletType) {
                if (gunType.allowNumBulletsByBulletType) {
                    numBullets = ((BulletType)shootableType).numBullets;
                }
                if (gunType.allowSpreadByBullet) {
                    spread = ((BulletType)shootableType).bulletSpread;
                }
            }
            if (numBullets <= 0) {
                numBullets = gunType.getNumBullets(stack);
            }
            if (spread <= 0.0f) {
                final float result = spread = gunType.getSpread(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting());
            }
            for (int k = 0; k < numBullets; ++k) {
                world.spawnEntityInWorld((Entity)itemShootable.getEntity(world, (EntityLivingBase)entityPlayer, spread, gunType.getDamage(stack), gunType.getBulletSpeed(stack), numBullets > 1, bulletStack.getMetadata(), gunType, gunType.Xoffset, gunType.Yoffset, gunType.Zoffset));
                final AttachmentType grip2 = gunType.getGrip(bulletStack);
                System.out.println(this.type.getSecondaryFire(stack));
                if (this.type.muzzleParticleHave && !this.type.getSecondaryFire(stack)) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(entityPlayer.posX + entityPlayer.getLookVec().xCoord * this.type.muzzleOffset, entityPlayer.posY + entityPlayer.getLookVec().yCoord * this.type.muzzleOffset, entityPlayer.posZ + entityPlayer.getLookVec().zCoord * this.type.muzzleOffset, this.type.muzzleParticleCount, this.type.muzzleParticle), entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, 200.0f, entityPlayer.dimension);
                }
            }
            FlansMod.packetHandler.sendTo(new PacketGunRecoil(gunType.getRecoilPitch(stack), gunType.getRecoilYaw(stack), gunType.decreaseRecoilPitch, gunType.decreaseRecoilYaw, gunType.getSustainedRecoilPitch(stack), gunType.getSustainedRecoilYaw(stack)), (EntityPlayerMP)entityPlayer);
            if (bullet.dropItemOnShoot != null && !entityPlayer.capabilities.isCreativeMode) {
                dropItem(world, (Entity)entityPlayer, bullet.dropItemOnShoot);
            }
            if (gunType.dropItemOnShoot != null) {
                dropItem(world, (Entity)entityPlayer, gunType.dropItemOnShoot);
            }
        }
        if (left) {
            if (!this.type.shootMelee || !this.type.sidearm || !this.type.getSecondaryFire(stack)) {
                final PlayerData playerData = PlayerHandler.getPlayerData(entityPlayer);
                playerData.shootTimeLeft += gunType.getShootDelay(stack);
            }
            if (this.type.shootMelee || this.type.sidearm || this.type.getSecondaryFire(stack)) {
                final PlayerData playerData2 = PlayerHandler.getPlayerData(entityPlayer);
                playerData2.stabTimeLeft += gunType.getShootDelay(stack);
            }
        }
        else {
            if (!this.type.shootMelee || !this.type.sidearm || !this.type.getSecondaryFire(stack)) {
                final PlayerData playerData3 = PlayerHandler.getPlayerData(entityPlayer);
                playerData3.shootTimeRight += gunType.getShootDelay(stack);
            }
            if (this.type.shootMelee || this.type.sidearm || this.type.getSecondaryFire(stack)) {
                final PlayerData playerData4 = PlayerHandler.getPlayerData(entityPlayer);
                playerData4.stabTimeRight += gunType.getShootDelay(stack);
            }
        }
        if (gunType.knockback > 0.0f) {}
    }
    
    public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        final PlayerData data = PlayerHandler.getPlayerData(entityplayer);
        if (data.isBlockingLeft < 10 && this.type.canBlock) {
            data.isBlockingLeft = this.type.blockTime;
            PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, 12.0, entityplayer.dimension, "swordDraw", true);
            entityplayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, this.type.blockTime, 4));
            if (entityplayer.worldObj.isRemote) {
                final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)entityplayer, false);
                animations.doMeleeLeft(this.type.meleeTime);
            }
        }
        if (data.minigunSpeed < 0 && this.type.labigunDelay) {
            data.minigunSpeed = this.type.minigunStartSpeed;
        }
        if (entityplayer.worldObj.isRemote && this.type.getSecondaryFire(itemstack)) {
            final GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase)entityplayer, false);
            animations.doMelee((int)this.type.getGrip(itemstack).secondaryShootDelay);
        }
        if (this.type.deployable) {
            final float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329f - 3.141593f);
            final float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329f - 3.141593f);
            final float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329f);
            final float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329f);
            final double length = 5.0;
            final Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62 - entityplayer.yOffset, entityplayer.posZ);
            final Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
            final MovingObjectPosition look = world.rayTraceBlocks(posVec, lookVec, true);
            if (look != null && look.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && look.sideHit == 1) {
                final int playerDir = MathHelper.floor_double(entityplayer.rotationYaw * 4.0f / 360.0f + 0.5) & 0x3;
                final int i = look.blockX;
                int j = look.blockY;
                final int k = look.blockZ;
                if (!world.isRemote) {
                    if (world.getBlock(i, j, k) == Blocks.snow) {
                        --j;
                    }
                    if (isSolid(world, i, j, k) && (world.getBlock(i, j + 1, k) == Blocks.air || world.getBlock(i, j + 1, k) == Blocks.snow) && world.getBlock(i + ((playerDir == 1) ? 1 : 0) - ((playerDir == 3) ? 1 : 0), j + 1, k - ((playerDir == 0) ? 1 : 0) + ((playerDir == 2) ? 1 : 0)) == Blocks.air && (world.getBlock(i + ((playerDir == 1) ? 1 : 0) - ((playerDir == 3) ? 1 : 0), j, k - ((playerDir == 0) ? 1 : 0) + ((playerDir == 2) ? 1 : 0)) == Blocks.air || world.getBlock(i + ((playerDir == 1) ? 1 : 0) - ((playerDir == 3) ? 1 : 0), j, k - ((playerDir == 0) ? 1 : 0) + ((playerDir == 2) ? 1 : 0)) == Blocks.snow)) {
                        for (final EntityMG mg : EntityMG.mgs) {
                            if (mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead) {
                                return itemstack;
                            }
                        }
                        if (!world.isRemote) {
                            world.spawnEntityInWorld((Entity)new EntityMG(world, i, j + 1, k, playerDir, this.type));
                        }
                        if (!entityplayer.capabilities.isCreativeMode) {
                            itemstack.stackSize = 0;
                        }
                    }
                }
            }
        }
        if (world.isRemote) {
            for (int l = 0; l < 3; ++l) {
                Minecraft.getMinecraft().entityRenderer.itemRenderer.updateEquippedItem();
            }
        }
        return itemstack;
    }
    
    private static boolean isSolid(final World world, final int i, final int j, final int k) {
        final Block block = world.getBlock(i, j, k);
        return block != null && block.getMaterial().isSolid() && block.isOpaqueCube();
    }
    
    public boolean onLeftClickEntity(final ItemStack stack, final EntityPlayer player, final Entity entity) {
        return (this.type.secondaryFunction != EnumSecondaryFunction.MELEE && !this.type.shootMelee) || (this.type.secondaryFunction != EnumSecondaryFunction.MELEE && this.type.meleeDamage == 1.0f) || (this.type.shootMelee && this.type.meleeDamage == 0.1);
    }
    
    public boolean isFull3D() {
        return true;
    }
    
    public boolean onEntitySwing(final EntityLivingBase entityLiving, final ItemStack stack) {
        if (this.type.meleeSound != null) {
            PacketPlaySound.sendSoundPacket(entityLiving.posX, entityLiving.posY, entityLiving.posZ, this.type.meleeSoundRange, entityLiving.dimension, this.type.meleeSound, true);
        }
        if (this.type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && this.type.meleeLeft && ItemGun.AHeld) {
            if (entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft <= 0) {
                final GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
                animations.doMeleeLeft(this.type.meleeTime);
            }
            if (entityLiving instanceof EntityPlayer && !this.type.shootMelee) {
                final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
                data.doMeleeLeft((EntityPlayer)entityLiving, this.type.meleeTime, this.type);
            }
        }
        else if (this.type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && this.type.meleeRight && ItemGun.DHeld) {
            if (entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft <= 0) {
                final GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
                animations.doMeleeRight(this.type.meleeTime);
            }
            if (entityLiving instanceof EntityPlayer && !this.type.shootMelee) {
                final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
                data.doMeleeRight((EntityPlayer)entityLiving, this.type.meleeTime, this.type);
            }
        }
        else if (this.type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && this.type.meleeDown && ItemGun.WHeld) {
            if (entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft <= 0) {
                final GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
                animations.doMeleeDown(this.type.meleeTime);
            }
            if (entityLiving instanceof EntityPlayer && !this.type.shootMelee) {
                final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
                data.doMeleeDown((EntityPlayer)entityLiving, this.type.meleeTime, this.type);
            }
        }
        else if ((this.type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && !this.type.lance) || (this.type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE && !this.blocking && this.type.lance && ItemGun.WHeld)) {
            if (entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft <= 0) {
                final GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
                animations.doMelee(this.type.meleeTime);
            }
            if (entityLiving instanceof EntityPlayer && !this.type.shootMelee) {
                final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
                data.doMelee((EntityPlayer)entityLiving, this.type.meleeTime, this.type);
            }
        }
        return this.type.secondaryFunction != EnumSecondaryFunction.MELEE;
    }
    
    public boolean onBlockStartBreak(final ItemStack itemstack, final int X, final int Y, final int Z, final EntityPlayer player) {
        return true;
    }
    
    public boolean canItemHarvestBlock(final Block p_150897_1_) {
        return false;
    }
    
    @SubscribeEvent
    public void onEventBlockBreak(final BlockEvent.BreakEvent event) {
        final EntityPlayer player = event.getPlayer();
        if (player != null && player.getHeldItem() != null && player.getHeldItem().getItem() instanceof ItemGun) {
            event.setCanceled(true);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    public boolean isItemStackDamageable() {
        return true;
    }
    
    public void getSubItems(final Item item, final CreativeTabs tabs, final List list) {
        final PaintableType type = ((IPaintableItem)item).GetPaintableType();
        if (FlansMod.addAllPaintjobsToCreative) {
            for (final Paintjob paintjob : type.paintjobs) {
                addPaintjobToList(item, type, paintjob, list);
            }
        }
        else {
            addPaintjobToList(item, type, type.defaultPaintjob, list);
        }
    }
    
    private static void addPaintjobToList(final Item item, final PaintableType type, final Paintjob paintjob, final List list) {
        final ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
        final NBTTagCompound tags = new NBTTagCompound();
        paintableStack.setTagCompound(tags);
        list.add(paintableStack);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister icon) {
        this.icons = new IIcon[this.type.paintjobs.size()];
        this.defaultIcon = icon.registerIcon("flansmod:null");
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
        for (int i = 0; i < this.type.paintjobs.size(); ++i) {
            this.icons[i] = icon.registerIcon("FlansMod:" + this.type.paintjobs.get(i).iconName);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(final ItemStack stack) {
        if (this.icons != null) {
            return this.icons[stack.getMetadata() % this.icons.length];
        }
        return this.defaultIcon;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 100;
    }
    
    public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
        if (this.type.shootMelee && !this.type.spear && this.fullHands == 0) {
            return null;
        }
        return (this.type != null) ? this.type.itemUseAction : EnumAction.bow;
    }
    
    public Multimap getAttributeModifiers(final ItemStack stack) {
        final Multimap map = super.getAttributeModifiers(stack);
        map.put((Object)SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), (Object)new AttributeModifier(ItemGun.itemModifierUUID, "KnockbackResist", (double)this.type.knockbackModifier, 0));
        map.put((Object)SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), (Object)new AttributeModifier(ItemGun.itemModifierUUID, "MovementSpeed", (double)(this.type.getMovementSpeed(stack) - 1.0f), 2));
        if (this.type.secondaryFunction == EnumSecondaryFunction.MELEE) {
            map.put((Object)SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), (Object)new AttributeModifier(ItemGun.itemModifierUUID, "Weapon modifier", (double)this.type.meleeDamage, 0));
        }
        return map;
    }
    
    public static float roundFloat(final float value, final int points) {
        int pow = 10;
        for (int i = 1; i < points; ++i) {
            pow *= 10;
        }
        final float result = value * pow;
        return (int)((result - (int)result >= 0.5f) ? (result + 1.0f) : result) / (float)pow;
    }
    
    static {
        ItemGun.rand = new Random();
        ItemGun.crouching = false;
        ItemGun.sprinting = false;
        ItemGun.cringedBlockingCheckerClient = false;
        ItemGun.mounted = false;
        ItemGun.shooting = false;
    }
}

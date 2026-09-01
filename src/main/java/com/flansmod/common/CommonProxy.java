// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import com.flansmod.common.teams.ArmourBoxType;
import com.flansmod.common.driveables.DriveablePart;
import java.util.Iterator;
import com.flansmod.common.driveables.CollisionBox;
import com.flansmod.common.driveables.EnumDriveablePart;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.driveables.DriveableType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketBreakSound;
import net.minecraft.block.Block;
import com.flansmod.common.paintjob.ContainerPaintjobTable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.driveables.mechas.ContainerMechaInventory;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.ContainerDriveableInventory;
import com.flansmod.common.guns.boxes.ContainerGunBox;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.guns.ContainerGunModTable;
import net.minecraft.inventory.Container;
import com.flansmod.client.model.GunAnimations;
import java.util.HashMap;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.boxes.GunBoxType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayer;
import java.util.ArrayList;
import java.io.File;
import java.util.List;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class CommonProxy
{
    protected static Pattern zipJar;
    
    public List<File> getContentList(final Method method, final ClassLoader classloader) {
        final List<File> contentPacks = new ArrayList<File>();
        for (final File file : FlansMod.flanDir.listFiles()) {
            if (file.isDirectory() || CommonProxy.zipJar.matcher(file.getName()).matches()) {
                FlansMod.log("Loaded content pack : " + file.getName());
                contentPacks.add(file);
            }
        }
        FlansMod.log("Loaded content pack list server side.");
        return contentPacks;
    }
    
    public void load() {
    }
    
    public void forceReload() {
    }
    
    public void registerRenderers() {
    }
    
    public void doTutorialStuff(final EntityPlayer player, final EntityDriveable entityType) {
    }
    
    public void changeControlMode(final EntityPlayer player) {
    }
    
    public boolean mouseControlEnabled() {
        return false;
    }
    
    public void openDriveableMenu(final EntityPlayer player, final World world, final EntityDriveable driveable) {
    }
    
    public <T> T loadModel(final String s, final String shortName, final Class<T> typeClass) {
        return null;
    }
    
    public void loadSound(final String contentPack, final String type, final String sound) {
    }
    
    public boolean isThePlayer(final EntityPlayer player) {
        return false;
    }
    
    public EntityPlayer getThePlayer() {
        return null;
    }
    
    public boolean isOnSameTeamClientPlayer(final EntityLivingBase entity) {
        return false;
    }
    
    public void buyGun(final GunBoxType type, final InfoType gun) {
    }
    
    public void buyAmmo(final GunBoxType box, final int ammo, final int type) {
    }
    
    public Object getClientGui(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        return null;
    }
    
    public HashMap<EntityLivingBase, GunAnimations> getAnimations(final boolean left) {
        if (left) {
            return FlansMod.gunAnimationsLeft;
        }
        return FlansMod.gunAnimationsRight;
    }
    
    public Container getServerGui(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        switch (ID) {
            case 0: {
                return null;
            }
            case 1: {
                return null;
            }
            case 2: {
                return new ContainerGunModTable(player.field_71071_by, world);
            }
            case 3: {
                return new ContainerDriveableMenu(player.field_71071_by, world);
            }
            case 4: {
                return new ContainerDriveableMenu(player.field_71071_by, world, true, ((EntitySeat)player.field_70154_o).driveable);
            }
            case 5: {
                return new ContainerGunBox(player.field_71071_by, world);
            }
            case 6: {
                return new ContainerDriveableInventory(player.field_71071_by, world, ((EntitySeat)player.field_70154_o).driveable, 0);
            }
            case 7: {
                return new ContainerDriveableInventory(player.field_71071_by, world, ((EntitySeat)player.field_70154_o).driveable, 1);
            }
            case 8: {
                return new ContainerDriveableMenu(player.field_71071_by, world, true, ((EntitySeat)player.field_70154_o).driveable);
            }
            case 9: {
                return new ContainerDriveableInventory(player.field_71071_by, world, ((EntitySeat)player.field_70154_o).driveable, 2);
            }
            case 10: {
                return new ContainerMechaInventory(player.field_71071_by, world, (EntityMecha)((EntitySeat)player.field_70154_o).driveable);
            }
            case 11: {
                return null;
            }
            case 12: {
                return new ContainerDriveableInventory(player.field_71071_by, world, ((EntitySeat)player.field_70154_o).driveable, 3);
            }
            case 13: {
                return new ContainerPaintjobTable(player.field_71071_by, world, (TileEntityPaintjobTable)world.func_147438_o(x, y, z));
            }
            default: {
                return null;
            }
        }
    }
    
    public void playBlockBreakSound(final int x, final int y, final int z, final Block blockHit, final int dimension) {
        FlansMod.packetHandler.sendToAllAround(new PacketBreakSound(x, y, z, blockHit), x, y, z, 32.0f, dimension);
    }
    
    public void addItem(final EntityPlayer player, final int id) {
        final ItemStack item = new ItemStack(Item.func_150899_d(id), 1, 4);
        player.field_71071_by.func_70441_a(item);
        final ArrayList<ItemStack> dirts = new ArrayList<ItemStack>();
        dirts.add(0, new ItemStack(Item.func_150899_d(3)));
        final CraftingInstance crafting = new CraftingInstance((IInventory)player.field_71071_by, dirts, new ItemStack(Item.func_150899_d(id)));
        if (crafting.canCraft()) {
            crafting.craft(player.field_71071_by.field_70458_d);
        }
    }
    
    public void craftDriveable(final EntityPlayer player, final DriveableType type) {
        final InventoryPlayer temporaryInventory = new InventoryPlayer((EntityPlayer)null);
        temporaryInventory.func_70455_b(player.field_71071_by);
        boolean canCraft = true;
        for (final ItemStack recipeStack : type.driveableRecipe) {
            int totalAmountFound = 0;
            for (int n = 0; n < player.field_71071_by.func_70302_i_(); ++n) {
                ItemStack stackInSlot = player.field_71071_by.func_70301_a(n);
                if (stackInSlot != null && stackInSlot.func_77973_b() == recipeStack.func_77973_b() && stackInSlot.func_77960_j() == recipeStack.func_77960_j()) {
                    final int amountFound = Math.min(stackInSlot.field_77994_a, recipeStack.field_77994_a - totalAmountFound);
                    final ItemStack itemStack = stackInSlot;
                    itemStack.field_77994_a -= amountFound;
                    if (stackInSlot.field_77994_a <= 0) {
                        stackInSlot = null;
                    }
                    player.field_71071_by.func_70299_a(n, stackInSlot);
                    totalAmountFound += amountFound;
                    if (totalAmountFound == recipeStack.field_77994_a) {
                        break;
                    }
                }
            }
            if (totalAmountFound < recipeStack.field_77994_a) {
                canCraft = false;
                break;
            }
        }
        if (!canCraft) {
            player.field_71071_by.func_70455_b(temporaryInventory);
            return;
        }
        final HashMap<PartType, ItemStack> engines = new HashMap<PartType, ItemStack>();
        for (int n2 = 0; n2 < temporaryInventory.func_70302_i_(); ++n2) {
            final ItemStack stackInSlot2 = temporaryInventory.func_70301_a(n2);
            if (stackInSlot2 != null && stackInSlot2.func_77973_b() instanceof ItemPart) {
                final PartType partType = ((ItemPart)stackInSlot2.func_77973_b()).type;
                if (partType.category == 2 && partType.worksWith.contains(EnumType.getFromObject(type))) {
                    if (engines.containsKey(partType)) {
                        final ItemStack itemStack2 = engines.get(partType);
                        itemStack2.field_77994_a += stackInSlot2.field_77994_a;
                    }
                    else {
                        engines.put(partType, stackInSlot2);
                    }
                }
            }
        }
        float bestEngineSpeed = -1.0f;
        ItemStack bestEngineStack = null;
        for (final PartType part : engines.keySet()) {
            if (part.engineSpeed > bestEngineSpeed && engines.get(part).field_77994_a >= type.numEngines()) {
                bestEngineSpeed = part.engineSpeed;
                bestEngineStack = engines.get(part);
            }
        }
        if (bestEngineStack == null) {
            player.field_71071_by.func_70455_b(temporaryInventory);
            return;
        }
        int numEnginesAcquired = 0;
        for (int n3 = 0; n3 < player.field_71071_by.func_70302_i_(); ++n3) {
            ItemStack stackInSlot3 = player.field_71071_by.func_70301_a(n3);
            if (stackInSlot3 != null && stackInSlot3.func_77973_b() == bestEngineStack.func_77973_b()) {
                final int amountFound2 = Math.min(stackInSlot3.field_77994_a, type.numEngines() - numEnginesAcquired);
                final ItemStack itemStack3 = stackInSlot3;
                itemStack3.field_77994_a -= amountFound2;
                if (stackInSlot3.field_77994_a <= 0) {
                    stackInSlot3 = null;
                }
                player.field_71071_by.func_70299_a(n3, stackInSlot3);
                numEnginesAcquired += amountFound2;
                if (numEnginesAcquired == type.numEngines()) {
                    break;
                }
            }
        }
        final ItemStack driveableStack = new ItemStack(type.item);
        final NBTTagCompound tags = new NBTTagCompound();
        tags.func_74778_a("Engine", ((ItemPart)bestEngineStack.func_77973_b()).type.shortName);
        tags.func_74778_a("Type", type.shortName);
        for (final EnumDriveablePart part2 : EnumDriveablePart.values()) {
            tags.func_74768_a(part2.getShortName() + "_Health", (type.health.get(part2) == null) ? 0 : type.health.get(part2).health);
            tags.func_74768_a(part2.getShortName() + "_Crew", (type.crew.get(part2) == null) ? 0 : type.crew.get(part2).crew);
            tags.func_74757_a(part2.getShortName() + "_Fire", false);
        }
        driveableStack.field_77990_d = tags;
        if (!player.field_71071_by.func_70441_a(driveableStack)) {
            player.func_71019_a(driveableStack, false);
        }
    }
    
    public void repairDriveable(final EntityPlayer driver, final EntityDriveable driving, final DriveablePart part) {
        for (final EnumDriveablePart parent : part.type.getParents()) {
            if (!driving.isPartIntact(parent)) {
                return;
            }
        }
        final InventoryPlayer temporaryInventory = new InventoryPlayer((EntityPlayer)null);
        temporaryInventory.func_70455_b(driver.field_71071_by);
        boolean canRepair = true;
        final ArrayList<ItemStack> stacksNeeded = driving.getDriveableType().getItemsRequired(part, driving.getDriveableData().engine);
        for (final ItemStack stackNeeded : stacksNeeded) {
            int totalAmountFound = 0;
            for (int m = 0; m < temporaryInventory.func_70302_i_(); ++m) {
                ItemStack stackInSlot = temporaryInventory.func_70301_a(m);
                if (stackInSlot != null && stackInSlot.func_77973_b() == stackNeeded.func_77973_b() && stackInSlot.func_77960_j() == stackNeeded.func_77960_j()) {
                    final int amountFound = Math.min(stackInSlot.field_77994_a, stackNeeded.field_77994_a - totalAmountFound);
                    final ItemStack itemStack = stackInSlot;
                    itemStack.field_77994_a -= amountFound;
                    if (stackInSlot.field_77994_a <= 0) {
                        stackInSlot = null;
                    }
                    temporaryInventory.func_70299_a(m, stackInSlot);
                    totalAmountFound += amountFound;
                    if (totalAmountFound == stackNeeded.field_77994_a) {
                        break;
                    }
                }
            }
            if (totalAmountFound < stackNeeded.field_77994_a) {
                canRepair = false;
            }
        }
        if (canRepair) {
            driver.field_71071_by.func_70455_b(temporaryInventory);
            if (part.type == EnumDriveablePart.ERA || part.type == EnumDriveablePart.ERA2 || part.type == EnumDriveablePart.ERA3 || part.type == EnumDriveablePart.APS || part.type == EnumDriveablePart.ADS) {
                part.health = Math.max(1, part.maxHealth);
            }
            else {
                part.health = Math.max(1, (int)(1.0f + part.maxHealth / 115.0f));
            }
            part.onFire = false;
            part.dead = false;
            driving.checkParts();
        }
    }
    
    public boolean isScreenOpen() {
        return false;
    }
    
    public boolean isKeyDown(final int key) {
        return false;
    }
    
    public boolean keyDown(final int keycode) {
        return false;
    }
    
    public void buyArmour(final String shortName, final int piece, final ArmourBoxType type) {
    }
    
    public void spawnParticle(final String p_72869_1_, final double p_72869_2_, final double p_72869_4_, final double p_72869_6_, final double p_72869_8_, final double p_72869_10_, final double p_72869_12_) {
    }
    
    public float getMouseSensitivity() {
        return 0.5f;
    }
    
    static {
        CommonProxy.zipJar = Pattern.compile("(.+).(zip|jar)$");
    }
}

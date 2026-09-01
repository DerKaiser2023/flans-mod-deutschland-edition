// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.client.model.ModelBase;
import com.flansmod.common.guns.GunType;
import net.minecraft.nbt.NBTBase;
import com.flansmod.common.guns.AttachmentType;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.world.World;
import java.util.Iterator;
import net.minecraft.item.Item;
import com.flansmod.common.FlansMod;
import java.util.ArrayList;
import com.flansmod.common.types.TypeFile;
import net.minecraft.item.ItemStack;
import java.util.List;
import com.flansmod.common.types.InfoType;

public class PlayerClass extends InfoType
{
    public static List<PlayerClass> classes;
    public List<String[]> startingItemStrings;
    public List<ItemStack> startingItems;
    public boolean horse;
    public boolean locked;
    public int cost;
    public ItemStack hat;
    public ItemStack chest;
    public ItemStack legs;
    public ItemStack shoes;
    
    public PlayerClass(final TypeFile file) {
        super(file);
        this.startingItemStrings = new ArrayList<String[]>();
        this.startingItems = new ArrayList<ItemStack>();
        this.horse = false;
        this.locked = false;
        this.cost = 1;
        PlayerClass.classes.add(this);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        if (split[0].equals("AddItem")) {
            this.startingItemStrings.add(split);
        }
        if (split[0].equals("SkinOverride")) {
            this.texture = split[1];
        }
        if (split[0].equals("Hat") || split[0].equals("Helmet")) {
            if (split[1].equals("None")) {
                return;
            }
            for (final Item item : FlansMod.armourItems) {
                final ArmourType armour = ((ItemTeamArmour)item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.hat = new ItemStack(item);
                }
            }
        }
        if (split[0].equals("Chest") || split[0].equals("Top")) {
            if (split[1].equals("None")) {
                return;
            }
            for (final Item item : FlansMod.armourItems) {
                final ArmourType armour = ((ItemTeamArmour)item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.chest = new ItemStack(item);
                }
            }
            if (split[0].equals("Unlockable") || split[0].equals("Locked")) {
                this.locked = true;
            }
            if (split[0].equals("Cost") && this.locked) {
                this.cost = Integer.parseInt(split[1]);
            }
        }
        if (split[0].equals("Legs") || split[0].equals("Bottom")) {
            if (split[1].equals("None")) {
                return;
            }
            for (final Item item : FlansMod.armourItems) {
                final ArmourType armour = ((ItemTeamArmour)item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.legs = new ItemStack(item);
                }
            }
        }
        if (split[0].equals("Shoes") || split[0].equals("Boots")) {
            if (split[1].equals("None")) {
                return;
            }
            for (final Item item : FlansMod.armourItems) {
                final ArmourType armour = ((ItemTeamArmour)item).type;
                if (armour != null && armour.shortName.equals(split[1])) {
                    this.shoes = new ItemStack(item);
                }
            }
        }
    }
    
    @Override
    protected void postRead(final TypeFile file) {
        this.onWorldLoad(null);
    }
    
    @Override
    public void onWorldLoad(final World world) {
        if (world != null && world.isRemote) {
            return;
        }
        try {
            this.startingItems.clear();
            for (final String[] split : this.startingItemStrings) {
                Item matchingItem = null;
                int amount = 1;
                int damage = 0;
                final String[] itemNames = split[1].split("\\+");
                for (final Object object : Item.itemRegistry) {
                    final Item item = (Item)object;
                    if (item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals(itemNames[0]) || (item.getUnlocalizedName().split("\\.").length > 1 && item.getUnlocalizedName().split("\\.")[1].equals(itemNames[0])))) {
                        matchingItem = item;
                    }
                }
                for (final InfoType type : InfoType.infoTypes) {
                    if (type.shortName.equals(itemNames[0]) && type.item != null) {
                        matchingItem = type.item;
                    }
                }
                if (matchingItem == null) {
                    FlansMod.log("Tried to add " + split[1] + " to player class " + this.shortName + " but the item did not exist");
                    return;
                }
                if (split.length > 2) {
                    amount = Integer.parseInt(split[2]);
                }
                if (split.length > 3) {
                    damage = Integer.parseInt(split[3]);
                }
                final ItemStack stack = new ItemStack(matchingItem, amount, damage);
                if (itemNames.length > 1 && matchingItem instanceof ItemGun) {
                    final GunType gunType = ((ItemGun)matchingItem).type;
                    final NBTTagCompound tags = new NBTTagCompound();
                    final NBTTagCompound attachmentTags = new NBTTagCompound();
                    int genericID = 0;
                    for (int i = 0; i < itemNames.length - 1; ++i) {
                        final AttachmentType attachment = AttachmentType.getAttachment(itemNames[i + 1]);
                        if (attachment != null) {
                            String tagName = null;
                            switch (attachment.type) {
                                case sights: {
                                    tagName = "scope";
                                    break;
                                }
                                case barrel: {
                                    tagName = "barrel";
                                    break;
                                }
                                case stock: {
                                    tagName = "stock";
                                    break;
                                }
                                case grip: {
                                    tagName = "grip";
                                    break;
                                }
                                case generic: {
                                    tagName = "generic_" + genericID++;
                                    break;
                                }
                            }
                            final NBTTagCompound specificAttachmentTags = new NBTTagCompound();
                            new ItemStack(attachment.item).writeToNBT(specificAttachmentTags);
                            attachmentTags.setTag(tagName, (NBTBase)specificAttachmentTags);
                        }
                    }
                    tags.setTag("attachments", (NBTBase)attachmentTags);
                    stack.stackTagCompound = tags;
                }
                this.startingItems.add(stack);
            }
        }
        catch (final Exception e) {
            System.out.println("Interpreting player class file failed.");
            e.printStackTrace();
        }
    }
    
    public static PlayerClass getClass(final String s) {
        for (final PlayerClass playerClass : PlayerClass.classes) {
            if (playerClass.shortName.equals(s)) {
                return playerClass;
            }
        }
        return null;
    }
    
    @Override
    protected void preRead(final TypeFile file) {
    }
    
    @Override
    public float GetRecommendedScale() {
        return 0.0f;
    }
    
    @Override
    public ModelBase GetModel() {
        return null;
    }
    
    static {
        PlayerClass.classes = new ArrayList<PlayerClass>();
    }
}

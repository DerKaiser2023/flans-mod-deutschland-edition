// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.types;

import java.util.ArrayList;
import net.minecraft.block.material.Material;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.world.World;
import net.minecraft.item.ItemDye;
import java.util.Iterator;
import net.minecraft.init.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import com.flansmod.common.FlansMod;
import net.minecraft.item.Item;
import java.util.List;

public abstract class InfoType
{
    public static List<InfoType> infoTypes;
    public String contentPack;
    public Item item;
    public int colour;
    public String iconPath;
    public Object[] recipe;
    public String[] recipeLine;
    public int recipeOutput;
    public boolean shapeless;
    public String smeltableFrom;
    public String name;
    public String shortName;
    public String texture;
    public String LauncherSkin;
    public String modelString;
    public String description;
    public float modelScale;
    public boolean canDrop;
    public final String packName;
    
    public InfoType(final TypeFile file) {
        this.colour = 16777215;
        this.recipeOutput = 1;
        this.smeltableFrom = null;
        this.modelScale = 1.0f;
        this.canDrop = true;
        this.contentPack = file.name;
        this.packName = file.pack;
        InfoType.infoTypes.add(this);
    }
    
    public void read(final TypeFile file) {
        this.preRead(file);
        while (true) {
            String line = null;
            line = file.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("//")) {
                continue;
            }
            final String[] split = line.split(" ");
            if (split.length < 2) {
                continue;
            }
            this.read(split, file);
        }
        this.postRead(file);
    }
    
    protected abstract void preRead(final TypeFile p0);
    
    protected abstract void postRead(final TypeFile p0);
    
    protected void read(final String[] split, final TypeFile file) {
        try {
            if (split[0].equals("Model")) {
                this.modelString = split[1];
            }
            if (split[0].equals("ModelScale")) {
                this.modelScale = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Name") && !split[0].equals("afterBurnName")) {
                this.name = split[1];
                for (int i = 0; i < split.length - 2; ++i) {
                    this.name = this.name + " " + split[i + 2];
                }
            }
            if (split[0].equals("Description")) {
                this.description = split[1];
                for (int i = 0; i < split.length - 2; ++i) {
                    this.description = this.description + " " + split[i + 2];
                }
            }
            if (split[0].equals("ShortName")) {
                this.shortName = split[1];
            }
            if (split[0].equals("Colour") || split[0].equals("Color")) {
                this.colour = (Integer.parseInt(split[1]) << 16) + (Integer.parseInt(split[2]) << 8) + Integer.parseInt(split[3]);
            }
            if (split[0].equals("Icon")) {
                this.iconPath = split[1];
            }
            if (split[0].equals("RecipeOutput")) {
                this.recipeOutput = Integer.parseInt(split[1]);
            }
            if (split[0].equals("Recipe")) {
                this.recipe = new Object[split.length + 2];
                for (int i = 0; i < 3; ++i) {
                    String line = null;
                    line = file.readLine();
                    if (line != null) {
                        if (line.startsWith("//")) {
                            --i;
                        }
                        else {
                            this.recipe[i] = line;
                        }
                    }
                }
                this.recipeLine = split;
                this.shapeless = false;
            }
            if (split[0].equals("ShapelessRecipe")) {
                this.recipeLine = split;
                this.shapeless = true;
            }
            if (split[0].equals("SmeltableFrom")) {
                this.smeltableFrom = split[1];
            }
            if (split[0].equals("CanDrop")) {
                this.canDrop = Boolean.parseBoolean(split[1]);
            }
        }
        catch (final Exception e) {
            FlansMod.log("Reading file failed : " + this.shortName);
            e.printStackTrace();
        }
    }
    
    public void addRecipe() {
        this.addRecipe(this.getItem());
    }
    
    public void addRecipe(final Item par1Item) {
        if (this.smeltableFrom != null) {
            GameRegistry.addSmelting(getRecipeElement(this.smeltableFrom, 0), new ItemStack(this.item), 0.0f);
        }
        if (this.recipeLine == null) {
            return;
        }
        try {
            if (!this.shapeless) {
                int rows = 3;
                if (((String)this.recipe[0]).charAt(0) == ' ' && ((String)this.recipe[1]).charAt(0) == ' ' && ((String)this.recipe[2]).charAt(0) == ' ') {
                    for (int i = 0; i < 3; ++i) {
                        this.recipe[i] = ((String)this.recipe[i]).substring(1);
                    }
                    if (((String)this.recipe[0]).charAt(0) == ' ' && ((String)this.recipe[1]).charAt(0) == ' ' && ((String)this.recipe[2]).charAt(0) == ' ') {
                        for (int i = 0; i < 3; ++i) {
                            this.recipe[i] = ((String)this.recipe[i]).substring(1);
                        }
                    }
                }
                int last = ((String)this.recipe[0]).length() - 1;
                if (((String)this.recipe[0]).charAt(last) == ' ' && ((String)this.recipe[1]).charAt(last) == ' ' && ((String)this.recipe[2]).charAt(last) == ' ') {
                    for (int j = 0; j < 3; ++j) {
                        this.recipe[j] = ((String)this.recipe[j]).substring(0, last);
                    }
                    --last;
                    if (((String)this.recipe[0]).charAt(last) == ' ' && ((String)this.recipe[1]).charAt(last) == ' ' && ((String)this.recipe[2]).charAt(last) == ' ') {
                        for (int j = 0; j < 3; ++j) {
                            this.recipe[j] = ((String)this.recipe[j]).substring(0, 0);
                        }
                    }
                }
                if (this.recipe[0].equals(" ") || this.recipe[0].equals("  ") || this.recipe[0].equals("   ")) {
                    final Object[] newRecipe = new Object[this.recipe.length - 1];
                    newRecipe[0] = this.recipe[1];
                    newRecipe[1] = this.recipe[2];
                    this.recipe = newRecipe;
                    --rows;
                    if (this.recipe[0].equals(" ") || this.recipe[0].equals("  ") || this.recipe[0].equals("   ")) {
                        final Object[] newRecipe2 = new Object[this.recipe.length - 1];
                        newRecipe2[0] = this.recipe[1];
                        this.recipe = newRecipe2;
                        --rows;
                    }
                }
                if (this.recipe[rows - 1].equals(" ") || this.recipe[rows - 1].equals("  ") || this.recipe[rows - 1].equals("   ")) {
                    final Object[] newRecipe = new Object[this.recipe.length - 1];
                    newRecipe[0] = this.recipe[0];
                    newRecipe[1] = this.recipe[1];
                    this.recipe = newRecipe;
                    --rows;
                    if (this.recipe[rows - 1].equals(" ") || this.recipe[rows - 1].equals("  ") || this.recipe[rows - 1].equals("   ")) {
                        final Object[] newRecipe2 = new Object[this.recipe.length - 1];
                        newRecipe2[0] = this.recipe[0];
                        this.recipe = newRecipe2;
                        --rows;
                    }
                }
                for (int j = 0; j < (this.recipeLine.length - 1) / 2; ++j) {
                    this.recipe[j * 2 + rows] = this.recipeLine[j * 2 + 1].charAt(0);
                    if (this.recipeLine[j * 2 + 2].contains(".")) {
                        this.recipe[j * 2 + rows + 1] = getRecipeElement(this.recipeLine[j * 2 + 2].split("\\.")[0], Integer.valueOf(this.recipeLine[j * 2 + 2].split("\\.")[1]));
                    }
                    else {
                        this.recipe[j * 2 + rows + 1] = getRecipeElement(this.recipeLine[j * 2 + 2], 0);
                    }
                }
                GameRegistry.addRecipe(new ItemStack(this.item, this.recipeOutput), this.recipe);
            }
            else {
                this.recipe = new Object[this.recipeLine.length - 1];
                for (int k = 0; k < this.recipeLine.length - 1; ++k) {
                    if (this.recipeLine[k + 1].contains(".")) {
                        this.recipe[k] = getRecipeElement(this.recipeLine[k + 1].split("\\.")[0], Integer.valueOf(this.recipeLine[k + 1].split("\\.")[1]));
                    }
                    else {
                        this.recipe[k] = getRecipeElement(this.recipeLine[k + 1], 0);
                    }
                }
                GameRegistry.addShapelessRecipe(new ItemStack(this.item, this.recipeOutput), this.recipe);
            }
        }
        catch (final Exception e) {
            FlansMod.log("Failed to add recipe for : " + this.shortName);
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    public Item getItem() {
        return this.item;
    }
    
    public static ItemStack getRecipeElement(final String s, final int damage) {
        return getRecipeElement(s, 1, damage);
    }
    
    public static ItemStack getRecipeElement(final String s, final int amount, final int damage) {
        return getRecipeElement(s, amount, damage, "nothing");
    }
    
    public static ItemStack getRecipeElement(final String s, final int amount, final int damage, final String requester) {
        if (s.equals("doorIron")) {
            return new ItemStack(Items.iron_door, amount);
        }
        if (s.equals("doorWood")) {
            return new ItemStack(Items.wooden_door, amount);
        }
        if (s.equals("clayItem")) {
            return new ItemStack(Items.clay_ball, amount);
        }
        for (final Object object : Item.itemRegistry) {
            final Item item = (Item)object;
            if (item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals("item." + s) || item.getUnlocalizedName().equals("tile." + s))) {
                return new ItemStack(item, amount, damage);
            }
        }
        for (final InfoType type : InfoType.infoTypes) {
            if (type.shortName.equals(s)) {
                return new ItemStack(type.item, amount, damage);
            }
        }
        if (s.equals("gunpowder")) {
            return new ItemStack(Items.gunpowder, amount);
        }
        if (s.equals("iron")) {
            return new ItemStack(Items.iron_ingot, amount);
        }
        FlansMod.log("Could not find " + s + " when adding recipe for " + requester);
        return null;
    }
    
    protected int getDyeDamageValue(final String dyeName) {
        int damage = -1;
        for (int i = 0; i < ItemDye.dyeColorNames.length; ++i) {
            if (ItemDye.dyeColorNames[i].equals(dyeName)) {
                damage = i;
            }
        }
        if (damage == -1) {
            FlansMod.log("Failed to find dye colour : " + dyeName + " while adding " + this.contentPack);
        }
        return damage;
    }
    
    public void reloadModel() {
    }
    
    public static InfoType getType(final String s) {
        for (final InfoType type : InfoType.infoTypes) {
            if (type != null) {
                if (type.shortName != null && type.shortName.equals(s)) {
                    return type;
                }
                if (type.name != null && type.name.equals(s)) {
                    return type;
                }
                continue;
            }
        }
        return null;
    }
    
    public void onWorldLoad(final World world) {
    }
    
    public abstract float GetRecommendedScale();
    
    @SideOnly(Side.CLIENT)
    public abstract ModelBase GetModel();
    
    public static InfoType getType(final ItemStack itemStack) {
        if (itemStack == null) {
            return null;
        }
        final Item item = itemStack.getItem();
        if (item instanceof IFlanItem) {
            return ((IFlanItem)item).getInfoType();
        }
        return null;
    }
    
    public static PotionEffect getPotionEffect(final String[] split) {
        final int potionID = Integer.parseInt(split[1]);
        final int duration = Integer.parseInt(split[2]);
        final int amplifier = Integer.parseInt(split[3]);
        return new PotionEffect(potionID, duration, amplifier, false);
    }
    
    public static Material getMaterial(final String mat) {
        return Material.ground;
    }
    
    static {
        InfoType.infoTypes = new ArrayList<InfoType>();
    }
}

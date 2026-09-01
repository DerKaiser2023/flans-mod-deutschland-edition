// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.boxes;

import net.minecraft.client.model.ModelBase;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import net.minecraft.block.Block;
import com.flansmod.common.FlansMod;
import java.util.Arrays;
import java.util.ArrayList;
import com.flansmod.common.types.TypeFile;
import java.util.HashMap;
import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import com.flansmod.common.types.InfoType;

public class GunBoxType extends InfoType
{
    public BlockGunBox block;
    public String topTexturePath;
    public String sideTexturePath;
    public String bottomTexturePath;
    @SideOnly(Side.CLIENT)
    public IIcon top;
    @SideOnly(Side.CLIENT)
    public IIcon side;
    @SideOnly(Side.CLIENT)
    public IIcon bottom;
    public int nextGun;
    public GunBoxEntry[] gunEntries;
    public List<GunPage> gunPages;
    public GunPage currentPage;
    public String guiTexturePath;
    public String gunBoxTextColor;
    public String itemListTextColor;
    public String itemTextColor;
    public String pageTextColor;
    public String buttonTextColor;
    public String buttonTextHoverColor;
    private static int lastIconIndex;
    public static HashMap<String, GunBoxType> gunBoxMap;
    
    public GunBoxType(final TypeFile file) {
        super(file);
        this.nextGun = -1;
        this.gunPages = new ArrayList<GunPage>();
        this.gunBoxTextColor = "404040";
        this.itemListTextColor = "404040";
        this.itemTextColor = "404040";
        this.pageTextColor = "FFFFFF";
        this.buttonTextColor = "FFFFFF";
        this.buttonTextHoverColor = "FFFFA0";
    }
    
    public void preRead(final TypeFile file) {
        this.gunEntries = new GunBoxEntry[8];
        this.currentPage = new GunPage("default");
    }
    
    public void postRead(final TypeFile file) {
        this.currentPage.addGunList(Arrays.copyOf(this.gunEntries, this.nextGun + 1));
        this.gunPages.add(this.currentPage);
        GunBoxType.gunBoxMap.put(this.shortName, this);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("TopTexture")) {
                this.topTexturePath = split[1];
            }
            if (split[0].equals("BottomTexture")) {
                this.bottomTexturePath = split[1];
            }
            if (split[0].equals("SideTexture")) {
                this.sideTexturePath = split[1];
            }
            if (split[0].equals("Page") || split[0].equals("SetPage")) {
                final String pageName = String.join(" ", (CharSequence[])Arrays.copyOfRange(split, 1, split.length));
                if (this.gunEntries[0] != null) {
                    this.currentPage.addGunList(Arrays.copyOf(this.gunEntries, this.nextGun + 1));
                    this.iteratePage(pageName);
                }
                else {
                    this.currentPage.setPageName(pageName);
                }
            }
            if (split[0].equals("AddGun")) {
                ++this.nextGun;
                if (this.nextGun > this.gunEntries.length - 1) {
                    this.currentPage.addGunList(Arrays.copyOf(this.gunEntries, this.nextGun));
                    this.iteratePage("default " + (this.gunPages.size() + 2));
                    ++this.nextGun;
                }
                this.gunEntries[this.nextGun] = new GunBoxEntry(InfoType.getType(split[1]), this.getRecipe(split));
            }
            if (split[0].equals("AddAmmo") || split[0].equals("AddAltAmmo") || split[0].equals("AddAlternateAmmo")) {
                this.gunEntries[this.nextGun].addAmmoEntry(new GunBoxEntry(InfoType.getType(split[1]), this.getRecipe(split)));
            }
            if (split[0].equals("GuiTexture")) {
                this.guiTexturePath = split[1];
            }
            if (split[0].equals("GunBoxNameColor")) {
                this.gunBoxTextColor = split[1];
            }
            if (split[0].equals("PageTextColor")) {
                this.pageTextColor = split[1];
            }
            if (split[0].equals("ListTextColor")) {
                this.itemListTextColor = split[1];
            }
            if (split[0].equals("ItemTextColor")) {
                this.itemTextColor = split[1];
            }
            if (split[0].equals("ButtonTextColor")) {
                this.buttonTextColor = split[1];
            }
            if (split[0].equals("ButtonTextHighlight")) {
                this.buttonTextHoverColor = split[1];
            }
        }
        catch (final Exception e) {
            FlansMod.log("Reading gun box file failed : " + this.shortName);
            e.printStackTrace();
        }
    }
    
    public void iteratePage(final String s) {
        this.gunPages.add(this.currentPage);
        this.gunEntries = new GunBoxEntry[8];
        this.nextGun = -1;
        this.currentPage = new GunPage(s);
    }
    
    public static GunBoxType getBox(final String s) {
        return GunBoxType.gunBoxMap.get(s);
    }
    
    public static GunBoxType getBox(final Block block) {
        for (final GunBoxType type : GunBoxType.gunBoxMap.values()) {
            if (type.block == block) {
                return type;
            }
        }
        return null;
    }
    
    public List<ItemStack> getRecipe(final String[] split) {
        final List<ItemStack> recipe = new ArrayList<ItemStack>();
        for (int i = 0; i < (split.length - 2) / 2; ++i) {
            if (split[i * 2 + 3].contains(".")) {
                recipe.add(InfoType.getRecipeElement(split[i * 2 + 3].split("\\.")[0], Integer.parseInt(split[i * 2 + 2]), Integer.valueOf(split[i * 2 + 3].split("\\.")[1]), this.shortName));
            }
            else {
                recipe.add(InfoType.getRecipeElement(split[i * 2 + 3], Integer.parseInt(split[i * 2 + 2]), 0, this.shortName));
            }
        }
        return recipe;
    }
    
    @Override
    public void addRecipe(final Item par1Item) {
        if (this.smeltableFrom != null) {
            GameRegistry.addSmelting(InfoType.getRecipeElement(this.smeltableFrom, 0), new ItemStack(this.item), 0.0f);
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
                        this.recipe[j * 2 + rows + 1] = InfoType.getRecipeElement(this.recipeLine[j * 2 + 2].split("\\.")[0], Integer.valueOf(this.recipeLine[j * 2 + 2].split("\\.")[1]));
                    }
                    else {
                        this.recipe[j * 2 + rows + 1] = InfoType.getRecipeElement(this.recipeLine[j * 2 + 2], 0);
                    }
                }
                GameRegistry.addRecipe(new ItemStack((Block)this.block, this.recipeOutput, 0), this.recipe);
            }
            else {
                this.recipe = new Object[this.recipeLine.length - 1];
                for (int k = 0; k < this.recipeLine.length - 1; ++k) {
                    if (this.recipeLine[k + 1].contains(".")) {
                        this.recipe[k] = InfoType.getRecipeElement(this.recipeLine[k + 1].split("\\.")[0], Integer.valueOf(this.recipeLine[k + 1].split("\\.")[1]));
                    }
                    else {
                        this.recipe[k] = InfoType.getRecipeElement(this.recipeLine[k + 1], 0);
                    }
                }
                GameRegistry.addShapelessRecipe(new ItemStack((Block)this.block, this.recipeOutput, 0), this.recipe);
            }
        }
        catch (final Exception e) {
            if (this.recipe != null) {
                String msg = " : ";
                for (final Object o : this.recipe) {
                    msg = msg + " " + o;
                }
                FlansMod.log("Failed to add recipe for : " + this.shortName + msg);
            }
            else {
                FlansMod.log("Failed to add recipe for : " + this.shortName);
            }
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return null;
    }
    
    static {
        GunBoxType.lastIconIndex = 2;
        GunBoxType.gunBoxMap = new HashMap<String, GunBoxType>();
    }
}

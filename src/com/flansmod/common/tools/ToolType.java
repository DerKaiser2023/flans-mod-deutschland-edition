// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.types.TypeFile;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import java.util.HashMap;
import com.flansmod.common.types.InfoType;

public class ToolType extends InfoType
{
    public static HashMap<String, ToolType> tools;
    @SideOnly(Side.CLIENT)
    public ModelBase model;
    public boolean healPlayers;
    public boolean healDriveables;
    public int healAmount;
    public int healStrength;
    public int toolLife;
    public boolean destroyOnEmpty;
    public ArrayList<ItemStack> rechargeRecipe;
    public int EUPerCharge;
    public boolean parachute;
    public boolean remote;
    public int foodness;
    public boolean key;
    public boolean bandAid;
    public boolean superBandAid;
    public boolean surgery;
    public boolean needle;
    public boolean transfusion;
    public String summonItem;
    
    public ToolType(final TypeFile file) {
        super(file);
        this.healPlayers = false;
        this.healDriveables = false;
        this.healAmount = 0;
        this.healStrength = 0;
        this.toolLife = 0;
        this.destroyOnEmpty = true;
        this.rechargeRecipe = new ArrayList<ItemStack>();
        this.EUPerCharge = 0;
        this.parachute = false;
        this.remote = false;
        this.foodness = 0;
        this.key = false;
        this.bandAid = false;
        this.superBandAid = false;
        this.surgery = false;
        this.needle = false;
        this.transfusion = false;
        this.summonItem = null;
    }
    
    @Override
    protected void postRead(final TypeFile file) {
        ToolType.tools.put(this.shortName, this);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelBase.class);
            }
            else if (split[0].equals("Texture")) {
                this.texture = split[1];
            }
            else if (split[0].equals("Parachute")) {
                this.parachute = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("bandAid")) {
                this.bandAid = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("superBandAid")) {
                this.superBandAid = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("surgery")) {
                this.surgery = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("transfusion")) {
                this.transfusion = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("needle")) {
                this.needle = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("summonItem")) {
                this.summonItem = split[1];
            }
            else if (split[0].equals("ExplosiveRemote")) {
                this.remote = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("Key")) {
                this.key = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("Heal") || split[0].equals("HealPlayers")) {
                this.healPlayers = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("Repair") || split[0].equals("RepairVehicles")) {
                this.healDriveables = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("HealAmount") || split[0].equals("RepairAmount")) {
                this.healAmount = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("HealStrength")) {
                this.healStrength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ToolLife") || split[0].equals("ToolUses")) {
                this.toolLife = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("EUPerCharge")) {
                this.EUPerCharge = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("RechargeRecipe")) {
                for (int i = 0; i < (split.length - 1) / 2; ++i) {
                    final int amount = Integer.parseInt(split[2 * i + 1]);
                    final boolean damaged = split[2 * i + 2].contains(".");
                    final String itemName = damaged ? split[2 * i + 2].split("\\.")[0] : split[2 * i + 2];
                    final int damage = damaged ? Integer.parseInt(split[2 * i + 2].split("\\.")[1]) : 0;
                    this.rechargeRecipe.add(InfoType.getRecipeElement(itemName, amount, damage, this.shortName));
                }
            }
            else if (split[0].equals("DestroyOnEmpty")) {
                this.destroyOnEmpty = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("Food") || split[0].equals("Foodness")) {
                this.foodness = Integer.parseInt(split[1]);
            }
        }
        catch (final Exception e) {
            FlansMod.log("Reading file failed : " + this.shortName);
            e.printStackTrace();
        }
    }
    
    @Override
    public void addRecipe(final Item item) {
        super.addRecipe(item);
        if (this.rechargeRecipe.size() < 1) {
            return;
        }
        this.rechargeRecipe.add(new ItemStack(item, 1, this.toolLife));
        GameRegistry.addShapelessRecipe(new ItemStack(item, 1, 0), this.rechargeRecipe.toArray());
    }
    
    public static ToolType getType(final String shortName) {
        return ToolType.tools.get(shortName);
    }
    
    @Override
    protected void preRead(final TypeFile file) {
    }
    
    @Override
    public float GetRecommendedScale() {
        return 0.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return null;
    }
    
    static {
        ToolType.tools = new HashMap<String, ToolType>();
    }
}

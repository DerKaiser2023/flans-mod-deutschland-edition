// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.parts;

import net.minecraft.client.model.ModelBase;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
import com.flansmod.common.types.TypeFile;
import java.util.HashMap;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import com.flansmod.common.types.EnumType;
import java.util.List;
import com.flansmod.common.types.InfoType;

public class PartType extends InfoType
{
    public int category;
    public int stackSize;
    public float engineSpeed;
    public float fuelConsumption;
    public int fuel;
    public List<EnumType> worksWith;
    public ArrayList<ItemStack> partBoxRecipe;
    public boolean useRFPower;
    public int RFDrawRate;
    public static HashMap<EnumType, PartType> defaultEngines;
    public static List<PartType> parts;
    
    public PartType(final TypeFile file) {
        super(file);
        this.engineSpeed = 1.0f;
        this.fuelConsumption = 1.0f;
        this.fuel = 0;
        this.worksWith = Arrays.asList(EnumType.mecha, EnumType.plane, EnumType.vehicle);
        this.partBoxRecipe = new ArrayList<ItemStack>();
        this.useRFPower = false;
        this.RFDrawRate = 1;
        PartType.parts.add(this);
    }
    
    public void postRead(final TypeFile file) {
        if (this.category == 2 && !this.useRFPower) {
            for (final EnumType type : this.worksWith) {
                if (PartType.defaultEngines.containsKey(type)) {
                    final PartType possiblyInferiorEngine = PartType.defaultEngines.get(type);
                    if (!this.isInferiorEngine(possiblyInferiorEngine)) {
                        continue;
                    }
                    PartType.defaultEngines.put(type, this);
                }
                else {
                    PartType.defaultEngines.put(type, this);
                }
            }
        }
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("Category")) {
                this.category = getCategory(split[1]);
            }
            else if (split[0].equals("StackSize")) {
                this.stackSize = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("EngineSpeed")) {
                this.engineSpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FuelConsumption")) {
                this.fuelConsumption = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Fuel")) {
                this.fuel = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("PartBoxRecipe")) {
                final ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
                for (int i = 0; i < (split.length - 2) / 2; ++i) {
                    final int amount = Integer.parseInt(split[2 * i + 2]);
                    final boolean damaged = split[2 * i + 3].contains(".");
                    final String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
                    final int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
                    stacks[i] = InfoType.getRecipeElement(itemName, amount, damage, this.shortName);
                }
                this.partBoxRecipe.addAll(Arrays.asList(stacks));
            }
            else if (split[0].equals("WorksWith")) {
                this.worksWith = new ArrayList<EnumType>();
                for (int j = 0; j < split.length - 1; ++j) {
                    this.worksWith.add(EnumType.get(split[j + 1]));
                }
            }
            else if (split[0].equals("UseRF") || split[0].equals("UseRFPower")) {
                this.useRFPower = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("RFDrawRate")) {
                this.RFDrawRate = Integer.parseInt(split[1]);
            }
        }
        catch (final Exception e) {
            System.out.println("Reading part file failed.");
            e.printStackTrace();
        }
    }
    
    public boolean isInferiorEngine(final PartType quitePossiblyAnInferiorEngine) {
        return this.engineSpeed > quitePossiblyAnInferiorEngine.engineSpeed;
    }
    
    public static PartType getPart(final String s) {
        for (final PartType part : PartType.parts) {
            if (part.shortName.equals(s)) {
                return part;
            }
        }
        return null;
    }
    
    private static int getCategory(final String s) {
        if (s.equals("Cockpit")) {
            return 0;
        }
        if (s.equals("Wing")) {
            return 1;
        }
        if (s.equals("Engine")) {
            return 2;
        }
        if (s.equals("Propeller")) {
            return 3;
        }
        if (s.equals("Bay")) {
            return 4;
        }
        if (s.equals("Tail")) {
            return 5;
        }
        if (s.equals("Wheel")) {
            return 6;
        }
        if (s.equals("Chassis")) {
            return 7;
        }
        if (s.equals("Turret")) {
            return 8;
        }
        if (s.equals("Fuel")) {
            return 9;
        }
        if (s.equals("Misc")) {
            return 10;
        }
        return 10;
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
        PartType.defaultEngines = new HashMap<EnumType, PartType>();
        PartType.parts = new ArrayList<PartType>();
    }
}

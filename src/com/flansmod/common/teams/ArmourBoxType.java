// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;
import java.util.HashMap;
import java.util.ArrayList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import com.flansmod.common.types.InfoType;

public class ArmourBoxType extends InfoType
{
    public String topTexturePath;
    public String sideTexturePath;
    public String bottomTexturePath;
    @SideOnly(Side.CLIENT)
    public IIcon top;
    @SideOnly(Side.CLIENT)
    public IIcon side;
    @SideOnly(Side.CLIENT)
    public IIcon bottom;
    public BlockArmourBox block;
    public ArrayList<ArmourBoxEntry> pages;
    public static HashMap<String, ArmourBoxType> boxes;
    
    public ArmourBoxType(final TypeFile file) {
        super(file);
        this.pages = new ArrayList<ArmourBoxEntry>();
    }
    
    public void preRead(final TypeFile file) {
    }
    
    public void postRead(final TypeFile file) {
        ArmourBoxType.boxes.put(this.shortName, this);
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
            if (split[0].toLowerCase().equals("addarmour") || split[0].toLowerCase().equals("addarmor")) {
                String name = split[2];
                for (int i = 3; i < split.length; ++i) {
                    name = name + " " + split[i];
                }
                final ArmourBoxEntry entry = new ArmourBoxEntry(split[1], name);
                for (int j = 0; j < 4; ++j) {
                    String line = null;
                    line = file.readLine();
                    if (line != null) {
                        if (line.startsWith("//")) {
                            --j;
                        }
                        else {
                            final String[] lineSplit = line.split(" ");
                            entry.armours[j] = ArmourType.getArmourType(lineSplit[0]);
                            for (int k = 0; k < (lineSplit.length - 1) / 2; ++k) {
                                ItemStack stack = null;
                                if (lineSplit[k * 2 + 1].contains(".")) {
                                    stack = InfoType.getRecipeElement(lineSplit[k * 2 + 1].split("\\.")[0], Integer.valueOf(lineSplit[k * 2 + 2]), Integer.valueOf(lineSplit[k * 2 + 1].split("\\.")[1]), this.shortName);
                                }
                                else {
                                    stack = InfoType.getRecipeElement(lineSplit[k * 2 + 1], Integer.valueOf(lineSplit[k * 2 + 2]), 0, this.shortName);
                                }
                                if (stack != null) {
                                    entry.requiredStacks[j].add(stack);
                                }
                            }
                        }
                    }
                }
                this.pages.add(entry);
            }
        }
        catch (final Exception e) {
            FlansMod.log("Reading gun box file failed : " + this.shortName);
            e.printStackTrace();
        }
    }
    
    public static ArmourBoxType getBox(final String boxShortName) {
        return ArmourBoxType.boxes.get(boxShortName);
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
        ArmourBoxType.boxes = new HashMap<String, ArmourBoxType>();
    }
    
    public class ArmourBoxEntry
    {
        public String shortName;
        public String name;
        public ArmourType[] armours;
        public ArrayList<ItemStack>[] requiredStacks;
        
        public ArmourBoxEntry(final String s, final String s1) {
            this.name = "";
            this.shortName = s;
            this.name = s1;
            this.armours = new ArmourType[4];
            this.requiredStacks = new ArrayList[4];
            for (int i = 0; i < 4; ++i) {
                this.requiredStacks[i] = new ArrayList<ItemStack>();
            }
        }
    }
}

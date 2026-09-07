package com.flansmod.common.teams;

import com.hbm.util.ArmorRegistry;
import com.hbm.util.ArmorRegistry.HazardClass;

import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.FlansMod;
import java.util.ArrayList;
import java.util.HashMap;
import net.minecraft.client.model.ModelBase;

public class GasMaskFilterType extends InfoType
{
    public static HashMap<String, GasMaskFilterType> filters;
    public int filterLife;
    public ArrayList<HazardClass> hazards;
    
    public GasMaskFilterType(final TypeFile file) {
        super(file);
        this.filterLife = 20000;
        this.hazards = new ArrayList<HazardClass>();
    }
    
    @Override
    protected void preRead(final TypeFile file) {
    }
    
    @Override
    protected void postRead(final TypeFile file) {
        GasMaskFilterType.filters.put(this.shortName, this);
        if(FlansMod.gasMaskFilterItems != null) {
            for(ItemGasMaskFilter item : FlansMod.gasMaskFilterItems) {
                if(item.type == this) {
                    if(this.hazards.isEmpty()) {
                        ArmorRegistry.registerHazard(item, HazardClass.PARTICLE_COARSE, HazardClass.PARTICLE_FINE, HazardClass.GAS_LUNG, HazardClass.GAS_BLISTERING, HazardClass.BACTERIA, HazardClass.GAS_MONOXIDE);
                    } else {
                        ArmorRegistry.registerHazard(item, this.hazards.toArray(new HazardClass[0]));
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if(split[0].equals("FilterLife")) {
                this.filterLife = Integer.parseInt(split[1]);
            }
            else if(split[0].equals("Hazards")) {
                for(int i = 1; i < split.length; i++) {
                    HazardClass h = HazardClass.valueOf(split[i]);
                    if(h != null) {
                        this.hazards.add(h);
                    }
                }
            }
        }
        catch(final Exception e) {
            FlansMod.log("Reading file failed : " + this.shortName);
            e.printStackTrace();
        }
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
        GasMaskFilterType.filters = new HashMap<String, GasMaskFilterType>();
    }
}

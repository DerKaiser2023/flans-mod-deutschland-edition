package com.flansmod.common.teams;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import net.minecraft.item.Item;

public class RTMHazardCompat {
    private static boolean initialized = false;
    private static Method registerHazardMethod;
    private static Class<?> hazardClassClass;

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void registerGasMaskHelmet(Item item) {
        registerGasMaskHelmet(item, (String[]) null);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void registerGasMaskHelmet(Item item, String[] hazardNames) {
        if (!initialized) {
            try {
                Class<?> armorRegistry = Class.forName("com.hbm.util.ArmorRegistry");
                hazardClassClass = Class.forName("com.hbm.util.ArmorRegistry$HazardClass");
                Class<?> arrayType = Array.newInstance(hazardClassClass, 0).getClass();
                registerHazardMethod = armorRegistry.getMethod("registerHazard", Item.class, arrayType);
                initialized = true;
            } catch (Exception e) {
                return;
            }
        }

        if (registerHazardMethod == null) {
            return;
        }

        if (hazardNames == null || hazardNames.length == 0) {
            hazardNames = new String[] {
                "PARTICLE_FINE", "PARTICLE_COARSE", "GAS_BLISTERING",
                "GAS_LUNG", "BACTERIA", "POISON", "GAS_MONOXIDE"
            };
        }

        try {
            Object hazards = Array.newInstance(hazardClassClass, hazardNames.length);
            for (int i = 0; i < hazardNames.length; i++) {
                Array.set(hazards, i, Enum.valueOf((Class) hazardClassClass, hazardNames[i]));
            }
            registerHazardMethod.invoke(null, item, hazards);
        } catch (Exception e) {
            // RTM not fully loaded or registration failed
        }
    }
}
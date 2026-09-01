// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui.config;

import net.minecraftforge.common.config.ConfigElement;
import com.flansmod.common.FlansMod;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(final GuiScreen parent) {
        super(parent, new ConfigElement(FlansMod.configFile.getCategory("general")).getChildElements(), "flansmod", false, false, GuiConfig.getAbridgedConfigPath(FlansMod.configFile.toString()));
    }
}

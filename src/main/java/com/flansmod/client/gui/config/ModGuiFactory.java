// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui.config;

import java.util.Set;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.Minecraft;
import cpw.mods.fml.client.IModGuiFactory;

public class ModGuiFactory implements IModGuiFactory
{
    public void initialize(final Minecraft minecraftInstance) {
    }
    
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return (Class<? extends GuiScreen>)ModGuiConfig.class;
    }
    
    public Set<IModGuiFactory.RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }
    
    public IModGuiFactory.RuntimeOptionGuiHandler getHandlerFor(final IModGuiFactory.RuntimeOptionCategoryElement element) {
        return null;
    }
}

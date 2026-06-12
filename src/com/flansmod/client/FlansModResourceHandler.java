// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.util.ResourceLocation;
import com.flansmod.common.types.InfoType;
import java.util.HashMap;

public class FlansModResourceHandler
{
    private static HashMap<InfoType, ResourceLocation> iconMap;
    private static HashMap<InfoType, ResourceLocation> textureMap;
    private static HashMap<Paintjob, ResourceLocation> paintjobMap;
    private static HashMap<Paintjob, ResourceLocation> paintjobIconMap;
    private static HashMap<String, ResourceLocation> scopeMap;
    private static HashMap<String, ResourceLocation> soundMap;
    private static HashMap<String, ResourceLocation> auxiliaryMap;
    
    public static ResourceLocation getIcon(final PaintableType paintableType, final Paintjob paintjob) {
        if (FlansModResourceHandler.paintjobIconMap.containsKey(paintjob)) {
            return FlansModResourceHandler.paintjobIconMap.get(paintjob);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "textures/items/" + paintjob.iconName + ".png");
        FlansModResourceHandler.paintjobIconMap.put(paintjob, resLoc);
        return resLoc;
    }
    
    public static ResourceLocation getIcon(final InfoType infoType) {
        if (FlansModResourceHandler.iconMap.containsKey(infoType)) {
            return FlansModResourceHandler.iconMap.get(infoType);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "textures/items/" + infoType.iconPath + ".png");
        FlansModResourceHandler.iconMap.put(infoType, resLoc);
        return resLoc;
    }
    
    public static ResourceLocation getTexture(final InfoType infoType) {
        if (FlansModResourceHandler.textureMap.containsKey(infoType)) {
            return FlansModResourceHandler.textureMap.get(infoType);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + infoType.texture + ".png");
        if (infoType.texture != null) {
            FlansModResourceHandler.textureMap.put(infoType, resLoc);
            return resLoc;
        }
        return null;
    }
    
    public static ResourceLocation getAlternateTexture(final BulletType gunType) {
        if (FlansModResourceHandler.textureMap.containsKey(gunType)) {
            return FlansModResourceHandler.textureMap.get(gunType);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + gunType.LauncherSkin + ".png");
        if (gunType.LauncherSkin != null) {
            FlansModResourceHandler.textureMap.put(gunType, resLoc);
            return resLoc;
        }
        return null;
    }
    
    public static ResourceLocation getDeployableTexture(final GunType gunType) {
        if (FlansModResourceHandler.textureMap.containsKey(gunType)) {
            return FlansModResourceHandler.textureMap.get(gunType);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + gunType.deployableTexture + ".png");
        FlansModResourceHandler.textureMap.put(gunType, resLoc);
        return resLoc;
    }
    
    public static ResourceLocation getScope(final String scopeTexture) {
        if (FlansModResourceHandler.scopeMap.containsKey(scopeTexture)) {
            return FlansModResourceHandler.scopeMap.get(scopeTexture);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "gui/" + scopeTexture + ".png");
        FlansModResourceHandler.scopeMap.put(scopeTexture, resLoc);
        return resLoc;
    }
    
    public static ResourceLocation getSound(final String sound) {
        if (FlansModResourceHandler.soundMap.containsKey(sound)) {}
        final ResourceLocation resLoc = new ResourceLocation("flansmod", sound);
        FlansModResourceHandler.soundMap.put(sound, resLoc);
        return resLoc;
    }
    
    public static ResourceLocation getPaintjobTexture(final Paintjob paintjob) {
        if (FlansModResourceHandler.paintjobMap.containsKey(paintjob)) {
            return FlansModResourceHandler.paintjobMap.get(paintjob);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + paintjob.textureName + ".png");
        FlansModResourceHandler.paintjobMap.put(paintjob, resLoc);
        return resLoc;
    }
    
    public static ResourceLocation getAuxiliaryTexture(final String texture) {
        if (FlansModResourceHandler.auxiliaryMap.containsKey(texture)) {
            return FlansModResourceHandler.auxiliaryMap.get(texture);
        }
        final ResourceLocation resLoc = new ResourceLocation("flansmod", "skins/" + texture + ".png");
        FlansModResourceHandler.auxiliaryMap.put(texture, resLoc);
        return resLoc;
    }
    
    static {
        FlansModResourceHandler.iconMap = new HashMap<InfoType, ResourceLocation>();
        FlansModResourceHandler.textureMap = new HashMap<InfoType, ResourceLocation>();
        FlansModResourceHandler.paintjobMap = new HashMap<Paintjob, ResourceLocation>();
        FlansModResourceHandler.paintjobIconMap = new HashMap<Paintjob, ResourceLocation>();
        FlansModResourceHandler.scopeMap = new HashMap<String, ResourceLocation>();
        FlansModResourceHandler.soundMap = new HashMap<String, ResourceLocation>();
        FlansModResourceHandler.auxiliaryMap = new HashMap<String, ResourceLocation>();
    }
}

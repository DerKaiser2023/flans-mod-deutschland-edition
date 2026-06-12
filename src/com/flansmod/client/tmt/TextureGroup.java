// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import java.util.ArrayList;

public class TextureGroup
{
    public ArrayList<TexturedPolygon> poly;
    public String texture;
    
    public TextureGroup() {
        this.poly = new ArrayList<TexturedPolygon>();
        this.texture = "";
    }
    
    public void addPoly(final TexturedPolygon polygon) {
        this.poly.add(polygon);
    }
    
    public void loadTexture() {
        this.loadTexture(-1);
    }
    
    public void loadTexture(final int defaultTexture) {
        if (!this.texture.equals("")) {
            final TextureManager renderengine = RenderManager.field_78727_a.field_78724_e;
            renderengine.func_110577_a(new ResourceLocation("", this.texture));
        }
        else if (defaultTexture > -1) {
            RenderManager.field_78727_a.field_78724_e.func_110577_a(new ResourceLocation("", ""));
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import java.util.List;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.EntityFlagpole;
import org.lwjgl.opengl.GL11;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.teams.EntityFlag;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.Render;

public class RenderFlag extends Render
{
    private static final ResourceLocation texture;
    public ModelFlagpole modelFlagpole;
    public static float angle;
    
    public RenderFlag() {
        this.modelFlagpole = new ModelFlagpole();
    }
    
    public void func_76986_a(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.func_110777_b(entity);
        final EntityFlag flag = (EntityFlag)entity;
        final int teamID = flag.getTeamID();
        final Team team = FlansModClient.getTeam(teamID);
        if (team == null) {
            switch (teamID) {
                case 0: {
                    GL11.glColor3f(0.5019608f, 0.5019608f, 0.5019608f);
                    break;
                }
                case 1: {
                    GL11.glColor3f(0.2509804f, 0.2509804f, 0.2509804f);
                    break;
                }
                case 2: {
                    GL11.glColor3f(0.6313726f, 0.49803922f, 1.0f);
                    break;
                }
                case 3: {
                    GL11.glColor3f(1.0f, 0.49803922f, 0.7137255f);
                    break;
                }
            }
        }
        else {
            final int colour = team.teamColour;
            GL11.glColor3f((colour >> 16 & 0xFF) / 255.0f, (colour >> 8 & 0xFF) / 255.0f, (colour & 0xFF) / 255.0f);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0f, 1.0f, 0.0f);
        final List ents = flag.field_70170_p.func_72872_a((Class)EntityFlagpole.class, flag.field_70121_D.func_72314_b(1.0, 2.0, 1.0));
        if (ents.size() == 0) {
            GL11.glRotatef(RenderFlag.angle, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(0.5f, 0.0f, 0.0f);
        }
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        this.modelFlagpole.renderFlag(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, flag);
        GL11.glPopMatrix();
    }
    
    protected ResourceLocation func_110775_a(final Entity entity) {
        return RenderFlag.texture;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "teamsMod/Flagpole.png");
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import org.lwjgl.opengl.GLContext;
import net.minecraft.client.renderer.GLAllocation;
import java.util.Arrays;
import java.nio.ByteOrder;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.ARBBufferObject;
import java.nio.ShortBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ByteBuffer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;

@SideOnly(Side.CLIENT)
public class TmtTessellator extends Tessellator
{
    private static int nativeBufferSize;
    private static int trivertsInBuffer;
    public static boolean renderingWorldRenderer;
    public boolean defaultTexture;
    private int rawBufferSize;
    public int textureID;
    private static boolean convertQuadsToTriangles;
    private static boolean tryVBO;
    private static ByteBuffer byteBuffer;
    private static IntBuffer intBuffer;
    private static FloatBuffer floatBuffer;
    private static ShortBuffer shortBuffer;
    private int[] rawBuffer;
    private int vertexCount;
    private double textureU;
    private double textureV;
    private double textureW;
    private int brightness;
    private int color;
    private boolean hasColor;
    private boolean hasTexture;
    private boolean hasBrightness;
    private boolean hasNormals;
    private int rawBufferIndex;
    private int addedVertices;
    private boolean isColorDisabled;
    public int drawMode;
    public double xOffset;
    public double yOffset;
    public double zOffset;
    private int normal;
    public static TmtTessellator instance;
    public boolean isDrawing;
    private static boolean useVBO;
    private static IntBuffer vertexBuffers;
    private int vboIndex;
    private static int vboCount;
    private int bufferSize;
    
    private TmtTessellator(final int par1) {
        this.defaultTexture = false;
        this.rawBufferSize = 0;
        this.textureID = 0;
        this.vertexCount = 0;
        this.hasColor = false;
        this.hasTexture = false;
        this.hasBrightness = false;
        this.hasNormals = false;
        this.rawBufferIndex = 0;
        this.addedVertices = 0;
        this.isColorDisabled = false;
        this.isDrawing = false;
        this.vboIndex = 0;
    }
    
    public TmtTessellator() {
        this.defaultTexture = false;
        this.rawBufferSize = 0;
        this.textureID = 0;
        this.vertexCount = 0;
        this.hasColor = false;
        this.hasTexture = false;
        this.hasBrightness = false;
        this.hasNormals = false;
        this.rawBufferIndex = 0;
        this.addedVertices = 0;
        this.isColorDisabled = false;
        this.isDrawing = false;
        this.vboIndex = 0;
    }
    
    public int draw() {
        if (!this.isDrawing) {
            throw new IllegalStateException("Not tesselating!");
        }
        this.isDrawing = false;
        int offs = 0;
        while (offs < this.vertexCount) {
            int vtc = 0;
            if (this.drawMode == 7 && TmtTessellator.convertQuadsToTriangles) {
                vtc = Math.min(this.vertexCount - offs, TmtTessellator.trivertsInBuffer);
            }
            else {
                vtc = Math.min(this.vertexCount - offs, TmtTessellator.nativeBufferSize >> 5);
            }
            TmtTessellator.intBuffer.clear();
            TmtTessellator.intBuffer.put(this.rawBuffer, offs * 10, vtc * 10);
            TmtTessellator.byteBuffer.position(0);
            TmtTessellator.byteBuffer.limit(vtc * 40);
            offs += vtc;
            if (TmtTessellator.useVBO) {
                this.vboIndex = (this.vboIndex + 1) % TmtTessellator.vboCount;
                ARBBufferObject.glBindBufferARB(34962, TmtTessellator.vertexBuffers.get(this.vboIndex));
                ARBBufferObject.glBufferDataARB(34962, TmtTessellator.byteBuffer, 35040);
            }
            if (this.hasTexture) {
                if (TmtTessellator.useVBO) {
                    GL11.glTexCoordPointer(4, 5126, 40, 12L);
                }
                else {
                    TmtTessellator.byteBuffer.position(12);
                    GL11.glTexCoordPointer(4, 5126, 40, TmtTessellator.byteBuffer);
                }
                GL11.glEnableClientState(32888);
            }
            if (this.hasBrightness) {
                OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
                if (TmtTessellator.useVBO) {
                    GL11.glTexCoordPointer(2, 5122, 40, 36L);
                }
                else {
                    TmtTessellator.byteBuffer.position(36);
                    GL11.glTexCoordPointer(2, 5122, 40, TmtTessellator.byteBuffer);
                }
                GL11.glEnableClientState(32888);
                OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
            }
            if (this.hasColor) {
                if (TmtTessellator.useVBO) {
                    GL11.glColorPointer(4, 5121, 40, 28L);
                }
                else {
                    TmtTessellator.byteBuffer.position(28);
                    GL11.glColorPointer(4, 5121, 40, TmtTessellator.byteBuffer);
                }
                GL11.glEnableClientState(32886);
            }
            if (this.hasNormals) {
                if (TmtTessellator.useVBO) {
                    GL11.glNormalPointer(5121, 40, 32L);
                }
                else {
                    TmtTessellator.byteBuffer.position(32);
                    GL11.glNormalPointer(5121, 40, TmtTessellator.byteBuffer);
                }
                GL11.glEnableClientState(32885);
            }
            if (TmtTessellator.useVBO) {
                GL11.glVertexPointer(3, 5126, 40, 0L);
            }
            else {
                TmtTessellator.byteBuffer.position(0);
                GL11.glVertexPointer(3, 5126, 40, TmtTessellator.byteBuffer);
            }
            GL11.glEnableClientState(32884);
            if (this.drawMode == 7 && TmtTessellator.convertQuadsToTriangles) {
                GL11.glDrawArrays(4, 0, vtc);
            }
            else {
                GL11.glDrawArrays(this.drawMode, 0, vtc);
            }
            GL11.glDisableClientState(32884);
            if (this.hasTexture) {
                GL11.glDisableClientState(32888);
            }
            if (this.hasBrightness) {
                OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
                GL11.glDisableClientState(32888);
                OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
            }
            if (this.hasColor) {
                GL11.glDisableClientState(32886);
            }
            if (this.hasNormals) {
                GL11.glDisableClientState(32885);
            }
        }
        if (this.rawBufferSize > 131072 && this.rawBufferIndex < this.rawBufferSize << 3) {
            this.rawBufferSize = 0;
            this.rawBuffer = null;
        }
        final int var1 = this.rawBufferIndex * 4;
        this.reset();
        return var1;
    }
    
    private void reset() {
        this.vertexCount = 0;
        TmtTessellator.byteBuffer.clear();
        this.rawBufferIndex = 0;
        this.addedVertices = 0;
    }
    
    public void startDrawingQuads() {
        this.startDrawing(7);
    }
    
    public void startDrawing(final int par1) {
        if (this.isDrawing) {
            throw new IllegalStateException("Already tesselating!");
        }
        this.isDrawing = true;
        this.reset();
        this.drawMode = par1;
        this.hasNormals = false;
        this.hasColor = false;
        this.hasTexture = false;
        this.hasBrightness = false;
        this.isColorDisabled = false;
    }
    
    public void setTextureUV(final double par1, final double par3) {
        this.hasTexture = true;
        this.textureU = par1;
        this.textureV = par3;
        this.textureW = 1.0;
    }
    
    public void setTextureUVW(final double par1, final double par3, final double par4) {
        this.hasTexture = true;
        this.textureU = par1;
        this.textureV = par3;
        this.textureW = par4;
    }
    
    public void setBrightness(final int par1) {
        this.hasBrightness = true;
        this.brightness = par1;
    }
    
    public void setColorOpaque_F(final float par1, final float par2, final float par3) {
        this.setColorOpaque((int)(par1 * 255.0f), (int)(par2 * 255.0f), (int)(par3 * 255.0f));
    }
    
    public void setColorRGBA_F(final float par1, final float par2, final float par3, final float par4) {
        this.setColorRGBA((int)(par1 * 255.0f), (int)(par2 * 255.0f), (int)(par3 * 255.0f), (int)(par4 * 255.0f));
    }
    
    public void setColorOpaque(final int par1, final int par2, final int par3) {
        this.setColorRGBA(par1, par2, par3, 255);
    }
    
    public void setColorRGBA(int par1, int par2, int par3, int par4) {
        if (!this.isColorDisabled) {
            if (par1 > 255) {
                par1 = 255;
            }
            if (par2 > 255) {
                par2 = 255;
            }
            if (par3 > 255) {
                par3 = 255;
            }
            if (par4 > 255) {
                par4 = 255;
            }
            if (par1 < 0) {
                par1 = 0;
            }
            if (par2 < 0) {
                par2 = 0;
            }
            if (par3 < 0) {
                par3 = 0;
            }
            if (par4 < 0) {
                par4 = 0;
            }
            this.hasColor = true;
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                this.color = (par4 << 24 | par3 << 16 | par2 << 8 | par1);
            }
            else {
                this.color = (par1 << 24 | par2 << 16 | par3 << 8 | par4);
            }
        }
    }
    
    public void addVertexWithUV(final double par1, final double par3, final double par5, final double par7, final double par9) {
        this.setTextureUV(par7, par9);
        this.addVertex(par1, par3, par5);
    }
    
    public void addVertexWithUVW(final double par1, final double par3, final double par5, final double par7, final double par9, final double par10) {
        this.setTextureUVW(par7, par9, par10);
        this.addVertex(par1, par3, par5);
    }
    
    public void addVertex(final double par1, final double par3, final double par5) {
        if (this.rawBufferIndex >= this.rawBufferSize - 40) {
            if (this.rawBufferSize == 0) {
                this.rawBufferSize = 65536;
                this.rawBuffer = new int[this.rawBufferSize];
            }
            else {
                this.rawBufferSize *= 2;
                this.rawBuffer = Arrays.copyOf(this.rawBuffer, this.rawBufferSize);
            }
        }
        ++this.addedVertices;
        if (this.drawMode == 7 && TmtTessellator.convertQuadsToTriangles && this.addedVertices % 4 == 0) {
            for (int var7 = 0; var7 < 2; ++var7) {
                final int var8 = 10 * (3 - var7);
                if (this.hasTexture) {
                    this.rawBuffer[this.rawBufferIndex + 3] = this.rawBuffer[this.rawBufferIndex - var8 + 3];
                    this.rawBuffer[this.rawBufferIndex + 4] = this.rawBuffer[this.rawBufferIndex - var8 + 4];
                    this.rawBuffer[this.rawBufferIndex + 5] = this.rawBuffer[this.rawBufferIndex - var8 + 5];
                    this.rawBuffer[this.rawBufferIndex + 6] = this.rawBuffer[this.rawBufferIndex - var8 + 6];
                }
                if (this.hasBrightness) {
                    this.rawBuffer[this.rawBufferIndex + 9] = this.rawBuffer[this.rawBufferIndex - var8 + 9];
                }
                if (this.hasColor) {
                    this.rawBuffer[this.rawBufferIndex + 7] = this.rawBuffer[this.rawBufferIndex - var8 + 7];
                }
                this.rawBuffer[this.rawBufferIndex] = this.rawBuffer[this.rawBufferIndex - var8];
                this.rawBuffer[this.rawBufferIndex + 1] = this.rawBuffer[this.rawBufferIndex - var8 + 1];
                this.rawBuffer[this.rawBufferIndex + 2] = this.rawBuffer[this.rawBufferIndex - var8 + 2];
                ++this.vertexCount;
                this.rawBufferIndex += 10;
            }
        }
        if (this.hasTexture) {
            this.rawBuffer[this.rawBufferIndex + 3] = Float.floatToRawIntBits((float)this.textureU);
            this.rawBuffer[this.rawBufferIndex + 4] = Float.floatToRawIntBits((float)this.textureV);
            this.rawBuffer[this.rawBufferIndex + 5] = Float.floatToRawIntBits(0.0f);
            this.rawBuffer[this.rawBufferIndex + 6] = Float.floatToRawIntBits((float)this.textureW);
        }
        if (this.hasBrightness) {
            this.rawBuffer[this.rawBufferIndex + 9] = this.brightness;
        }
        if (this.hasColor) {
            this.rawBuffer[this.rawBufferIndex + 7] = this.color;
        }
        if (this.hasNormals) {
            this.rawBuffer[this.rawBufferIndex + 8] = this.normal;
        }
        this.rawBuffer[this.rawBufferIndex] = Float.floatToRawIntBits((float)(par1 + this.xOffset));
        this.rawBuffer[this.rawBufferIndex + 1] = Float.floatToRawIntBits((float)(par3 + this.yOffset));
        this.rawBuffer[this.rawBufferIndex + 2] = Float.floatToRawIntBits((float)(par5 + this.zOffset));
        this.rawBufferIndex += 10;
        ++this.vertexCount;
    }
    
    public void setColorOpaque_I(final int par1) {
        final int j = par1 >> 16 & 0xFF;
        final int k = par1 >> 8 & 0xFF;
        final int l = par1 & 0xFF;
        this.setColorOpaque(j, k, l);
    }
    
    public void setColorRGBA_I(final int par1, final int par2) {
        final int k = par1 >> 16 & 0xFF;
        final int l = par1 >> 8 & 0xFF;
        final int i1 = par1 & 0xFF;
        this.setColorRGBA(k, l, i1, par2);
    }
    
    public void disableColor() {
        this.isColorDisabled = true;
    }
    
    public void setNormal(final float par1, final float par2, final float par3) {
        this.hasNormals = true;
        final byte b0 = (byte)(par1 * 127.0f);
        final byte b2 = (byte)(par2 * 127.0f);
        final byte b3 = (byte)(par3 * 127.0f);
        this.normal = ((b0 & 0xFF) | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16);
    }
    
    public void setTranslation(final double par1, final double par3, final double par5) {
        this.xOffset = par1;
        this.yOffset = par3;
        this.zOffset = par5;
    }
    
    public void addTranslation(final float par1, final float par2, final float par3) {
        this.xOffset += par1;
        this.yOffset += par2;
        this.zOffset += par3;
    }
    
    static {
        TmtTessellator.nativeBufferSize = 2097152;
        TmtTessellator.trivertsInBuffer = TmtTessellator.nativeBufferSize / 48 * 6;
        TmtTessellator.renderingWorldRenderer = false;
        TmtTessellator.convertQuadsToTriangles = false;
        TmtTessellator.tryVBO = false;
        TmtTessellator.byteBuffer = GLAllocation.createDirectByteBuffer(TmtTessellator.nativeBufferSize * 4);
        TmtTessellator.intBuffer = TmtTessellator.byteBuffer.asIntBuffer();
        TmtTessellator.floatBuffer = TmtTessellator.byteBuffer.asFloatBuffer();
        TmtTessellator.shortBuffer = TmtTessellator.byteBuffer.asShortBuffer();
        TmtTessellator.instance = new TmtTessellator(2097152);
        TmtTessellator.useVBO = false;
        TmtTessellator.vboCount = 10;
        TmtTessellator.instance.defaultTexture = true;
        TmtTessellator.useVBO = (TmtTessellator.tryVBO && GLContext.getCapabilities().GL_ARB_vertex_buffer_object);
        if (TmtTessellator.useVBO) {
            ARBBufferObject.glGenBuffersARB(TmtTessellator.vertexBuffers = GLAllocation.createDirectIntBuffer(TmtTessellator.vboCount));
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

public class Coord2D
{
    public double xCoord;
    public double yCoord;
    public int uCoord;
    public int vCoord;
    
    public Coord2D(final double x, final double y) {
        this.xCoord = x;
        this.yCoord = y;
        this.uCoord = (int)Math.floor(x);
        this.vCoord = (int)Math.floor(y);
    }
    
    public Coord2D(final double x, final double y, final int u, final int v) {
        this(x, y);
        this.uCoord = u;
        this.vCoord = v;
    }
}

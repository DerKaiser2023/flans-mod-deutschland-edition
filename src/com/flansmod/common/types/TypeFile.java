// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.types;

import java.util.HashMap;
import java.util.ArrayList;

public class TypeFile
{
    public EnumType type;
    public String name;
    public final String pack;
    public ArrayList<String> lines;
    public static HashMap<EnumType, ArrayList<TypeFile>> files;
    private int readerPosition;
    
    public TypeFile(final EnumType t, final String s, final String packName) {
        this(t, s, packName, true);
    }
    
    public TypeFile(final EnumType t, final String s, final String packName, final boolean addToTypeFileList) {
        this.readerPosition = 0;
        this.type = t;
        this.name = s;
        this.pack = packName;
        this.lines = new ArrayList<String>();
        if (addToTypeFileList) {
            TypeFile.files.get(this.type).add(this);
        }
    }
    
    public String readLine() {
        if (this.readerPosition == this.lines.size()) {
            return null;
        }
        return this.lines.get(this.readerPosition++);
    }
    
    static {
        TypeFile.files = new HashMap<EnumType, ArrayList<TypeFile>>();
        for (final EnumType type : EnumType.values()) {
            TypeFile.files.put(type, new ArrayList<TypeFile>());
        }
    }
}

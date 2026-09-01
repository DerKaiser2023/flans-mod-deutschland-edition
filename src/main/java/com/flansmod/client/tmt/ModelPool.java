// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import java.util.HashMap;
import java.io.File;
import cpw.mods.fml.common.Loader;
import java.util.Map;

public class ModelPool
{
    private static Map<String, ModelPoolEntry> modelMap;
    private static String[] resourceDir;
    public static final Class OBJ;
    
    public static ModelPoolEntry addFile(final String file, final Class modelClass, final Map<String, TransformGroup> group, final Map<String, TextureGroup> textureGroup) {
        ModelPoolEntry entry = null;
        if (ModelPool.modelMap.containsKey(file)) {
            entry = ModelPool.modelMap.get(file);
            entry.applyGroups(group, textureGroup);
            return entry;
        }
        try {
            entry = (ModelPoolEntry) modelClass.newInstance();
        }
        catch (final Exception e) {
            if (entry != null) {
                System.out.println("A new " + entry.getClass().getName() + " could not be initialized.");
            }
            System.out.println(e.getMessage());
            return null;
        }
        File modelFile = null;
        String absPath;
        for (int i = 0; i < ModelPool.resourceDir.length && (modelFile == null || !modelFile.exists()); modelFile = entry.checkValidPath(absPath + file), ++i) {
            absPath = new File(Loader.instance().getConfigDir().getParent(), ModelPool.resourceDir[i]).getAbsolutePath();
            if (!absPath.endsWith("/") || !absPath.endsWith("\\")) {
                absPath += "/";
            }
        }
        if (modelFile == null || !modelFile.exists()) {
            System.out.println("The model with the name " + file + " does not exist.");
            return null;
        }
        entry.groups = new HashMap<String, TransformGroupBone>();
        entry.textures = new HashMap<String, TextureGroup>();
        entry.name = file;
        entry.setGroup("0");
        entry.setTextureGroup("0");
        entry.getModel(modelFile);
        entry.applyGroups(group, textureGroup);
        ModelPool.modelMap.put(file, entry);
        return entry;
    }
    
    static {
        ModelPool.modelMap = new HashMap<String, ModelPoolEntry>();
        ModelPool.resourceDir = new String[] { "/resources/models/", "/resources/mod/models/", "/Flan/" };
        OBJ = ModelPoolObjEntry.class;
    }
}

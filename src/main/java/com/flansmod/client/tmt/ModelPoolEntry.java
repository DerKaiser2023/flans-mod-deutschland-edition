// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.io.File;
import java.util.Map;

public abstract class ModelPoolEntry
{
    public String name;
    public PositionTransformVertex[] vertices;
    public TexturedPolygon[] faces;
    public Map<String, TransformGroupBone> groups;
    public Map<String, TextureGroup> textures;
    protected TransformGroupBone group;
    protected TextureGroup texture;
    protected String[] fileExtensions;
    
    public File checkValidPath(final String path) {
        File file = null;
        String absPath;
        for (int index = 0; index < this.fileExtensions.length && (file == null || !file.exists()); file = new File(absPath), ++index) {
            absPath = path;
            if (!path.endsWith("." + this.fileExtensions[index])) {
                absPath = absPath + "." + this.fileExtensions[index];
            }
        }
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }
    
    public abstract void getModel(final File p0);
    
    protected void setGroup(final String groupName) {
        this.setGroup(groupName, new Bone(0.0f, 0.0f, 0.0f, 0.0f), 1.0);
    }
    
    protected void setGroup(final String groupName, final Bone bone, final double weight) {
        if (this.groups.size() == 0 || !this.groups.containsKey(groupName)) {
            this.groups.put(groupName, new TransformGroupBone(bone, weight));
        }
        this.group = this.groups.get(groupName);
    }
    
    protected void setTextureGroup(final String groupName) {
        if (this.textures.size() == 0 || !this.textures.containsKey(groupName)) {
            this.textures.put(groupName, new TextureGroup());
        }
        this.texture = this.textures.get(groupName);
    }
    
    protected void applyGroups(final Map<String, TransformGroup> groupsMap, final Map<String, TextureGroup> texturesMap) {
        final Set<String> groupsCol = this.groups.keySet();
        final Collection<String> texturesCol = this.textures.keySet();
        final Iterator<String> groupsItr = groupsCol.iterator();
        final Iterator<String> texturesItr = texturesCol.iterator();
        while (groupsItr.hasNext()) {
            int nameIdx;
            String groupKey;
            String currentGroup;
            for (nameIdx = 0, groupKey = groupsItr.next(), currentGroup = this.name + "_" + nameIdx + ":" + groupKey; groupsMap.size() > 0 && groupsMap.containsKey(currentGroup); currentGroup = this.name + "_" + nameIdx + ":" + groupKey) {
                ++nameIdx;
            }
            groupsMap.put(currentGroup, this.groups.get(groupKey));
        }
        while (texturesItr.hasNext()) {
            int nameIdx;
            String groupKey;
            String currentGroup;
            for (nameIdx = 0, groupKey = texturesItr.next(), currentGroup = this.name + "_" + nameIdx + ":" + groupKey; groupsMap.size() > 0 && texturesMap.containsKey(currentGroup); currentGroup = this.name + "_" + nameIdx + ":" + groupKey) {
                ++nameIdx;
            }
            texturesMap.put(currentGroup, this.textures.get(groupKey));
        }
    }
}

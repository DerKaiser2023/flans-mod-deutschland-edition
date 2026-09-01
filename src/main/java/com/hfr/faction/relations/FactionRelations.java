package com.hfr.faction.relations;

import com.hfr.clowder.Clowder;
import net.minecraft.util.EnumChatFormatting;

import java.util.HashMap;
import java.util.Map;

public class FactionRelations {
    public static final Map<Object, RelationshipInfo> relations = new HashMap<Object, RelationshipInfo>() {
        @Override
        public boolean containsKey(Object key) {
            return get(key) != null;
        }

        @Override
        public RelationshipInfo get(Object key) {
            RelationshipInfo info = super.get(key);
            if (info != null) return info;

            if (key instanceof akka.japi.Pair) {
                akka.japi.Pair pair = (akka.japi.Pair) key;
                Object first = pair.first;
                Object second = pair.second;
                if (first instanceof String && second instanceof String) {
                    return lookup((String) first, (String) second);
                }
            } else if (key instanceof String) {
                String s = (String) key;
                int sep = s.indexOf('|');
                if (sep > 0) {
                    return lookup(s.substring(0, sep), s.substring(sep + 1));
                }
            }
            return null;
        }
    };

    private static RelationshipInfo lookup(String a, String b) {
        Clowder c1 = Clowder.getClowderFromName(a);
        Clowder c2 = Clowder.getClowderFromName(b);
        if (c1 == null || c2 == null) return null;
        if (c1 == c2) return new RelationshipInfo(EnumChatFormatting.WHITE.toString());
        if (c1.allies.containsKey(c2)) return new RelationshipInfo(EnumChatFormatting.GREEN.toString());
        if (c1.isAtWarWith(c2)) return new RelationshipInfo(EnumChatFormatting.RED.toString());
        return null;
    }
}

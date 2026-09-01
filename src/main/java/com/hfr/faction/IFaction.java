package com.hfr.faction;

import java.util.Collection;

public interface IFaction {
    enum PermLevel {
        PLEBEIAN,
        OFFICER,
        OWNER
    }

    String getName();

    Collection<String> getMembersOfRankAndAbove(PermLevel level);

    void removeTransportVehicle(Object entity);

    void addTransportVehicle(Object entity, Object name);
}

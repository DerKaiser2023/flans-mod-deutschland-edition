package com.hfr.faction;

import com.hfr.clowder.Clowder;
import com.hfr.clowder.FactionMemberRecord;
import com.hfr.clowder.FactionRole;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HFRFactionAdapter implements IFaction {
    private final Clowder clowder;

    public HFRFactionAdapter(Clowder clowder) {
        this.clowder = clowder;
    }

    @Override
    public String getName() {
        return clowder.name;
    }

    @Override
    public Collection<String> getMembersOfRankAndAbove(PermLevel level) {
        int minLevel;
        switch (level) {
            case OWNER:
                minLevel = FactionRole.OWNER.getPermissionLevel();
                break;
            case OFFICER:
                minLevel = FactionRole.OFFICER.getPermissionLevel();
                break;
            case PLEBEIAN:
            default:
                minLevel = FactionRole.MEMBER.getPermissionLevel();
                break;
        }

        List<String> result = new ArrayList<>();
        for (FactionMemberRecord record : clowder.memberRecords.values()) {
            if (record.role.getPermissionLevel() >= minLevel) {
                result.add(record.lastKnownName);
            }
        }
        return result;
    }

    @Override
    public void removeTransportVehicle(Object entity) {
        // No-op: the new Clowder API does not expose transport vehicle tracking.
    }
}

package com.ren.lorecraft.common.entities.enums;

import java.util.Arrays;
import java.util.Comparator;

public enum Variation {

    FIRST(0),
    SECOND(1),
    THIRD(2);

    private static final Variation[] VALUES = Arrays.stream(values()).sorted(Comparator.comparingInt(Variation::getId)).toArray(Variation[]::new);
    private final int id;

    Variation(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Variation byId(int p_234254_0_) {
        return VALUES[p_234254_0_ % VALUES.length];
    }
}

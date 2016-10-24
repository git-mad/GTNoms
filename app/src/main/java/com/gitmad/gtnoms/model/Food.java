package com.gitmad.gtnoms.model;

import android.support.annotation.NonNull;

/**
 * An item of food
 */
public class Food {
    @NonNull
    private String name;

    @NonNull
    private State state;

    enum State {
        VERIFIED,
        UNVERIFIED,
        OUT
    }

    public Food(@NonNull String name, @NonNull State state) {
        this.name = name;
        this.state = state;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public State getState() {
        return state;
    }
}

package com.gitmad.gtnoms.model;

import android.support.annotation.NonNull;

import java.util.Collections;
import java.util.List;

/**
 *
 */
public class DiningHallSection {
    @NonNull
    private String name;

    @NonNull
    private List<Food> foods;

    public DiningHallSection(@NonNull String name, @NonNull List<Food> foods) {
        this.name = name;
        this.foods = Collections.unmodifiableList(foods);
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public List<Food> getFoods() {
        return foods;
    }
}

package com.gitmad.gtnoms.model;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Represents a DiningHall, along with the dining hall sections
 * @TODO: Do we need this? Or can we just use List<DiningHallSection></DiningHallSection>
 * Created by Mohammed on 10/30/2016.
 */

public class DiningHall {
    @NonNull
    private String name;
    @NonNull
    private List<DiningHallSection> diningHallSections;

}

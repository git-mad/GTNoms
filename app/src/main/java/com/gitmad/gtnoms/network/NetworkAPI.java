package com.gitmad.gtnoms.network;

import android.support.annotation.NonNull;

import com.gitmad.gtnoms.model.DiningHallSection;
import com.gitmad.gtnoms.model.Food;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Stubs out API calls from the server.
 * Activities are going to use this class to retrieve information from the server.
 * ... but right now we're just returning example data.
 */
public class NetworkAPI {
    @NonNull
    private static List<DiningHallSection> northAvenue = Arrays.asList(
            new DiningHallSection("Grill", Arrays.asList(
                    new Food("Chipotle Patty Melt", Food.State.VERIFIED),
                    new Food("Grilled Cheese with Tomatoes on Wheat", Food.State.VERIFIED),
                    new Food("Cajun Seasoned French Fries", Food.State.VERIFIED),
                    new Food("Curly French Fries", Food.State.VERIFIED),
                    new Food("Carrot & Celery Sticks", Food.State.UNVERIFIED),
                    new Food("Curly French Fries", Food.State.UNVERIFIED)
            )),
            new DiningHallSection("OBCo", Arrays.asList(
                    new Food("Sante Fe Black Bean", Food.State.VERIFIED),
                    new Food("Vegetable Egg roll", Food.State.VERIFIED),
                    new Food("Fresh Chinese (Napa) Cabbage", Food.State.VERIFIED),
                    new Food("Farro with Sweet Corn (vegan)", Food.State.VERIFIED)
            )),
            new DiningHallSection("Desert", Arrays.asList(
                    new Food("Peanut Butter Cookies", Food.State.VERIFIED),
                    new Food("Bourbon Street Bar with Snickers Pieces", Food.State.UNVERIFIED
            ))
    ));

    @NonNull
    public static List<DiningHallSection> fetchData() {
        return northAvenue;
    }
}

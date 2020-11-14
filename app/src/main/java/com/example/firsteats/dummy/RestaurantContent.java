package com.example.firsteats.dummy;

import com.example.firsteats.model.Restaurant;
import com.example.firsteats.util.RestaurantUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class RestaurantContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Restaurant> ITEMS = new ArrayList<Restaurant>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Restaurant> ITEM_MAP = new HashMap<String, Restaurant>();

    private static final int COUNT = 25;
    public static int id;

    public static void init(Context context)
    {
        for (int i = 1; i <= COUNT; i++) {
            id = i;
            addItem(RestaurantUtil.getRandom(context));
        }
    }

    private static void addItem(Restaurant item) {
        ITEMS.add(item);
        ITEM_MAP.put(String.valueOf(id - 1), item);
    }

    /**
     * A dummy item representing a piece of content.
     */
}

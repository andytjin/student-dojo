package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andy on 24-4-2017.
 */
public class Items {

    private List<Item> items = new ArrayList<Item>();

    public List<Item> makeItems() {

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }
}

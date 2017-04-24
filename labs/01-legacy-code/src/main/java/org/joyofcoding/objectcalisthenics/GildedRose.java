package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", new NumberOfDays(10), new Value(20)));
        items.add(new Item("Aged Brie", new NumberOfDays(2), new Value(0)));
        items.add(new Item("Elixir of the Mongoose", new NumberOfDays(5), new Value(7)));
        items.add(new Item("Sulfuras, Hand of Ragnaros", new NumberOfDays(0),new Value( 80)));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", new NumberOfDays(15),new Value( 20)));
        items.add(new Item("Conjured Mana Cake", new NumberOfDays(3),new Value( 6)));
        return items;
    }




    public void updateQuality(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (!item.getName().equals("Aged Brie")
                    && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getQuality().getValue() > 0) {
                    if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                        item.getQuality().setValue(item.getQuality().getValue() - 1);
                        item.setQuality(item.getQuality());
                    }
                }
            } else {
                if (item.getQuality().getValue() < 50) {
                    item.getQuality().setValue(item.getQuality().getValue() + 1);
                    item.setQuality(item.getQuality());

                    if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getSellIn().getNumberOfDays() < 11) {
                            if (item.getQuality().getValue() < 50) {
                                item.getQuality().setValue(item.getQuality().getValue() + 1);
                                item.setQuality(item.getQuality());
                            }
                        }

                        if (item.getSellIn().getNumberOfDays() < 6) {
                            if (item.getQuality().getValue() < 50) {
                                item.getQuality().setValue(item.getQuality().getValue() + 1);
                            }
                        }
                    }
                }
            }

            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                item.getSellIn().setNumberOfDays(item.getSellIn().getNumberOfDays() - 1);
                item.setSellIn(item.getSellIn());
            }

            if (item.getSellIn().getNumberOfDays() < 0) {
                if (!item.getName().equals("Aged Brie")) {
                    if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getQuality().getValue() > 0) {
                            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                                item.getQuality().setValue(item.getQuality().getValue() - 1);
                            }
                        }
                    } else {
                        item.getQuality().setValue(item.getQuality().getValue() - item.getQuality().getValue());
                    }
                } else {
                    if (item.getQuality().getValue() < 50) {
                        item.getQuality().setValue(item.getQuality().getValue() + 1);
                    }
                }
            }
        }
    }
}

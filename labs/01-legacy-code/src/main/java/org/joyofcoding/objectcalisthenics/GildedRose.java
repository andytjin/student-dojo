package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        Items allItems = new Items();
        gildedRose.updateQuality(allItems.makeItems());
    }



    public void updateQuality(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (!item.checkName("Aged Brie")
                    && !item.checkName("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.getQuality() > 0) {
                        if (!item.checkName("Sulfuras, Hand of Ragnaros")) {
                            item.decreaseQuality();
                        }
                    }
            } else {
                if (item.getQuality() < 50) {
                    item.increaseQuality();

                    if (item.checkName("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getSellIn() < 11) {
                            if (item.getQuality() < 50) {
                                item.increaseQuality();
                            }
                        }

                        if (item.getSellIn() < 6) {
                            if (item.getQuality() < 50) {
                                item.increaseQuality();
                            }
                        }
                    }
                }
            }

            if (!item.checkName("Sulfuras, Hand of Ragnaros")) {
                item.decreaseSellin();
            }

            if (item.getSellIn() < 0) {
                if (!item.checkName("Aged Brie")) {
                    if (!item.checkName("Backstage passes to a TAFKAL80ETC concert")) {

                        if (item.getQuality() > 0) {
                            if (!item.checkName("Sulfuras, Hand of Ragnaros")) {
                                item.decreaseQuality();
                            }
                        }
                    } else {
                        item.equalQuality();
                    }
                } else {
                    if (item.getQuality() < 50) {
                        item.increaseQuality();
                    }
                }
            }
        }
    }
}

package org.joyofcoding.objectcalisthenics;

public class Item {
    private String name;
    private NumberOfDays sellIn;
    private Value quality;

    public Item(String name, NumberOfDays sellIn, Value quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public String getName() {
        return name;
    }

    public NumberOfDays getSellIn() {
        return sellIn;
    }

    public void setSellIn(NumberOfDays sellIn) {
        this.sellIn = sellIn;
    }

    public Value getQuality() {
        return quality;
    }

    public void setQuality(Value quality) {
        this.quality = quality;
    }
}

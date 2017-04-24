package org.joyofcoding.objectcalisthenics;
public class Item {
    private String name;
    private sellinNumberOfDays sellIn = new sellinNumberOfDays();
    private qualityValue quality = new qualityValue();

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn.setSellInNumberOfDays(sellIn);
        this.quality.setQualityValue(quality);
    }

    public String getName() {
        return name;
    }


    public int getSellIn() {
        return sellIn.getSellInNumberOfDays();
    }

    public void setSellIn(int sellIn) {
        this.sellIn.setSellInNumberOfDays(sellIn);
    }

    public int getQuality() {
        return quality.getQualityValue();
    }

    public void setQuality(int quality) {
        this.quality.setQualityValue(quality);
    }

    public boolean checkName(String name){
        boolean checkName = false;
        if(this.name.equals(name)){
            checkName = true;
        }
        return checkName;
    }

    public void decreaseQuality(){
        this.quality.setQualityValue(this.quality.getQualityValue() - 1);
    }

    public void increaseQuality(){
        this.quality.setQualityValue(this.quality.getQualityValue() + 1);
    }

    public void equalQuality(){
        this.quality.setQualityValue(this.quality.getQualityValue() - this.quality.getQualityValue());
    }

    public void decreaseSellin(){
        this.sellIn.setSellInNumberOfDays(this.sellIn.getSellInNumberOfDays() - 1);
    }
}
package org.joyofcoding.objectcalisthenics;

/**
 * Created by andy on 27-3-2017.
 */
public class Value {
    private int quality;

    public Value(int quality){
        this.quality = quality;
    }

    public int getValue() {
        return quality;
    }

    public void setValue(int quality) {
        this.quality = quality;
    }
}

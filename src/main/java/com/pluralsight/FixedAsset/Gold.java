package com.pluralsight.FixedAsset;

public class Gold extends FixedAsset {
    double weight;
    public Gold(double weight){
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return 2001.69;
    }
}

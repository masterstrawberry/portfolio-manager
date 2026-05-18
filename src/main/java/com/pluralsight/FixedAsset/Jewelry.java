package com.pluralsight.FixedAsset;

public class Jewelry extends FixedAsset {
    double karat;

    public Jewelry(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return 100.67;
    }
}

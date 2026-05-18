package com.pluralsight.finance.FixedAsset;

public class Jewelry extends FixedAsset {
    double karat;

    public Jewelry(String name, double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return 100.67;
    }
}

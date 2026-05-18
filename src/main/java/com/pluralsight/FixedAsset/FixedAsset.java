package com.pluralsight.finance.FixedAsset;

import com.pluralsight.finance.Valuable;

public abstract class FixedAsset implements Valuable {
    String name;
    double marketValue;

    public void Asset(String name, double value){
    }

    public abstract double getValue();

}

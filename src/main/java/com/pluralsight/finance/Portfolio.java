package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
    String name;
    String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
    public void add(Valuable asset) {
        this.assets.add(asset);
    }
    public double getValue(){
        return 90.90;
    }
    public Valuable getMostValuable(){
        return assets.getFirst();
    }
    public Valuable getLeastValuable(){
        return assets.getLast();
    }

}

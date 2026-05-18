package com.pluralsight.finance.FixedAsset;

public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue(){
        return 420.67;
    }
}

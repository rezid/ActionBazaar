package com.actionbazaar.persistence;

import java.io.Serializable;

public class Shipping implements Serializable {

    protected double cost;

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }


}

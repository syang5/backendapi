package com.mooo.ilsong02;

/**
 * Created by swyang on 8/14/16.
 */
public class OptionNews extends MarketNews {
    private double top_price;
    private double bottom_price;

    public double getTop_price() {
        return top_price;
    }

    public void setTop_price(double top_price) {
        this.top_price = top_price;
    }

    public double getBottom_price() {
        return bottom_price;
    }

    public void setBottom_price(double bottom_price) {
        this.bottom_price = bottom_price;
    }
}

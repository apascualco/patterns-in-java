package com.apascualco.pattern.structural.adapter.domain;

public class Screen implements Square {

    private int width;

    public Screen(int width) {
        this.width = width;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

}

package com.apascualco.pattern.creational.afactory.domain;

public abstract class Monitor {

    private String brand;
    private boolean curve;
    private Type screenType;
    private Resolution resolution;

    @SuppressWarnings("unused")
    private Monitor() { }

    protected Monitor(
            final String brand,
            final boolean curve,
            final Type screenType,
            final Resolution resolution
    ) {
        this.brand = brand;
        this.curve = curve;
        this.screenType = screenType;
        this.resolution = resolution;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isCurve() {
        return curve;
    }

    public Type getScreenType() {
        return screenType;
    }

    public Resolution getResolution() {
        return resolution;
    }
}

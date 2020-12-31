package com.apascualco.pattern.structural.bridge.domain;

public class Philips extends Television {

    private String branding;

    private int inch;

    public Philips(
            final ControlPanel controlPanel,
            final String branding,
            final int inch
    ) {
        super(controlPanel);
        this.branding = branding;
        this.inch = inch;
    }

    @Override
    public String getBranding() {
        return this.branding;
    }

    @Override
    public String getOptions() {
        return this.controlPanel.options();
    }

    @Override
    public int getInch() {
        return this.inch;
    }

    @Override
    public void printOptions() {
        System.out.println("4k Control panel of " + this.branding + " -> " + this.controlPanel.options() );
    }
}

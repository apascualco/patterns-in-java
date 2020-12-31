package com.apascualco.pattern.structural.bridge.domain;

public abstract class Television {

    protected final ControlPanel controlPanel;

    public Television(final ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    abstract public String getBranding();

    abstract public String getOptions();

    abstract public int getInch();

    abstract public void printOptions();
}

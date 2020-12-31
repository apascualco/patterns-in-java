package com.apascualco.pattern.creational.afactory.factory;

import com.apascualco.pattern.creational.afactory.domain.*;

public class Philips implements AbstractMonitor {

    private final static String BRAND = "Philips";

    @Override
    public Monitor create5k(final boolean curve, final Type screenType) {
        return new Monitor5K(BRAND, curve, screenType);
    }

    @Override
    public Monitor create4k(final boolean curve, final Type screenType) {
        return new Monitor4K(BRAND, curve, screenType);
    }

    @Override
    public Monitor createHD(final boolean curve, final Type screenType) {
        return new MonitorHD(BRAND, curve, screenType);
    }

    @Override
    public Monitor createDefault(final boolean curve, final Type screenType, final Resolution resolution) {
        return new MonitorDefault(BRAND, curve, screenType, resolution);
    }

}

package com.apascualco.pattern.creational.afactory.factory;

import com.apascualco.pattern.creational.afactory.domain.Monitor;
import com.apascualco.pattern.creational.afactory.domain.Resolution;
import com.apascualco.pattern.creational.afactory.domain.Type;

public interface AbstractMonitor {

    Monitor create5k(final boolean curve, final Type screenType);
    Monitor create4k(final boolean curve, final Type screenType);
    Monitor createHD(final boolean curve, final Type screenType);
    Monitor createDefault(final boolean curve, final Type screenType, final Resolution resolution);

}

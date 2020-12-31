package com.apascualco.pattern.structural.adapter.client;

import com.apascualco.pattern.structural.adapter.domain.Rectangle;

public class Area {

    public static int calculate(final Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getHeight();
    }

}

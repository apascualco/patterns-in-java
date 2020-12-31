package com.apascualco.pattern.structural.adapter;

import com.apascualco.pattern.structural.adapter.client.Area;
import com.apascualco.pattern.structural.adapter.domain.Rectangle;
import com.apascualco.pattern.structural.adapter.domain.Screen;
import com.apascualco.pattern.structural.adapter.domain.ScreenRectangleAdapter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaTest {

    @Test
    public void adapter_test() {
        final Screen screen = new Screen(5);

        final Rectangle rectangle = ScreenRectangleAdapter.of(screen);
        final int area = Area.calculate(rectangle);

        assertEquals("Width must be 5",5, rectangle.getWidth());
        assertEquals("Height must be 5",5, rectangle.getHeight());
        assertEquals("The area must be 25",25, area);
    }
}

package com.apascualco.pattern.creational.afactory;


import com.apascualco.pattern.creational.afactory.domain.*;
import com.apascualco.pattern.creational.afactory.factory.AbstractMonitor;
import com.apascualco.pattern.creational.afactory.factory.LG;
import org.junit.Test;

import static com.apascualco.pattern.creational.afactory.domain.Type.LCD;
import static com.apascualco.pattern.creational.afactory.domain.Type.VGA;
import static org.junit.Assert.*;

public class LGFactoryTest {

    private final String BRAND = "LG";

    private AbstractMonitor factory;

    public LGFactoryTest() {
        this.factory = new LG();
    }

    @Test
    public void create_LG() {

        final Monitor monitor = this.factory.createDefault(false, LCD, new Resolution(900, 720));

        assertTrue(monitor instanceof MonitorDefault);
        assertEquals(monitor.getBrand(), BRAND);
        assertFalse(monitor.isCurve());
        assertEquals(monitor.getScreenType(), LCD);
        assertNotNull(monitor.getResolution());
        assertEquals(monitor.getResolution().getWidth(), 900);
        assertEquals(monitor.getResolution().getHeight(), 720);
    }

    @Test
    public void create_monitor_4k() {

        final Monitor monitor = this.factory.create4k(true, VGA);

        assertTrue(monitor instanceof Monitor4K);
        assertEquals(monitor.getBrand(), BRAND);
        assertEquals(monitor.getResolution().getWidth(), 3656);
        assertEquals(monitor.getResolution().getHeight(), 2664);
    }

    @Test
    public void create_monitor_5k() {

        final Monitor monitor = this.factory.create5k(true, LCD);

        assertTrue(monitor instanceof Monitor5K);
        assertEquals(monitor.getBrand(), BRAND);
        assertEquals(monitor.getResolution().getWidth(), 5120);
        assertEquals(monitor.getResolution().getHeight(), 2880);
    }

    @Test
    public void create_monitor_HD() {

        final Monitor monitor = this.factory.createHD(true, LCD);

        assertTrue(monitor instanceof MonitorHD);
        assertEquals(monitor.getBrand(), BRAND);
        assertEquals(monitor.getResolution().getWidth(), 1920);
        assertEquals(monitor.getResolution().getHeight(), 1080);
    }

}

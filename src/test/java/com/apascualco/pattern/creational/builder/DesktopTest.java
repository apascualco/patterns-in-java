package com.apascualco.pattern.creational.builder;

import com.apascualco.pattern.creational.builder.constructor.DesktopBuilder;
import com.apascualco.pattern.creational.builder.constructor.Director;
import com.apascualco.pattern.creational.builder.domain.Desktop;
import com.apascualco.pattern.creational.builder.domain.Type;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesktopTest {

    @Test
    public void desktop_construct_pc_design() {

        final DesktopBuilder desktopBuilder = new DesktopBuilder();
        Director.constructPCDesign(desktopBuilder);

        final Desktop design = desktopBuilder.build();
        assertEquals( Type.PRO, design.getType());
        assertEquals("i7-7700K 4.2GHZ", design.getProcessor());
        assertEquals(128, design.getRam());
    }

    @Test
    public void desktop_construct_pc_gaming() {
        final DesktopBuilder desktopBuilder = new DesktopBuilder();

        Director.constructPCGaming(desktopBuilder);
        final Desktop gaming = desktopBuilder.build();
        assertEquals(Type.GAMING, gaming.getType());
        assertEquals("i7-7700K 4.2GHZ", gaming.getProcessor());
        assertEquals(64, gaming.getRam());
    }

    @Test
    public void desktop_construct_pc_mobility() {
        final DesktopBuilder desktopBuilder = new DesktopBuilder();

        Director.constructPCMobility(desktopBuilder);
        final Desktop mobility = desktopBuilder.build();
        assertEquals(Type.PRO, mobility.getType());
        assertEquals("i5-7500", mobility.getProcessor());
        assertEquals(32, mobility.getRam());
    }

    @Test
    public void desktop_construct_pc_travel() {
        final DesktopBuilder desktopBuilder = new DesktopBuilder();

        Director.constructPCTravel(desktopBuilder);
        final Desktop travel = desktopBuilder.build();
        assertEquals(Type.HOME, travel.getType());
        assertEquals("i5-7500", travel.getProcessor());
        assertEquals(18, travel.getRam());
    }

}

package com.apascualco.pattern.structural.bridge;

import com.apascualco.pattern.structural.bridge.domain.*;
import org.junit.Test;

import javax.naming.ldap.Control;

import static org.junit.Assert.assertEquals;

public class BridgeTest {

    @Test
    public void philip_bridge_control_panel_test() {
        final ControlPanel controlPanel = new BasicPanel();
        final String branding = "PHILIPS";
        final int inch = 43;
        final Television philips = new Philips(controlPanel, branding, inch);
        assertEquals("The philips inch must be 43", inch, philips.getInch());
        assertEquals("The philips branding must be PHILIPS", branding, philips.getBranding());
        assertEquals("The philips control panel must be basic panel", controlPanel.options(), philips.getOptions());
        philips.printOptions();
    }

    @Test
    public void lg_bridge_control_panel_test() {
        final ControlPanel controlPanel = new AdvancedPanel();
        final String branding = "LG";
        final int inch = 32;
        final Television lg = new LG(controlPanel, branding, inch);
        assertEquals("The lg inch must be 32", inch, lg.getInch());
        assertEquals("The lg branding must be LG", branding, lg.getBranding());
        assertEquals("The lg control panel must be advanced panel", controlPanel.options(), lg.getOptions());
        lg.printOptions();
    }

    @Test
    public void samsung_bridge_control_panel_test() {
        final ControlPanel controlPanel = new BasicPanel();
        final String branding = "SAMSUNG";
        final int inch = 24;
        final Television samsung = new Samsung(controlPanel, branding, inch);
        assertEquals("The samsung inch must be 24", inch, samsung.getInch());
        assertEquals("The samsung branding must be SAMSUNG", branding, samsung.getBranding());
        assertEquals("The samsung control panel must be basic panel", controlPanel.options(), samsung.getOptions());
        samsung.printOptions();
    }

    @Test
    public void sony_bridge_control_panel_test() {
        final ControlPanel controlPanel = new AdvancedPanel();
        final String branding = "SONY";
        final int inch = 60;
        final Television sony = new Sony(controlPanel, branding, inch);
        assertEquals("The sony inch must be 60", inch, sony.getInch());
        assertEquals("The sony branding must be SONY", branding, sony.getBranding());
        assertEquals("The sony control panel must be advanced panel", controlPanel.options(), sony.getOptions());
        sony.printOptions();
    }
}

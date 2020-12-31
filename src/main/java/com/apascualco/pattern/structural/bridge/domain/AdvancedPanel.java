package com.apascualco.pattern.structural.bridge.domain;

public class AdvancedPanel implements ControlPanel {

    @Override
    public String options() {
        return "\nVOLUME [+][-] \nCHANNEL [NEXT][PREVIOUS] \nTELETEXTO \nBRIGHTNESS ";
    }

}

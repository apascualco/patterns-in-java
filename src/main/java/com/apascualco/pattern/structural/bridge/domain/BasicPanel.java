package com.apascualco.pattern.structural.bridge.domain;

public class BasicPanel implements ControlPanel {

    @Override
    public String options() {
        return "\nVOLUME [+][-] \nCHANNEL [NEXT][PREVIOUS]";
    }

}

package com.apascualco.pattern.creational.builder.domain;

public class Desktop {

    private final Type type;
    private final String processor;
    private final int ram;
    private final GraphicCard graphicCard;
    private final MotherBoard motherBoard;

    public Desktop(
            final Type type,
            final String processor,
            final int ram,
            final GraphicCard graphicCard,
            final MotherBoard motherBoard
    ) {
        this.type = type;
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.motherBoard = motherBoard;
    }

    public Type getType() {
        return type;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

}

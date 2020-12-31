package com.apascualco.pattern.creational.builder.constructor;

import com.apascualco.pattern.creational.builder.domain.GraphicCard;
import com.apascualco.pattern.creational.builder.domain.MotherBoard;
import com.apascualco.pattern.creational.builder.domain.NoteBook;
import com.apascualco.pattern.creational.builder.domain.Type;

public class NoteBookBuilder implements DeviceBuilder {

    private Type type;
    private String processor;
    private int ram;
    private GraphicCard graphicCard;
    private MotherBoard motherBoard;

    @Override
    public NoteBookBuilder type(final Type type) {
        this.type = type;
        return this;
    }

    @Override
    public NoteBookBuilder processor(final String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public NoteBookBuilder ram(final int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public NoteBookBuilder graphicCard(final GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }

    @Override
    public DeviceBuilder motherBoard(final MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    public NoteBook build() {
        return new NoteBook(this.type, this.processor, this.ram, this.graphicCard, this.motherBoard);
    }

}

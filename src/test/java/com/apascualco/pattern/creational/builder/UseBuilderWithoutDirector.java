package com.apascualco.pattern.creational.builder;

import com.apascualco.pattern.creational.builder.constructor.DesktopBuilder;
import com.apascualco.pattern.creational.builder.domain.Desktop;
import com.apascualco.pattern.creational.builder.domain.GraphicCard;
import com.apascualco.pattern.creational.builder.domain.MotherBoard;
import com.apascualco.pattern.creational.builder.domain.Type;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UseBuilderWithoutDirector {

    @Test
    public void use_builder_and_create_desktop() {

        final Desktop desktop = new DesktopBuilder().type(Type.GAMING)
                .processor("i7-7700K 4.2GHZ")
                .ram(64)
                .graphicCard(new GraphicCard())
                .motherBoard(new MotherBoard())
                .build();

        assertEquals(desktop.getType(), Type.GAMING);
        assertEquals(desktop.getProcessor(), "i7-7700K 4.2GHZ");
        assertEquals(desktop.getRam(), 64);
    }
}

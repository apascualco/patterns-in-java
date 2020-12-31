package com.apascualco.pattern.creational.builder.constructor;

import com.apascualco.pattern.creational.builder.domain.GraphicCard;
import com.apascualco.pattern.creational.builder.domain.MotherBoard;
import com.apascualco.pattern.creational.builder.domain.Type;

public class Director {

    public static void constructPCGaming(final DeviceBuilder deviceBuilder) {
        deviceBuilder.type(Type.GAMING)
                .processor("i7-7700K 4.2GHZ")
                .ram(64)
                .graphicCard(new GraphicCard())
                .motherBoard(new MotherBoard());
    }

    public static void constructPCTravel(final DeviceBuilder deviceBuilder) {
        deviceBuilder.type(Type.HOME)
                .processor("i5-7500")
                .ram(18)
                .graphicCard(new GraphicCard())
                .motherBoard(new MotherBoard());
    }

    public static void constructPCMobility(final DeviceBuilder deviceBuilder) {
        deviceBuilder.type(Type.PRO)
                .processor("i5-7500")
                .ram(32)
                .graphicCard(new GraphicCard())
                .motherBoard(new MotherBoard());
    }

    public static void constructPCDesign(final DeviceBuilder deviceBuilder) {
        deviceBuilder.type(Type.PRO)
                .processor("i7-7700K 4.2GHZ")
                .ram(128)
                .graphicCard(new GraphicCard())
                .motherBoard(new MotherBoard());
    }
}

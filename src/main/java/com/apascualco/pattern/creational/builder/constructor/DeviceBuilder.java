package com.apascualco.pattern.creational.builder.constructor;

import com.apascualco.pattern.creational.builder.domain.GraphicCard;
import com.apascualco.pattern.creational.builder.domain.MotherBoard;
import com.apascualco.pattern.creational.builder.domain.Type;

public interface DeviceBuilder {

    DeviceBuilder type(Type type);
    DeviceBuilder processor(String processor);
    DeviceBuilder ram(int ram);
    DeviceBuilder graphicCard(GraphicCard graphicCard);
    DeviceBuilder motherBoard(MotherBoard motherBoard);

}

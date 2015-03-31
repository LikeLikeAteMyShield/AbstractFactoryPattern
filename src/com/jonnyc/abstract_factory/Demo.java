package com.jonnyc.abstract_factory;

import com.jonnyc.abstract_factory.model.Color;
import com.jonnyc.standard_factory.model.Shape;

public class Demo {

    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory shapeFactory = factoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = factoryProducer.getFactory("COLOR");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Color color1 = colorFactory.getColor("RED");

        Shape shape2 = shapeFactory.getShape("SQUARE");
        Color color2 = colorFactory.getColor("GREEN");

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        Color color3 = colorFactory.getColor("BLUE");

        shape1.draw();
        color1.fill();

        shape2.draw();
        color2.fill();

        shape3.draw();
        color3.fill();
    }
}

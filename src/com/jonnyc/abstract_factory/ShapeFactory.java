package com.jonnyc.abstract_factory;

import com.jonnyc.abstract_factory.model.Color;
import com.jonnyc.standard_factory.model.Circle;
import com.jonnyc.standard_factory.model.Rectangle;
import com.jonnyc.standard_factory.model.Shape;
import com.jonnyc.standard_factory.model.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape){

        if(shape == null)
            return null;

        if(shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        else if(shape.equalsIgnoreCase("SQUARE"))
            return new Square();

        else if(shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }

    @Override
    public Color getColor(String color){
        return null;
    }
}
